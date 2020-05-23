package typings.imageSize.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISizeCalculationResult extends ISize {
  var images: js.UndefOr[js.Array[ISize]] = js.undefined
}

object ISizeCalculationResult {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    images: js.Array[ISize] = null,
    orientation: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ISizeCalculationResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (!js.isUndefined(orientation)) __obj.updateDynamic("orientation")(orientation.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISizeCalculationResult]
  }
}

