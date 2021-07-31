package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch accounts request.
  */
trait SchemaAccountsCustomBatchRequestEntry extends StObject {
  
  /**
    * The account to create or update. Only defined if the method is insert or
    * update.
    */
  var account: js.UndefOr[SchemaAccount] = js.undefined
  
  /**
    * The ID of the targeted account. Only defined if the method is not insert.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the account should be deleted if the account has offers. Only
    * applicable if the method is delete.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Details about the link request.
    */
  var linkRequest: js.UndefOr[SchemaAccountsCustomBatchRequestEntryLinkRequest] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The method of the batch entry.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * Only applicable if the method is claimwebsite. Indicates whether or not
    * to take the claim from another account in case there is a conflict.
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object SchemaAccountsCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): SchemaAccountsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class SchemaAccountsCustomBatchRequestEntryMutableBuilder[Self <: SchemaAccountsCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: SchemaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setLinkRequest(value: SchemaAccountsCustomBatchRequestEntryLinkRequest): Self = StObject.set(x, "linkRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkRequestUndefined: Self = StObject.set(x, "linkRequest", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
