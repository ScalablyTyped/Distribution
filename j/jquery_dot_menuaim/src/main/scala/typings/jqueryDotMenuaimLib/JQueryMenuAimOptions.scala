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

