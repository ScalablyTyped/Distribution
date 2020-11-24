package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Effective
import typings.googleapis.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics web property.
  */
@js.native
trait SchemaWebproperty extends js.Object {
  
  /**
    * Account ID to which this web property belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Child link for this web property. Points to the list of views (profiles)
    * for this web property.
    */
  var childLink: js.UndefOr[Href] = js.native
  
  /**
    * Time this web property was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * Set to true to reset the retention period of the user identifier with
    * each new event from that user (thus setting the expiration date to
    * current time plus retention period). Set to false to delete data
    * associated with the user identifer automatically after the rentention
    * period. This property cannot be set on insert.
    */
  var dataRetentionResetOnNewActivity: js.UndefOr[Boolean] = js.native
  
  /**
    * The length of time for which user and event data is retained. This
    * property cannot be set on insert.
    */
  var dataRetentionTtl: js.UndefOr[String] = js.native
  
  /**
    * Default view (profile) ID.
    */
  var defaultProfileId: js.UndefOr[String] = js.native
  
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The industry vertical/category selected for this web property.
    */
  var industryVertical: js.UndefOr[String] = js.native
  
  /**
    * Internal ID for this web property.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  /**
    * Resource type for Analytics WebProperty.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Level for this web property. Possible values are STANDARD or PREMIUM.
    */
  var level: js.UndefOr[String] = js.native
  
  /**
    * Name of this web property.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Parent link for this web property. Points to the account to which this
    * web property belongs.
    */
  var parentLink: js.UndefOr[Href] = js.native
  
  /**
    * Permissions the user has for this web property.
    */
  var permissions: js.UndefOr[Effective] = js.native
  
  /**
    * View (Profile) count for this web property.
    */
  var profileCount: js.UndefOr[Double] = js.native
  
  /**
    * Link for this web property.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether this web property is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.native
  
  /**
    * Time this web property was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * Website url for this web property.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}
object SchemaWebproperty {
  
  @scala.inline
  def apply(): SchemaWebproperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebproperty]
  }
  
  @scala.inline
  implicit class SchemaWebpropertyOps[Self <: SchemaWebproperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setChildLink(value: Href): Self = this.set("childLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildLink: Self = this.set("childLink", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDataRetentionResetOnNewActivity(value: Boolean): Self = this.set("dataRetentionResetOnNewActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRetentionResetOnNewActivity: Self = this.set("dataRetentionResetOnNewActivity", js.undefined)
    
    @scala.inline
    def setDataRetentionTtl(value: String): Self = this.set("dataRetentionTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRetentionTtl: Self = this.set("dataRetentionTtl", js.undefined)
    
    @scala.inline
    def setDefaultProfileId(value: String): Self = this.set("defaultProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultProfileId: Self = this.set("defaultProfileId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndustryVertical(value: String): Self = this.set("industryVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndustryVertical: Self = this.set("industryVertical", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = this.set("internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalWebPropertyId: Self = this.set("internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentLink(value: Href): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    
    @scala.inline
    def setPermissions(value: Effective): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setProfileCount(value: Double): Self = this.set("profileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileCount: Self = this.set("profileCount", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = this.set("starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarred: Self = this.set("starred", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
}
