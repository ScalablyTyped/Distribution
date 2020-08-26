package typings.jqueryMenuaim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryMenuAimOptions extends js.Object {
  /** Function to call when a row is purposefully activated. Use this
    * to show a submenu's content for the activated row.
    */
  var activate: js.UndefOr[js.Function0[Unit]] = js.native
  /** Function to call when a row is deactivated.
    */
  var deactivate: js.UndefOr[js.Function0[Unit]] = js.native
  /** Function to call when mouse enters a menu row. Entering a row
    * does not mean the row has been activated, as the user may be
    * mousing over to a submenu.
    */
  var enter: js.UndefOr[js.Function0[Unit]] = js.native
  /** Function to call when mouse exits a menu row.
    */
  var exit: js.UndefOr[js.Function0[Unit]] = js.native
  /** Function to call when mouse exits the entire menu. If this returns
    * true, the current row's deactivation event and callback function
    * will be fired. Otherwise, if this isn't supplied or it returns
    * false, the currently activated row will stay activated when the
    * mouse leaves the menu entirely.
    */
  var exitMenu: js.UndefOr[js.Function0[Unit]] = js.native
  /** Selector for identifying which elements in the menu are rows
    * that can trigger the above events. Defaults to "> li".
    * rowSelector: "> li",
    */
  var rowSelector: js.UndefOr[String] = js.native
  /** Direction the submenu opens relative to the main menu. This
    * controls which direction is "forgiving" as the user moves their
    * cursor from the main menu into the submenu. Can be one of "right",
    * "left", "above", or "below". Defaults to "right".
    * submenuDirection: "right"
    */
  var submenuDirection: js.UndefOr[String] = js.native
  /** You may have some menu rows that aren't submenus and therefore
    * shouldn't ever need to "activate." If so, filter submenu rows w/
    * this selector. Defaults to "*" (all elements).
    * submenuSelector: "*",
    */
  var submenuSelector: js.UndefOr[String] = js.native
}

object JQueryMenuAimOptions {
  @scala.inline
  def apply(): JQueryMenuAimOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryMenuAimOptions]
  }
  @scala.inline
  implicit class JQueryMenuAimOptionsOps[Self <: JQueryMenuAimOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivate(value: () => Unit): Self = this.set("activate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    @scala.inline
    def setDeactivate(value: () => Unit): Self = this.set("deactivate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDeactivate: Self = this.set("deactivate", js.undefined)
    @scala.inline
    def setEnter(value: () => Unit): Self = this.set("enter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setExit(value: () => Unit): Self = this.set("exit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    @scala.inline
    def setExitMenu(value: () => Unit): Self = this.set("exitMenu", js.Any.fromFunction0(value))
    @scala.inline
    def deleteExitMenu: Self = this.set("exitMenu", js.undefined)
    @scala.inline
    def setRowSelector(value: String): Self = this.set("rowSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSelector: Self = this.set("rowSelector", js.undefined)
    @scala.inline
    def setSubmenuDirection(value: String): Self = this.set("submenuDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenuDirection: Self = this.set("submenuDirection", js.undefined)
    @scala.inline
    def setSubmenuSelector(value: String): Self = this.set("submenuSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenuSelector: Self = this.set("submenuSelector", js.undefined)
  }
  
}

