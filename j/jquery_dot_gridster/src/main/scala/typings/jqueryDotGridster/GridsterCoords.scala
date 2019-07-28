package typings.jqueryDotGridster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterCoords extends js.Object {
  var col: Double
  var row: Double
  var size_x: Double
  var size_y: Double
}

object GridsterCoords {
  @scala.inline
  def apply(col: Double, row: Double, size_x: Double, size_y: Double): GridsterCoords = {
    val __obj = js.Dynamic.literal(col = col, row = row, size_x = size_x, size_y = size_y)
  
    __obj.asInstanceOf[GridsterCoords]
  }
}

