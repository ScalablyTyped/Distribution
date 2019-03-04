package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gravity extends Vector {
  var scale: scala.Double
}

object Gravity {
  @scala.inline
  def apply(scale: scala.Double, x: scala.Double, y: scala.Double): Gravity = {
    val __obj = js.Dynamic.literal(scale = scale, x = x, y = y)
  
    __obj.asInstanceOf[Gravity]
  }
}

