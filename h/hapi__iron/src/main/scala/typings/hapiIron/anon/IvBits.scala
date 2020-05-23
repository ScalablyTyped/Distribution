package typings.hapiIron.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IvBits extends js.Object {
  var ivBits: Double
  var keyBits: Double
}

object IvBits {
  @scala.inline
  def apply(ivBits: Double, keyBits: Double): IvBits = {
    val __obj = js.Dynamic.literal(ivBits = ivBits.asInstanceOf[js.Any], keyBits = keyBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[IvBits]
  }
}

