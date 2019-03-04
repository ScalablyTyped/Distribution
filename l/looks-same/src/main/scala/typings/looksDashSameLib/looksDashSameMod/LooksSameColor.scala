package typings
package looksDashSameLib.looksDashSameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pass to looksSame.colors function
  */
trait LooksSameColor extends js.Object {
  /**
    * Blue
    */
  var B: scala.Double
  /**
    * Green
    */
  var G: scala.Double
  /**
    * Red
    */
  var R: scala.Double
}

object LooksSameColor {
  @scala.inline
  def apply(B: scala.Double, G: scala.Double, R: scala.Double): LooksSameColor = {
    val __obj = js.Dynamic.literal(B = B, G = G, R = R)
  
    __obj.asInstanceOf[LooksSameColor]
  }
}

