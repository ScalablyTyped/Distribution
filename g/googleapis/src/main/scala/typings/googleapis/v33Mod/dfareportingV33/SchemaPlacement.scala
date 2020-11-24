package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a placement.
  */
@js.native
trait SchemaPlacement extends js.Object {
  
  /**
    * Account ID of this placement. This field can be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Whether this placement opts out of ad blocking. When true, ad blocking is
    * disabled for this placement. When false, the campaign and site settings
    * take effect.
    */
  var adBlockingOptOut: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional sizes associated with this placement. When inserting or
    * updating a placement, only the size ID field is used.
    */
  var additionalSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  
  /**
    * Advertiser ID of this placement. This field can be left blank.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Whether this placement is archived.
    */
  var archived: js.UndefOr[Boolean] = js.native
  
  /**
    * Campaign ID of this placement. This field is a required field on
    * insertion.
    */
  var campaignId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the campaign. This is a read-only,
    * auto-generated field.
    */
  var campaignIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Comments for this placement.
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Placement compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to
    * rendering on desktop, on mobile devices or in mobile apps for regular or
    * interstitial ads respectively. APP and APP_INTERSTITIAL are no longer
    * allowed for new placement insertions. Instead, use DISPLAY or
    * DISPLAY_INTERSTITIAL. IN_STREAM_VIDEO refers to rendering in in-stream
    * video ads developed with the VAST standard. This field is required on
    * insertion.
    */
  var compatibility: js.UndefOr[String] = js.native
  
  /**
    * ID of the content category assigned to this placement.
    */
  var contentCategoryId: js.UndefOr[String] = js.native
  
  /**
    * Information about the creation of this placement. This is a read-only
    * field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  
  /**
    * Directory site ID of this placement. On insert, you must set either this
    * field or the siteId field to specify the site associated with this
    * placement. This is a required field that is read-only after insertion.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the directory site. This is a read-only,
    * auto-generated field.
    */
  var directorySiteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * External ID for this placement.
    */
  var externalId: js.UndefOr[String] = js.native
  
  /**
    * ID of this placement. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of this placement. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Key name of this placement. This is a read-only, auto-generated field.
    */
  var keyName: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placement&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Information about the most recent modification of this placement. This is
    * a read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  
  /**
    * Lookback window settings for this placement.
    */
  var lookbackConfiguration: js.UndefOr[SchemaLookbackConfiguration] = js.native
  
  /**
    * Name of this placement.This is a required field and must be less than 256
    * characters long.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Whether payment was approved for this placement. This is a read-only
    * field relevant only to publisher-paid placements.
    */
  var paymentApproved: js.UndefOr[Boolean] = js.native
  
  /**
    * Payment source for this placement. This is a required field that is
    * read-only after insertion.
    */
  var paymentSource: js.UndefOr[String] = js.native
  
  /**
    * ID of this placement&#39;s group, if applicable.
    */
  var placementGroupId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the placement group. This is a read-only,
    * auto-generated field.
    */
  var placementGroupIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * ID of the placement strategy assigned to this placement.
    */
  var placementStrategyId: js.UndefOr[String] = js.native
  
  /**
    * Pricing schedule of this placement. This field is required on insertion,
    * specifically subfields startDate, endDate and pricingType.
    */
  var pricingSchedule: js.UndefOr[SchemaPricingSchedule] = js.native
  
  /**
    * Whether this placement is the primary placement of a roadblock (placement
    * group). You cannot change this field from true to false. Setting this
    * field to true will automatically set the primary field on the original
    * primary placement of the roadblock to false, and it will automatically
    * set the roadblock&#39;s primaryPlacementId field to the ID of this
    * placement.
    */
  var primary: js.UndefOr[Boolean] = js.native
  
