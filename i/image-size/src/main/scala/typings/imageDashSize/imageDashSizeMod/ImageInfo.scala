package typings.imageDashSize.imageDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
  var height: Double
  var orientation: js.UndefOr[Double] = js.undefined
  var `type`: String
  var width: Double
}

object ImageInfo {
  @scala.inline
  def apply(height: Double, `type`: String, width: Double, orientation: Int | Double = null): ImageInfo = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    __obj.updateDynamic("type")(`type`)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
}

