package typings.imageminDashWebp.imageminDashWebpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crop extends Resize {
  var x: Double
  var y: Double
}

object Crop {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): Crop = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Crop]
  }
}

