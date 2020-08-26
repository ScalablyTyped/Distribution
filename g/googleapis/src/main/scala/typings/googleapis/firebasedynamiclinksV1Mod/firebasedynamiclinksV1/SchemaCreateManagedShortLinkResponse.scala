package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to create a short Dynamic Link.
  */
@js.native
trait SchemaCreateManagedShortLinkResponse extends js.Object {
  /**
    * Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz
    */
  var managedShortLink: js.UndefOr[SchemaManagedShortLink] = js.native
  /**
    * Preview link to show the link flow chart. (debug info.)
    */
  var previewLink: js.UndefOr[String] = js.native
  /**
    * Information about potential warnings on link creation.
    */
  var warning: js.UndefOr[js.Array[SchemaDynamicLinkWarning]] = js.native
}

object SchemaCreateManagedShortLinkResponse {
  @scala.inline
  def apply(): SchemaCreateManagedShortLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateManagedShortLinkResponse]
  }
  @scala.inline
  implicit class SchemaCreateManagedShortLinkResponseOps[Self <: SchemaCreateManagedShortLinkResponse] (val x: Self) extends AnyVal {
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
    def setManagedShortLink(value: SchemaManagedShortLink): Self = this.set("managedShortLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedShortLink: Self = this.set("managedShortLink", js.undefined)
    @scala.inline
    def setPreviewLink(value: String): Self = this.set("previewLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewLink: Self = this.set("previewLink", js.undefined)
    @scala.inline
    def setWarningVarargs(value: SchemaDynamicLinkWarning*): Self = this.set("warning", js.Array(value :_*))
    @scala.inline
    def setWarning(value: js.Array[SchemaDynamicLinkWarning]): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

