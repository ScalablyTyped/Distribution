package typings
package math3dLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  var columns: scala.Double
  var rows: scala.Double
}

object Anon_Columns {
  @scala.inline
  def apply(columns: scala.Double, rows: scala.Double): Anon_Columns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[Anon_Columns]
  }
}

