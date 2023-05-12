package typings.luminoWidgets

import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.typesStackedpanelMod.StackedPanel
import typings.luminoWidgets.typesTabbarMod.TabBar
import typings.luminoWidgets.typesTabbarMod.TabBar.IRenderer
import typings.luminoWidgets.typesTabpanelMod.TabPanel.ICurrentChangedArgs
import typings.luminoWidgets.typesTabpanelMod.TabPanel.IOptions
import typings.luminoWidgets.typesTabpanelMod.TabPanel.TabPlacement
import typings.luminoWidgets.typesWidgetMod.Widget
import typings.std.Document
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTabpanelMod {
  
  @JSImport("@lumino/widgets/types/tabpanel", "TabPanel")
  @js.native
  /**
    * Construct a new tab panel.
    *
    * @param options - The options for initializing the tab panel.
    */
  open class TabPanel () extends Widget {
    def this(options: IOptions) = this()
    
    /* private */ var _addRequested: Any = js.native
    
    /* private */ var _currentChanged: Any = js.native
    
    /**
      * Handle the `currentChanged` signal from the tab bar.
      */
    /* private */ var _onCurrentChanged: Any = js.native
    
    /**
      * Handle the `tabActivateRequested` signal from the tab bar.
      */
    /* private */ var _onTabActivateRequested: Any = js.native
    
    /**
      * Handle the `tabAddRequested` signal from the tab bar.
      */
    /* private */ var _onTabAddRequested: Any = js.native
    
    /**
      * Handle the `tabCloseRequested` signal from the tab bar.
      */
    /* private */ var _onTabCloseRequested: Any = js.native
    
    /**
      * Handle the `tabMoved` signal from the tab bar.
      */
    /* private */ var _onTabMoved: Any = js.native
    
    /**
      * Handle the `widgetRemoved` signal from the stacked panel.
      */
    /* private */ var _onWidgetRemoved: Any = js.native
    
    /* private */ var _tabPlacement: Any = js.native
    
    /**
      * Get the whether the add button is enabled.
      *
      */
    def addButtonEnabled: Boolean = js.native
    /**
      * Set the whether the add button is enabled.
      *
      */
    def addButtonEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * A signal emitted when the add button on a tab bar is clicked.
      *
      */
    def addRequested: ISignal[this.type, TabBar[Widget]] = js.native
    
    /**
      * Add a widget to the end of the tab panel.
      *
      * @param widget - The widget to add to the tab panel.
      *
      * #### Notes
      * If the widget is already contained in the panel, it will be moved.
      *
      * The widget's `title` is used to populate the tab.
      */
    def addWidget(widget: Widget): Unit = js.native
    
    /**
      * A signal emitted when the current tab is changed.
      *
      * #### Notes
      * This signal is emitted when the currently selected tab is changed
      * either through user or programmatic interaction.
      *
      * Notably, this signal is not emitted when the index of the current
      * tab changes due to tabs being inserted, removed, or moved. It is
      * only emitted when the actual current tab node is changed.
      */
    def currentChanged: ISignal[this.type, ICurrentChangedArgs] = js.native
    
    /**
      * Get the index of the currently selected tab.
      *
      * #### Notes
      * This will be `-1` if no tab is selected.
      */
    def currentIndex: Double = js.native
    /**
      * Set the index of the currently selected tab.
      *
      * #### Notes
      * If the index is out of range, it will be set to `-1`.
      */
    def currentIndex_=(value: Double): Unit = js.native
    
    /**
      * Get the currently selected widget.
      *
      * #### Notes
      * This will be `null` if there is no selected tab.
      */
    def currentWidget: Widget | Null = js.native
    /**
      * Set the currently selected widget.
      *
      * #### Notes
      * If the widget is not in the panel, it will be set to `null`.
      */
    def currentWidget_=(value: Widget | Null): Unit = js.native
    
    /**
      * Insert a widget into the tab panel at a specified index.
      *
      * @param index - The index at which to insert the widget.
      *
      * @param widget - The widget to insert into to the tab panel.
      *
      * #### Notes
      * If the widget is already contained in the panel, it will be moved.
      *
      * The widget's `title` is used to populate the tab.
      */
    def insertWidget(index: Double, widget: Widget): Unit = js.native
    
    /**
      * The stacked panel used by the tab panel.
      *
      * #### Notes
      * Modifying the panel directly can lead to undefined behavior.
      */
    val stackedPanel: StackedPanel = js.native
    
    /**
      * The tab bar used by the tab panel.
      *
      * #### Notes
      * Modifying the tab bar directly can lead to undefined behavior.
      */
    val tabBar: TabBar[Widget] = js.native
    
    /**
      * Get the tab placement for the tab panel.
      *
      * #### Notes
      * This controls the position of the tab bar relative to the content.
      */
    def tabPlacement: TabPlacement = js.native
    /**
      * Set the tab placement for the tab panel.
      *
      * #### Notes
      * This controls the position of the tab bar relative to the content.
      */
    def tabPlacement_=(value: TabPlacement): Unit = js.native
    
    /**
      * Get the whether the tabs are movable by the user.
      *
      * #### Notes
      * Tabs can always be moved programmatically.
      */
    def tabsMovable: Boolean = js.native
    /**
      * Set the whether the tabs are movable by the user.
      *
      * #### Notes
      * Tabs can always be moved programmatically.
      */
    def tabsMovable_=(value: Boolean): Unit = js.native
    
    /**
      * A read-only array of the widgets in the panel.
      */
    def widgets: js.Array[Widget] = js.native
  }
  object TabPanel {
    
    /**
      * The arguments object for the `currentChanged` signal.
      */
    trait ICurrentChangedArgs extends StObject {
      
      /**
        * The currently selected index.
        */
      var currentIndex: Double
      
      /**
        * The currently selected widget.
        */
      var currentWidget: Widget | Null
      
      /**
        * The previously selected index.
        */
      var previousIndex: Double
      
      /**
        * The previously selected widget.
        */
      var previousWidget: Widget | Null
    }
    object ICurrentChangedArgs {
      
      inline def apply(currentIndex: Double, previousIndex: Double): ICurrentChangedArgs = {
        val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], currentWidget = null, previousWidget = null)
        __obj.asInstanceOf[ICurrentChangedArgs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ICurrentChangedArgs] (val x: Self) extends AnyVal {
        
        inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
        
        inline def setCurrentWidget(value: Widget): Self = StObject.set(x, "currentWidget", value.asInstanceOf[js.Any])
        
        inline def setCurrentWidgetNull: Self = StObject.set(x, "currentWidget", null)
        
        inline def setPreviousIndex(value: Double): Self = StObject.set(x, "previousIndex", value.asInstanceOf[js.Any])
        
        inline def setPreviousWidget(value: Widget): Self = StObject.set(x, "previousWidget", value.asInstanceOf[js.Any])
        
        inline def setPreviousWidgetNull: Self = StObject.set(x, "previousWidget", null)
      }
    }
    
    /**
      * An options object for initializing a tab panel.
      */
    trait IOptions extends StObject {
      
      /**
        * Whether the button to add new tabs is enabled.
        *
        * The default is `false`.
        */
      var addButtonEnabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The document to use with the tab panel.
        *
        * The default is the global `document` instance.
        */
      var document: js.UndefOr[Document | ShadowRoot] = js.undefined
      
      /**
        * The renderer for the panel's tab bar.
        *
        * The default is a shared renderer instance.
        */
      var renderer: js.UndefOr[IRenderer[Widget]] = js.undefined
      
      /**
        * The placement of the tab bar relative to the content.
        *
        * The default is `'top'`.
        */
      var tabPlacement: js.UndefOr[TabPlacement] = js.undefined
      
      /**
        * Whether the tabs are movable by the user.
        *
        * The default is `false`.
        */
      var tabsMovable: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setAddButtonEnabled(value: Boolean): Self = StObject.set(x, "addButtonEnabled", value.asInstanceOf[js.Any])
        
        inline def setAddButtonEnabledUndefined: Self = StObject.set(x, "addButtonEnabled", js.undefined)
        
        inline def setDocument(value: Document | ShadowRoot): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
        
        inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
        
        inline def setRenderer(value: IRenderer[Widget]): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setTabPlacement(value: TabPlacement): Self = StObject.set(x, "tabPlacement", value.asInstanceOf[js.Any])
        
        inline def setTabPlacementUndefined: Self = StObject.set(x, "tabPlacement", js.undefined)
        
        inline def setTabsMovable(value: Boolean): Self = StObject.set(x, "tabsMovable", value.asInstanceOf[js.Any])
        
        inline def setTabsMovableUndefined: Self = StObject.set(x, "tabsMovable", js.undefined)
      }
    }
    
    /**
      * A type alias for tab placement in a tab bar.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.top
      - typings.luminoWidgets.luminoWidgetsStrings.left
      - typings.luminoWidgets.luminoWidgetsStrings.right
      - typings.luminoWidgets.luminoWidgetsStrings.bottom
    */
    trait TabPlacement extends StObject
    object TabPlacement {
      
      inline def bottom: typings.luminoWidgets.luminoWidgetsStrings.bottom = "bottom".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.bottom]
      
      inline def left: typings.luminoWidgets.luminoWidgetsStrings.left = "left".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.left]
      
      inline def right: typings.luminoWidgets.luminoWidgetsStrings.right = "right".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.right]
      
      inline def top: typings.luminoWidgets.luminoWidgetsStrings.top = "top".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.top]
    }
  }
}
