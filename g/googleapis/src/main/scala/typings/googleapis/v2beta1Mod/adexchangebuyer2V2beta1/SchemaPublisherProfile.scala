package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note: this resource requires whitelisting for access. Please contact your
  * account manager for access to Marketplace resources.  Represents a
  * publisher profile in Marketplace.  All fields are read only. All string
  * fields are free-form text entered by the publisher unless noted otherwise.
  */
@js.native
trait SchemaPublisherProfile extends js.Object {
  /**
    * Description on the publisher&#39;s audience.
    */
  var audienceDescription: js.UndefOr[String] = js.native
  /**
    * Statement explaining what&#39;s unique about publisher&#39;s business,
    * and why buyers should partner with the publisher.
    */
  var buyerPitchStatement: js.UndefOr[String] = js.native
  /**
    * Contact information for direct reservation deals. This is free text
    * entered by the publisher and may include information like names, phone
    * numbers and email addresses.
    */
  var directDealsContact: js.UndefOr[String] = js.native
  /**
    * Name of the publisher profile.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The list of domains represented in this publisher profile. Empty if this
    * is a parent profile. These are top private domains, meaning that these
    * will not contain a string like &quot;photos.google.co.uk/123&quot;, but
    * will instead contain &quot;google.co.uk&quot;.
    */
  var domains: js.UndefOr[js.Array[String]] = js.native
  /**
    * URL to publisher&#39;s Google+ page.
    */
  var googlePlusUrl: js.UndefOr[String] = js.native
  /**
    * A Google public URL to the logo for this publisher profile. The logo is
    * stored as a PNG, JPG, or GIF image.
    */
  var logoUrl: js.UndefOr[String] = js.native
  /**
    * URL to additional marketing and sales materials.
    */
  var mediaKitUrl: js.UndefOr[String] = js.native
  /**
    * Overview of the publisher.
    */
  var overview: js.UndefOr[String] = js.native
  /**
    * Contact information for programmatic deals. This is free text entered by
    * the publisher and may include information like names, phone numbers and
    * email addresses.
    */
  var programmaticDealsContact: js.UndefOr[String] = js.native
  /**
    * Unique ID for publisher profile.
    */
  var publisherProfileId: js.UndefOr[String] = js.native
  /**
    * URL to a publisher rate card.
    */
  var rateCardInfoUrl: js.UndefOr[String] = js.native
  /**
    * URL to a sample content page.
    */
  var samplePageUrl: js.UndefOr[String] = js.native
  /**
    * Seller of the publisher profile.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  /**
    * Up to three key metrics and rankings. Max 100 characters each. For
    * example &quot;#1 Mobile News Site for 20 Straight Months&quot;.
    */
  var topHeadlines: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPublisherProfile {
  @scala.inline
  def apply(): SchemaPublisherProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherProfile]
  }
  @scala.inline
  implicit class SchemaPublisherProfileOps[Self <: SchemaPublisherProfile] (val x: Self) extends AnyVal {
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
    def setAudienceDescription(value: String): Self = this.set("audienceDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudienceDescription: Self = this.set("audienceDescription", js.undefined)
    @scala.inline
    def setBuyerPitchStatement(value: String): Self = this.set("buyerPitchStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyerPitchStatement: Self = this.set("buyerPitchStatement", js.undefined)
    @scala.inline
    def setDirectDealsContact(value: String): Self = this.set("directDealsContact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectDealsContact: Self = this.set("directDealsContact", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDomainsVarargs(value: String*): Self = this.set("domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: js.Array[String]): Self = this.set("domains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    @scala.inline
    def setGooglePlusUrl(value: String): Self = this.set("googlePlusUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGooglePlusUrl: Self = this.set("googlePlusUrl", js.undefined)
    @scala.inline
    def setLogoUrl(value: String): Self = this.set("logoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoUrl: Self = this.set("logoUrl", js.undefined)
    @scala.inline
    def setMediaKitUrl(value: String): Self = this.set("mediaKitUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaKitUrl: Self = this.set("mediaKitUrl", js.undefined)
    @scala.inline
    def setOverview(value: String): Self = this.set("overview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    @scala.inline
    def setProgrammaticDealsContact(value: String): Self = this.set("programmaticDealsContact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgrammaticDealsContact: Self = this.set("programmaticDealsContact", js.undefined)
    @scala.inline
    def setPublisherProfileId(value: String): Self = this.set("publisherProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherProfileId: Self = this.set("publisherProfileId", js.undefined)
    @scala.inline
    def setRateCardInfoUrl(value: String): Self = this.set("rateCardInfoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateCardInfoUrl: Self = this.set("rateCardInfoUrl", js.undefined)
    @scala.inline
    def setSamplePageUrl(value: String): Self = this.set("samplePageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplePageUrl: Self = this.set("samplePageUrl", js.undefined)
    @scala.inline
    def setSeller(value: SchemaSeller): Self = this.set("seller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeller: Self = this.set("seller", js.undefined)
    @scala.inline
    def setTopHeadlinesVarargs(value: String*): Self = this.set("topHeadlines", js.Array(value :_*))
    @scala.inline
    def setTopHeadlines(value: js.Array[String]): Self = this.set("topHeadlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopHeadlines: Self = this.set("topHeadlines", js.undefined)
  }
  
}

