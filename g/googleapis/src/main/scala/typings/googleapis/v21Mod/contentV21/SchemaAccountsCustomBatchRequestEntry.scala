package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch accounts request.
  */
@js.native
trait SchemaAccountsCustomBatchRequestEntry extends js.Object {
  
  /**
    * The account to create or update. Only defined if the method is insert or
    * update.
    */
  var account: js.UndefOr[SchemaAccount] = js.native
  
  /**
    * The ID of the targeted account. Only defined if the method is not insert.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * Whether the account should be deleted if the account has offers. Only
    * applicable if the method is delete.
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * Details about the link request.
    */
  var linkRequest: js.UndefOr[SchemaAccountsCustomBatchRequestEntryLinkRequest] = js.native
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  
  /**
    * The method of the batch entry.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * Only applicable if the method is claimwebsite. Indicates whether or not
    * to take the claim from another account in case there is a conflict.
    */
  var overwrite: js.UndefOr[Boolean] = js.native
}
object SchemaAccountsCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): SchemaAccountsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class SchemaAccountsCustomBatchRequestEntryOps[Self <: SchemaAccountsCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: SchemaAccount): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setLinkRequest(value: SchemaAccountsCustomBatchRequestEntryLinkRequest): Self = this.set("linkRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkRequest: Self = this.set("linkRequest", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
  }
}
