package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherProfile extends StObject {
  
  /** Description on the publisher's audience. */
  var audienceDescription: js.UndefOr[String] = js.native
  
  /** Statement explaining what's unique about publisher's business, and why buyers should partner with the publisher. */
  var buyerPitchStatement: js.UndefOr[String] = js.native
  
  /** Contact information for direct reservation deals. This is free text entered by the publisher and may include information like names, phone numbers and email addresses. */
  var directDealsContact: js.UndefOr[String] = js.native
  
  /** Name of the publisher profile. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The list of domains represented in this publisher profile. Empty if this is a parent profile. These are top private domains, meaning that these will not contain a string like
    * "photos.google.co.uk/123", but will instead contain "google.co.uk".
    */
  var domains: js.UndefOr[js.Array[String]] = js.native
  
  /** URL to publisher's Google+ page. */
  var googlePlusUrl: js.UndefOr[String] = js.native
  
  /**
    * Indicates if this profile is the parent profile of the seller. A parent profile represents all the inventory from the seller, as opposed to child profile that is created to brand a
    * portion of inventory. One seller should have only one parent publisher profile, and can have multiple child profiles. Publisher profiles for the same seller will have same value of
    * field google.ads.adexchange.buyer.v2beta1.PublisherProfile.seller. See https://support.google.com/admanager/answer/6035806 for details.
    */
  var isParent: js.UndefOr[Boolean] = js.native
  
  /** A Google public URL to the logo for this publisher profile. The logo is stored as a PNG, JPG, or GIF image. */
  var logoUrl: js.UndefOr[String] = js.native
  
  /** URL to additional marketing and sales materials. */
  var mediaKitUrl: js.UndefOr[String] = js.native
  
  /** The list of apps represented in this publisher profile. Empty if this is a parent profile. */
  var mobileApps: js.UndefOr[js.Array[PublisherProfileMobileApplication]] = js.native
  
  /** Overview of the publisher. */
  var overview: js.UndefOr[String] = js.native
  
  /** Contact information for programmatic deals. This is free text entered by the publisher and may include information like names, phone numbers and email addresses. */
  var programmaticDealsContact: js.UndefOr[String] = js.native
  
  /** Unique ID for publisher profile. */
  var publisherProfileId: js.UndefOr[String] = js.native
  
  /** URL to a publisher rate card. */
  var rateCardInfoUrl: js.UndefOr[String] = js.native
  
  /** URL to a sample content page. */
  var samplePageUrl: js.UndefOr[String] = js.native
  
  /** Seller of the publisher profile. */
  var seller: js.UndefOr[Seller] = js.native
  
  /** Up to three key metrics and rankings. Max 100 characters each. For example "#1 Mobile News Site for 20 Straight Months". */
  var topHeadlines: js.UndefOr[js.Array[String]] = js.native
}
object PublisherProfile {
  
  @scala.inline
  def apply(): PublisherProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherProfile]
  }
  
  @scala.inline
  implicit class PublisherProfileMutableBuilder[Self <: PublisherProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudienceDescription(value: String): Self = StObject.set(x, "audienceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceDescriptionUndefined: Self = StObject.set(x, "audienceDescription", js.undefined)
    
    @scala.inline
    def setBuyerPitchStatement(value: String): Self = StObject.set(x, "buyerPitchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerPitchStatementUndefined: Self = StObject.set(x, "buyerPitchStatement", js.undefined)
    
    @scala.inline
    def setDirectDealsContact(value: String): Self = StObject.set(x, "directDealsContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectDealsContactUndefined: Self = StObject.set(x, "directDealsContact", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    @scala.inline
    def setGooglePlusUrl(value: String): Self = StObject.set(x, "googlePlusUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGooglePlusUrlUndefined: Self = StObject.set(x, "googlePlusUrl", js.undefined)
    
    @scala.inline
    def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsParentUndefined: Self = StObject.set(x, "isParent", js.undefined)
    
    @scala.inline
    def setLogoUrl(value: String): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUrlUndefined: Self = StObject.set(x, "logoUrl", js.undefined)
    
    @scala.inline
    def setMediaKitUrl(value: String): Self = StObject.set(x, "mediaKitUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaKitUrlUndefined: Self = StObject.set(x, "mediaKitUrl", js.undefined)
    
    @scala.inline
    def setMobileApps(value: js.Array[PublisherProfileMobileApplication]): Self = StObject.set(x, "mobileApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileAppsUndefined: Self = StObject.set(x, "mobileApps", js.undefined)
    
    @scala.inline
    def setMobileAppsVarargs(value: PublisherProfileMobileApplication*): Self = StObject.set(x, "mobileApps", js.Array(value :_*))
    
    @scala.inline
    def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    @scala.inline
    def setProgrammaticDealsContact(value: String): Self = StObject.set(x, "programmaticDealsContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgrammaticDealsContactUndefined: Self = StObject.set(x, "programmaticDealsContact", js.undefined)
    
    @scala.inline
    def setPublisherProfileId(value: String): Self = StObject.set(x, "publisherProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherProfileIdUndefined: Self = StObject.set(x, "publisherProfileId", js.undefined)
    
    @scala.inline
    def setRateCardInfoUrl(value: String): Self = StObject.set(x, "rateCardInfoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateCardInfoUrlUndefined: Self = StObject.set(x, "rateCardInfoUrl", js.undefined)
    
    @scala.inline
    def setSamplePageUrl(value: String): Self = StObject.set(x, "samplePageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplePageUrlUndefined: Self = StObject.set(x, "samplePageUrl", js.undefined)
    
    @scala.inline
    def setSeller(value: Seller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    @scala.inline
    def setTopHeadlines(value: js.Array[String]): Self = StObject.set(x, "topHeadlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopHeadlinesUndefined: Self = StObject.set(x, "topHeadlines", js.undefined)
    
    @scala.inline
    def setTopHeadlinesVarargs(value: String*): Self = StObject.set(x, "topHeadlines", js.Array(value :_*))
  }
}
