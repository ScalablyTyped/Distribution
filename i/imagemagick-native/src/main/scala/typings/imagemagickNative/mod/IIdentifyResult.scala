package typings.imagemagickNative.mod

import typings.imagemagickNative.AnonHeight
import typings.imagemagickNative.AnonOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIdentifyResult extends js.Object {
  var density: AnonHeight
  var depth: Double
  var exif: AnonOrientation
  var format: String
  var height: Double
  var width: Double
}

object IIdentifyResult {
  @scala.inline
  def apply(
    density: AnonHeight,
    depth: Double,
    exif: AnonOrientation,
    format: String,
    height: Double,
    width: Double
  ): IIdentifyResult = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdentifyResult]
  }
}

