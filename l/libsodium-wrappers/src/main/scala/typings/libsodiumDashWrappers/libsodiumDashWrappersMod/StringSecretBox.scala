package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringSecretBox extends js.Object {
  var cipher: String
  var mac: String
}

object StringSecretBox {
  @scala.inline
  def apply(cipher: String, mac: String): StringSecretBox = {
    val __obj = js.Dynamic.literal(cipher = cipher, mac = mac)
  
    __obj.asInstanceOf[StringSecretBox]
  }
}

