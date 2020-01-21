package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single thumbnail, with its size and format.
  */
@js.native
trait SchemaThumbnail extends js.Object {
  /**
    * The thumbnail&#39;s content type, i.e. &quot;image/png&quot;.  Always
    * set.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * The thumbnail file itself.  That is, the bytes here are precisely the
    * bytes that make up the thumbnail file; they can be served as an image
    * as-is (with the appropriate content type.)  Always set.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The height of the thumbnail, in pixels.  Always set.
    */
  var heightPx: js.UndefOr[Double] = js.native
  /**
    * The width of the thumbnail, in pixels.  Always set.
    */
  var widthPx: js.UndefOr[Double] = js.native
}

object SchemaThumbnail {
  @scala.inline
  def apply(
    contentType: String = null,
    data: String = null,
    heightPx: Int | Double = null,
    widthPx: Int | Double = null
  ): SchemaThumbnail = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (heightPx != null) __obj.updateDynamic("heightPx")(heightPx.asInstanceOf[js.Any])
    if (widthPx != null) __obj.updateDynamic("widthPx")(widthPx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThumbnail]
  }
}

