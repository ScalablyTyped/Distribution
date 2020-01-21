package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe image data.
  */
@js.native
trait SchemaImage extends js.Object {
  /**
    * Image data in format determined by the mime type. Currently, the format
    * will always be &quot;image/png&quot;, but this might change in the
    * future.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The mime-type of the image data.
    */
  var mimeType: js.UndefOr[String] = js.native
}

object SchemaImage {
  @scala.inline
  def apply(data: String = null, mimeType: String = null): SchemaImage = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImage]
  }
}

