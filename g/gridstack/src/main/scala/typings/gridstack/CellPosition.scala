package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *   Defines the position of a cell inside the grid
  */
trait CellPosition extends js.Object {
  var x: Double
  var y: Double
}

object CellPosition {
  @scala.inline
  def apply(x: Double, y: Double): CellPosition = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[CellPosition]
  }
}

