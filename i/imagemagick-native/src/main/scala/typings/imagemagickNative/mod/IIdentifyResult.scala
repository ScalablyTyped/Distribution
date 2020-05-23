package typings.imagemagickNative.mod

import typings.imagemagickNative.anon.Height
import typings.imagemagickNative.anon.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIdentifyResult extends js.Object {
  var density: Height
  var depth: Double
  var exif: Orientation
  var format: String
  var height: Double
  var width: Double
}

object IIdentifyResult {
  @scala.inline
  def apply(density: Height, depth: Double, exif: Orientation, format: String, height: Double, width: Double): IIdentifyResult = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdentifyResult]
  }
}

