package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch datafeedstatuses request.
  */
@js.native
trait SchemaDatafeedstatusesCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * The country for which to get the datafeed status. If this parameter is
    * provided then language must also be provided. Note that for multi-target
    * datafeeds this parameter is required.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The ID of the data feed to get.
    */
  var datafeedId: js.UndefOr[String] = js.native
  /**
    * The language for which to get the datafeed status. If this parameter is
    * provided then country must also be provided. Note that for multi-target
    * datafeeds this parameter is required.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
}

object SchemaDatafeedstatusesCustomBatchRequestEntry {
  @scala.inline
  def apply(): SchemaDatafeedstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedstatusesCustomBatchRequestEntry]
  }
  @scala.inline
  implicit class SchemaDatafeedstatusesCustomBatchRequestEntryOps[Self <: SchemaDatafeedstatusesCustomBatchRequestEntry] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDatafeedId(value: String): Self = this.set("datafeedId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatafeedId: Self = this.set("datafeedId", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
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

