package typings.atJimpPluginDashResize.atJimpPluginDashResizeMod

import typings.atJimpPluginDashResize.Anon_BezierInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resize extends js.Object {
  var `class`: ResizeClass
  var constants: Anon_BezierInterpolation
}

object Resize {
  @scala.inline
  def apply(`class`: ResizeClass, constants: Anon_BezierInterpolation): Resize = {
    val __obj = js.Dynamic.literal(constants = constants)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[Resize]
  }
}

