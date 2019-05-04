package typings
package atJupyterlabApplicationLib.libShellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/shell", "ApplicationShell")
@js.native
/**
  * Construct a new application shell.
  */
class ApplicationShell ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  var _activeChanged: js.Any = js.native
  var _addOptionsCache: js.Any = js.native
  var _adjacentBar: js.Any = js.native
  var _bottomPanel: js.Any = js.native
  var _cachedLayout: js.Any = js.native
  var _currentChanged: js.Any = js.native
  var _currentTabBar: js.Any = js.native
  var _debouncer: js.Any = js.native
  /**
    * A message hook for child add/remove messages on the main area dock panel.
    */
  var _dockChildHook: js.Any = js.native
  var _dockPanel: js.Any = js.native
  var _isRestored: js.Any = js.native
  var _layoutModified: js.Any = js.native
  var _leftHandler: js.Any = js.native
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
  var _topPanel: js.Any = js.native
  var _tracker: js.Any = js.native
  /**
    * A signal emitted when main area's active focus changes.
    */
  val activeChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.IChangedArgs] = js.native
  /**
    * The active widget in the shell's main area.
    */
  val activeWidget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget | scala.Null = js.native
  /**
    * A signal emitted when main area's current focus changes.
    */
  val currentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.IChangedArgs] = js.native
  /**
    * The current widget in the shell's main area.
    */
  val currentWidget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget | scala.Null = js.native
  /**
    * A signal emitted when the main area's layout is modified.
    */
  val layoutModified: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * Whether the left area is collapsed.
    */
  val leftCollapsed: scala.Boolean = js.native
  /**
    * The main dock area's user interface mode.
    */
  var mode: atPhosphorWidgetsLib.libDockpanelMod.DockPanelNs.Mode = js.native
  /**
    * Whether JupyterLab is in presentation mode with the `jp-mod-presentationMode` CSS class.
    */
  /**
    * Enable/disable presentation mode (`jp-mod-presentationMode` CSS class) with a boolean.
    */
  var presentationMode: scala.Boolean = js.native
  /**
    * Promise that resolves when state is first restored, returning layout
    * description.
    */
  val restored: js.Promise[atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.ILayout] = js.native
  /**
    * Whether the left area is collapsed.
    */
  val rightCollapsed: scala.Boolean = js.native
  /**
    * Activate a widget in its area.
    */
  def activateById(id: java.lang.String): scala.Unit = js.native
  def activateNextTab(): scala.Unit = js.native
  def activatePreviousTab(): scala.Unit = js.native
  /**
    * Add a widget to the bottom content area.
    *
    * #### Notes
    * Widgets must have a unique `id` property, which will be used as the DOM id.
    */
  def addToBottomArea(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Unit = js.native
  def addToBottomArea(
    widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget,
    options: atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.ISideAreaOptions
  ): scala.Unit = js.native
  /**
    * Add a widget to the left content area.
    *
    * #### Notes
    * Widgets must have a unique `id` property, which will be used as the DOM id.
    */
  def addToLeftArea(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Unit = js.native
  def addToLeftArea(
    widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget,
    options: atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.ISideAreaOptions
  ): scala.Unit = js.native
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
  def addToMainArea(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Unit = js.native
  def addToMainArea(
    widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget,
    options: atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.IMainAreaOptions
  ): scala.Unit = js.native
  /**
    * Add a widget to the right content area.
    *
    * #### Notes
    * Widgets must have a unique `id` property, which will be used as the DOM id.
    */
  def addToRightArea(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Unit = js.native
  def addToRightArea(
    widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget,
    options: atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.ISideAreaOptions
  ): scala.Unit = js.native
  /**
    * Add a widget to the top content area.
    *
    * #### Notes
    * Widgets must have a unique `id` property, which will be used as the DOM id.
    */
  def addToTopArea(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Unit = js.native
  def addToTopArea(
    widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget,
    options: atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.ISideAreaOptions
  ): scala.Unit = js.native
  /**
    * Close all widgets in the main area.
    */
  def closeAll(): scala.Unit = js.native
  /**
    * Collapse the left area.
    */
  def collapseLeft(): scala.Unit = js.native
  /**
    * Collapse the right area.
    */
  def collapseRight(): scala.Unit = js.native
  /**
    * Expand the left area.
    *
    * #### Notes
    * This will open the most recently used tab,
    * or the first tab if there is no most recently used.
    */
  def expandLeft(): scala.Unit = js.native
  /**
    * Expand the right area.
    *
    * #### Notes
    * This will open the most recently used tab,
    * or the first tab if there is no most recently used.
    */
  def expandRight(): scala.Unit = js.native
  /**
    * True if the given area is empty.
    */
  def isEmpty(area: atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.Area): scala.Boolean = js.native
  /**
    * Restore the layout state for the application shell.
    */
  def restoreLayout(layout: atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.ILayout): scala.Unit = js.native
  /**
    * Save the dehydrated state of the application shell.
    */
  def saveLayout(): atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.ILayout = js.native
  /**
    * Returns the widgets for an application area.
    */
  def widgets(area: atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.Area): atPhosphorAlgorithmLib.libIterMod.IIterator[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = js.native
}

