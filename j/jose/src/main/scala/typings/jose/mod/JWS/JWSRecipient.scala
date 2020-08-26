package typings.jose.mod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWSRecipient extends js.Object {
  var header: js.UndefOr[js.Object] = js.native
  var `protected`: js.UndefOr[String] = js.native
  var signature: String = js.native
}

object JWSRecipient {
  @scala.inline
  def apply(signature: String): JWSRecipient = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWSRecipient]
  }
  @scala.inline
  implicit class JWSRecipientOps[Self <: JWSRecipient] (val x: Self) extends AnyVal {
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
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setProtected(value: String): Self = this.set("protected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtected: Self = this.set("protected", js.undefined)
  }
  
}

