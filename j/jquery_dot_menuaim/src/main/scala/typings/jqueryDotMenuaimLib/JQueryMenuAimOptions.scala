package typings
package jqueryDotMenuaimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryMenuAimOptions extends js.Object {
  /** Function to call when a row is purposefully activated. Use this
    * to show a submenu's content for the activated row.
    */
  var activate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Function to call when a row is deactivated.
    */
  var deactivate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Function to call when mouse enters a menu row. Entering a row
    * does not mean the row has been activated, as the user may be
    * mousing over to a submenu.
    */
  var enter: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Function to call when mouse exits a menu row.
    */
  var exit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Function to call when mouse exits the entire menu. If this returns
    * true, the current row's deactivation event and callback function
    * will be fired. Otherwise, if this isn't supplied or it returns
    * false, the currently activated row will stay activated when the
    * mouse leaves the menu entirely.
    */
  var exitMenu: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Selector for identifying which elements in the menu are rows
    * that can trigger the above events. Defaults to "> li".
    * rowSelector: "> li",
    */
  var rowSelector: js.UndefOr[java.lang.String] = js.undefined
  /** Direction the submenu opens relative to the main menu. This
    * controls which direction is "forgiving" as the user moves their
    * cursor from the main menu into the submenu. Can be one of "right",
    * "left", "above", or "below". Defaults to "right".
    * submenuDirection: "right"
    */
  var submenuDirection: js.UndefOr[java.lang.String] = js.undefined
  /** You may have some menu rows that aren't submenus and therefore
    * shouldn't ever need to "activate." If so, filter submenu rows w/
    * this selector. Defaults to "*" (all elements).
    * submenuSelector: "*",
    */
  var submenuSelector: js.UndefOr[java.lang.String] = js.undefined
}

object JQueryMenuAimOptions {
  @scala.inline
  def apply(
    activate: () => scala.Unit = null,
    deactivate: () => scala.Unit = null,
    enter: () => scala.Unit = null,
    exit: () => scala.Unit = null,
    exitMenu: () => scala.Unit = null,
    rowSelector: java.lang.String = null,
    submenuDirection: java.lang.String = null,
    submenuSelector: java.lang.String = null
  ): JQueryMenuAimOptions = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction0(activate))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction0(deactivate))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction0(enter))
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction0(exit))
    if (exitMenu != null) __obj.updateDynamic("exitMenu")(js.Any.fromFunction0(exitMenu))
    if (rowSelector != null) __obj.updateDynamic("rowSelector")(rowSelector)
    if (submenuDirection != null) __obj.updateDynamic("submenuDirection")(submenuDirection)
    if (submenuSelector != null) __obj.updateDynamic("submenuSelector")(submenuSelector)
    __obj.asInstanceOf[JQueryMenuAimOptions]
  }
}

