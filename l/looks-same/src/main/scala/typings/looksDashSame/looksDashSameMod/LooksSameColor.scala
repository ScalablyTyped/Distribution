package typings.looksDashSame.looksDashSameMod

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
  var B: Double
  /**
    * Green
    */
  var G: Double
  /**
    * Red
    */
  var R: Double
}

object LooksSameColor {
  @scala.inline
  def apply(B: Double, G: Double, R: Double): LooksSameColor = {
    val __obj = js.Dynamic.literal(B = B, G = G, R = R)
  
    __obj.asInstanceOf[LooksSameColor]
  }
}

