package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Effective
import typings.googleapis.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebproperty extends StObject {
  
  /**
    * Account ID to which this web property belongs.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Child link for this web property. Points to the list of views (profiles) for this web property.
    */
  var childLink: js.UndefOr[Href | Null] = js.undefined
  
  /**
    * Time this web property was created.
    */
  var created: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set to true to reset the retention period of the user identifier with each new event from that user (thus setting the expiration date to current time plus retention period).
    * Set to false to delete data associated with the user identifier automatically after the rentention period.
    * This property cannot be set on insert.
    */
  var dataRetentionResetOnNewActivity: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The length of time for which user and event data is retained.
    * This property cannot be set on insert.
    */
  var dataRetentionTtl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Default view (profile) ID.
    */
  var defaultProfileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The industry vertical/category selected for this web property.
    */
  var industryVertical: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Internal ID for this web property.
    */
  var internalWebPropertyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for Analytics WebProperty.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Level for this web property. Possible values are STANDARD or PREMIUM.
    */
  var level: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this web property.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parent link for this web property. Points to the account to which this web property belongs.
    */
  var parentLink: js.UndefOr[Href | Null] = js.undefined
  
  /**
    * Permissions the user has for this web property.
    */
  var permissions: js.UndefOr[Effective | Null] = js.undefined
  
  /**
    * View (Profile) count for this web property.
    */
  var profileCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Link for this web property.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether this web property is starred or not.
    */
  var starred: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Time this web property was last modified.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Website url for this web property.
    */
  var websiteUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaWebproperty {
  
  inline def apply(): SchemaWebproperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebproperty]
  }
  
  extension [Self <: SchemaWebproperty](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setChildLink(value: Href): Self = StObject.set(x, "childLink", value.asInstanceOf[js.Any])
    
    inline def setChildLinkNull: Self = StObject.set(x, "childLink", null)
    
    inline def setChildLinkUndefined: Self = StObject.set(x, "childLink", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedNull: Self = StObject.set(x, "created", null)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDataRetentionResetOnNewActivity(value: Boolean): Self = StObject.set(x, "dataRetentionResetOnNewActivity", value.asInstanceOf[js.Any])
    
    inline def setDataRetentionResetOnNewActivityNull: Self = StObject.set(x, "dataRetentionResetOnNewActivity", null)
    
    inline def setDataRetentionResetOnNewActivityUndefined: Self = StObject.set(x, "dataRetentionResetOnNewActivity", js.undefined)
    
    inline def setDataRetentionTtl(value: String): Self = StObject.set(x, "dataRetentionTtl", value.asInstanceOf[js.Any])
    
    inline def setDataRetentionTtlNull: Self = StObject.set(x, "dataRetentionTtl", null)
    
    inline def setDataRetentionTtlUndefined: Self = StObject.set(x, "dataRetentionTtl", js.undefined)
    
    inline def setDefaultProfileId(value: String): Self = StObject.set(x, "defaultProfileId", value.asInstanceOf[js.Any])
    
    inline def setDefaultProfileIdNull: Self = StObject.set(x, "defaultProfileId", null)
    
    inline def setDefaultProfileIdUndefined: Self = StObject.set(x, "defaultProfileId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndustryVertical(value: String): Self = StObject.set(x, "industryVertical", value.asInstanceOf[js.Any])
    
    inline def setIndustryVerticalNull: Self = StObject.set(x, "industryVertical", null)
    
    inline def setIndustryVerticalUndefined: Self = StObject.set(x, "industryVertical", js.undefined)
    
    inline def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    inline def setInternalWebPropertyIdNull: Self = StObject.set(x, "internalWebPropertyId", null)
    
    inline def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setParentLinkNull: Self = StObject.set(x, "parentLink", null)
    
    inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    inline def setPermissions(value: Effective): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setProfileCount(value: Double): Self = StObject.set(x, "profileCount", value.asInstanceOf[js.Any])
    
    inline def setProfileCountNull: Self = StObject.set(x, "profileCount", null)
    
    inline def setProfileCountUndefined: Self = StObject.set(x, "profileCount", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    inline def setStarredNull: Self = StObject.set(x, "starred", null)
    
    inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlNull: Self = StObject.set(x, "websiteUrl", null)
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
