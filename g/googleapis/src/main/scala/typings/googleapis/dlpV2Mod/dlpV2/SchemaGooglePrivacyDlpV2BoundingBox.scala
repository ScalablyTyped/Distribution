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
    height: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaGooglePrivacyDlpV2BoundingBox = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2BoundingBox]
  }
}

