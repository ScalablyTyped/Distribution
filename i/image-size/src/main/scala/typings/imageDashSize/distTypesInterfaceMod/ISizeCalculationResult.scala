package typings.imageDashSize.distTypesInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISizeCalculationResult extends ISize {
  var images: js.UndefOr[js.Array[ISize]] = js.undefined
}

object ISizeCalculationResult {
  @scala.inline
  def apply(
    height: Int | Double = null,
    images: js.Array[ISize] = null,
    orientation: Int | Double = null,
    `type`: String = null,
    width: Int | Double = null
  ): ISizeCalculationResult = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISizeCalculationResult]
  }
}