  /**
    * Information about the last publisher update. This is a read-only field.
    */
  var publisherUpdateInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  
  /**
    * Site ID associated with this placement. On insert, you must set either
    * this field or the directorySiteId field to specify the site associated
    * with this placement. This is a required field that is read-only after
    * insertion.
    */
  var siteId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the site. This is a read-only,
    * auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Size associated with this placement. When inserting or updating a
    * placement, only the size ID field is used. This field is required on
    * insertion.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  
  /**
    * Whether creatives assigned to this placement must be SSL-compliant.
    */
  var sslRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * Third-party placement status.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Subaccount ID of this placement. This field can be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Tag formats to generate for this placement. This field is required on
    * insertion. Acceptable values are: - &quot;PLACEMENT_TAG_STANDARD&quot; -
    * &quot;PLACEMENT_TAG_IFRAME_JAVASCRIPT&quot; -
    * &quot;PLACEMENT_TAG_IFRAME_ILAYER&quot; -
    * &quot;PLACEMENT_TAG_INTERNAL_REDIRECT&quot; -
    * &quot;PLACEMENT_TAG_JAVASCRIPT&quot; -
    * &quot;PLACEMENT_TAG_INTERSTITIAL_IFRAME_JAVASCRIPT&quot; -
    * &quot;PLACEMENT_TAG_INTERSTITIAL_INTERNAL_REDIRECT&quot; -
    * &quot;PLACEMENT_TAG_INTERSTITIAL_JAVASCRIPT&quot; -
    * &quot;PLACEMENT_TAG_CLICK_COMMANDS&quot; -
    * &quot;PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH&quot; -
    * &quot;PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_3&quot; -
    * &quot;PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_4&quot; -
    * &quot;PLACEMENT_TAG_TRACKING&quot; -
    * &quot;PLACEMENT_TAG_TRACKING_IFRAME&quot; -
    * &quot;PLACEMENT_TAG_TRACKING_JAVASCRIPT&quot;
    */
  var tagFormats: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Tag settings for this placement.
    */
  var tagSetting: js.UndefOr[SchemaTagSetting] = js.native
  
  /**
    * Whether Verification and ActiveView are disabled for in-stream video
    * creatives for this placement. The same setting videoActiveViewOptOut
    * exists on the site level -- the opt out occurs if either of these
    * settings are true. These settings are distinct from
    * DirectorySites.settings.activeViewOptOut or
    * Sites.siteSettings.activeViewOptOut which only apply to display ads.
    * However, Accounts.activeViewOptOut opts out both video traffic, as well
    * as display ads, from Verification and ActiveView.
    */
  var videoActiveViewOptOut: js.UndefOr[Boolean] = js.native
  
  /**
    * A collection of settings which affect video creatives served through this
    * placement. Applicable to placements with IN_STREAM_VIDEO compatibility.
    */
  var videoSettings: js.UndefOr[SchemaVideoSettings] = js.native
  
  /**
    * VPAID adapter setting for this placement. Controls which VPAID format the
    * measurement adapter will use for in-stream video creatives assigned to
    * this placement.  Note: Flash is no longer supported. This field now
    * defaults to HTML5 when the following values are provided: FLASH, BOTH.
    */
  var vpaidAdapterChoice: js.UndefOr[String] = js.native
}
object SchemaPlacement {
  
