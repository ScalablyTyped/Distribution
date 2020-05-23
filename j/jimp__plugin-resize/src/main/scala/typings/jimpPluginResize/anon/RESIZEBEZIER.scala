package typings.jimpPluginResize.anon

import typings.jimpPluginResize.jimpPluginResizeStrings.bezierInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.bicubicInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.bilinearInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.hermiteInterpolation
import typings.jimpPluginResize.jimpPluginResizeStrings.nearestNeighbor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESIZEBEZIER extends js.Object {
  var RESIZE_BEZIER: bezierInterpolation
  var RESIZE_BICUBIC: bicubicInterpolation
  var RESIZE_BILINEAR: bilinearInterpolation
  var RESIZE_HERMITE: hermiteInterpolation
  // resize methods
  var RESIZE_NEAREST_NEIGHBOR: nearestNeighbor
}

object RESIZEBEZIER {
  @scala.inline
  def apply(
    RESIZE_BEZIER: bezierInterpolation,
    RESIZE_BICUBIC: bicubicInterpolation,
    RESIZE_BILINEAR: bilinearInterpolation,
    RESIZE_HERMITE: hermiteInterpolation,
    RESIZE_NEAREST_NEIGHBOR: nearestNeighbor
  ): RESIZEBEZIER = {
    val __obj = js.Dynamic.literal(RESIZE_BEZIER = RESIZE_BEZIER.asInstanceOf[js.Any], RESIZE_BICUBIC = RESIZE_BICUBIC.asInstanceOf[js.Any], RESIZE_BILINEAR = RESIZE_BILINEAR.asInstanceOf[js.Any], RESIZE_HERMITE = RESIZE_HERMITE.asInstanceOf[js.Any], RESIZE_NEAREST_NEIGHBOR = RESIZE_NEAREST_NEIGHBOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[RESIZEBEZIER]
  }
}

