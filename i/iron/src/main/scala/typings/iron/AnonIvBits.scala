package typings.iron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIvBits extends js.Object {
  var ivBits: Double
  var keyBits: Double
}

object AnonIvBits {
  @scala.inline
  def apply(ivBits: Double, keyBits: Double): AnonIvBits = {
    val __obj = js.Dynamic.literal(ivBits = ivBits.asInstanceOf[js.Any], keyBits = keyBits.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIvBits]
  }
}

