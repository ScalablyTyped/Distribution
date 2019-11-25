package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotSchemaColumnAxis extends js.Object {
  var tuples: js.Array[PivotTupleModel]
}

object PivotSchemaColumnAxis {
  @scala.inline
  def apply(tuples: js.Array[PivotTupleModel]): PivotSchemaColumnAxis = {
    val __obj = js.Dynamic.literal(tuples = tuples.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PivotSchemaColumnAxis]
  }
}

