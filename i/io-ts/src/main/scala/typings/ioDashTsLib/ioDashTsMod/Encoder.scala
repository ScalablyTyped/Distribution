package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder[A, O] extends js.Object {
  def encode(a: A): O
}

object Encoder {
  @scala.inline
  def apply[A, O](encode: js.Function1[A, O]): Encoder[A, O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encode")(encode)
    __obj.asInstanceOf[Encoder[A, O]]
  }
}

