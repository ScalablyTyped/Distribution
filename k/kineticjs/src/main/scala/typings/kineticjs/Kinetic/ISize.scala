package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISize extends js.Object {
  var height: Double
  var width: Double
}

object ISize {
  @scala.inline
  def apply(height: Double, width: Double): ISize = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[ISize]
  }
}

