package typings
package imagemagickDashNativeLib.imagemagickDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIdentifyResult extends js.Object {
  var density: imagemagickDashNativeLib.Anon_Height
  var depth: scala.Double
  var exif: imagemagickDashNativeLib.Anon_Orientation
  var format: java.lang.String
  var height: scala.Double
  var width: scala.Double
}

object IIdentifyResult {
  @scala.inline
  def apply(
    density: imagemagickDashNativeLib.Anon_Height,
    depth: scala.Double,
    exif: imagemagickDashNativeLib.Anon_Orientation,
    format: java.lang.String,
    height: scala.Double,
    width: scala.Double
  ): IIdentifyResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("density")(density)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("exif")(exif)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IIdentifyResult]
  }
}

