package typings.jsNacl.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxSharedSecret extends js.Object {
  var boxK: Uint8Array = js.native
}

object BoxSharedSecret {
  @scala.inline
  def apply(boxK: Uint8Array): BoxSharedSecret = {
    val __obj = js.Dynamic.literal(boxK = boxK.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSharedSecret]
  }
  @scala.inline
  implicit class BoxSharedSecretOps[Self <: BoxSharedSecret] (val x: Self) extends AnyVal {
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
    def setBoxK(value: Uint8Array): Self = this.set("boxK", value.asInstanceOf[js.Any])
  }
  
}

