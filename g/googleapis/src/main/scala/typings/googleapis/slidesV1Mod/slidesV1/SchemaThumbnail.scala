package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The thumbnail of a page.
  */
@js.native
trait SchemaThumbnail extends js.Object {
  /**
    * The content URL of the thumbnail image.  The URL to the image has a
    * default lifetime of 30 minutes. This URL is tagged with the account of
    * the requester. Anyone with the URL effectively accesses the image as the
    * original requester. Access to the image may be lost if the
    * presentation&#39;s sharing settings change. The mime type of the
    * thumbnail image is the same as specified in the
    * `GetPageThumbnailRequest`.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * The positive height in pixels of the thumbnail image.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The positive width in pixels of the thumbnail image.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaThumbnail {
  @scala.inline
  def apply(
    contentUrl: String = null,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaThumbnail = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThumbnail]
  }
}

