package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bounding box encompassing detected text within an image.
  */
@js.native
trait SchemaGooglePrivacyDlpV2BoundingBox extends js.Object {
  /**
    * Height of the bounding box in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Left coordinate of the bounding box. (0,0) is upper left.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * Top coordinate of the bounding box. (0,0) is upper left.
    */
  var top: js.UndefOr[Double] = js.native
  /**
    * Width of the bounding box in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2BoundingBox {
  @scala.inline
  def apply(
    height: Int | Double = null,
    left: Int | Double = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): SchemaGooglePrivacyDlpV2BoundingBox = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BoundingBox]
  }
}

