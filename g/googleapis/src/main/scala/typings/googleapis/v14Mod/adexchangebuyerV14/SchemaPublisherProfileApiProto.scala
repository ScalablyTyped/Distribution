package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublisherProfileApiProto extends StObject {
  
  /**
    * Publisher provided info on its audience.
    */
  var audience: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A pitch statement for the buyer
    */
  var buyerPitchStatement: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Direct contact for the publisher profile.
    */
  var directContact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Exchange where this publisher profile is from. E.g. AdX, Rubicon etc...
    */
  var exchange: js.UndefOr[String | Null] = js.undefined
  
  var forecastInventory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to publisher's Google+ page.
    */
  var googlePlusLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True, if this is the parent profile, which represents all domains owned by the publisher.
    */
  var isParent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True, if this profile is published. Deprecated for state.
    */
  var isPublished: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#publisherProfileApiProto".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The url to the logo for the publisher.
    */
  var logoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The url for additional marketing and sales materials.
    */
  var mediaKitLink: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Publisher provided overview.
    */
  var overview: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The pair of (seller.account_id, profile_id) uniquely identifies a publisher profile for a given publisher.
    */
  var profileId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Programmatic contact for the publisher profile.
    */
  var programmaticContact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of app IDs represented in this publisher profile. Empty if this is a parent profile. Deprecated in favor of publisher_app.
    */
  var publisherAppIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The list of apps represented in this publisher profile. Empty if this is a parent profile.
    */
  var publisherApps: js.UndefOr[js.Array[SchemaMobileApplication]] = js.undefined
  
  /**
    * The list of domains represented in this publisher profile. Empty if this is a parent profile.
    */
  var publisherDomains: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Unique Id for publisher profile.
    */
  var publisherProfileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Publisher provided forecasting information.
    */
  var publisherProvidedForecast: js.UndefOr[SchemaPublisherProvidedForecast] = js.undefined
  
  /**
    * Link to publisher rate card
    */
  var rateCardInfoLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link for a sample content page.
    */
  var samplePageLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Seller of the publisher profile.
    */
  var seller: js.UndefOr[SchemaSeller] = js.undefined
  
  /**
    * State of the publisher profile.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Publisher provided key metrics and rankings.
    */
  var topHeadlines: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPublisherProfileApiProto {
  
  inline def apply(): SchemaPublisherProfileApiProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherProfileApiProto]
  }
  
  extension [Self <: SchemaPublisherProfileApiProto](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceNull: Self = StObject.set(x, "audience", null)
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setBuyerPitchStatement(value: String): Self = StObject.set(x, "buyerPitchStatement", value.asInstanceOf[js.Any])
    
    inline def setBuyerPitchStatementNull: Self = StObject.set(x, "buyerPitchStatement", null)
    
    inline def setBuyerPitchStatementUndefined: Self = StObject.set(x, "buyerPitchStatement", js.undefined)
    
    inline def setDirectContact(value: String): Self = StObject.set(x, "directContact", value.asInstanceOf[js.Any])
    
    inline def setDirectContactNull: Self = StObject.set(x, "directContact", null)
    
    inline def setDirectContactUndefined: Self = StObject.set(x, "directContact", js.undefined)
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeNull: Self = StObject.set(x, "exchange", null)
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setForecastInventory(value: String): Self = StObject.set(x, "forecastInventory", value.asInstanceOf[js.Any])
    
    inline def setForecastInventoryNull: Self = StObject.set(x, "forecastInventory", null)
    
    inline def setForecastInventoryUndefined: Self = StObject.set(x, "forecastInventory", js.undefined)
    
    inline def setGooglePlusLink(value: String): Self = StObject.set(x, "googlePlusLink", value.asInstanceOf[js.Any])
    
    inline def setGooglePlusLinkNull: Self = StObject.set(x, "googlePlusLink", null)
    
    inline def setGooglePlusLinkUndefined: Self = StObject.set(x, "googlePlusLink", js.undefined)
    
    inline def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
    
    inline def setIsParentNull: Self = StObject.set(x, "isParent", null)
    
    inline def setIsParentUndefined: Self = StObject.set(x, "isParent", js.undefined)
    
    inline def setIsPublished(value: Boolean): Self = StObject.set(x, "isPublished", value.asInstanceOf[js.Any])
    
    inline def setIsPublishedNull: Self = StObject.set(x, "isPublished", null)
    
    inline def setIsPublishedUndefined: Self = StObject.set(x, "isPublished", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLogoUrl(value: String): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
    
    inline def setLogoUrlNull: Self = StObject.set(x, "logoUrl", null)
    
    inline def setLogoUrlUndefined: Self = StObject.set(x, "logoUrl", js.undefined)
    
    inline def setMediaKitLink(value: String): Self = StObject.set(x, "mediaKitLink", value.asInstanceOf[js.Any])
    
    inline def setMediaKitLinkNull: Self = StObject.set(x, "mediaKitLink", null)
    
    inline def setMediaKitLinkUndefined: Self = StObject.set(x, "mediaKitLink", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewNull: Self = StObject.set(x, "overview", null)
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setProfileId(value: Double): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdNull: Self = StObject.set(x, "profileId", null)
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setProgrammaticContact(value: String): Self = StObject.set(x, "programmaticContact", value.asInstanceOf[js.Any])
    
    inline def setProgrammaticContactNull: Self = StObject.set(x, "programmaticContact", null)
    
    inline def setProgrammaticContactUndefined: Self = StObject.set(x, "programmaticContact", js.undefined)
    
    inline def setPublisherAppIds(value: js.Array[String]): Self = StObject.set(x, "publisherAppIds", value.asInstanceOf[js.Any])
    
    inline def setPublisherAppIdsNull: Self = StObject.set(x, "publisherAppIds", null)
    
    inline def setPublisherAppIdsUndefined: Self = StObject.set(x, "publisherAppIds", js.undefined)
    
    inline def setPublisherAppIdsVarargs(value: String*): Self = StObject.set(x, "publisherAppIds", js.Array(value*))
    
    inline def setPublisherApps(value: js.Array[SchemaMobileApplication]): Self = StObject.set(x, "publisherApps", value.asInstanceOf[js.Any])
    
    inline def setPublisherAppsUndefined: Self = StObject.set(x, "publisherApps", js.undefined)
    
    inline def setPublisherAppsVarargs(value: SchemaMobileApplication*): Self = StObject.set(x, "publisherApps", js.Array(value*))
    
    inline def setPublisherDomains(value: js.Array[String]): Self = StObject.set(x, "publisherDomains", value.asInstanceOf[js.Any])
    
    inline def setPublisherDomainsNull: Self = StObject.set(x, "publisherDomains", null)
    
    inline def setPublisherDomainsUndefined: Self = StObject.set(x, "publisherDomains", js.undefined)
    
    inline def setPublisherDomainsVarargs(value: String*): Self = StObject.set(x, "publisherDomains", js.Array(value*))
    
    inline def setPublisherProfileId(value: String): Self = StObject.set(x, "publisherProfileId", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfileIdNull: Self = StObject.set(x, "publisherProfileId", null)
    
    inline def setPublisherProfileIdUndefined: Self = StObject.set(x, "publisherProfileId", js.undefined)
    
    inline def setPublisherProvidedForecast(value: SchemaPublisherProvidedForecast): Self = StObject.set(x, "publisherProvidedForecast", value.asInstanceOf[js.Any])
    
    inline def setPublisherProvidedForecastUndefined: Self = StObject.set(x, "publisherProvidedForecast", js.undefined)
    
    inline def setRateCardInfoLink(value: String): Self = StObject.set(x, "rateCardInfoLink", value.asInstanceOf[js.Any])
    
    inline def setRateCardInfoLinkNull: Self = StObject.set(x, "rateCardInfoLink", null)
    
    inline def setRateCardInfoLinkUndefined: Self = StObject.set(x, "rateCardInfoLink", js.undefined)
    
    inline def setSamplePageLink(value: String): Self = StObject.set(x, "samplePageLink", value.asInstanceOf[js.Any])
    
    inline def setSamplePageLinkNull: Self = StObject.set(x, "samplePageLink", null)
    
    inline def setSamplePageLinkUndefined: Self = StObject.set(x, "samplePageLink", js.undefined)
    
    inline def setSeller(value: SchemaSeller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    inline def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTopHeadlines(value: js.Array[String]): Self = StObject.set(x, "topHeadlines", value.asInstanceOf[js.Any])
    
    inline def setTopHeadlinesNull: Self = StObject.set(x, "topHeadlines", null)
    
    inline def setTopHeadlinesUndefined: Self = StObject.set(x, "topHeadlines", js.undefined)
    
    inline def setTopHeadlinesVarargs(value: String*): Self = StObject.set(x, "topHeadlines", js.Array(value*))
  }
}
