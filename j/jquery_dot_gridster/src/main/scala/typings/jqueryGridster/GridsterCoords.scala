package typings.jqueryGridster

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
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], size_x = size_x.asInstanceOf[js.Any], size_y = size_y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridsterCoords]
  }
}

