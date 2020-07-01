package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A thumbnail is an image representing a YouTube resource.
  */
@js.native
trait SchemaThumbnail extends js.Object {
  /**
    * (Optional) Height of the thumbnail image.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The thumbnail image&#39;s URL.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * (Optional) Width of the thumbnail image.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaThumbnail {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaThumbnail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThumbnail]
  }
}

