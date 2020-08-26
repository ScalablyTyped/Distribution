package typings.intercomClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityVerificationOptions extends js.Object {
  var identifier: String = js.native
  var secretKey: String = js.native
}

object IdentityVerificationOptions {
  @scala.inline
  def apply(identifier: String, secretKey: String): IdentityVerificationOptions = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityVerificationOptions]
  }
  @scala.inline
  implicit class IdentityVerificationOptionsOps[Self <: IdentityVerificationOptions] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
  }
  
}

