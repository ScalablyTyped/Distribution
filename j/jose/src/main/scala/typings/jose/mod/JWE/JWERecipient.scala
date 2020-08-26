package typings.jose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWERecipient extends js.Object {
  var encrypted_key: String = js.native
  var header: js.UndefOr[js.Object] = js.native
}

object JWERecipient {
  @scala.inline
  def apply(encrypted_key: String): JWERecipient = {
    val __obj = js.Dynamic.literal(encrypted_key = encrypted_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWERecipient]
  }
  @scala.inline
  implicit class JWERecipientOps[Self <: JWERecipient] (val x: Self) extends AnyVal {
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
    def setEncrypted_key(value: String): Self = this.set("encrypted_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
  
}

