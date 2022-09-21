package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinkedForeignAccount extends StObject {
  
  /**
    * Account ID to which this linked foreign account belongs.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Boolean indicating whether this is eligible for search.
    */
  var eligibleForSearch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Entity ad account link ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Internal ID for the web property to which this linked foreign account belongs.
    */
  var internalWebPropertyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for linked foreign account.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The foreign account ID. For example the an Google Ads `linkedAccountId` has the following format XXX-XXX-XXXX.
    */
  var linkedAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Remarketing audience ID to which this linked foreign account belongs.
    */
  var remarketingAudienceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of this foreign account link.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the foreign account. For example, `ADWORDS_LINKS`, `DBM_LINKS`, `MCC_LINKS` or `OPTIMIZE`.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Web property ID of the form UA-XXXXX-YY to which this linked foreign account belongs.
    */
  var webPropertyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaLinkedForeignAccount {
  
  inline def apply(): SchemaLinkedForeignAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedForeignAccount]
  }
  
  extension [Self <: SchemaLinkedForeignAccount](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setEligibleForSearch(value: Boolean): Self = StObject.set(x, "eligibleForSearch", value.asInstanceOf[js.Any])
    
    inline def setEligibleForSearchNull: Self = StObject.set(x, "eligibleForSearch", null)
    
    inline def setEligibleForSearchUndefined: Self = StObject.set(x, "eligibleForSearch", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    inline def setInternalWebPropertyIdNull: Self = StObject.set(x, "internalWebPropertyId", null)
    
    inline def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinkedAccountId(value: String): Self = StObject.set(x, "linkedAccountId", value.asInstanceOf[js.Any])
    
    inline def setLinkedAccountIdNull: Self = StObject.set(x, "linkedAccountId", null)
    
    inline def setLinkedAccountIdUndefined: Self = StObject.set(x, "linkedAccountId", js.undefined)
    
    inline def setRemarketingAudienceId(value: String): Self = StObject.set(x, "remarketingAudienceId", value.asInstanceOf[js.Any])
    
    inline def setRemarketingAudienceIdNull: Self = StObject.set(x, "remarketingAudienceId", null)
    
    inline def setRemarketingAudienceIdUndefined: Self = StObject.set(x, "remarketingAudienceId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdNull: Self = StObject.set(x, "webPropertyId", null)
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
