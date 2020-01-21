package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVideostream extends js.Object {
  /**
    * The height, in pixels, of the video resource.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * MIME type of the video stream.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * URL of the video stream.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The width, in pixels, of the video resource.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaVideostream {
  @scala.inline
  def apply(height: Int | Double = null, `type`: String = null, url: String = null, width: Int | Double = null): SchemaVideostream = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideostream]
  }
}

