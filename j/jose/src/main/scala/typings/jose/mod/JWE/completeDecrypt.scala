package typings.jose.mod.JWE

import typings.jose.mod.JWK.Key
import typings.jose.mod.JWK.OctKey
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait completeDecrypt extends js.Object {
  var aad: js.UndefOr[String] = js.native
  var cek: OctKey = js.native
  var cleartext: Buffer = js.native
  var header: js.UndefOr[js.Object] = js.native
  var key: Key = js.native
  var `protected`: js.UndefOr[js.Object] = js.native
  var unprotected: js.UndefOr[js.Object] = js.native
}

object completeDecrypt {
  @scala.inline
  def apply(cek: OctKey, cleartext: Buffer, key: Key): completeDecrypt = {
    val __obj = js.Dynamic.literal(cek = cek.asInstanceOf[js.Any], cleartext = cleartext.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[completeDecrypt]
  }
  @scala.inline
  implicit class completeDecryptOps[Self <: completeDecrypt] (val x: Self) extends AnyVal {
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
    def setCek(value: OctKey): Self = this.set("cek", value.asInstanceOf[js.Any])
    @scala.inline
    def setCleartext(value: Buffer): Self = this.set("cleartext", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setAad(value: String): Self = this.set("aad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAad: Self = this.set("aad", js.undefined)
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setProtected(value: js.Object): Self = this.set("protected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtected: Self = this.set("protected", js.undefined)
    @scala.inline
    def setUnprotected(value: js.Object): Self = this.set("unprotected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprotected: Self = this.set("unprotected", js.undefined)
  }
  
}

