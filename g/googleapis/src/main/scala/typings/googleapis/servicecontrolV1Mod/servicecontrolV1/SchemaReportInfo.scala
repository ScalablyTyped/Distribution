package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains additional info about the report operation.
  */
@js.native
trait SchemaReportInfo extends js.Object {
  /**
    * The Operation.operation_id value from the request.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Quota usage info when processing the `Operation`.
    */
  var quotaInfo: js.UndefOr[SchemaQuotaInfo] = js.native
}

object SchemaReportInfo {
  @scala.inline
  def apply(): SchemaReportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportInfo]
  }
  @scala.inline
  implicit class SchemaReportInfoOps[Self <: SchemaReportInfo] (val x: Self) extends AnyVal {
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
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setQuotaInfo(value: SchemaQuotaInfo): Self = this.set("quotaInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaInfo: Self = this.set("quotaInfo", js.undefined)
  }
  
}

