package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAccess extends js.Object {
  var `access-oauth-token`: js.UndefOr[js.Array[String]] = js.native
  var `access-oauth-uri`: js.UndefOr[String] = js.native
  var `access-password`: js.UndefOr[String] = js.native
  var `access-pin`: js.UndefOr[String] = js.native
  var `access-user-name`: js.UndefOr[String] = js.native
}

object DocumentAccess {
  @scala.inline
  def apply(): DocumentAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAccess]
  }
  @scala.inline
  implicit class DocumentAccessOps[Self <: DocumentAccess] (val x: Self) extends AnyVal {
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
    def `setAccess-oauth-tokenVarargs`(value: String*): Self = this.set("access-oauth-token", js.Array(value :_*))
    @scala.inline
    def `setAccess-oauth-token`(value: js.Array[String]): Self = this.set("access-oauth-token", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-oauth-token`: Self = this.set("access-oauth-token", js.undefined)
    @scala.inline
    def `setAccess-oauth-uri`(value: String): Self = this.set("access-oauth-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-oauth-uri`: Self = this.set("access-oauth-uri", js.undefined)
    @scala.inline
    def `setAccess-password`(value: String): Self = this.set("access-password", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-password`: Self = this.set("access-password", js.undefined)
    @scala.inline
    def `setAccess-pin`(value: String): Self = this.set("access-pin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-pin`: Self = this.set("access-pin", js.undefined)
    @scala.inline
    def `setAccess-user-name`(value: String): Self = this.set("access-user-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-user-name`: Self = this.set("access-user-name", js.undefined)
  }
  
}

