package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolarCoordinates extends js.Object {
  var phi: scala.Double
  var r: scala.Double
}

object PolarCoordinates {
  @scala.inline
  def apply(phi: scala.Double, r: scala.Double): PolarCoordinates = {
    val __obj = js.Dynamic.literal(phi = phi, r = r)
  
    __obj.asInstanceOf[PolarCoordinates]
  }
}

