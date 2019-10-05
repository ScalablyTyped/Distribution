package typings.leafletDotPm.leafletMod.PM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draw extends js.Object {
  def getShapes(): js.Array[String]
}

object Draw {
  @scala.inline
  def apply(getShapes: () => js.Array[String]): Draw = {
    val __obj = js.Dynamic.literal(getShapes = js.Any.fromFunction0(getShapes))
  
    __obj.asInstanceOf[Draw]
  }
}

