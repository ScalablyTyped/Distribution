package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.ExcludeConditions
import typings.googleapis.anon.IncludeConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics remarketing audience.
  */
@js.native
trait SchemaRemarketingAudience extends StObject {
  
  /**
    * Account ID to which this remarketing audience belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The simple audience definition that will cause a user to be added to an
    * audience.
    */
  var audienceDefinition: js.UndefOr[IncludeConditions] = js.native
  
  /**
    * The type of audience, either SIMPLE or STATE_BASED.
    */
  var audienceType: js.UndefOr[String] = js.native
  
  /**
    * Time this remarketing audience was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * The description of this remarketing audience.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Remarketing Audience ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Internal ID for the web property to which this remarketing audience
    * belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The linked ad accounts associated with this remarketing audience. A
    * remarketing audience can have only one linkedAdAccount currently.
    */
  var linkedAdAccounts: js.UndefOr[js.Array[SchemaLinkedForeignAccount]] = js.native
  
  /**
    * The views (profiles) that this remarketing audience is linked to.
    */
  var linkedViews: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of this remarketing audience.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A state based audience definition that will cause a user to be added or
    * removed from an audience.
    */
  var stateBasedAudienceDefinition: js.UndefOr[ExcludeConditions] = js.native
  
  /**
    * Time this remarketing audience was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * Web property ID of the form UA-XXXXX-YY to which this remarketing
    * audience belongs.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object SchemaRemarketingAudience {
  
  @scala.inline
  def apply(): SchemaRemarketingAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingAudience]
  }
  
  @scala.inline
  implicit class SchemaRemarketingAudienceMutableBuilder[Self <: SchemaRemarketingAudience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAudienceDefinition(value: IncludeConditions): Self = StObject.set(x, "audienceDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceDefinitionUndefined: Self = StObject.set(x, "audienceDefinition", js.undefined)
    
    @scala.inline
    def setAudienceType(value: String): Self = StObject.set(x, "audienceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceTypeUndefined: Self = StObject.set(x, "audienceType", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
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
    def setLinkedAdAccounts(value: js.Array[SchemaLinkedForeignAccount]): Self = StObject.set(x, "linkedAdAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedAdAccountsUndefined: Self = StObject.set(x, "linkedAdAccounts", js.undefined)
    
    @scala.inline
    def setLinkedAdAccountsVarargs(value: SchemaLinkedForeignAccount*): Self = StObject.set(x, "linkedAdAccounts", js.Array(value :_*))
    
    @scala.inline
    def setLinkedViews(value: js.Array[String]): Self = StObject.set(x, "linkedViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedViewsUndefined: Self = StObject.set(x, "linkedViews", js.undefined)
    
    @scala.inline
    def setLinkedViewsVarargs(value: String*): Self = StObject.set(x, "linkedViews", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStateBasedAudienceDefinition(value: ExcludeConditions): Self = StObject.set(x, "stateBasedAudienceDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateBasedAudienceDefinitionUndefined: Self = StObject.set(x, "stateBasedAudienceDefinition", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
