package typings.gun.anon

import typings.gun.gunStrings.PBKDF2
import typings.gun.gunStrings.`SHA-256`
import typings.gun.gunStrings.base16
import typings.gun.gunStrings.base32
import typings.gun.gunStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  name :'SHA-256' | 'PBKDF2',   encode :'base64' | 'base32' | 'base16',   iterations :number,   salt :any,   hash :string,   length :any}> */
@js.native
trait PartialnameSHA256PBKDF2en extends js.Object {
  var encode: js.UndefOr[base64 | base32 | base16] = js.native
  var hash: js.UndefOr[String] = js.native
  var iterations: js.UndefOr[Double] = js.native
  var length: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[`SHA-256` | PBKDF2] = js.native
  var salt: js.UndefOr[js.Any] = js.native
}

object PartialnameSHA256PBKDF2en {
  @scala.inline
  def apply(): PartialnameSHA256PBKDF2en = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialnameSHA256PBKDF2en]
  }
  @scala.inline
  implicit class PartialnameSHA256PBKDF2enOps[Self <: PartialnameSHA256PBKDF2en] (val x: Self) extends AnyVal {
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
    def setEncode(value: base64 | base32 | base16): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    @scala.inline
    def setLength(value: js.Any): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setName(value: `SHA-256` | PBKDF2): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSalt(value: js.Any): Self = this.set("salt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
  }
  
}

