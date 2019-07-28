package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingOptions extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object PaddingOptions {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): PaddingOptions = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[PaddingOptions]
  }
}