  @scala.inline
  def apply(): SchemaPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacement]
  }
  
  @scala.inline
  implicit class SchemaPlacementOps[Self <: SchemaPlacement] (val x: Self) extends AnyVal {
    
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
    def setAdBlockingOptOut(value: Boolean): Self = this.set("adBlockingOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdBlockingOptOut: Self = this.set("adBlockingOptOut", js.undefined)
    
    @scala.inline
    def setAdditionalSizesVarargs(value: SchemaSize*): Self = this.set("additionalSizes", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalSizes(value: js.Array[SchemaSize]): Self = this.set("additionalSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalSizes: Self = this.set("additionalSizes", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = this.set("advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserIdDimensionValue: Self = this.set("advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setCampaignIdDimensionValue(value: SchemaDimensionValue): Self = this.set("campaignIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignIdDimensionValue: Self = this.set("campaignIdDimensionValue", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCompatibility(value: String): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibility: Self = this.set("compatibility", js.undefined)
    
    @scala.inline
    def setContentCategoryId(value: String): Self = this.set("contentCategoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentCategoryId: Self = this.set("contentCategoryId", js.undefined)
    
    @scala.inline
    def setCreateInfo(value: SchemaLastModifiedInfo): Self = this.set("createInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateInfo: Self = this.set("createInfo", js.undefined)
    
    @scala.inline
    def setDirectorySiteId(value: String): Self = this.set("directorySiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySiteId: Self = this.set("directorySiteId", js.undefined)
    
    @scala.inline
    def setDirectorySiteIdDimensionValue(value: SchemaDimensionValue): Self = this.set("directorySiteIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySiteIdDimensionValue: Self = this.set("directorySiteIdDimensionValue", js.undefined)
    
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyName: Self = this.set("keyName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setLookbackConfiguration(value: SchemaLookbackConfiguration): Self = this.set("lookbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookbackConfiguration: Self = this.set("lookbackConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPaymentApproved(value: Boolean): Self = this.set("paymentApproved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentApproved: Self = this.set("paymentApproved", js.undefined)
    
    @scala.inline
    def setPaymentSource(value: String): Self = this.set("paymentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentSource: Self = this.set("paymentSource", js.undefined)
    
    @scala.inline
    def setPlacementGroupId(value: String): Self = this.set("placementGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementGroupId: Self = this.set("placementGroupId", js.undefined)
    
    @scala.inline
    def setPlacementGroupIdDimensionValue(value: SchemaDimensionValue): Self = this.set("placementGroupIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementGroupIdDimensionValue: Self = this.set("placementGroupIdDimensionValue", js.undefined)
    
    @scala.inline
    def setPlacementStrategyId(value: String): Self = this.set("placementStrategyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementStrategyId: Self = this.set("placementStrategyId", js.undefined)
    
    @scala.inline
    def setPricingSchedule(value: SchemaPricingSchedule): Self = this.set("pricingSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingSchedule: Self = this.set("pricingSchedule", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setPublisherUpdateInfo(value: SchemaLastModifiedInfo): Self = this.set("publisherUpdateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherUpdateInfo: Self = this.set("publisherUpdateInfo", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    
    @scala.inline
    def setSiteIdDimensionValue(value: SchemaDimensionValue): Self = this.set("siteIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteIdDimensionValue: Self = this.set("siteIdDimensionValue", js.undefined)
    
    @scala.inline
    def setSize(value: SchemaSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSslRequired(value: Boolean): Self = this.set("sslRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslRequired: Self = this.set("sslRequired", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTagFormatsVarargs(value: String*): Self = this.set("tagFormats", js.Array(value :_*))
    
    @scala.inline
    def setTagFormats(value: js.Array[String]): Self = this.set("tagFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagFormats: Self = this.set("tagFormats", js.undefined)
    
    @scala.inline
    def setTagSetting(value: SchemaTagSetting): Self = this.set("tagSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSetting: Self = this.set("tagSetting", js.undefined)
    
    @scala.inline
    def setVideoActiveViewOptOut(value: Boolean): Self = this.set("videoActiveViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoActiveViewOptOut: Self = this.set("videoActiveViewOptOut", js.undefined)
    
    @scala.inline
    def setVideoSettings(value: SchemaVideoSettings): Self = this.set("videoSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoSettings: Self = this.set("videoSettings", js.undefined)
    
    @scala.inline
    def setVpaidAdapterChoice(value: String): Self = this.set("vpaidAdapterChoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpaidAdapterChoice: Self = this.set("vpaidAdapterChoice", js.undefined)
  }
}
