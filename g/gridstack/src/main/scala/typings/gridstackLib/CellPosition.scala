package typings
package gridstackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
*   Defines the position of a cell inside the grid
*/
trait CellPosition extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object CellPosition {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): CellPosition = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[CellPosition]
  }
}

