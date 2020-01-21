package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of inserting an embedded Google Sheets chart.
  */
@js.native
trait SchemaInsertInlineSheetsChartResponse extends js.Object {
  /**
    * The object ID of the inserted chart.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaInsertInlineSheetsChartResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaInsertInlineSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInsertInlineSheetsChartResponse]
  }
}

