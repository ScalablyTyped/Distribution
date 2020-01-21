package typings.libsodiumWrappers.mod

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
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StringSecretBox]
  }
}

