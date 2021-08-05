package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleapis.anon.Token
import typings.googleapis.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPretargetingConfig extends StObject {
  
  /**
    * The id for billing purposes, provided for reference. Leave this field
    * blank for insert requests; the id will be generated automatically.
    */
  var billingId: js.UndefOr[String] = js.undefined
  
  /**
    * The config id; generated automatically. Leave this field blank for insert
    * requests.
    */
  var configId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the config. Must be unique. Required for all requests.
    */
  var configName: js.UndefOr[String] = js.undefined
  
  /**
    * List must contain exactly one of PRETARGETING_CREATIVE_TYPE_HTML or
    * PRETARGETING_CREATIVE_TYPE_VIDEO.
    */
  var creativeType: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests which allow one of these (width, height) pairs will match. All
    * pairs must be supported ad dimensions.
    */
  var dimensions: js.UndefOr[js.Array[Width]] = js.undefined
  
  /**
    * Requests with any of these content labels will not match. Values are from
    * content-labels.txt in the downloadable files section.
    */
  var excludedContentLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests containing any of these geo criteria ids will not match.
    */
  var excludedGeoCriteriaIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests containing any of these placements will not match.
    */
  var excludedPlacements: js.UndefOr[js.Array[Token]] = js.undefined
  
  /**
    * Requests containing any of these users list ids will not match.
    */
  var excludedUserLists: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests containing any of these vertical ids will not match. Values are
    * from the publisher-verticals.txt file in the downloadable files section.
    */
  var excludedVerticals: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests containing any of these geo criteria ids will match.
    */
  var geoCriteriaIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether this config is active. Required for all requests.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The kind of the resource, i.e.
    * &quot;adexchangebuyer#pretargetingConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Request containing any of these language codes will match.
    */
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests containing any of these mobile carrier ids will match. Values
    * are from mobile-carriers.csv in the downloadable files section.
    */
  var mobileCarriers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests containing any of these mobile device ids will match. Values are
    * from mobile-devices.csv in the downloadable files section.
    */
  var mobileDevices: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests containing any of these mobile operating system version ids will
    * match. Values are from mobile-os.csv in the downloadable files section.
    */
  var mobileOperatingSystemVersions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests containing any of these placements will match.
    */
  var placements: js.UndefOr[js.Array[Token]] = js.undefined
  
  /**
    * Requests matching any of these platforms will match. Possible values are
    * PRETARGETING_PLATFORM_MOBILE, PRETARGETING_PLATFORM_DESKTOP, and
    * PRETARGETING_PLATFORM_TABLET.
    */
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Creative attributes should be declared here if all creatives
    * corresponding to this pretargeting configuration have that creative
    * attribute. Values are from pretargetable-creative-attributes.txt in the
    * downloadable files section.
    */
  var supportedCreativeAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests containing any of these user list ids will match.
    */
  var userLists: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests that allow any of these vendor ids will match. Values are from
    * vendors.txt in the downloadable files section.
    */
  var vendorTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Requests containing any of these vertical ids will match.
    */
  var verticals: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaPretargetingConfig {
  
  inline def apply(): SchemaPretargetingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPretargetingConfig]
  }
  
  extension [Self <: SchemaPretargetingConfig](x: Self) {
    
    inline def setBillingId(value: String): Self = StObject.set(x, "billingId", value.asInstanceOf[js.Any])
    
    inline def setBillingIdUndefined: Self = StObject.set(x, "billingId", js.undefined)
    
    inline def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
    
    inline def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
    
    inline def setCreativeType(value: js.Array[String]): Self = StObject.set(x, "creativeType", value.asInstanceOf[js.Any])
    
    inline def setCreativeTypeUndefined: Self = StObject.set(x, "creativeType", js.undefined)
    
    inline def setCreativeTypeVarargs(value: String*): Self = StObject.set(x, "creativeType", js.Array(value :_*))
    
    inline def setDimensions(value: js.Array[Width]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: Width*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    inline def setExcludedContentLabels(value: js.Array[String]): Self = StObject.set(x, "excludedContentLabels", value.asInstanceOf[js.Any])
    
    inline def setExcludedContentLabelsUndefined: Self = StObject.set(x, "excludedContentLabels", js.undefined)
    
    inline def setExcludedContentLabelsVarargs(value: String*): Self = StObject.set(x, "excludedContentLabels", js.Array(value :_*))
    
    inline def setExcludedGeoCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "excludedGeoCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedGeoCriteriaIdsUndefined: Self = StObject.set(x, "excludedGeoCriteriaIds", js.undefined)
    
    inline def setExcludedGeoCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "excludedGeoCriteriaIds", js.Array(value :_*))
    
    inline def setExcludedPlacements(value: js.Array[Token]): Self = StObject.set(x, "excludedPlacements", value.asInstanceOf[js.Any])
    
    inline def setExcludedPlacementsUndefined: Self = StObject.set(x, "excludedPlacements", js.undefined)
    
    inline def setExcludedPlacementsVarargs(value: Token*): Self = StObject.set(x, "excludedPlacements", js.Array(value :_*))
    
    inline def setExcludedUserLists(value: js.Array[String]): Self = StObject.set(x, "excludedUserLists", value.asInstanceOf[js.Any])
    
    inline def setExcludedUserListsUndefined: Self = StObject.set(x, "excludedUserLists", js.undefined)
    
    inline def setExcludedUserListsVarargs(value: String*): Self = StObject.set(x, "excludedUserLists", js.Array(value :_*))
    
    inline def setExcludedVerticals(value: js.Array[String]): Self = StObject.set(x, "excludedVerticals", value.asInstanceOf[js.Any])
    
    inline def setExcludedVerticalsUndefined: Self = StObject.set(x, "excludedVerticals", js.undefined)
    
    inline def setExcludedVerticalsVarargs(value: String*): Self = StObject.set(x, "excludedVerticals", js.Array(value :_*))
    
    inline def setGeoCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "geoCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setGeoCriteriaIdsUndefined: Self = StObject.set(x, "geoCriteriaIds", js.undefined)
    
    inline def setGeoCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "geoCriteriaIds", js.Array(value :_*))
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    inline def setMobileCarriers(value: js.Array[String]): Self = StObject.set(x, "mobileCarriers", value.asInstanceOf[js.Any])
    
    inline def setMobileCarriersUndefined: Self = StObject.set(x, "mobileCarriers", js.undefined)
    
    inline def setMobileCarriersVarargs(value: String*): Self = StObject.set(x, "mobileCarriers", js.Array(value :_*))
    
    inline def setMobileDevices(value: js.Array[String]): Self = StObject.set(x, "mobileDevices", value.asInstanceOf[js.Any])
    
    inline def setMobileDevicesUndefined: Self = StObject.set(x, "mobileDevices", js.undefined)
    
    inline def setMobileDevicesVarargs(value: String*): Self = StObject.set(x, "mobileDevices", js.Array(value :_*))
    
    inline def setMobileOperatingSystemVersions(value: js.Array[String]): Self = StObject.set(x, "mobileOperatingSystemVersions", value.asInstanceOf[js.Any])
    
    inline def setMobileOperatingSystemVersionsUndefined: Self = StObject.set(x, "mobileOperatingSystemVersions", js.undefined)
    
    inline def setMobileOperatingSystemVersionsVarargs(value: String*): Self = StObject.set(x, "mobileOperatingSystemVersions", js.Array(value :_*))
    
    inline def setPlacements(value: js.Array[Token]): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
    
    inline def setPlacementsUndefined: Self = StObject.set(x, "placements", js.undefined)
    
    inline def setPlacementsVarargs(value: Token*): Self = StObject.set(x, "placements", js.Array(value :_*))
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value :_*))
    
    inline def setSupportedCreativeAttributes(value: js.Array[String]): Self = StObject.set(x, "supportedCreativeAttributes", value.asInstanceOf[js.Any])
    
    inline def setSupportedCreativeAttributesUndefined: Self = StObject.set(x, "supportedCreativeAttributes", js.undefined)
    
    inline def setSupportedCreativeAttributesVarargs(value: String*): Self = StObject.set(x, "supportedCreativeAttributes", js.Array(value :_*))
    
    inline def setUserLists(value: js.Array[String]): Self = StObject.set(x, "userLists", value.asInstanceOf[js.Any])
    
    inline def setUserListsUndefined: Self = StObject.set(x, "userLists", js.undefined)
    
    inline def setUserListsVarargs(value: String*): Self = StObject.set(x, "userLists", js.Array(value :_*))
    
    inline def setVendorTypes(value: js.Array[String]): Self = StObject.set(x, "vendorTypes", value.asInstanceOf[js.Any])
    
    inline def setVendorTypesUndefined: Self = StObject.set(x, "vendorTypes", js.undefined)
    
    inline def setVendorTypesVarargs(value: String*): Self = StObject.set(x, "vendorTypes", js.Array(value :_*))
    
    inline def setVerticals(value: js.Array[String]): Self = StObject.set(x, "verticals", value.asInstanceOf[js.Any])
    
    inline def setVerticalsUndefined: Self = StObject.set(x, "verticals", js.undefined)
    
    inline def setVerticalsVarargs(value: String*): Self = StObject.set(x, "verticals", js.Array(value :_*))
  }
}
