package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * The status of the execution. Only defined if   - the request was
    * successful; and  - the method is not get, getByMerchantOrderId, or one of
    * the test methods.
    */
  var executionStatus: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The retrieved order. Only defined if the method is get and if the request
    * was successful.
    */
  var order: js.UndefOr[SchemaOrder] = js.native
}

object SchemaOrdersCustomBatchResponseEntry {
  @scala.inline
  def apply(): SchemaOrdersCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchResponseEntry]
  }
  @scala.inline
  implicit class SchemaOrdersCustomBatchResponseEntryOps[Self <: SchemaOrdersCustomBatchResponseEntry] (val x: Self) extends AnyVal {
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    @scala.inline
    def setErrors(value: SchemaErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setExecutionStatus(value: String): Self = this.set("executionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionStatus: Self = this.set("executionStatus", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOrder(value: SchemaOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

