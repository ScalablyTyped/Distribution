package typings.ionicCore.virtualScrollUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var bottom: Double
  var top: Double
}

object Viewport {
  @scala.inline
  def apply(bottom: Double, top: Double): Viewport = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
}

