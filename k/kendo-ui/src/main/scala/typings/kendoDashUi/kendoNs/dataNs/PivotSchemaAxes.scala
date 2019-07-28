package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotSchemaAxes extends js.Object {
  var columns: PivotSchemaColumnAxis
  var rows: PivotSchemaRowAxis
}

object PivotSchemaAxes {
  @scala.inline
  def apply(columns: PivotSchemaColumnAxis, rows: PivotSchemaRowAxis): PivotSchemaAxes = {
    val __obj = js.Dynamic.literal(columns = columns, rows = rows)
  
    __obj.asInstanceOf[PivotSchemaAxes]
  }
}

