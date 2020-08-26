package typings.hapiIron.mod.password

import typings.hapiIron.mod.Password_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  Secret object with optional id.
  */
@js.native
trait Secret extends js.Object {
  var id: js.UndefOr[String] = js.native
  var secret: Password_ = js.native
}

object Secret {
  @scala.inline
  def apply(secret: Password_): Secret = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secret]
  }
  @scala.inline
  implicit class SecretOps[Self <: Secret] (val x: Self) extends AnyVal {
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
    def setSecret(value: Password_): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

