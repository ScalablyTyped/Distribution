package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsCustomBatchRequestEntry extends StObject {
  
  /**
    * The account to create or update. Only defined if the method is `insert` or `update`.
    */
  var account: js.UndefOr[SchemaAccount] = js.undefined
  
  /**
    * The ID of the targeted account. Only defined if the method is not `insert`.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether the account should be deleted if the account has offers. Only applicable if the method is `delete`.
    */
  var force: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Label IDs for the 'updatelabels' request.
    */
  var labelIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Details about the `link` request.
    */
  var linkRequest: js.UndefOr[SchemaAccountsCustomBatchRequestEntryLinkRequest] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The method of the batch entry. Acceptable values are: - "`claimWebsite`" - "`delete`" - "`get`" - "`insert`" - "`link`" - "`update`"
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only applicable if the method is `claimwebsite`. Indicates whether or not to take the claim from another account in case there is a conflict.
    */
  var overwrite: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAccountsCustomBatchRequestEntry {
  
  inline def apply(): SchemaAccountsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchRequestEntry]
  }
  
  extension [Self <: SchemaAccountsCustomBatchRequestEntry](x: Self) {
    
    inline def setAccount(value: SchemaAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceNull: Self = StObject.set(x, "force", null)
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsNull: Self = StObject.set(x, "labelIds", null)
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
    
    inline def setLinkRequest(value: SchemaAccountsCustomBatchRequestEntryLinkRequest): Self = StObject.set(x, "linkRequest", value.asInstanceOf[js.Any])
    
    inline def setLinkRequestUndefined: Self = StObject.set(x, "linkRequest", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdNull: Self = StObject.set(x, "merchantId", null)
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteNull: Self = StObject.set(x, "overwrite", null)
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
