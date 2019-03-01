package typings
package jqueryDashFocusDashExitLib.jqueryDashFocusDashExitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusElements extends js.Object {
  var gainedFocus: stdLib.HTMLElement
  var lostFocus: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object FocusElements {
  @scala.inline
  def apply(gainedFocus: stdLib.HTMLElement, lostFocus: stdLib.HTMLElement = null): FocusElements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gainedFocus")(gainedFocus)
    if (lostFocus != null) __obj.updateDynamic("lostFocus")(lostFocus)
    __obj.asInstanceOf[FocusElements]
  }
}

