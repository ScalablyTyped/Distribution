package typings.jose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pemEncodingOptions extends js.Object {
  var cipher: js.UndefOr[String] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object pemEncodingOptions {
  @scala.inline
  def apply(): pemEncodingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pemEncodingOptions]
  }
  @scala.inline
  implicit class pemEncodingOptionsOps[Self <: pemEncodingOptions] (val x: Self) extends AnyVal {
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
    def setCipher(value: String): Self = this.set("cipher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCipher: Self = this.set("cipher", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

