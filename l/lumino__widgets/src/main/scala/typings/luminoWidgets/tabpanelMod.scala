package typings.luminoWidgets

import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.stackedpanelMod.StackedPanel
import typings.luminoWidgets.tabbarMod.TabBar
import typings.luminoWidgets.tabbarMod.TabBar.IRenderer
import typings.luminoWidgets.tabpanelMod.TabPanel.ICurrentChangedArgs
import typings.luminoWidgets.tabpanelMod.TabPanel.IOptions
import typings.luminoWidgets.tabpanelMod.TabPanel.TabPlacement
import typings.luminoWidgets.widgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabpanelMod {
  
  @JSImport("@lumino/widgets/types/tabpanel", "TabPanel")
  @js.native
  /**
    * Construct a new tab panel.
    *
    * @param options - The options for initializing the tab panel.
    */
  class TabPanel () extends Widget {
    def this(options: IOptions) = this()
    
    var _currentChanged: js.Any = js.native
    
    /**
      * Handle the `currentChanged` signal from the tab bar.
      */
    var _onCurrentChanged: js.Any = js.native
    
    /**
      * Handle the `tabActivateRequested` signal from the tab bar.
      */
    var _onTabActivateRequested: js.Any = js.native
    
    /**
      * Handle the `tabCloseRequested` signal from the tab bar.
      */
    var _onTabCloseRequested: js.Any = js.native
    
    /**
      * Handle the `tabMoved` signal from the tab bar.
      */
    var _onTabMoved: js.Any = js.native
    
    /**
      * Handle the `widgetRemoved` signal from the stacked panel.
      */
    var _onWidgetRemoved: js.Any = js.native
    
    var _tabPlacement: js.Any = js.native
    
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
    val currentChanged: ISignal[this.type, ICurrentChangedArgs] = js.native
    
    /**
      * Get the index of the currently selected tab.
      *
      * #### Notes
      * This will be `-1` if no tab is selected.
      */
    /**
      * Set the index of the currently selected tab.
      *
      * #### Notes
      * If the index is out of range, it will be set to `-1`.
      */
    var currentIndex: Double = js.native
    
    /**
      * Get the currently selected widget.
      *
      * #### Notes
      * This will be `null` if there is no selected tab.
      */
    /**
      * Set the currently selected widget.
      *
      * #### Notes
      * If the widget is not in the panel, it will be set to `null`.
      */
    var currentWidget: Widget | Null = js.native
    
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
    /**
      * Set the tab placement for the tab panel.
      *
      * #### Notes
      * This controls the position of the tab bar relative to the content.
      */
    var tabPlacement: TabPlacement = js.native
    
    /**
      * Get the whether the tabs are movable by the user.
      *
      * #### Notes
      * Tabs can always be moved programmatically.
      */
    /**
      * Set the whether the tabs are movable by the user.
      *
      * #### Notes
      * Tabs can always be moved programmatically.
      */
    var tabsMovable: Boolean = js.native
    
    /**
      * A read-only array of the widgets in the panel.
      */
    val widgets: js.Array[Widget] = js.native
  }
  object TabPanel {
    
    /**
      * The arguments object for the `currentChanged` signal.
      */
    @js.native
    trait ICurrentChangedArgs extends StObject {
      
      /**
        * The currently selected index.
        */
      var currentIndex: Double = js.native
      
      /**
        * The currently selected widget.
        */
      var currentWidget: Widget | Null = js.native
      
      /**
        * The previously selected index.
        */
      var previousIndex: Double = js.native
      
      /**
        * The previously selected widget.
        */
      var previousWidget: Widget | Null = js.native
    }
    object ICurrentChangedArgs {
      
      @scala.inline
      def apply(currentIndex: Double, previousIndex: Double): ICurrentChangedArgs = {
        val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICurrentChangedArgs]
      }
      
      @scala.inline
      implicit class ICurrentChangedArgsMutableBuilder[Self <: ICurrentChangedArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentWidget(value: Widget): Self = StObject.set(x, "currentWidget", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentWidgetNull: Self = StObject.set(x, "currentWidget", null)
        
        @scala.inline
        def setPreviousIndex(value: Double): Self = StObject.set(x, "previousIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreviousWidget(value: Widget): Self = StObject.set(x, "previousWidget", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreviousWidgetNull: Self = StObject.set(x, "previousWidget", null)
      }
    }
    
    /**
      * An options object for initializing a tab panel.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The renderer for the panel's tab bar.
        *
        * The default is a shared renderer instance.
        */
      var renderer: js.UndefOr[IRenderer[Widget]] = js.native
      
      /**
        * The placement of the tab bar relative to the content.
        *
        * The default is `'top'`.
        */
      var tabPlacement: js.UndefOr[TabPlacement] = js.native
      
      /**
        * Whether the tabs are movable by the user.
        *
        * The default is `false`.
        */
      var tabsMovable: js.UndefOr[Boolean] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRenderer(value: IRenderer[Widget]): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        @scala.inline
        def setTabPlacement(value: TabPlacement): Self = StObject.set(x, "tabPlacement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTabPlacementUndefined: Self = StObject.set(x, "tabPlacement", js.undefined)
        
        @scala.inline
        def setTabsMovable(value: Boolean): Self = StObject.set(x, "tabsMovable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTabsMovableUndefined: Self = StObject.set(x, "tabsMovable", js.undefined)
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
      
      @scala.inline
      def bottom: typings.luminoWidgets.luminoWidgetsStrings.bottom = "bottom".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.bottom]
      
      @scala.inline
      def left: typings.luminoWidgets.luminoWidgetsStrings.left = "left".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.left]
      
      @scala.inline
      def right: typings.luminoWidgets.luminoWidgetsStrings.right = "right".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.right]
      
      @scala.inline
      def top: typings.luminoWidgets.luminoWidgetsStrings.top = "top".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.top]
    }
  }
}
