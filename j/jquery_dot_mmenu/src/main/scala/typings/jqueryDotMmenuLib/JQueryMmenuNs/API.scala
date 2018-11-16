package typings
package jqueryDotMmenuLib.JQueryMmenuNs

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
  def bind(methodName: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): js.Any = js.native
  /** @see closeAllPanels() */
  @JSName("bind")
  def bind_closeAllPanels(
    methodName: jqueryDotMmenuLib.jqueryDotMmenuLibStrings.closeAllPanels,
    callback: js.Function0[scala.Unit]
  ): jqueryDotMmenuLib.JQuery = js.native
  /** @see closePanel() */
  @JSName("bind")
  def bind_closePanel(
    methodName: jqueryDotMmenuLib.jqueryDotMmenuLibStrings.closePanel,
    callback: js.Function1[/* panel */ jqueryDotMmenuLib.JQuery, scala.Unit]
  ): scala.Unit = js.native
  /** @see getInstance() */
  @JSName("bind")
  def bind_getInstance(
    methodName: jqueryDotMmenuLib.jqueryDotMmenuLibStrings.getInstance,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** @see init() */
  @JSName("bind")
  def bind_init(
    methodName: jqueryDotMmenuLib.jqueryDotMmenuLibStrings.init,
    callback: js.Function1[/* panel */ jqueryDotMmenuLib.JQuery, scala.Unit]
  ): scala.Unit = js.native
  /** @see openPanel() */
  @JSName("bind")
  def bind_openPanel(
    methodName: jqueryDotMmenuLib.jqueryDotMmenuLibStrings.openPanel,
    callback: js.Function1[/* panel */ jqueryDotMmenuLib.JQuery, scala.Unit]
  ): scala.Unit = js.native
  /** @see setSelected() */
  @JSName("bind")
  def bind_setSelected(
    methodName: jqueryDotMmenuLib.jqueryDotMmenuLibStrings.setSelected,
    callback: js.Function2[
      /* li */ jqueryDotMmenuLib.JQuery, 
      /* selected */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** @see update() */
  @JSName("bind")
  def bind_update(methodName: jqueryDotMmenuLib.jqueryDotMmenuLibStrings.update, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Trigger this method to close all opened panels and go back to the first panel.
           */
  def closeAllPanels(): jqueryDotMmenuLib.JQuery = js.native
  /**
           * Trigger this method to close a panel
           * (only available if the "slidingSubmenus" option is set to false).
           * @param panel
           */
  def closePanel(panel: jqueryDotMmenuLib.JQuery): scala.Unit = js.native
  /**
           * Trigger this method to get the class instance for the menu.
           */
  def getInstance(): scala.Unit = js.native
  /**
           * Trigger this method to (re)initialize a newly added panel.
           * @param panel The panel to (re)initialize.
           */
  def init(panel: jqueryDotMmenuLib.JQuery): scala.Unit = js.native
  /**
           * Trigger this method to open a panel.
           * @param panel The panel to open.
           */
  def openPanel(panel: jqueryDotMmenuLib.JQuery): scala.Unit = js.native
  /**
           * Trigger this method to set or unset a list item as "selected".
           * @param li The list item to set or unset as "selected".
           * @param selected Whether to set or unset the list item as "selected". Default: true
           */
  def setSelected(li: jqueryDotMmenuLib.JQuery): scala.Unit = js.native
  /**
           * Trigger this method to set or unset a list item as "selected".
           * @param li The list item to set or unset as "selected".
           * @param selected Whether to set or unset the list item as "selected". Default: true
           */
  def setSelected(li: jqueryDotMmenuLib.JQuery, selected: scala.Boolean): scala.Unit = js.native
  /**
           * Trigger this method to update the appearance for the menu.
           */
  def update(): scala.Unit = js.native
}

