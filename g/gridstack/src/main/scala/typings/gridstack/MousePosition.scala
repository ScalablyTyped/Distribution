package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Defines the coordiantes of a object
*/
trait MousePosition extends js.Object {
  var left: Double
  var top: Double
}

object MousePosition {
  @scala.inline
  def apply(left: Double, top: Double): MousePosition = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[MousePosition]
  }
}

