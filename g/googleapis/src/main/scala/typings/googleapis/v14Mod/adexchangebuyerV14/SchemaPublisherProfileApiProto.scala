package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    audience: String = null,
    buyerPitchStatement: String = null,
    directContact: String = null,
    exchange: String = null,
    googlePlusLink: String = null,
    isParent: js.UndefOr[Boolean] = js.undefined,
    isPublished: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    logoUrl: String = null,
    mediaKitLink: String = null,
    name: String = null,
    overview: String = null,
    profileId: js.UndefOr[Double] = js.undefined,
    programmaticContact: String = null,
    publisherDomains: js.Array[String] = null,
    publisherProfileId: String = null,
    publisherProvidedForecast: SchemaPublisherProvidedForecast = null,
    rateCardInfoLink: String = null,
    samplePageLink: String = null,
    seller: SchemaSeller = null,
    state: String = null,
    topHeadlines: js.Array[String] = null
  ): SchemaPublisherProfileApiProto = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (buyerPitchStatement != null) __obj.updateDynamic("buyerPitchStatement")(buyerPitchStatement.asInstanceOf[js.Any])
    if (directContact != null) __obj.updateDynamic("directContact")(directContact.asInstanceOf[js.Any])
    if (exchange != null) __obj.updateDynamic("exchange")(exchange.asInstanceOf[js.Any])
    if (googlePlusLink != null) __obj.updateDynamic("googlePlusLink")(googlePlusLink.asInstanceOf[js.Any])
    if (!js.isUndefined(isParent)) __obj.updateDynamic("isParent")(isParent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublished)) __obj.updateDynamic("isPublished")(isPublished.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (logoUrl != null) __obj.updateDynamic("logoUrl")(logoUrl.asInstanceOf[js.Any])
    if (mediaKitLink != null) __obj.updateDynamic("mediaKitLink")(mediaKitLink.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (!js.isUndefined(profileId)) __obj.updateDynamic("profileId")(profileId.get.asInstanceOf[js.Any])
    if (programmaticContact != null) __obj.updateDynamic("programmaticContact")(programmaticContact.asInstanceOf[js.Any])
    if (publisherDomains != null) __obj.updateDynamic("publisherDomains")(publisherDomains.asInstanceOf[js.Any])
    if (publisherProfileId != null) __obj.updateDynamic("publisherProfileId")(publisherProfileId.asInstanceOf[js.Any])
    if (publisherProvidedForecast != null) __obj.updateDynamic("publisherProvidedForecast")(publisherProvidedForecast.asInstanceOf[js.Any])
    if (rateCardInfoLink != null) __obj.updateDynamic("rateCardInfoLink")(rateCardInfoLink.asInstanceOf[js.Any])
    if (samplePageLink != null) __obj.updateDynamic("samplePageLink")(samplePageLink.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (topHeadlines != null) __obj.updateDynamic("topHeadlines")(topHeadlines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPublisherProfileApiProto]
  }
}

