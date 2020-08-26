package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch productstatuses response.
  */
@js.native
trait SchemaProductstatusesCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors, if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productstatusesCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The requested product status. Only defined if the request was successful.
    */
  var productStatus: js.UndefOr[SchemaProductStatus] = js.native
}

object SchemaProductstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(): SchemaProductstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductstatusesCustomBatchResponseEntry]
  }
  @scala.inline
  implicit class SchemaProductstatusesCustomBatchResponseEntryOps[Self <: SchemaProductstatusesCustomBatchResponseEntry] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProductStatus(value: SchemaProductStatus): Self = this.set("productStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductStatus: Self = this.set("productStatus", js.undefined)
  }
  
}

