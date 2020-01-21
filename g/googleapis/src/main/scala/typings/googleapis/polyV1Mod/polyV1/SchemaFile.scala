package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a file in Poly, which can be a root, resource, or thumbnail
  * file.
  */
@js.native
trait SchemaFile extends js.Object {
  /**
    * The MIME content-type, such as `image/png`. For more information, see
    * [MIME
    * types](//developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types).
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * The path of the resource file relative to the root file. For root or
    * thumbnail files, this is just the filename.
    */
  var relativePath: js.UndefOr[String] = js.native
  /**
    * The URL where the file data can be retrieved.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaFile {
  @scala.inline
  def apply(contentType: String = null, relativePath: String = null, url: String = null): SchemaFile = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFile]
  }
}

