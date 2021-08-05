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
  
  inline def apply(): SchemaAccountsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchRequestEntry]
  }
  
  extension [Self <: SchemaAccountsCustomBatchRequestEntry](x: Self) {
    
    inline def setAccount(value: SchemaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setLinkRequest(value: SchemaAccountsCustomBatchRequestEntryLinkRequest): Self = StObject.set(x, "linkRequest", value.asInstanceOf[js.Any])
    
    inline def setLinkRequestUndefined: Self = StObject.set(x, "linkRequest", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
