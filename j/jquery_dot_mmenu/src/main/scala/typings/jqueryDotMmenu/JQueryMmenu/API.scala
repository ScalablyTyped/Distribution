package typings.jqueryDotMmenu.JQueryMmenu

import typings.jqueryDotMmenu.JQuery
import typings.jqueryDotMmenu.jqueryDotMmenuStrings.closeAllPanels
import typings.jqueryDotMmenu.jqueryDotMmenuStrings.closePanel
import typings.jqueryDotMmenu.jqueryDotMmenuStrings.getInstance
import typings.jqueryDotMmenu.jqueryDotMmenuStrings.init
import typings.jqueryDotMmenu.jqueryDotMmenuStrings.openPanel
import typings.jqueryDotMmenu.jqueryDotMmenuStrings.setSelected
import typings.jqueryDotMmenu.jqueryDotMmenuStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
  /**
    * Trigger non-specialized signature method
    * @param methodName
    * @param callback
    */
  def bind(methodName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  /** @see closeAllPanels() */
  @JSName("bind")
  def bind_closeAllPanels(methodName: closeAllPanels, callback: js.Function0[Unit]): JQuery = js.native
  /** @see closePanel() */
  @JSName("bind")
  def bind_closePanel(methodName: closePanel, callback: js.Function1[/* panel */ JQuery, Unit]): Unit = js.native
  /** @see getInstance() */
  @JSName("bind")
  def bind_getInstance(methodName: getInstance, callback: js.Function0[Unit]): Unit = js.native
  /** @see init() */
  @JSName("bind")
  def bind_init(methodName: init, callback: js.Function1[/* panel */ JQuery, Unit]): Unit = js.native
  /** @see openPanel() */
  @JSName("bind")
  def bind_openPanel(methodName: openPanel, callback: js.Function1[/* panel */ JQuery, Unit]): Unit = js.native
  /** @see setSelected() */
  @JSName("bind")
  def bind_setSelected(
    methodName: setSelected,
    callback: js.Function2[/* li */ JQuery, /* selected */ js.UndefOr[Boolean], Unit]
  ): Unit = js.native
  /** @see update() */
  @JSName("bind")
  def bind_update(methodName: update, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Trigger this method to close all opened panels and go back to the first panel.
    */
  def closeAllPanels(): JQuery = js.native
  /**
    * Trigger this method to close a panel
    * (only available if the "slidingSubmenus" option is set to false).
    * @param panel
    */
  def closePanel(panel: JQuery): Unit = js.native
  /**
    * Trigger this method to get the class instance for the menu.
    */
  def getInstance(): Unit = js.native
  /**
    * Trigger this method to (re)initialize a newly added panel.
    * @param panel The panel to (re)initialize.
    */
  def init(panel: JQuery): Unit = js.native
  /**
    * Trigger this method to open a panel.
    * @param panel The panel to open.
    */
  def openPanel(panel: JQuery): Unit = js.native
  /**
    * Trigger this method to set or unset a list item as "selected".
    * @param li The list item to set or unset as "selected".
    * @param selected Whether to set or unset the list item as "selected". Default: true
    */
  def setSelected(li: JQuery): Unit = js.native
  def setSelected(li: JQuery, selected: Boolean): Unit = js.native
  /**
    * Trigger this method to update the appearance for the menu.
    */
  def update(): Unit = js.native
}

