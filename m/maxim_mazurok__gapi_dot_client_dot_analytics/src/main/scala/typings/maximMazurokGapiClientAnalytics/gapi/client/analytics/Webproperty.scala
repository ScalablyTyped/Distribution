package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.maximMazurokGapiClientAnalytics.anon.Effective
import typings.maximMazurokGapiClientAnalytics.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Webproperty extends StObject {
  
  /** Account ID to which this web property belongs. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Child link for this web property. Points to the list of views (profiles) for this web property. */
  var childLink: js.UndefOr[Href] = js.native
  
  /** Time this web property was created. */
  var created: js.UndefOr[String] = js.native
  
  /**
    * Set to true to reset the retention period of the user identifier with each new event from that user (thus setting the expiration date to current time plus retention period).
    * Set to false to delete data associated with the user identifier automatically after the rentention period.
    * This property cannot be set on insert.
    */
  var dataRetentionResetOnNewActivity: js.UndefOr[Boolean] = js.native
  
  /**
    * The length of time for which user and event data is retained.
    * This property cannot be set on insert.
    */
  var dataRetentionTtl: js.UndefOr[String] = js.native
  
  /** Default view (profile) ID. */
  var defaultProfileId: js.UndefOr[String] = js.native
  
  /** Web property ID of the form UA-XXXXX-YY. */
  var id: js.UndefOr[String] = js.native
  
  /** The industry vertical/category selected for this web property. */
  var industryVertical: js.UndefOr[String] = js.native
  
  /** Internal ID for this web property. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  /** Resource type for Analytics WebProperty. */
  var kind: js.UndefOr[String] = js.native
  
  /** Level for this web property. Possible values are STANDARD or PREMIUM. */
  var level: js.UndefOr[String] = js.native
  
  /** Name of this web property. */
  var name: js.UndefOr[String] = js.native
  
  /** Parent link for this web property. Points to the account to which this web property belongs. */
  var parentLink: js.UndefOr[Href] = js.native
  
  /** Permissions the user has for this web property. */
  var permissions: js.UndefOr[Effective] = js.native
  
  /** View (Profile) count for this web property. */
  var profileCount: js.UndefOr[Double] = js.native
  
  /** Link for this web property. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Indicates whether this web property is starred or not. */
  var starred: js.UndefOr[Boolean] = js.native
  
  /** Time this web property was last modified. */
  var updated: js.UndefOr[String] = js.native
  
  /** Website url for this web property. */
  var websiteUrl: js.UndefOr[String] = js.native
}
object Webproperty {
  
  @scala.inline
  def apply(): Webproperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Webproperty]
  }
  
  @scala.inline
  implicit class WebpropertyMutableBuilder[Self <: Webproperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setChildLink(value: Href): Self = StObject.set(x, "childLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildLinkUndefined: Self = StObject.set(x, "childLink", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDataRetentionResetOnNewActivity(value: Boolean): Self = StObject.set(x, "dataRetentionResetOnNewActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRetentionResetOnNewActivityUndefined: Self = StObject.set(x, "dataRetentionResetOnNewActivity", js.undefined)
    
    @scala.inline
    def setDataRetentionTtl(value: String): Self = StObject.set(x, "dataRetentionTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRetentionTtlUndefined: Self = StObject.set(x, "dataRetentionTtl", js.undefined)
    
    @scala.inline
    def setDefaultProfileId(value: String): Self = StObject.set(x, "defaultProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultProfileIdUndefined: Self = StObject.set(x, "defaultProfileId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndustryVertical(value: String): Self = StObject.set(x, "industryVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndustryVerticalUndefined: Self = StObject.set(x, "industryVertical", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    @scala.inline
    def setPermissions(value: Effective): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setProfileCount(value: Double): Self = StObject.set(x, "profileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileCountUndefined: Self = StObject.set(x, "profileCount", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
