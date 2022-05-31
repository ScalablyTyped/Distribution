package typings.jupyterlabApplication

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.shellMod.ILabShell.Area
import typings.jupyterlabApplication.shellMod.ILabShell.IChangedArgs
import typings.jupyterlabApplication.shellMod.ILabShell.ILayout
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IOpenOptions
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoCoreutils.mod.Token
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.docklayoutMod.DockLayout.ILayoutConfig
import typings.luminoWidgets.dockpanelMod.DockPanel.Mode
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shellMod {
  
  object ILabShell extends Shortcut {
    
    @JSImport("@jupyterlab/application/lib/shell", "ILabShell")
    @js.native
    val ^ : Token[ILabShell] = js.native
    
    /**
      * The areas of the application shell where widgets can reside.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.main
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.header
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.top
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.left
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.right
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.bottom
    */
    trait Area extends StObject
    object Area {
      
      inline def bottom: typings.jupyterlabApplication.jupyterlabApplicationStrings.bottom = "bottom".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.bottom]
      
      inline def header: typings.jupyterlabApplication.jupyterlabApplicationStrings.header = "header".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.header]
      
      inline def left: typings.jupyterlabApplication.jupyterlabApplicationStrings.left = "left".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.left]
      
      inline def main: typings.jupyterlabApplication.jupyterlabApplicationStrings.main = "main".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.main]
      
      inline def right: typings.jupyterlabApplication.jupyterlabApplicationStrings.right = "right".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.right]
      
      inline def top: typings.jupyterlabApplication.jupyterlabApplicationStrings.top = "top".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.top]
    }
    
    /**
      * The restorable description of an area within the main dock panel.
      */
    type AreaConfig = typings.luminoWidgets.docklayoutMod.DockLayout.AreaConfig
    
    /**
      * An arguments object for the changed signals.
      */
    type IChangedArgs = typings.luminoWidgets.focustrackerMod.FocusTracker.IChangedArgs[Widget]
    
    /**
      * A description of the application's user interface layout.
      */
    trait ILayout extends StObject {
      
      /**
        * Indicates whether fetched session restore data was actually retrieved
        * from the state database or whether it is a fresh blank slate.
        *
        * #### Notes
        * This attribute is only relevant when the layout data is retrieved via a
        * `fetch` call. If it is set when being passed into `save`, it will be
        * ignored.
        */
      val fresh: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The left area of the user interface.
        */
      val leftArea: ISideArea | Null
      
      /**
        * The main area of the user interface.
        */
      val mainArea: IMainArea | Null
      
      /**
        * The right area of the user interface.
        */
      val rightArea: ISideArea | Null
    }
    object ILayout {
      
      inline def apply(): ILayout = {
        val __obj = js.Dynamic.literal(leftArea = null, mainArea = null, rightArea = null)
        __obj.asInstanceOf[ILayout]
      }
      
      extension [Self <: ILayout](x: Self) {
        
        inline def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
        
        inline def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
        
        inline def setLeftArea(value: ISideArea): Self = StObject.set(x, "leftArea", value.asInstanceOf[js.Any])
        
        inline def setLeftAreaNull: Self = StObject.set(x, "leftArea", null)
        
        inline def setMainArea(value: IMainArea): Self = StObject.set(x, "mainArea", value.asInstanceOf[js.Any])
        
        inline def setMainAreaNull: Self = StObject.set(x, "mainArea", null)
        
        inline def setRightArea(value: ISideArea): Self = StObject.set(x, "rightArea", value.asInstanceOf[js.Any])
        
        inline def setRightAreaNull: Self = StObject.set(x, "rightArea", null)
      }
    }
    
    /**
      * The restorable description of the main application area.
      */
    trait IMainArea extends StObject {
      
      /**
        * The current widget that has application focus.
        */
      val currentWidget: Widget | Null
      
      /**
        * The contents of the main application dock panel.
        */
      val dock: ILayoutConfig | Null
      
      /**
        * The document mode (i.e., multiple/single) of the main dock panel.
        */
      val mode: Mode | Null
    }
    object IMainArea {
      
      inline def apply(): IMainArea = {
        val __obj = js.Dynamic.literal(currentWidget = null, dock = null, mode = null)
        __obj.asInstanceOf[IMainArea]
      }
      
      extension [Self <: IMainArea](x: Self) {
        
        inline def setCurrentWidget(value: Widget): Self = StObject.set(x, "currentWidget", value.asInstanceOf[js.Any])
        
        inline def setCurrentWidgetNull: Self = StObject.set(x, "currentWidget", null)
        
        inline def setDock(value: ILayoutConfig): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
        
        inline def setDockNull: Self = StObject.set(x, "dock", null)
        
        inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeNull: Self = StObject.set(x, "mode", null)
      }
    }
    
    /**
      * The restorable description of a sidebar in the user interface.
      */
    trait ISideArea extends StObject {
      
      /**
        * A flag denoting whether the sidebar has been collapsed.
        */
      val collapsed: Boolean
      
      /**
        * The current widget that has side area focus.
        */
      val currentWidget: Widget | Null
      
      /**
        * The collection of widgets held by the sidebar.
        */
      val widgets: js.Array[Widget] | Null
    }
    object ISideArea {
      
      inline def apply(collapsed: Boolean): ISideArea = {
        val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], currentWidget = null, widgets = null)
        __obj.asInstanceOf[ISideArea]
      }
      
      extension [Self <: ISideArea](x: Self) {
        
        inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
        
        inline def setCurrentWidget(value: Widget): Self = StObject.set(x, "currentWidget", value.asInstanceOf[js.Any])
        
        inline def setCurrentWidgetNull: Self = StObject.set(x, "currentWidget", null)
        
        inline def setWidgets(value: js.Array[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
        
        inline def setWidgetsNull: Self = StObject.set(x, "widgets", null)
        
        inline def setWidgetsVarargs(value: Widget*): Self = StObject.set(x, "widgets", js.Array(value :_*))
      }
    }
    
    type _To = Token[ILabShell]
    
    /* This means you don't have to write `^`, but can instead just say `ILabShell.foo` */
    override def _to: Token[ILabShell] = ^
  }
  type ILabShell = LabShell
  
  @JSImport("@jupyterlab/application/lib/shell", "LabShell")
  @js.native
  /**
    * Construct a new application shell.
    */
  class LabShell () extends IShell {
    
    /* private */ var _activeChanged: js.Any = js.native
    
    /**
      * Add a widget to the bottom content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToBottomArea: js.Any = js.native
    
    /**
      * Add a widget to the header content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToHeaderArea: js.Any = js.native
    
    /**
      * Add a widget to the left content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToLeftArea: js.Any = js.native
    
    /**
      * Add a widget to the main content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      * All widgets added to the main area should be disposed after removal
      * (disposal before removal will remove the widget automatically).
      *
      * In the options, `ref` defaults to `null`, `mode` defaults to `'tab-after'`,
      * and `activate` defaults to `true`.
      */
    /* private */ var _addToMainArea: js.Any = js.native
    
    /**
      * Add a widget to the right content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToRightArea: js.Any = js.native
    
    /**
      * Add a widget to the top content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToTopArea: js.Any = js.native
    
    /* private */ var _adjacentBar: js.Any = js.native
    
    /* private */ var _bottomPanel: js.Any = js.native
    
    /* private */ var _cachedLayout: js.Any = js.native
    
    /* private */ var _currentChanged: js.Any = js.native
    
    /* private */ var _currentTabBar: js.Any = js.native
    
    /**
      * A message hook for child add/remove messages on the main area dock panel.
      */
    /* private */ var _dockChildHook: js.Any = js.native
    
    /* private */ var _dockPanel: js.Any = js.native
    
    /* private */ var _headerPanel: js.Any = js.native
    
    /* private */ var _isRestored: js.Any = js.native
    
    /* private */ var _layoutDebouncer: js.Any = js.native
    
    /* private */ var _layoutModified: js.Any = js.native
    
    /* private */ var _leftHandler: js.Any = js.native
    
    /* private */ var _mainOptionsCache: js.Any = js.native
    
    /**
      * Handle a change to the dock area active widget.
      */
    /* private */ var _onActiveChanged: js.Any = js.native
    
    /**
      * Handle a change to the dock area current widget.
      */
    /* private */ var _onCurrentChanged: js.Any = js.native
    
    /**
      * Handle a change to the layout.
      */
    /* private */ var _onLayoutModified: js.Any = js.native
    
    /* private */ var _restored: js.Any = js.native
    
    /* private */ var _rightHandler: js.Any = js.native
    
    /* private */ var _sideOptionsCache: js.Any = js.native
    
    /* private */ var _topHandler: js.Any = js.native
    
    /* private */ var _tracker: js.Any = js.native
    
    def activateNextTab(): Unit = js.native
    
    def activateNextTabBar(): Unit = js.native
    
    def activatePreviousTab(): Unit = js.native
    
    def activatePreviousTabBar(): Unit = js.native
    
    /**
      * A signal emitted when main area's active focus changes.
      */
    def activeChanged: ISignal[this.type, IChangedArgs] = js.native
    
    /**
      * The active widget in the shell's main area.
      */
    def activeWidget: Widget | Null = js.native
    
    def add(widget: Widget, area: Area): Unit = js.native
    def add(widget: Widget, area: Area, options: IOpenOptions): Unit = js.native
    
    /**
      * Close all widgets in the main area.
      */
    def closeAll(): Unit = js.native
    
    /**
      * Collapse the left area.
      */
    def collapseLeft(): Unit = js.native
    
    /**
      * Collapse the right area.
      */
    def collapseRight(): Unit = js.native
    
    /**
      * A signal emitted when main area's current focus changes.
      */
    def currentChanged: ISignal[this.type, IChangedArgs] = js.native
    
    /**
      * The current widget in the shell's main area.
      */
    @JSName("currentWidget")
    def currentWidget_MLabShell: Widget | Null = js.native
    
    /**
      * Expand the left area.
      *
      * #### Notes
      * This will open the most recently used tab,
      * or the first tab if there is no most recently used.
      */
    def expandLeft(): Unit = js.native
    
    /**
      * Expand the right area.
      *
      * #### Notes
      * This will open the most recently used tab,
      * or the first tab if there is no most recently used.
      */
    def expandRight(): Unit = js.native
    
    /**
      * True if the given area is empty.
      */
    def isEmpty(area: Area): Boolean = js.native
    
    /**
      * A signal emitted when the main area's layout is modified.
      */
    def layoutModified: ISignal[this.type, Unit] = js.native
    
    /**
      * Whether the left area is collapsed.
      */
    def leftCollapsed: Boolean = js.native
    
    /**
      * The main dock area's user interface mode.
      */
    def mode: Mode = js.native
    def mode_=(mode: Mode): Unit = js.native
    
    /**
      * Whether JupyterLab is in presentation mode with the
      * `jp-mod-presentationMode` CSS class.
      */
    def presentationMode: Boolean = js.native
    /**
      * Enable/disable presentation mode (`jp-mod-presentationMode` CSS class) with
      * a boolean.
      */
    def presentationMode_=(value: Boolean): Unit = js.native
    
    /**
      * Restore the layout state for the application shell.
      */
    def restoreLayout(layout: ILayout): Unit = js.native
    
    /**
      * Promise that resolves when state is first restored, returning layout
      * description.
      */
    def restored: js.Promise[ILayout] = js.native
    
    /**
      * Whether the left area is collapsed.
      */
    def rightCollapsed: Boolean = js.native
    
    /**
      * Save the dehydrated state of the application shell.
      */
    def saveLayout(): ILayout = js.native
    
    def widgets(area: Area): IIterator[Widget] = js.native
  }
}
