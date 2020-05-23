package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexName extends js.Object {
  var hex: String
  var name: String
}

object HexName {
  @scala.inline
  def apply(hex: String, name: String): HexName = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexName]
  }
}

