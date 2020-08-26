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
  def apply(): SchemaAnalyticsDataimportDeleteUploadDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsDataimportDeleteUploadDataRequest]
  }
  @scala.inline
  implicit class SchemaAnalyticsDataimportDeleteUploadDataRequestOps[Self <: SchemaAnalyticsDataimportDeleteUploadDataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomDataImportUidsVarargs(value: String*): Self = this.set("customDataImportUids", js.Array(value :_*))
    @scala.inline
    def setCustomDataImportUids(value: js.Array[String]): Self = this.set("customDataImportUids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDataImportUids: Self = this.set("customDataImportUids", js.undefined)
  }
  
}

