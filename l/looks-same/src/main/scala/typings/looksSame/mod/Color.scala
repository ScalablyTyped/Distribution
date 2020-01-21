package typings.looksSame.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pass to looksSame.colors function
  */
trait Color extends js.Object {
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

object Color {
  @scala.inline
  def apply(B: Double, G: Double, R: Double): Color = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Color]
  }
}

