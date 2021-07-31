package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics Remarketing Audience Foreign Link.
  */
trait SchemaLinkedForeignAccount extends StObject {
  
  /**
    * Account ID to which this linked foreign account belongs.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean indicating whether this is eligible for search.
    */
  var eligibleForSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Entity ad account link ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Internal ID for the web property to which this linked foreign account
    * belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for linked foreign account.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The foreign account ID. For example the an Google Ads `linkedAccountId`
    * has the following format XXX-XXX-XXXX.
    */
  var linkedAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Remarketing audience ID to which this linked foreign account belongs.
    */
  var remarketingAudienceId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of this foreign account link.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the foreign account. For example, `ADWORDS_LINKS`,
    * `DBM_LINKS`, `MCC_LINKS` or `OPTIMIZE`.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID of the form UA-XXXXX-YY to which this linked foreign
    * account belongs.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object SchemaLinkedForeignAccount {
  
  @scala.inline
  def apply(): SchemaLinkedForeignAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedForeignAccount]
  }
  
  @scala.inline
  implicit class SchemaLinkedForeignAccountMutableBuilder[Self <: SchemaLinkedForeignAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setEligibleForSearch(value: Boolean): Self = StObject.set(x, "eligibleForSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEligibleForSearchUndefined: Self = StObject.set(x, "eligibleForSearch", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLinkedAccountId(value: String): Self = StObject.set(x, "linkedAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedAccountIdUndefined: Self = StObject.set(x, "linkedAccountId", js.undefined)
    
    @scala.inline
    def setRemarketingAudienceId(value: String): Self = StObject.set(x, "remarketingAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarketingAudienceIdUndefined: Self = StObject.set(x, "remarketingAudienceId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
