package typings
package jqueryDashHandsontableLib.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellPosition extends js.Object {
  var col: scala.Double
  var row: scala.Double
}

object CellPosition {
  @scala.inline
  def apply(col: scala.Double, row: scala.Double): CellPosition = {
    val __obj = js.Dynamic.literal(col = col, row = row)
  
    __obj.asInstanceOf[CellPosition]
  }
}

