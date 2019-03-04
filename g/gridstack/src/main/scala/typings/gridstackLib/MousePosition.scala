package typings
package gridstackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Defines the coordiantes of a object
*/
trait MousePosition extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object MousePosition {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): MousePosition = {
    val __obj = js.Dynamic.literal(left = left, top = top)
  
    __obj.asInstanceOf[MousePosition]
  }
}

