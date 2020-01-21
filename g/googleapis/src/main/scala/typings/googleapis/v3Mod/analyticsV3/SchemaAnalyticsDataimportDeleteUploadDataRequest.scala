package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request template for the delete upload data request.
  */
@js.native
trait SchemaAnalyticsDataimportDeleteUploadDataRequest extends js.Object {
  /**
    * A list of upload UIDs.
    */
  var customDataImportUids: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAnalyticsDataimportDeleteUploadDataRequest {
  @scala.inline
  def apply(customDataImportUids: js.Array[String] = null): SchemaAnalyticsDataimportDeleteUploadDataRequest = {
    val __obj = js.Dynamic.literal()
    if (customDataImportUids != null) __obj.updateDynamic("customDataImportUids")(customDataImportUids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnalyticsDataimportDeleteUploadDataRequest]
  }
}

