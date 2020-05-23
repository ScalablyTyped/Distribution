package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hex extends js.Object {
  var hex: String
}

object Hex {
  @scala.inline
  def apply(hex: String): Hex = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hex]
  }
}

