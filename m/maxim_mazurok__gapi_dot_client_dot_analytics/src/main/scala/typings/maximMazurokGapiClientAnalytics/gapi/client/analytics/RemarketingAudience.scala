package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.maximMazurokGapiClientAnalytics.anon.ExcludeConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemarketingAudience extends StObject {
  
  /** Account ID to which this remarketing audience belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The simple audience definition that will cause a user to be added to an audience. */
  var audienceDefinition: js.UndefOr[typings.maximMazurokGapiClientAnalytics.anon.IncludeConditions] = js.undefined
  
  /** The type of audience, either SIMPLE or STATE_BASED. */
  var audienceType: js.UndefOr[String] = js.undefined
  
  /** Time this remarketing audience was created. */
  var created: js.UndefOr[String] = js.undefined
  
  /** The description of this remarketing audience. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Remarketing Audience ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Internal ID for the web property to which this remarketing audience belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  
  /** Collection type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The linked ad accounts associated with this remarketing audience. A remarketing audience can have only one linkedAdAccount currently. */
  var linkedAdAccounts: js.UndefOr[js.Array[LinkedForeignAccount]] = js.undefined
  
  /** The views (profiles) that this remarketing audience is linked to. */
  var linkedViews: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of this remarketing audience. */
  var name: js.UndefOr[String] = js.undefined
  
  /** A state based audience definition that will cause a user to be added or removed from an audience. */
  var stateBasedAudienceDefinition: js.UndefOr[ExcludeConditions] = js.undefined
  
  /** Time this remarketing audience was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  
  /** Web property ID of the form UA-XXXXX-YY to which this remarketing audience belongs. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object RemarketingAudience {
  
  inline def apply(): RemarketingAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingAudience]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemarketingAudience] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAudienceDefinition(value: typings.maximMazurokGapiClientAnalytics.anon.IncludeConditions): Self = StObject.set(x, "audienceDefinition", value.asInstanceOf[js.Any])
    
    inline def setAudienceDefinitionUndefined: Self = StObject.set(x, "audienceDefinition", js.undefined)
    
    inline def setAudienceType(value: String): Self = StObject.set(x, "audienceType", value.asInstanceOf[js.Any])
    
    inline def setAudienceTypeUndefined: Self = StObject.set(x, "audienceType", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    inline def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinkedAdAccounts(value: js.Array[LinkedForeignAccount]): Self = StObject.set(x, "linkedAdAccounts", value.asInstanceOf[js.Any])
    
    inline def setLinkedAdAccountsUndefined: Self = StObject.set(x, "linkedAdAccounts", js.undefined)
    
    inline def setLinkedAdAccountsVarargs(value: LinkedForeignAccount*): Self = StObject.set(x, "linkedAdAccounts", js.Array(value*))
    
    inline def setLinkedViews(value: js.Array[String]): Self = StObject.set(x, "linkedViews", value.asInstanceOf[js.Any])
    
    inline def setLinkedViewsUndefined: Self = StObject.set(x, "linkedViews", js.undefined)
    
    inline def setLinkedViewsVarargs(value: String*): Self = StObject.set(x, "linkedViews", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStateBasedAudienceDefinition(value: ExcludeConditions): Self = StObject.set(x, "stateBasedAudienceDefinition", value.asInstanceOf[js.Any])
    
    inline def setStateBasedAudienceDefinitionUndefined: Self = StObject.set(x, "stateBasedAudienceDefinition", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
