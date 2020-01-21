package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotSchemaRowAxis extends js.Object {
  var tuples: js.Array[PivotTupleModel]
}

object PivotSchemaRowAxis {
  @scala.inline
  def apply(tuples: js.Array[PivotTupleModel]): PivotSchemaRowAxis = {
    val __obj = js.Dynamic.literal(tuples = tuples.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PivotSchemaRowAxis]
  }
}

