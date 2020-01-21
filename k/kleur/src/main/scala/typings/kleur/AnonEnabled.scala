package typings.kleur

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  var enabled: Boolean
}

object AnonEnabled {
  @scala.inline
  def apply(enabled: Boolean): AnonEnabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnabled]
  }
}

