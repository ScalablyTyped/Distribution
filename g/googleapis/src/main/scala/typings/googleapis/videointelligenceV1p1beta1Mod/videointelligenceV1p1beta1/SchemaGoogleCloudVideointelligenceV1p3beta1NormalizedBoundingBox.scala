package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Normalized bounding box. The normalized vertex coordinates are relative to
  * the original image. Range: [0, 1].
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox extends js.Object {
  /**
    * Bottom Y coordinate.
    */
  var bottom: js.UndefOr[Double] = js.native
  /**
    * Left X coordinate.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * Right X coordinate.
    */
  var right: js.UndefOr[Double] = js.native
  /**
    * Top Y coordinate.
    */
  var top: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox]
  }
}

