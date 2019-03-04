package typings
package latlonDashGeohashLib.latlonDashGeohashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  @JSName("ne")
  var ne_FBounds: Point
  var sw: Point
}

object Bounds {
  @scala.inline
  def apply(ne: Point, sw: Point): Bounds = {
    val __obj = js.Dynamic.literal(ne = ne, sw = sw)
  
    __obj.asInstanceOf[Bounds]
  }
}

