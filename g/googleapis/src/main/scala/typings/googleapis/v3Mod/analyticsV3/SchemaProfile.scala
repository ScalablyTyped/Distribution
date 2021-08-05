package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Effective
import typings.googleapis.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics view (profile).
  */
trait SchemaProfile extends StObject {
  
  /**
    * Account ID to which this view (profile) belongs.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether bot filtering is enabled for this view (profile).
    */
  var botFilteringEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Child link for this view (profile). Points to the list of goals for this
    * view (profile).
    */
  var childLink: js.UndefOr[Href] = js.undefined
  
  /**
    * Time this view (profile) was created.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * The currency type associated with this view (profile), defaults to USD.
    * The supported values are: USD, JPY, EUR, GBP, AUD, KRW, BRL, CNY, DKK,
    * RUB, SEK, NOK, PLN, TRY, TWD, HKD, THB, IDR, ARS, MXN, VND, PHP, INR,
    * CHF, CAD, CZK, NZD, HUF, BGN, LTL, ZAR, UAH, AED, BOB, CLP, COP, EGP,
    * HRK, ILS, MAD, MYR, PEN, PKR, RON, RSD, SAR, SGD, VEF, LVL
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * Default page for this view (profile).
    */
  var defaultPage: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether ecommerce tracking is enabled for this view (profile).
    */
  var eCommerceTracking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether enhanced ecommerce tracking is enabled for this view
    * (profile). This property can only be enabled if ecommerce tracking is
    * enabled.
    */
  var enhancedECommerceTracking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The query parameters that are excluded from this view (profile).
    */
  var excludeQueryParameters: js.UndefOr[String] = js.undefined
  
  /**
    * View (Profile) ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Internal ID for the web property to which this view (profile) belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type for Analytics view (profile).
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this view (profile).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Parent link for this view (profile). Points to the web property to which
    * this view (profile) belongs.
    */
  var parentLink: js.UndefOr[Href] = js.undefined
  
  /**
    * Permissions the user has for this view (profile).
    */
  var permissions: js.UndefOr[Effective] = js.undefined
  
  /**
    * Link for this view (profile).
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Site search category parameters for this view (profile).
    */
  var siteSearchCategoryParameters: js.UndefOr[String] = js.undefined
  
  /**
    * The site search query parameters for this view (profile).
    */
  var siteSearchQueryParameters: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether this view (profile) is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not Analytics will strip search category parameters from the
    * URLs in your reports.
    */
  var stripSiteSearchCategoryParameters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not Analytics will strip search query parameters from the URLs
    * in your reports.
    */
  var stripSiteSearchQueryParameters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Time zone for which this view (profile) has been configured. Time zones
    * are identified by strings from the TZ database.
    */
  var timezone: js.UndefOr[String] = js.undefined
  
  /**
    * View (Profile) type. Supported types: WEB or APP.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Time this view (profile) was last modified.
    */
  var updated: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID of the form UA-XXXXX-YY to which this view (profile)
    * belongs.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
  
  /**
    * Website URL for this view (profile).
    */
  var websiteUrl: js.UndefOr[String] = js.undefined
}
object SchemaProfile {
  
  inline def apply(): SchemaProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfile]
  }
  
  extension [Self <: SchemaProfile](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBotFilteringEnabled(value: Boolean): Self = StObject.set(x, "botFilteringEnabled", value.asInstanceOf[js.Any])
    
    inline def setBotFilteringEnabledUndefined: Self = StObject.set(x, "botFilteringEnabled", js.undefined)
    
    inline def setChildLink(value: Href): Self = StObject.set(x, "childLink", value.asInstanceOf[js.Any])
    
    inline def setChildLinkUndefined: Self = StObject.set(x, "childLink", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDefaultPage(value: String): Self = StObject.set(x, "defaultPage", value.asInstanceOf[js.Any])
    
    inline def setDefaultPageUndefined: Self = StObject.set(x, "defaultPage", js.undefined)
    
    inline def setECommerceTracking(value: Boolean): Self = StObject.set(x, "eCommerceTracking", value.asInstanceOf[js.Any])
    
    inline def setECommerceTrackingUndefined: Self = StObject.set(x, "eCommerceTracking", js.undefined)
    
    inline def setEnhancedECommerceTracking(value: Boolean): Self = StObject.set(x, "enhancedECommerceTracking", value.asInstanceOf[js.Any])
    
    inline def setEnhancedECommerceTrackingUndefined: Self = StObject.set(x, "enhancedECommerceTracking", js.undefined)
    
    inline def setExcludeQueryParameters(value: String): Self = StObject.set(x, "excludeQueryParameters", value.asInstanceOf[js.Any])
    
    inline def setExcludeQueryParametersUndefined: Self = StObject.set(x, "excludeQueryParameters", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    inline def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    inline def setPermissions(value: Effective): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSiteSearchCategoryParameters(value: String): Self = StObject.set(x, "siteSearchCategoryParameters", value.asInstanceOf[js.Any])
    
    inline def setSiteSearchCategoryParametersUndefined: Self = StObject.set(x, "siteSearchCategoryParameters", js.undefined)
    
    inline def setSiteSearchQueryParameters(value: String): Self = StObject.set(x, "siteSearchQueryParameters", value.asInstanceOf[js.Any])
    
    inline def setSiteSearchQueryParametersUndefined: Self = StObject.set(x, "siteSearchQueryParameters", js.undefined)
    
    inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    inline def setStripSiteSearchCategoryParameters(value: Boolean): Self = StObject.set(x, "stripSiteSearchCategoryParameters", value.asInstanceOf[js.Any])
    
    inline def setStripSiteSearchCategoryParametersUndefined: Self = StObject.set(x, "stripSiteSearchCategoryParameters", js.undefined)
    
    inline def setStripSiteSearchQueryParameters(value: Boolean): Self = StObject.set(x, "stripSiteSearchQueryParameters", value.asInstanceOf[js.Any])
    
    inline def setStripSiteSearchQueryParametersUndefined: Self = StObject.set(x, "stripSiteSearchQueryParameters", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
