package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch accountstatuses request.
  */
@js.native
trait SchemaAccountstatusesCustomBatchRequestEntry extends js.Object {
  /**
    * The ID of the (sub-)account whose status to get.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * If set, only issues for the specified destinations are returned,
    * otherwise only issues for the Shopping destination.
    */
  var destinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The method (get).
    */
  var method: js.UndefOr[String] = js.native
}

object SchemaAccountstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(): SchemaAccountstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountstatusesCustomBatchRequestEntry]
  }
  @scala.inline
  implicit class SchemaAccountstatusesCustomBatchRequestEntryOps[Self <: SchemaAccountstatusesCustomBatchRequestEntry] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    @scala.inline
    def setDestinationsVarargs(value: String*): Self = this.set("destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: js.Array[String]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

