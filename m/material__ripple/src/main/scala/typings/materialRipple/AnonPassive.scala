package typings.materialRipple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassive extends js.Object {
  var passive: Boolean
}

object AnonPassive {
  @scala.inline
  def apply(passive: Boolean): AnonPassive = {
    val __obj = js.Dynamic.literal(passive = passive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPassive]
  }
}

