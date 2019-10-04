package typings.atJimpPluginDashResize

import typings.atJimpPluginDashResize.atJimpPluginDashResizeStrings.bezierInterpolation
import typings.atJimpPluginDashResize.atJimpPluginDashResizeStrings.bicubicInterpolation
import typings.atJimpPluginDashResize.atJimpPluginDashResizeStrings.bilinearInterpolation
import typings.atJimpPluginDashResize.atJimpPluginDashResizeStrings.hermiteInterpolation
import typings.atJimpPluginDashResize.atJimpPluginDashResizeStrings.nearestNeighbor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BezierInterpolation extends js.Object {
  var RESIZE_BEZIER: bezierInterpolation
  var RESIZE_BICUBIC: bicubicInterpolation
  var RESIZE_BILINEAR: bilinearInterpolation
  var RESIZE_HERMITE: hermiteInterpolation
  // resize methods
  var RESIZE_NEAREST_NEIGHBOR: nearestNeighbor
}

object Anon_BezierInterpolation {
  @scala.inline
  def apply(
    RESIZE_BEZIER: bezierInterpolation,
    RESIZE_BICUBIC: bicubicInterpolation,
    RESIZE_BILINEAR: bilinearInterpolation,
    RESIZE_HERMITE: hermiteInterpolation,
    RESIZE_NEAREST_NEIGHBOR: nearestNeighbor
  ): Anon_BezierInterpolation = {
    val __obj = js.Dynamic.literal(RESIZE_BEZIER = RESIZE_BEZIER, RESIZE_BICUBIC = RESIZE_BICUBIC, RESIZE_BILINEAR = RESIZE_BILINEAR, RESIZE_HERMITE = RESIZE_HERMITE, RESIZE_NEAREST_NEIGHBOR = RESIZE_NEAREST_NEIGHBOR)
  
    __obj.asInstanceOf[Anon_BezierInterpolation]
  }
}

