package typings
package jqueryDashMouseDashExitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GainedFocus extends js.Object {
  var gainedFocus: stdLib.HTMLElement
  var lostFocus: stdLib.HTMLElement
}

object Anon_GainedFocus {
  @scala.inline
  def apply(gainedFocus: stdLib.HTMLElement, lostFocus: stdLib.HTMLElement): Anon_GainedFocus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gainedFocus")(gainedFocus)
    __obj.updateDynamic("lostFocus")(lostFocus)
    __obj.asInstanceOf[Anon_GainedFocus]
  }
}

