package typings.math3d.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: Double
  var rows: Double
}

object Columns {
  @scala.inline
  def apply(columns: Double, rows: Double): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

