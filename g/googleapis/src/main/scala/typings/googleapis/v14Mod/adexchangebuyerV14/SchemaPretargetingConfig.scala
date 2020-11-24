package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleapis.anon.AspectRatio
import typings.googleapis.anon.Token
import typings.googleapis.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPretargetingConfig extends js.Object {
  
  /**
    * The id for billing purposes, provided for reference. Leave this field
    * blank for insert requests; the id will be generated automatically.
    */
  var billingId: js.UndefOr[String] = js.native
  
  /**
    * The config id; generated automatically. Leave this field blank for insert
    * requests.
    */
  var configId: js.UndefOr[String] = js.native
  
  /**
    * The name of the config. Must be unique. Required for all requests.
    */
  var configName: js.UndefOr[String] = js.native
  
  /**
    * List must contain exactly one of PRETARGETING_CREATIVE_TYPE_HTML or
    * PRETARGETING_CREATIVE_TYPE_VIDEO.
    */
  var creativeType: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests which allow one of these (width, height) pairs will match. All
    * pairs must be supported ad dimensions.
    */
  var dimensions: js.UndefOr[js.Array[Width]] = js.native
  
  /**
    * Requests with any of these content labels will not match. Values are from
    * content-labels.txt in the downloadable files section.
    */
  var excludedContentLabels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests containing any of these geo criteria ids will not match.
    */
  var excludedGeoCriteriaIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests containing any of these placements will not match.
    */
  var excludedPlacements: js.UndefOr[js.Array[Token]] = js.native
  
  /**
    * Requests containing any of these users list ids will not match.
    */
  var excludedUserLists: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests containing any of these vertical ids will not match. Values are
    * from the publisher-verticals.txt file in the downloadable files section.
    */
  var excludedVerticals: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests containing any of these geo criteria ids will match.
    */
  var geoCriteriaIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether this config is active. Required for all requests.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  
  /**
    * The kind of the resource, i.e.
    * &quot;adexchangebuyer#pretargetingConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Request containing any of these language codes will match.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests where the predicted viewability is below the specified decile
    * will not match. E.g. if the buyer sets this value to 5, requests from
    * slots where the predicted viewability is below 50% will not match. If the
    * predicted viewability is unknown this field will be ignored.
    */
  var minimumViewabilityDecile: js.UndefOr[Double] = js.native
  
  /**
    * Requests containing any of these mobile carrier ids will match. Values
    * are from mobile-carriers.csv in the downloadable files section.
    */
  var mobileCarriers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests containing any of these mobile device ids will match. Values are
    * from mobile-devices.csv in the downloadable files section.
    */
  var mobileDevices: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests containing any of these mobile operating system version ids will
    * match. Values are from mobile-os.csv in the downloadable files section.
    */
  var mobileOperatingSystemVersions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests containing any of these placements will match.
    */
  var placements: js.UndefOr[js.Array[Token]] = js.native
  
  /**
    * Requests matching any of these platforms will match. Possible values are
    * PRETARGETING_PLATFORM_MOBILE, PRETARGETING_PLATFORM_DESKTOP, and
    * PRETARGETING_PLATFORM_TABLET.
    */
  var platforms: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Creative attributes should be declared here if all creatives
    * corresponding to this pretargeting configuration have that creative
    * attribute. Values are from pretargetable-creative-attributes.txt in the
    * downloadable files section.
    */
  var supportedCreativeAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests containing the specified type of user data will match. Possible
    * values are HOSTED_MATCH_DATA, which means the request is
    * cookie-targetable and has a match in the buyer&#39;s hosted match table,
    * and COOKIE_OR_IDFA, which means the request has either a targetable
    * cookie or an iOS IDFA.
    */
  var userIdentifierDataRequired: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests containing any of these user list ids will match.
    */
  var userLists: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests that allow any of these vendor ids will match. Values are from
    * vendors.txt in the downloadable files section.
    */
  var vendorTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Requests containing any of these vertical ids will match.
    */
  var verticals: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Video requests satisfying any of these player size constraints will
    * match.
    */
  var videoPlayerSizes: js.UndefOr[js.Array[AspectRatio]] = js.native
}
object SchemaPretargetingConfig {
  
