package typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2

import typings.googleapis.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPagespeedApiImageV2 extends js.Object {
  /**
    * Image data base64 encoded.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Height of screenshot in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Unique string key, if any, identifying this image.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Mime type of image data (e.g. &quot;image/jpeg&quot;).
    */
  var mime_type: js.UndefOr[String] = js.native
  /**
    * The region of the page that is captured by this image, with dimensions
    * measured in CSS pixels.
    */
  var page_rect: js.UndefOr[Left] = js.native
  /**
    * Width of screenshot in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaPagespeedApiImageV2 {
  @scala.inline
  def apply(
    data: String = null,
    height: js.UndefOr[Double] = js.undefined,
    key: String = null,
    mime_type: String = null,
    page_rect: Left = null,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaPagespeedApiImageV2 = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (mime_type != null) __obj.updateDynamic("mime_type")(mime_type.asInstanceOf[js.Any])
    if (page_rect != null) __obj.updateDynamic("page_rect")(page_rect.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPagespeedApiImageV2]
  }
}

