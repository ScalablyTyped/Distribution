package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.ExcludeConditions
import typings.googleapis.anon.IncludeConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemarketingAudience extends StObject {
  
  /**
    * Account ID to which this remarketing audience belongs.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The simple audience definition that will cause a user to be added to an audience.
    */
  var audienceDefinition: js.UndefOr[IncludeConditions | Null] = js.undefined
  
  /**
    * The type of audience, either SIMPLE or STATE_BASED.
    */
  var audienceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time this remarketing audience was created.
    */
  var created: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of this remarketing audience.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Remarketing Audience ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Internal ID for the web property to which this remarketing audience belongs.
    */
  var internalWebPropertyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The linked ad accounts associated with this remarketing audience. A remarketing audience can have only one linkedAdAccount currently.
    */
  var linkedAdAccounts: js.UndefOr[js.Array[SchemaLinkedForeignAccount]] = js.undefined
  
  /**
    * The views (profiles) that this remarketing audience is linked to.
    */
  var linkedViews: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of this remarketing audience.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A state based audience definition that will cause a user to be added or removed from an audience.
    */
  var stateBasedAudienceDefinition: js.UndefOr[ExcludeConditions | Null] = js.undefined
  
  /**
    * Time this remarketing audience was last modified.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Web property ID of the form UA-XXXXX-YY to which this remarketing audience belongs.
    */
  var webPropertyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRemarketingAudience {
  
  inline def apply(): SchemaRemarketingAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingAudience]
  }
  
  extension [Self <: SchemaRemarketingAudience](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAudienceDefinition(value: IncludeConditions): Self = StObject.set(x, "audienceDefinition", value.asInstanceOf[js.Any])
    
    inline def setAudienceDefinitionNull: Self = StObject.set(x, "audienceDefinition", null)
    
    inline def setAudienceDefinitionUndefined: Self = StObject.set(x, "audienceDefinition", js.undefined)
    
    inline def setAudienceType(value: String): Self = StObject.set(x, "audienceType", value.asInstanceOf[js.Any])
    
    inline def setAudienceTypeNull: Self = StObject.set(x, "audienceType", null)
    
    inline def setAudienceTypeUndefined: Self = StObject.set(x, "audienceType", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedNull: Self = StObject.set(x, "created", null)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    inline def setInternalWebPropertyIdNull: Self = StObject.set(x, "internalWebPropertyId", null)
    
    inline def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLinkedAdAccounts(value: js.Array[SchemaLinkedForeignAccount]): Self = StObject.set(x, "linkedAdAccounts", value.asInstanceOf[js.Any])
    
    inline def setLinkedAdAccountsUndefined: Self = StObject.set(x, "linkedAdAccounts", js.undefined)
    
    inline def setLinkedAdAccountsVarargs(value: SchemaLinkedForeignAccount*): Self = StObject.set(x, "linkedAdAccounts", js.Array(value*))
    
    inline def setLinkedViews(value: js.Array[String]): Self = StObject.set(x, "linkedViews", value.asInstanceOf[js.Any])
    
    inline def setLinkedViewsNull: Self = StObject.set(x, "linkedViews", null)
    
    inline def setLinkedViewsUndefined: Self = StObject.set(x, "linkedViews", js.undefined)
    
    inline def setLinkedViewsVarargs(value: String*): Self = StObject.set(x, "linkedViews", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStateBasedAudienceDefinition(value: ExcludeConditions): Self = StObject.set(x, "stateBasedAudienceDefinition", value.asInstanceOf[js.Any])
    
    inline def setStateBasedAudienceDefinitionNull: Self = StObject.set(x, "stateBasedAudienceDefinition", null)
    
    inline def setStateBasedAudienceDefinitionUndefined: Self = StObject.set(x, "stateBasedAudienceDefinition", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdNull: Self = StObject.set(x, "webPropertyId", null)
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