  @scala.inline
  def apply(): SchemaPretargetingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPretargetingConfig]
  }
  
  @scala.inline
  implicit class SchemaPretargetingConfigOps[Self <: SchemaPretargetingConfig] (val x: Self) extends AnyVal {
    
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
    def setBillingId(value: String): Self = this.set("billingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingId: Self = this.set("billingId", js.undefined)
    
    @scala.inline
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigId: Self = this.set("configId", js.undefined)
    
    @scala.inline
    def setConfigName(value: String): Self = this.set("configName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigName: Self = this.set("configName", js.undefined)
    
    @scala.inline
    def setCreativeTypeVarargs(value: String*): Self = this.set("creativeType", js.Array(value :_*))
    
    @scala.inline
    def setCreativeType(value: js.Array[String]): Self = this.set("creativeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeType: Self = this.set("creativeType", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Width*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[Width]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setExcludedContentLabelsVarargs(value: String*): Self = this.set("excludedContentLabels", js.Array(value :_*))
    
    @scala.inline
    def setExcludedContentLabels(value: js.Array[String]): Self = this.set("excludedContentLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedContentLabels: Self = this.set("excludedContentLabels", js.undefined)
    
    @scala.inline
    def setExcludedGeoCriteriaIdsVarargs(value: String*): Self = this.set("excludedGeoCriteriaIds", js.Array(value :_*))
    
    @scala.inline
    def setExcludedGeoCriteriaIds(value: js.Array[String]): Self = this.set("excludedGeoCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedGeoCriteriaIds: Self = this.set("excludedGeoCriteriaIds", js.undefined)
    
    @scala.inline
    def setExcludedPlacementsVarargs(value: Token*): Self = this.set("excludedPlacements", js.Array(value :_*))
    
    @scala.inline
    def setExcludedPlacements(value: js.Array[Token]): Self = this.set("excludedPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedPlacements: Self = this.set("excludedPlacements", js.undefined)
    
    @scala.inline
    def setExcludedUserListsVarargs(value: String*): Self = this.set("excludedUserLists", js.Array(value :_*))
    
    @scala.inline
    def setExcludedUserLists(value: js.Array[String]): Self = this.set("excludedUserLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedUserLists: Self = this.set("excludedUserLists", js.undefined)
    
    @scala.inline
    def setExcludedVerticalsVarargs(value: String*): Self = this.set("excludedVerticals", js.Array(value :_*))
    
    @scala.inline
    def setExcludedVerticals(value: js.Array[String]): Self = this.set("excludedVerticals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedVerticals: Self = this.set("excludedVerticals", js.undefined)
    
    @scala.inline
    def setGeoCriteriaIdsVarargs(value: String*): Self = this.set("geoCriteriaIds", js.Array(value :_*))
    
    @scala.inline
    def setGeoCriteriaIds(value: js.Array[String]): Self = this.set("geoCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoCriteriaIds: Self = this.set("geoCriteriaIds", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    
    @scala.inline
    def setMinimumViewabilityDecile(value: Double): Self = this.set("minimumViewabilityDecile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumViewabilityDecile: Self = this.set("minimumViewabilityDecile", js.undefined)
    
    @scala.inline
    def setMobileCarriersVarargs(value: String*): Self = this.set("mobileCarriers", js.Array(value :_*))
    
    @scala.inline
    def setMobileCarriers(value: js.Array[String]): Self = this.set("mobileCarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileCarriers: Self = this.set("mobileCarriers", js.undefined)
    
    @scala.inline
    def setMobileDevicesVarargs(value: String*): Self = this.set("mobileDevices", js.Array(value :_*))
    
    @scala.inline
    def setMobileDevices(value: js.Array[String]): Self = this.set("mobileDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileDevices: Self = this.set("mobileDevices", js.undefined)
    
    @scala.inline
    def setMobileOperatingSystemVersionsVarargs(value: String*): Self = this.set("mobileOperatingSystemVersions", js.Array(value :_*))
    
    @scala.inline
    def setMobileOperatingSystemVersions(value: js.Array[String]): Self = this.set("mobileOperatingSystemVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileOperatingSystemVersions: Self = this.set("mobileOperatingSystemVersions", js.undefined)
    
    @scala.inline
    def setPlacementsVarargs(value: Token*): Self = this.set("placements", js.Array(value :_*))
    
    @scala.inline
    def setPlacements(value: js.Array[Token]): Self = this.set("placements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacements: Self = this.set("placements", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: String*): Self = this.set("platforms", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: js.Array[String]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
    
    @scala.inline
    def setSupportedCreativeAttributesVarargs(value: String*): Self = this.set("supportedCreativeAttributes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedCreativeAttributes(value: js.Array[String]): Self = this.set("supportedCreativeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedCreativeAttributes: Self = this.set("supportedCreativeAttributes", js.undefined)
    
    @scala.inline
    def setUserIdentifierDataRequiredVarargs(value: String*): Self = this.set("userIdentifierDataRequired", js.Array(value :_*))
    
    @scala.inline
    def setUserIdentifierDataRequired(value: js.Array[String]): Self = this.set("userIdentifierDataRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIdentifierDataRequired: Self = this.set("userIdentifierDataRequired", js.undefined)
    
    @scala.inline
    def setUserListsVarargs(value: String*): Self = this.set("userLists", js.Array(value :_*))
    
    @scala.inline
    def setUserLists(value: js.Array[String]): Self = this.set("userLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLists: Self = this.set("userLists", js.undefined)
    
    @scala.inline
    def setVendorTypesVarargs(value: String*): Self = this.set("vendorTypes", js.Array(value :_*))
    
    @scala.inline
    def setVendorTypes(value: js.Array[String]): Self = this.set("vendorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorTypes: Self = this.set("vendorTypes", js.undefined)
    
    @scala.inline
    def setVerticalsVarargs(value: String*): Self = this.set("verticals", js.Array(value :_*))
    
    @scala.inline
    def setVerticals(value: js.Array[String]): Self = this.set("verticals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticals: Self = this.set("verticals", js.undefined)
    
    @scala.inline
    def setVideoPlayerSizesVarargs(value: AspectRatio*): Self = this.set("videoPlayerSizes", js.Array(value :_*))
    
    @scala.inline
    def setVideoPlayerSizes(value: js.Array[AspectRatio]): Self = this.set("videoPlayerSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoPlayerSizes: Self = this.set("videoPlayerSizes", js.undefined)
  }
}
