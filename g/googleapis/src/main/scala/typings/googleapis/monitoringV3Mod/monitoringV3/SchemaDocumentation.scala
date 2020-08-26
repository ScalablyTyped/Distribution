package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A content string and a MIME type that describes the content string&#39;s
  * format.
  */
@js.native
trait SchemaDocumentation extends js.Object {
  /**
    * The text of the documentation, interpreted according to mime_type. The
    * content may not exceed 8,192 Unicode characters and may not exceed more
    * than 10,240 bytes when encoded in UTF-8 format, whichever is smaller.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The format of the content field. Presently, only the value
    * &quot;text/markdown&quot; is supported. See Markdown
    * (https://en.wikipedia.org/wiki/Markdown) for more information.
    */
  var mimeType: js.UndefOr[String] = js.native
}

object SchemaDocumentation {
  @scala.inline
  def apply(): SchemaDocumentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentation]
  }
  @scala.inline
  implicit class SchemaDocumentationOps[Self <: SchemaDocumentation] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
  }
  
}

