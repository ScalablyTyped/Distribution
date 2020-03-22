package typings.jupyterlabApplication.shellMod

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.shellMod.ILabShell.Area
import typings.jupyterlabApplication.shellMod.ILabShell.IChangedArgs
import typings.jupyterlabApplication.shellMod.ILabShell.ILayout
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IOpenOptions
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.dockpanelMod.DockPanel.Mode
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/shell", "LabShell")
@js.native
/**
  * Construct a new application shell.
  */
class LabShell () extends IShell {
  var _activeChanged: js.Any = js.native
  /**
    * Add a widget to the bottom content area.
    *
    * #### Notes
    * Widgets must have a unique `id` property, which will be used as the DOM id.
    */
  var _addToBottomArea: js.Any = js.native
  /**
    * Add a widget to the header content area.
    *
    * #### Notes
    * Widgets must have a unique `id` property, which will be used as the DOM id.
    */
  var _addToHeaderArea: js.Any = js.native
  /**
    * Add a widget to the left content area.
    *
    * #### Notes
    * Widgets must have a unique `id` property, which will be used as the DOM id.
    */
  var _addToLeftArea: js.Any = js.native
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
  var _addToMainArea: js.Any = js.native
  /**
    * Add a widget to the right content area.
    *
    * #### Notes
    * Widgets must have a unique `id` property, which will be used as the DOM id.
    */
  var _addToRightArea: js.Any = js.native
  /**
    * Add a widget to the top content area.
    *
    * #### Notes
    * Widgets must have a unique `id` property, which will be used as the DOM id.
    */
  var _addToTopArea: js.Any = js.native
  var _adjacentBar: js.Any = js.native
  var _bottomPanel: js.Any = js.native
  var _cachedLayout: js.Any = js.native
  var _currentChanged: js.Any = js.native
  var _currentTabBar: js.Any = js.native
  /**
    * A message hook for child add/remove messages on the main area dock panel.
    */
  var _dockChildHook: js.Any = js.native
  var _dockPanel: js.Any = js.native
  var _headerPanel: js.Any = js.native
  var _isRestored: js.Any = js.native
  var _layoutDebouncer: js.Any = js.native
  var _layoutModified: js.Any = js.native
  var _leftHandler: js.Any = js.native
  var _mainOptionsCache: js.Any = js.native
  /**
    * Handle a change to the dock area active widget.
    */
  var _onActiveChanged: js.Any = js.native
  /**
    * Handle a change to the dock area current widget.
    */
  var _onCurrentChanged: js.Any = js.native
  /**
    * Handle a change to the layout.
    */
  var _onLayoutModified: js.Any = js.native
  var _restored: js.Any = js.native
  var _rightHandler: js.Any = js.native
  var _sideOptionsCache: js.Any = js.native
  var _topHandler: js.Any = js.native
  var _tracker: js.Any = js.native
  def activateNextTab(): Unit = js.native
  def activateNextTabBar(): Unit = js.native
  def activatePreviousTab(): Unit = js.native
  def activatePreviousTabBar(): Unit = js.native
  /**
    * A signal emitted when main area's active focus changes.
    */
  def activeChanged(): ISignal[this.type, IChangedArgs] = js.native
  /**
    * The active widget in the shell's main area.
    */
  def activeWidget(): Widget | Null = js.native
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
  def currentChanged(): ISignal[this.type, IChangedArgs] = js.native
  /**
    * The current widget in the shell's main area.
    */
  @JSName("currentWidget")
  def currentWidget_MLabShell(): Widget | Null = js.native
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
  def layoutModified(): ISignal[this.type, Unit] = js.native
  /**
    * Whether the left area is collapsed.
    */
  def leftCollapsed(): Boolean = js.native
  /**
    * The main dock area's user interface mode.
    */
  def mode(): Mode = js.native
  def mode(mode: Mode): js.Any = js.native
  /**
    * Whether JupyterLab is in presentation mode with the
    * `jp-mod-presentationMode` CSS class.
    */
  def presentationMode(): Boolean = js.native
  /**
    * Enable/disable presentation mode (`jp-mod-presentationMode` CSS class) with
    * a boolean.
    */
  def presentationMode(value: Boolean): js.Any = js.native
  /**
    * Restore the layout state for the application shell.
    */
  def restoreLayout(layout: ILayout): Unit = js.native
  /**
    * Promise that resolves when state is first restored, returning layout
    * description.
    */
  def restored(): js.Promise[ILayout] = js.native
  /**
    * Whether the left area is collapsed.
    */
  def rightCollapsed(): Boolean = js.native
  /**
    * Save the dehydrated state of the application shell.
    */
  def saveLayout(): ILayout = js.native
  def widgets(area: Area): IIterator[Widget] = js.native
}

