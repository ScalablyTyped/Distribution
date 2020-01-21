package typings.imageminWebp.mod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Crop]
  }
}

