package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretBox extends js.Object {
  var cipher: Uint8Array = js.native
  var mac: Uint8Array = js.native
}

object SecretBox {
  @scala.inline
  def apply(cipher: Uint8Array, mac: Uint8Array): SecretBox = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretBox]
  }
  @scala.inline
  implicit class SecretBoxOps[Self <: SecretBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCipher(value: Uint8Array): Self = this.set("cipher", value.asInstanceOf[js.Any])
    @scala.inline
    def setMac(value: Uint8Array): Self = this.set("mac", value.asInstanceOf[js.Any])
  }
  
}

