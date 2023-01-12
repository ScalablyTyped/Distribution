package typings.luminoWidgets

import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.typesDockpanelMod.DockPanel.IAddOptions
import typings.luminoWidgets.typesDockpanelMod.DockPanel.ILayoutConfig
import typings.luminoWidgets.typesDockpanelMod.DockPanel.IOptions
import typings.luminoWidgets.typesDockpanelMod.DockPanel.IOverlay
import typings.luminoWidgets.typesDockpanelMod.DockPanel.IRenderer
import typings.luminoWidgets.typesDockpanelMod.DockPanel.Mode
import typings.luminoWidgets.typesTabbarMod.TabBar
import typings.luminoWidgets.typesWidgetMod.Widget
import typings.luminoWidgets.typesWidgetMod.Widget.HiddenMode
import typings.std.Document
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDockpanelMod {
  
  @JSImport("@lumino/widgets/types/dockpanel", "DockPanel")
  @js.native
  /**
    * Construct a new dock panel.
    *
    * @param options - The options for initializing the panel.
    */
  open class DockPanel () extends Widget {
    def this(options: IOptions) = this()
    
    /* private */ var _addButtonEnabled: Any = js.native
    
    /* private */ var _addRequested: Any = js.native
    
    /**
      * Create a new handle for use by the panel.
      */
    /* private */ var _createHandle: Any = js.native
    
    /**
      * Create a new tab bar for use by the panel.
      */
    /* private */ var _createTabBar: Any = js.native
    
    /* private */ var _document: Any = js.native
    
    /* private */ var _drag: Any = js.native
    
    /* private */ var _edges: Any = js.native
    
    /**
      * Handle the `'lm-dragenter'` event for the dock panel.
      */
    /* private */ var _evtDragEnter: Any = js.native
    
    /**
      * Handle the `'lm-dragleave'` event for the dock panel.
      */
    /* private */ var _evtDragLeave: Any = js.native
    
    /**
      * Handle the `'lm-dragover'` event for the dock panel.
      */
    /* private */ var _evtDragOver: Any = js.native
    
    /**
      * Handle the `'lm-drop'` event for the dock panel.
      */
    /* private */ var _evtDrop: Any = js.native
    
    /**
      * Handle the `'keydown'` event for the dock panel.
      */
    /* private */ var _evtKeyDown: Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the dock panel.
      */
    /* private */ var _evtMouseDown: Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the dock panel.
      */
    /* private */ var _evtMouseMove: Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the dock panel.
      */
    /* private */ var _evtMouseUp: Any = js.native
    
    /* private */ var _layoutModified: Any = js.native
    
    /* private */ var _mode: Any = js.native
    
    /**
      * Handle the `currentChanged` signal from a tab bar.
      */
    /* private */ var _onCurrentChanged: Any = js.native
    
    /**
      * Handle the `tabActivateRequested` signal from a tab bar.
      */
    /* private */ var _onTabActivateRequested: Any = js.native
    
    /**
      * Handle the `addRequested` signal from a tab bar.
      */
    /* private */ var _onTabAddRequested: Any = js.native
    
    /**
      * Handle the `tabCloseRequested` signal from a tab bar.
      */
    /* private */ var _onTabCloseRequested: Any = js.native
    
    /**
      * Handle the `tabDetachRequested` signal from a tab bar.
      */
    /* private */ var _onTabDetachRequested: Any = js.native
    
    /**
      * Handle the `tabMoved` signal from a tab bar.
      */
    /* private */ var _onTabMoved: Any = js.native
    
    /* private */ var _pressData: Any = js.native
    
    /**
      * Release the mouse grab for the dock panel.
      */
    /* private */ var _releaseMouse: Any = js.native
    
    /* private */ var _renderer: Any = js.native
    
    /**
      * Show the overlay indicator at the given client position.
      *
      * Returns the drop zone at the specified client position.
      *
      * #### Notes
      * If the position is not over a valid zone, the overlay is hidden.
      */
    /* private */ var _showOverlay: Any = js.native
    
    /* private */ var _tabsConstrained: Any = js.native
    
    /* private */ var _tabsMovable: Any = js.native
    
    /**
      * Activate a specified widget in the dock panel.
      *
      * @param widget - The widget of interest.
      *
      * #### Notes
      * This will select and activate the given widget.
      */
    def activateWidget(widget: Widget): Unit = js.native
    
    /**
      * Whether the add buttons for each tab bar are enabled.
      */
    /**
      * Set whether the add buttons for each tab bar are enabled.
      */
    var addButtonEnabled: Boolean = js.native
    
    /**
      * A signal emitted when the add button on a tab bar is clicked.
      *
      */
    val addRequested: ISignal[this.type, TabBar[Widget]] = js.native
    
    /**
      * Add a widget to the dock panel.
      *
      * @param widget - The widget to add to the dock panel.
      *
      * @param options - The additional options for adding the widget.
      *
      * #### Notes
      * If the panel is in single document mode, the options are ignored
      * and the widget is always added as tab in the hidden tab bar.
      */
    def addWidget(widget: Widget): Unit = js.native
    def addWidget(widget: Widget, options: IAddOptions): Unit = js.native
    
    /**
      * Handle the DOM events for the dock panel.
      *
      * @param event - The DOM event sent to the panel.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the panel's DOM node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Create an iterator over the handles in the panel.
      *
      * @returns A new iterator over the handles in the panel.
      */
    def handles(): IIterator[HTMLDivElement] = js.native
    
    /**
      * Whether the dock panel is empty.
      */
    val isEmpty: Boolean = js.native
    
    /**
      * A signal emitted when the layout configuration is modified.
      *
      * #### Notes
      * This signal is emitted whenever the current layout configuration
      * may have changed.
      *
      * This signal is emitted asynchronously in a collapsed fashion, so
      * that multiple synchronous modifications results in only a single
      * emit of the signal.
      */
    val layoutModified: ISignal[this.type, Unit] = js.native
    
    /**
      * Get the mode for the dock panel.
      */
    /**
      * Set the mode for the dock panel.
      *
      * #### Notes
      * Changing the mode is a destructive operation with respect to the
      * panel's layout configuration. If layout state must be preserved,
      * save the current layout config before changing the mode.
      */
    var mode: Mode = js.native
    
    /**
      * The overlay used by the dock panel.
      */
    val overlay: IOverlay = js.native
    
    /**
      * The renderer used by the dock panel.
      */
    val renderer: IRenderer = js.native
    
    /**
      * Restore the layout to a previously saved configuration.
      *
      * @param config - The layout configuration to restore.
      *
      * #### Notes
      * Widgets which currently belong to the layout but which are not
      * contained in the config will be unparented.
      *
      * The dock panel automatically reverts to `'multiple-document'`
      * mode when a layout config is restored.
      */
    def restoreLayout(config: ILayoutConfig): Unit = js.native
    
    /**
      * Save the current layout configuration of the dock panel.
      *
      * @returns A new config object for the current layout state.
      *
      * #### Notes
      * The return value can be provided to the `restoreLayout` method
      * in order to restore the layout to its current configuration.
      */
    def saveLayout(): ILayoutConfig = js.native
    
    /**
      * Select a specific widget in the dock panel.
      *
      * @param widget - The widget of interest.
      *
      * #### Notes
      * This will make the widget the current widget in its tab area.
      */
    def selectWidget(widget: Widget): Unit = js.native
    
    /**
      * Create an iterator over the selected widgets in the panel.
      *
      * @returns A new iterator over the selected user widgets.
      *
      * #### Notes
      * This iterator yields the widgets corresponding to the current tab
      * of each tab bar in the panel.
      */
    def selectedWidgets(): IIterator[Widget] = js.native
    
    /**
      * Get the spacing between the widgets.
      */
    /**
      * Set the spacing between the widgets.
      */
    var spacing: Double = js.native
    
    /**
      * Create an iterator over the tab bars in the panel.
      *
      * @returns A new iterator over the tab bars in the panel.
      *
      * #### Notes
      * This iterator does not include the user widgets.
      */
    def tabBars(): IIterator[TabBar[Widget]] = js.native
    
    /**
      * Whether the tabs are constrained to their source dock panel
      */
    /**
      * Constrain/Allow tabs to be dragged outside of this dock panel
      */
    var tabsConstrained: Boolean = js.native
    
    /**
      * Whether the tabs can be dragged / moved at runtime.
      */
    /**
      * Enable / Disable draggable / movable tabs.
      */
    var tabsMovable: Boolean = js.native
    
    /**
      * Create an iterator over the user widgets in the panel.
      *
      * @returns A new iterator over the user widgets in the panel.
      *
      * #### Notes
      * This iterator does not include the generated tab bars.
      */
    def widgets(): IIterator[Widget] = js.native
  }
  object DockPanel {
    
    /**
      * A concrete implementation of `IOverlay`.
      *
      * This is the default overlay implementation for a dock panel.
      */
    @JSImport("@lumino/widgets/types/dockpanel", "DockPanel.Overlay")
    @js.native
    /**
      * Construct a new overlay.
      */
    open class Overlay ()
      extends StObject
         with IOverlay {
      
      /* private */ var _hidden: Any = js.native
      
      /* private */ var _timer: Any = js.native
      
      /**
        * Hide the overlay node.
        *
        * @param delay - The delay (in ms) before hiding the overlay.
        *   A delay value <= 0 should hide the overlay immediately.
        *
        * #### Notes
        * This is called whenever the overlay node should been hidden.
        */
      /* CompleteClass */
      override def hide(delay: Double): Unit = js.native
      
      /**
        * The DOM node for the overlay.
        */
      /* CompleteClass */
      override val node: HTMLDivElement = js.native
      
      /**
        * Show the overlay using the given overlay geometry.
        *
        * @param geo - The desired geometry for the overlay.
        *
        * #### Notes
        * The given geometry values assume the node will use absolute
        * positioning.
        *
        * This is called on every mouse move event during a drag in order
        * to update the position of the overlay. It should be efficient.
        */
      /* CompleteClass */
      override def show(geo: IOverlayGeometry): Unit = js.native
    }
    
    /**
      * The default implementation of `IRenderer`.
      */
    @JSImport("@lumino/widgets/types/dockpanel", "DockPanel.Renderer")
    @js.native
    open class Renderer ()
      extends StObject
         with typings.luminoWidgets.typesDocklayoutMod.DockLayout.IRenderer
    
    /**
      * The default `Renderer` instance.
      */
    @JSImport("@lumino/widgets/types/dockpanel", "DockPanel.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * A type alias for the add widget options.
      */
    type IAddOptions = typings.luminoWidgets.typesDocklayoutMod.DockLayout.IAddOptions
    
    /**
      * The sizes of the edge drop zones, in pixels.
      */
    trait IEdges extends StObject {
      
      /**
        * The size of the bottom edge drop zone.
        */
      var bottom: Double
      
      /**
        * The size of the left edge drop zone.
        */
      var left: Double
      
      /**
        * The size of the right edge drop zone.
        */
      var right: Double
      
      /**
        * The size of the top edge drop zone.
        */
      var top: Double
    }
    object IEdges {
      
      inline def apply(bottom: Double, left: Double, right: Double, top: Double): IEdges = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
        __obj.asInstanceOf[IEdges]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IEdges] (val x: Self) extends AnyVal {
        
        inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for a layout configuration object.
      */
    type ILayoutConfig = typings.luminoWidgets.typesDocklayoutMod.DockLayout.ILayoutConfig
    
    /**
      * An options object for creating a dock panel.
      */
    trait IOptions extends StObject {
      
      /**
        * Enable add buttons in each of the dock panel's tab bars.
        *
        * The default is `'false'`.
        */
      var addButtonEnabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The document to use with the dock panel.
        *
        * The default is the global `document` instance.
        */
      var document: js.UndefOr[Document | ShadowRoot] = js.undefined
      
      /**
        * The sizes of the edge drop zones, in pixels.
        * If not given, default values will be used.
        */
      var edges: js.UndefOr[IEdges] = js.undefined
      
      /**
        * The method for hiding widgets.
        *
        * The default is `Widget.HiddenMode.Display`.
        */
      var hiddenMode: js.UndefOr[HiddenMode] = js.undefined
      
      /**
        * The mode for the dock panel.
        *
        * The default is `'multiple-document'`.
        */
      var mode: js.UndefOr[Mode] = js.undefined
      
      /**
        * The overlay to use with the dock panel.
        *
        * The default is a new `Overlay` instance.
        */
      var overlay: js.UndefOr[IOverlay] = js.undefined
      
      /**
        * The renderer to use for the dock panel.
        *
        * The default is a shared renderer instance.
        */
      var renderer: js.UndefOr[IRenderer] = js.undefined
      
      /**
        * The spacing between the items in the panel.
        *
        * The default is `4`.
        */
      var spacing: js.UndefOr[Double] = js.undefined
      
      /**
        * Constrain tabs to this dock panel
        *
        * The default is `'false'`.
        */
      var tabsConstrained: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Allow tabs to be draggable / movable by user.
        *
        * The default is `'true'`.
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
        
        inline def setEdges(value: IEdges): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
        
        inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
        
        inline def setHiddenMode(value: HiddenMode): Self = StObject.set(x, "hiddenMode", value.asInstanceOf[js.Any])
        
        inline def setHiddenModeUndefined: Self = StObject.set(x, "hiddenMode", js.undefined)
        
        inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setOverlay(value: IOverlay): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
        
        inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
        
        inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
        
        inline def setTabsConstrained(value: Boolean): Self = StObject.set(x, "tabsConstrained", value.asInstanceOf[js.Any])
        
        inline def setTabsConstrainedUndefined: Self = StObject.set(x, "tabsConstrained", js.undefined)
        
        inline def setTabsMovable(value: Boolean): Self = StObject.set(x, "tabsMovable", value.asInstanceOf[js.Any])
        
        inline def setTabsMovableUndefined: Self = StObject.set(x, "tabsMovable", js.undefined)
      }
    }
    
    /**
      * An object which manages the overlay node for a dock panel.
      */
    trait IOverlay extends StObject {
      
      /**
        * Hide the overlay node.
        *
        * @param delay - The delay (in ms) before hiding the overlay.
        *   A delay value <= 0 should hide the overlay immediately.
        *
        * #### Notes
        * This is called whenever the overlay node should been hidden.
        */
      def hide(delay: Double): Unit
      
      /**
        * The DOM node for the overlay.
        */
      val node: HTMLDivElement
      
      /**
        * Show the overlay using the given overlay geometry.
        *
        * @param geo - The desired geometry for the overlay.
        *
        * #### Notes
        * The given geometry values assume the node will use absolute
        * positioning.
        *
        * This is called on every mouse move event during a drag in order
        * to update the position of the overlay. It should be efficient.
        */
      def show(geo: IOverlayGeometry): Unit
    }
    object IOverlay {
      
      inline def apply(hide: Double => Unit, node: HTMLDivElement, show: IOverlayGeometry => Unit): IOverlay = {
        val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), node = node.asInstanceOf[js.Any], show = js.Any.fromFunction1(show))
        __obj.asInstanceOf[IOverlay]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOverlay] (val x: Self) extends AnyVal {
        
        inline def setHide(value: Double => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
        
        inline def setNode(value: HTMLDivElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
        
        inline def setShow(value: IOverlayGeometry => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * An object which holds the geometry for overlay positioning.
      */
    trait IOverlayGeometry extends StObject {
      
      /**
        * The distance between the overlay and parent bottom edges.
        */
      var bottom: Double
      
      /**
        * The distance between the overlay and parent left edges.
        */
      var left: Double
      
      /**
        * The distance between the overlay and parent right edges.
        */
      var right: Double
      
      /**
        * The distance between the overlay and parent top edges.
        */
      var top: Double
    }
    object IOverlayGeometry {
      
      inline def apply(bottom: Double, left: Double, right: Double, top: Double): IOverlayGeometry = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOverlayGeometry]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOverlayGeometry] (val x: Self) extends AnyVal {
        
        inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for a dock panel renderer;
      */
    type IRenderer = typings.luminoWidgets.typesDocklayoutMod.DockLayout.IRenderer
    
    /**
      * A type alias for the supported insertion modes.
      */
    type InsertMode = typings.luminoWidgets.typesDocklayoutMod.DockLayout.InsertMode
    
    /**
      * A type alias for the supported dock panel modes.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoWidgets.luminoWidgetsStrings.`single-document`
      - typings.luminoWidgets.luminoWidgetsStrings.`multiple-document`
    */
    trait Mode extends StObject
    object Mode {
      
      inline def `multiple-document`: typings.luminoWidgets.luminoWidgetsStrings.`multiple-document` = "multiple-document".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`multiple-document`]
      
      inline def `single-document`: typings.luminoWidgets.luminoWidgetsStrings.`single-document` = "single-document".asInstanceOf[typings.luminoWidgets.luminoWidgetsStrings.`single-document`]
    }
  }
}
