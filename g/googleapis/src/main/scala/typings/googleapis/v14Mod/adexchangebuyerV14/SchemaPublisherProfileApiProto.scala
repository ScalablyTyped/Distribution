package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPublisherProfileApiProto extends js.Object {
  
  /**
    * Publisher provided info on its audience.
    */
  var audience: js.UndefOr[String] = js.native
  
  /**
    * A pitch statement for the buyer
    */
  var buyerPitchStatement: js.UndefOr[String] = js.native
  
  /**
    * Direct contact for the publisher profile.
    */
  var directContact: js.UndefOr[String] = js.native
  
  /**
    * Exchange where this publisher profile is from. E.g. AdX, Rubicon etc...
    */
  var exchange: js.UndefOr[String] = js.native
  
  /**
    * Link to publisher&#39;s Google+ page.
    */
  var googlePlusLink: js.UndefOr[String] = js.native
  
  /**
    * True, if this is the parent profile, which represents all domains owned
    * by the publisher.
    */
  var isParent: js.UndefOr[Boolean] = js.native
  
  /**
    * True, if this profile is published. Deprecated for state.
    */
  var isPublished: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;adexchangebuyer#publisherProfileApiProto&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The url to the logo for the publisher.
    */
  var logoUrl: js.UndefOr[String] = js.native
  
  /**
    * The url for additional marketing and sales materials.
    */
  var mediaKitLink: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * Publisher provided overview.
    */
  var overview: js.UndefOr[String] = js.native
  
  /**
    * The pair of (seller.account_id, profile_id) uniquely identifies a
    * publisher profile for a given publisher.
    */
  var profileId: js.UndefOr[Double] = js.native
  
  /**
    * Programmatic contact for the publisher profile.
    */
  var programmaticContact: js.UndefOr[String] = js.native
  
  /**
    * The list of domains represented in this publisher profile. Empty if this
    * is a parent profile.
    */
  var publisherDomains: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Unique Id for publisher profile.
    */
  var publisherProfileId: js.UndefOr[String] = js.native
  
  /**
    * Publisher provided forecasting information.
    */
  var publisherProvidedForecast: js.UndefOr[SchemaPublisherProvidedForecast] = js.native
  
  /**
    * Link to publisher rate card
    */
  var rateCardInfoLink: js.UndefOr[String] = js.native
  
  /**
    * Link for a sample content page.
    */
  var samplePageLink: js.UndefOr[String] = js.native
  
  /**
    * Seller of the publisher profile.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  
  /**
    * State of the publisher profile.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Publisher provided key metrics and rankings.
    */
  var topHeadlines: js.UndefOr[js.Array[String]] = js.native
}
object SchemaPublisherProfileApiProto {
  
  @scala.inline
  def apply(): SchemaPublisherProfileApiProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherProfileApiProto]
  }
  
  @scala.inline
  implicit class SchemaPublisherProfileApiProtoOps[Self <: SchemaPublisherProfileApiProto] (val x: Self) extends AnyVal {
    
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
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setBuyerPitchStatement(value: String): Self = this.set("buyerPitchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerPitchStatement: Self = this.set("buyerPitchStatement", js.undefined)
    
    @scala.inline
    def setDirectContact(value: String): Self = this.set("directContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectContact: Self = this.set("directContact", js.undefined)
    
    @scala.inline
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange: Self = this.set("exchange", js.undefined)
    
    @scala.inline
    def setGooglePlusLink(value: String): Self = this.set("googlePlusLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePlusLink: Self = this.set("googlePlusLink", js.undefined)
    
    @scala.inline
    def setIsParent(value: Boolean): Self = this.set("isParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsParent: Self = this.set("isParent", js.undefined)
    
    @scala.inline
    def setIsPublished(value: Boolean): Self = this.set("isPublished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPublished: Self = this.set("isPublished", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLogoUrl(value: String): Self = this.set("logoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoUrl: Self = this.set("logoUrl", js.undefined)
    
    @scala.inline
    def setMediaKitLink(value: String): Self = this.set("mediaKitLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaKitLink: Self = this.set("mediaKitLink", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOverview(value: String): Self = this.set("overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    
    @scala.inline
    def setProfileId(value: Double): Self = this.set("profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    
    @scala.inline
    def setProgrammaticContact(value: String): Self = this.set("programmaticContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgrammaticContact: Self = this.set("programmaticContact", js.undefined)
    
    @scala.inline
    def setPublisherDomainsVarargs(value: String*): Self = this.set("publisherDomains", js.Array(value :_*))
    
    @scala.inline
    def setPublisherDomains(value: js.Array[String]): Self = this.set("publisherDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherDomains: Self = this.set("publisherDomains", js.undefined)
    
    @scala.inline
    def setPublisherProfileId(value: String): Self = this.set("publisherProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherProfileId: Self = this.set("publisherProfileId", js.undefined)
    
    @scala.inline
    def setPublisherProvidedForecast(value: SchemaPublisherProvidedForecast): Self = this.set("publisherProvidedForecast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherProvidedForecast: Self = this.set("publisherProvidedForecast", js.undefined)
    
    @scala.inline
    def setRateCardInfoLink(value: String): Self = this.set("rateCardInfoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateCardInfoLink: Self = this.set("rateCardInfoLink", js.undefined)
    
    @scala.inline
    def setSamplePageLink(value: String): Self = this.set("samplePageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplePageLink: Self = this.set("samplePageLink", js.undefined)
    
    @scala.inline
    def setSeller(value: SchemaSeller): Self = this.set("seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeller: Self = this.set("seller", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTopHeadlinesVarargs(value: String*): Self = this.set("topHeadlines", js.Array(value :_*))
    
    @scala.inline
    def setTopHeadlines(value: js.Array[String]): Self = this.set("topHeadlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopHeadlines: Self = this.set("topHeadlines", js.undefined)
  }
}
