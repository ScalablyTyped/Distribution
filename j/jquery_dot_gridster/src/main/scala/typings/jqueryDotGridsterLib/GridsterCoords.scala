package typings
package jqueryDotGridsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterCoords extends js.Object {
  var col: scala.Double
  var row: scala.Double
  var size_x: scala.Double
  var size_y: scala.Double
}

object GridsterCoords {
  @scala.inline
  def apply(col: scala.Double, row: scala.Double, size_x: scala.Double, size_y: scala.Double): GridsterCoords = {
    val __obj = js.Dynamic.literal(col = col, row = row, size_x = size_x, size_y = size_y)
  
    __obj.asInstanceOf[GridsterCoords]
  }
}

