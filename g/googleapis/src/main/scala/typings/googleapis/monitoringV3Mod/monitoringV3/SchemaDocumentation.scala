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
  def apply(content: String = null, mimeType: String = null): SchemaDocumentation = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDocumentation]
  }
}

