package typings
package imageDashSizeLib.imageDashSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
  var height: scala.Double
  var orientation: js.UndefOr[scala.Double] = js.undefined
  var `type`: java.lang.String
  var width: scala.Double
}

object ImageInfo {
  @scala.inline
  def apply(
    height: scala.Double,
    `type`: java.lang.String,
    width: scala.Double,
    orientation: scala.Int | scala.Double = null
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    __obj.updateDynamic("type")(`type`)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
}

