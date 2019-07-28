package typings.jqueryDashFocusDashExit.jqueryDashFocusDashExitMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusElements extends js.Object {
  var gainedFocus: HTMLElement
  var lostFocus: js.UndefOr[HTMLElement] = js.undefined
}

object FocusElements {
  @scala.inline
  def apply(gainedFocus: HTMLElement, lostFocus: HTMLElement = null): FocusElements = {
    val __obj = js.Dynamic.literal(gainedFocus = gainedFocus)
    if (lostFocus != null) __obj.updateDynamic("lostFocus")(lostFocus)
    __obj.asInstanceOf[FocusElements]
  }
}

