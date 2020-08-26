package typings.jose.mod.JWKS

import typings.jose.mod.ImportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWKSImportOptions extends ImportOptions {
  var ignoreErrors: js.UndefOr[Boolean] = js.native
}

object JWKSImportOptions {
  @scala.inline
  def apply(): JWKSImportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWKSImportOptions]
  }
  @scala.inline
  implicit class JWKSImportOptionsOps[Self <: JWKSImportOptions] (val x: Self) extends AnyVal {
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
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
  }
  
}

