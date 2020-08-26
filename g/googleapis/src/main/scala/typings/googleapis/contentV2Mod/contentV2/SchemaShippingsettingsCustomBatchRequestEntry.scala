package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch shippingsettings request.
  */
@js.native
trait SchemaShippingsettingsCustomBatchRequestEntry extends js.Object {
  /**
    * The ID of the account for which to get/update account shipping settings.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  /**
    * The account shipping settings to update. Only defined if the method is
    * update.
    */
  var shippingSettings: js.UndefOr[SchemaShippingSettings] = js.native
}

object SchemaShippingsettingsCustomBatchRequestEntry {
  @scala.inline
  def apply(): SchemaShippingsettingsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsCustomBatchRequestEntry]
  }
  @scala.inline
  implicit class SchemaShippingsettingsCustomBatchRequestEntryOps[Self <: SchemaShippingsettingsCustomBatchRequestEntry] (val x: Self) extends AnyVal {
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
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setShippingSettings(value: SchemaShippingSettings): Self = this.set("shippingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingSettings: Self = this.set("shippingSettings", js.undefined)
  }
  
}

