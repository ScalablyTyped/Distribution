package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating an embedded Google Sheets chart.
  */
@js.native
trait SchemaCreateSheetsChartResponse extends js.Object {
  /**
    * The object ID of the created chart.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaCreateSheetsChartResponse {
  @scala.inline
  def apply(objectId: String = null): SchemaCreateSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateSheetsChartResponse]
  }
}

