package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of an event tag.
  */
@js.native
trait SchemaEventTag extends js.Object {
  
  /**
    * Account ID of this event tag. This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Advertiser ID of this event tag. This field or the campaignId field is
    * required on insertion.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Campaign ID of this event tag. This field or the advertiserId field is
    * required on insertion.
    */
  var campaignId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the campaign. This is a read-only,
    * auto-generated field.
    */
  var campaignIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Whether this event tag should be automatically enabled for all of the
    * advertiser&#39;s campaigns and ads.
    */
  var enabledByDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to remove this event tag from ads that are trafficked through
    * Display &amp; Video 360 to Ad Exchange. This may be useful if the event
    * tag uses a pixel that is unapproved for Ad Exchange bids on one or more
    * networks, such as the Google Display Network.
    */
  var excludeFromAdxRequests: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of this event tag. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#eventTag&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this event tag. This is a required field and must be less than
    * 256 characters long.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Site filter type for this event tag. If no type is specified then the
    * event tag will be applied to all sites.
    */
  var siteFilterType: js.UndefOr[String] = js.native
  
  /**
    * Filter list of site IDs associated with this event tag. The
    * siteFilterType determines whether this is a whitelist or blacklist
    * filter.
    */
  var siteIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether this tag is SSL-compliant or not. This is a read-only field.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  /**
    * Status of this event tag. Must be ENABLED for this event tag to fire.
    * This is a required field.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Subaccount ID of this event tag. This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Event tag type. Can be used to specify whether to use a third-party
    * pixel, a third-party JavaScript URL, or a third-party click-through URL
    * for either impression or click tracking. This is a required field.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Payload URL for this event tag. The URL on a click-through event tag
    * should have a landing page URL appended to the end of it. This field is
    * required on insertion.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Number of times the landing page URL should be URL-escaped before being
    * appended to the click-through event tag URL. Only applies to
    * click-through event tags as specified by the event tag type.
    */
  var urlEscapeLevels: js.UndefOr[Double] = js.native
}
object SchemaEventTag {
  
  @scala.inline
  def apply(): SchemaEventTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTag]
  }
  
  @scala.inline
  implicit class SchemaEventTagOps[Self <: SchemaEventTag] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = this.set("advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserIdDimensionValue: Self = this.set("advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setCampaignIdDimensionValue(value: SchemaDimensionValue): Self = this.set("campaignIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignIdDimensionValue: Self = this.set("campaignIdDimensionValue", js.undefined)
    
    @scala.inline
    def setEnabledByDefault(value: Boolean): Self = this.set("enabledByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledByDefault: Self = this.set("enabledByDefault", js.undefined)
    
    @scala.inline
    def setExcludeFromAdxRequests(value: Boolean): Self = this.set("excludeFromAdxRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeFromAdxRequests: Self = this.set("excludeFromAdxRequests", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSiteFilterType(value: String): Self = this.set("siteFilterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteFilterType: Self = this.set("siteFilterType", js.undefined)
    
    @scala.inline
    def setSiteIdsVarargs(value: String*): Self = this.set("siteIds", js.Array(value :_*))
    
    @scala.inline
    def setSiteIds(value: js.Array[String]): Self = this.set("siteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteIds: Self = this.set("siteIds", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlEscapeLevels(value: Double): Self = this.set("urlEscapeLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlEscapeLevels: Self = this.set("urlEscapeLevels", js.undefined)
  }
}
