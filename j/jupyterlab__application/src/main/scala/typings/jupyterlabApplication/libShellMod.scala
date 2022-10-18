package typings.jupyterlabApplication

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.anon.PartialIConfig
import typings.jupyterlabApplication.jupyterlabApplicationStrings.display
import typings.jupyterlabApplication.jupyterlabApplicationStrings.scale
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libShellMod.ILabShell.Area
import typings.jupyterlabApplication.libShellMod.ILabShell.IChangedArgs
import typings.jupyterlabApplication.libShellMod.ILabShell.ICurrentPathChangedArgs
import typings.jupyterlabApplication.libShellMod.ILabShell.ILayout
import typings.jupyterlabApplication.libShellMod.ILabShell.IOptions
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IOpenOptions
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoCoreutils.mod.Token
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.DockPanel
import typings.luminoWidgets.mod.TabBar
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.typesDocklayoutMod.DockLayout.ILayoutConfig
import typings.luminoWidgets.typesDockpanelMod.DockPanel.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShellMod {
  
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
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.menu
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.left
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.right
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.bottom
      - typings.jupyterlabApplication.jupyterlabApplicationStrings.down
    */
    trait Area extends StObject
    object Area {
      
      inline def bottom: typings.jupyterlabApplication.jupyterlabApplicationStrings.bottom = "bottom".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.bottom]
      
      inline def down: typings.jupyterlabApplication.jupyterlabApplicationStrings.down = "down".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.down]
      
      inline def header: typings.jupyterlabApplication.jupyterlabApplicationStrings.header = "header".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.header]
      
      inline def left: typings.jupyterlabApplication.jupyterlabApplicationStrings.left = "left".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.left]
      
      inline def main: typings.jupyterlabApplication.jupyterlabApplicationStrings.main = "main".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.main]
      
      inline def menu: typings.jupyterlabApplication.jupyterlabApplicationStrings.menu = "menu".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.menu]
      
      inline def right: typings.jupyterlabApplication.jupyterlabApplicationStrings.right = "right".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.right]
      
      inline def top: typings.jupyterlabApplication.jupyterlabApplicationStrings.top = "top".asInstanceOf[typings.jupyterlabApplication.jupyterlabApplicationStrings.top]
    }
    
    /**
      * The restorable description of an area within the main dock panel.
      */
    type AreaConfig = typings.luminoWidgets.typesDocklayoutMod.DockLayout.AreaConfig
    
    /**
      * An arguments object for the changed signals.
      */
    type IChangedArgs = typings.luminoWidgets.typesFocustrackerMod.FocusTracker.IChangedArgs[Widget]
    
    trait IConfig extends StObject {
      
      /**
        * The method for hiding widgets in the dock panel.
        *
        * The default is `scale`.
        *
        * Using `scale` will often increase performance as most browsers will not trigger style computation
        * for the transform action.
        */
      var hiddenMode: display | scale
    }
    object IConfig {
      
      inline def apply(hiddenMode: display | scale): IConfig = {
        val __obj = js.Dynamic.literal(hiddenMode = hiddenMode.asInstanceOf[js.Any])
        __obj.asInstanceOf[IConfig]
      }
      
      extension [Self <: IConfig](x: Self) {
        
        inline def setHiddenMode(value: display | scale): Self = StObject.set(x, "hiddenMode", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The args for the current path change signal.
      */
    trait ICurrentPathChangedArgs extends StObject {
      
      /**
        * The old value of the tree path, not including '/tree'.
        */
      var newValue: String
      
      /**
        * The new value of the tree path, not including '/tree'.
        */
      var oldValue: String
    }
    object ICurrentPathChangedArgs {
      
      inline def apply(newValue: String, oldValue: String): ICurrentPathChangedArgs = {
        val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICurrentPathChangedArgs]
      }
      
      extension [Self <: ICurrentPathChangedArgs](x: Self) {
        
        inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
        
        inline def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      }
    }
    
    trait IDownArea extends StObject {
      
      /**
        * The current widget that has down area focus.
        */
      val currentWidget: Widget | Null
      
      /**
        * Vertical relative size of the down area
        *
        * The main area will take the rest of the height
        */
      val size: Double | Null
      
      /**
        * The collection of widgets held by the panel.
        */
      val widgets: js.Array[Widget] | Null
    }
    object IDownArea {
      
      inline def apply(): IDownArea = {
        val __obj = js.Dynamic.literal(currentWidget = null, size = null, widgets = null)
        __obj.asInstanceOf[IDownArea]
      }
      
      extension [Self <: IDownArea](x: Self) {
        
        inline def setCurrentWidget(value: Widget): Self = StObject.set(x, "currentWidget", value.asInstanceOf[js.Any])
        
        inline def setCurrentWidgetNull: Self = StObject.set(x, "currentWidget", null)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeNull: Self = StObject.set(x, "size", null)
        
        inline def setWidgets(value: js.Array[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
        
        inline def setWidgetsNull: Self = StObject.set(x, "widgets", null)
        
        inline def setWidgetsVarargs(value: Widget*): Self = StObject.set(x, "widgets", js.Array(value*))
      }
    }
    
    /**
      * A description of the application's user interface layout.
      */
    trait ILayout extends StObject {
      
      /**
        * The down area of the user interface.
        */
      val downArea: IDownArea | Null
      
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
        * The relatives sizes of the areas of the user interface.
        */
      val relativeSizes: js.Array[Double] | Null
      
      /**
        * The right area of the user interface.
        */
      val rightArea: ISideArea | Null
    }
    object ILayout {
      
      inline def apply(): ILayout = {
        val __obj = js.Dynamic.literal(downArea = null, leftArea = null, mainArea = null, relativeSizes = null, rightArea = null)
        __obj.asInstanceOf[ILayout]
      }
      
      extension [Self <: ILayout](x: Self) {
        
        inline def setDownArea(value: IDownArea): Self = StObject.set(x, "downArea", value.asInstanceOf[js.Any])
        
        inline def setDownAreaNull: Self = StObject.set(x, "downArea", null)
        
        inline def setFresh(value: Boolean): Self = StObject.set(x, "fresh", value.asInstanceOf[js.Any])
        
        inline def setFreshUndefined: Self = StObject.set(x, "fresh", js.undefined)
        
        inline def setLeftArea(value: ISideArea): Self = StObject.set(x, "leftArea", value.asInstanceOf[js.Any])
        
        inline def setLeftAreaNull: Self = StObject.set(x, "leftArea", null)
        
        inline def setMainArea(value: IMainArea): Self = StObject.set(x, "mainArea", value.asInstanceOf[js.Any])
        
        inline def setMainAreaNull: Self = StObject.set(x, "mainArea", null)
        
        inline def setRelativeSizes(value: js.Array[Double]): Self = StObject.set(x, "relativeSizes", value.asInstanceOf[js.Any])
        
        inline def setRelativeSizesNull: Self = StObject.set(x, "relativeSizes", null)
        
        inline def setRelativeSizesVarargs(value: Double*): Self = StObject.set(x, "relativeSizes", js.Array(value*))
        
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
    }
    object IMainArea {
      
      inline def apply(): IMainArea = {
        val __obj = js.Dynamic.literal(currentWidget = null, dock = null)
        __obj.asInstanceOf[IMainArea]
      }
      
      extension [Self <: IMainArea](x: Self) {
        
        inline def setCurrentWidget(value: Widget): Self = StObject.set(x, "currentWidget", value.asInstanceOf[js.Any])
        
        inline def setCurrentWidgetNull: Self = StObject.set(x, "currentWidget", null)
        
        inline def setDock(value: ILayoutConfig): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
        
        inline def setDockNull: Self = StObject.set(x, "dock", null)
      }
    }
    
    /**
      * An options object for creating a lab shell object.
      */
    trait IOptions extends StObject {
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
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
        
        inline def setWidgetsVarargs(value: Widget*): Self = StObject.set(x, "widgets", js.Array(value*))
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
  open class LabShell () extends IShell {
    def this(options: IOptions) = this()
    
    /* private */ var _activeChanged: Any = js.native
    
    /**
      * Add a widget to the bottom content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToBottomArea: Any = js.native
    
    /* private */ var _addToDownArea: Any = js.native
    
    /**
      * Add a widget to the header content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToHeaderArea: Any = js.native
    
    /**
      * Add a widget to the left content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToLeftArea: Any = js.native
    
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
    /* private */ var _addToMainArea: Any = js.native
    
    /**
      * Add a widget to the title content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToMenuArea: Any = js.native
    
    /**
      * Add a widget to the right content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToRightArea: Any = js.native
    
    /**
      * Add a widget to the top content area.
      *
      * #### Notes
      * Widgets must have a unique `id` property, which will be used as the DOM id.
      */
    /* private */ var _addToTopArea: Any = js.native
    
    /* private */ var _adjacentBar: Any = js.native
    
    /* private */ var _bottomPanel: Any = js.native
    
    /* private */ var _cachedLayout: Any = js.native
    
    /* private */ var _currentChanged: Any = js.native
    
    /* private */ var _currentPath: Any = js.native
    
    /* private */ var _currentPathChanged: Any = js.native
    
    /* private */ var _currentTabBar: Any = js.native
    
    /**
      * A message hook for child add/remove messages on the main area dock panel.
      */
    /* private */ var _dockChildHook: Any = js.native
    
    /* private */ var _dockPanel: Any = js.native
    
    /* private */ var _downPanel: Any = js.native
    
    /* private */ var _headerPanel: Any = js.native
    
    /* private */ var _hsplitPanel: Any = js.native
    
    /* private */ var _isRestored: Any = js.native
    
    /* private */ var _layoutDebouncer: Any = js.native
    
    /* private */ var _layoutModified: Any = js.native
    
    /* private */ var _leftHandler: Any = js.native
    
    /* private */ var _mainOptionsCache: Any = js.native
    
    /* private */ var _menuHandler: Any = js.native
    
    /* private */ var _modeChanged: Any = js.native
    
    /**
      * Handle a change to the dock area active widget.
      */
    /* private */ var _onActiveChanged: Any = js.native
    
    /**
      * Handle a change to the dock area current widget.
      */
    /* private */ var _onCurrentChanged: Any = js.native
    
    /**
      * Handle a change to the layout.
      */
    /* private */ var _onLayoutModified: Any = js.native
    
    /**
      * Handle a change on the down panel widgets
      */
    /* private */ var _onTabPanelChanged: Any = js.native
    
    /* private */ var _restored: Any = js.native
    
    /* private */ var _rightHandler: Any = js.native
    
    /* private */ var _sideOptionsCache: Any = js.native
    
    /* private */ var _skipLinkWidget: Any = js.native
    
    /* private */ var _titleHandler: Any = js.native
    
    /* private */ var _topHandler: Any = js.native
    
    /* private */ var _tracker: Any = js.native
    
    /**
      * The path of the current widget changed, fire the _currentPathChanged signal.
      */
    /* private */ var _updateCurrentPath: Any = js.native
    
    /**
      * Update the title panel title based on the title of the current widget.
      */
    /* private */ var _updateTitlePanelTitle: Any = js.native
    
    /* private */ var _vsplitPanel: Any = js.native
    
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
    
    def addButtonEnabled: Boolean = js.native
    def addButtonEnabled_=(value: Boolean): Unit = js.native
    
    def addRequested: ISignal[DockPanel, TabBar[Widget]] = js.native
    
    /**
      * Close all widgets in the main and down area.
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
      * A signal emitted when the path of the current document changes.
      *
      * This also fires when the current document itself changes.
      */
    def currentPathChanged: ISignal[this.type, ICurrentPathChangedArgs] = js.native
    
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
    
    /**
      * A signal emitted when the shell/dock panel change modes (single/multiple document).
      */
    def modeChanged: ISignal[this.type, Mode] = js.native
    
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
    def restoreLayout(mode: Mode, layout: ILayout): Unit = js.native
    
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
    
    /**
      * Update the shell configuration.
      *
      * @param config Shell configuration
      */
    def updateConfig(config: PartialIConfig): Unit = js.native
    
    def widgets(area: Area): IIterator[Widget] = js.native
  }
}
