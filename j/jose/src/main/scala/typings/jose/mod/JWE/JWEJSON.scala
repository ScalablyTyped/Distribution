package typings.jose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWEJSON extends js.Object {
  var aad: js.UndefOr[String] = js.native
  var ciphertext: String = js.native
  var iv: String = js.native
  var `protected`: js.UndefOr[String] = js.native
  var tag: String = js.native
  var unprotected: js.UndefOr[js.Object] = js.native
}

object JWEJSON {
  @scala.inline
  def apply(ciphertext: String, iv: String, tag: String): JWEJSON = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWEJSON]
  }
  @scala.inline
  implicit class JWEJSONOps[Self <: JWEJSON] (val x: Self) extends AnyVal {
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
    def setCiphertext(value: String): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    @scala.inline
    def setIv(value: String): Self = this.set("iv", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setAad(value: String): Self = this.set("aad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAad: Self = this.set("aad", js.undefined)
    @scala.inline
    def setProtected(value: String): Self = this.set("protected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtected: Self = this.set("protected", js.undefined)
    @scala.inline
    def setUnprotected(value: js.Object): Self = this.set("unprotected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprotected: Self = this.set("unprotected", js.undefined)
  }
  
}

