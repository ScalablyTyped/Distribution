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
    val __obj = js.Dynamic.literal(density = density, depth = depth, exif = exif, format = format, height = height, width = width)
  
    __obj.asInstanceOf[IIdentifyResult]
  }
}

