package typings.jqueryMouseExit.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  lostFocus  :std.HTMLElement,   gainedFocus  :std.HTMLElement}> */
trait FocusElements extends js.Object {
  var gainedFocus: js.UndefOr[HTMLElement] = js.undefined
  var lostFocus: js.UndefOr[HTMLElement] = js.undefined
}

object FocusElements {
  @scala.inline
  def apply(gainedFocus: HTMLElement = null, lostFocus: HTMLElement = null): FocusElements = {
    val __obj = js.Dynamic.literal()
    if (gainedFocus != null) __obj.updateDynamic("gainedFocus")(gainedFocus.asInstanceOf[js.Any])
    if (lostFocus != null) __obj.updateDynamic("lostFocus")(lostFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusElements]
  }
}

