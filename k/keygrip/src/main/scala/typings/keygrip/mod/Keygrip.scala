package typings.keygrip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keygrip extends js.Object {
  def index(data: js.Any, digest: String): Double
  def sign(data: js.Any): String
  def verify(data: js.Any, digest: String): Boolean
}

object Keygrip {
  @scala.inline
  def apply(index: (js.Any, String) => Double, sign: js.Any => String, verify: (js.Any, String) => Boolean): Keygrip = {
    val __obj = js.Dynamic.literal(index = js.Any.fromFunction2(index), sign = js.Any.fromFunction1(sign), verify = js.Any.fromFunction2(verify))
  
    __obj.asInstanceOf[Keygrip]
  }
}

