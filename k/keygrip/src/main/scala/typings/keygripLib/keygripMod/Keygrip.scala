package typings
package keygripLib.keygripMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keygrip extends js.Object {
  def index(data: js.Any, digest: java.lang.String): scala.Double
  def sign(data: js.Any): java.lang.String
  def verify(data: js.Any, digest: java.lang.String): scala.Boolean
}

object Keygrip {
  @scala.inline
  def apply(
    index: (js.Any, java.lang.String) => scala.Double,
    sign: js.Any => java.lang.String,
    verify: (js.Any, java.lang.String) => scala.Boolean
  ): Keygrip = {
    val __obj = js.Dynamic.literal(index = js.Any.fromFunction2(index), sign = js.Any.fromFunction1(sign), verify = js.Any.fromFunction2(verify))
  
    __obj.asInstanceOf[Keygrip]
  }
}

