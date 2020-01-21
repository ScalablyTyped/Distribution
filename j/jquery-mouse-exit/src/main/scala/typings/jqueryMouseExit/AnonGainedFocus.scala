package typings.jqueryMouseExit

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGainedFocus extends js.Object {
  var gainedFocus: HTMLElement
  var lostFocus: HTMLElement
}

object AnonGainedFocus {
  @scala.inline
  def apply(gainedFocus: HTMLElement, lostFocus: HTMLElement): AnonGainedFocus = {
    val __obj = js.Dynamic.literal(gainedFocus = gainedFocus.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGainedFocus]
  }
}

