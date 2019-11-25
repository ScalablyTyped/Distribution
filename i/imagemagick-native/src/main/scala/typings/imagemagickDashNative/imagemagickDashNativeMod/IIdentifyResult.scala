package typings.imagemagickDashNative.imagemagickDashNativeMod

import typings.imagemagickDashNative.Anon_Height
import typings.imagemagickDashNative.Anon_Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIdentifyResult extends js.Object {
  var density: Anon_Height
  var depth: Double
  var exif: Anon_Orientation
  var format: String
  var height: Double
  var width: Double
}

object IIdentifyResult {
  @scala.inline
  def apply(
    density: Anon_Height,
    depth: Double,
    exif: Anon_Orientation,
    format: String,
    height: Double,
    width: Double
  ): IIdentifyResult = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IIdentifyResult]
  }
}

