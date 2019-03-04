package typings
package leafletDashAreaselectLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object Dimension {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): Dimension = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Dimension]
  }
}

