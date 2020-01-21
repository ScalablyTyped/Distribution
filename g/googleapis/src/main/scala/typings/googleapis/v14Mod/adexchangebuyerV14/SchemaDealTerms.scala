package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDealTerms extends js.Object {
  /**
    * Visibilty of the URL in bid requests.
    */
  var brandingType: js.UndefOr[String] = js.native
  /**
    * Indicates that this ExternalDealId exists under at least two different
    * AdxInventoryDeals. Currently, the only case that the same ExternalDealId
    * will exist is programmatic cross sell case.
    */
  var crossListedExternalDealIdType: js.UndefOr[String] = js.native
  /**
    * Description for the proposed terms of the deal.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Non-binding estimate of the estimated gross spend for this deal Can be
    * set by buyer or seller.
    */
  var estimatedGrossSpend: js.UndefOr[SchemaPrice] = js.native
  /**
    * Non-binding estimate of the impressions served per day Can be set by
    * buyer or seller.
    */
  var estimatedImpressionsPerDay: js.UndefOr[String] = js.native
  /**
    * The terms for guaranteed fixed price deals.
    */
  var guaranteedFixedPriceTerms: js.UndefOr[SchemaDealTermsGuaranteedFixedPriceTerms] = js.native
  /**
    * The terms for non-guaranteed auction deals.
    */
  var nonGuaranteedAuctionTerms: js.UndefOr[SchemaDealTermsNonGuaranteedAuctionTerms] = js.native
  /**
    * The terms for non-guaranteed fixed price deals.
    */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[SchemaDealTermsNonGuaranteedFixedPriceTerms] = js.native
  /**
    * The terms for rubicon non-guaranteed deals.
    */
  var rubiconNonGuaranteedTerms: js.UndefOr[SchemaDealTermsRubiconNonGuaranteedTerms] = js.native
  /**
    * For deals with Cost Per Day billing, defines the timezone used to mark
    * the boundaries of a day (buyer-readonly)
    */
  var sellerTimeZone: js.UndefOr[String] = js.native
}

object SchemaDealTerms {
  @scala.inline
  def apply(
    brandingType: String = null,
    crossListedExternalDealIdType: String = null,
    description: String = null,
    estimatedGrossSpend: SchemaPrice = null,
    estimatedImpressionsPerDay: String = null,
    guaranteedFixedPriceTerms: SchemaDealTermsGuaranteedFixedPriceTerms = null,
    nonGuaranteedAuctionTerms: SchemaDealTermsNonGuaranteedAuctionTerms = null,
    nonGuaranteedFixedPriceTerms: SchemaDealTermsNonGuaranteedFixedPriceTerms = null,
    rubiconNonGuaranteedTerms: SchemaDealTermsRubiconNonGuaranteedTerms = null,
    sellerTimeZone: String = null
  ): SchemaDealTerms = {
    val __obj = js.Dynamic.literal()
    if (brandingType != null) __obj.updateDynamic("brandingType")(brandingType.asInstanceOf[js.Any])
    if (crossListedExternalDealIdType != null) __obj.updateDynamic("crossListedExternalDealIdType")(crossListedExternalDealIdType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (estimatedGrossSpend != null) __obj.updateDynamic("estimatedGrossSpend")(estimatedGrossSpend.asInstanceOf[js.Any])
    if (estimatedImpressionsPerDay != null) __obj.updateDynamic("estimatedImpressionsPerDay")(estimatedImpressionsPerDay.asInstanceOf[js.Any])
    if (guaranteedFixedPriceTerms != null) __obj.updateDynamic("guaranteedFixedPriceTerms")(guaranteedFixedPriceTerms.asInstanceOf[js.Any])
    if (nonGuaranteedAuctionTerms != null) __obj.updateDynamic("nonGuaranteedAuctionTerms")(nonGuaranteedAuctionTerms.asInstanceOf[js.Any])
    if (nonGuaranteedFixedPriceTerms != null) __obj.updateDynamic("nonGuaranteedFixedPriceTerms")(nonGuaranteedFixedPriceTerms.asInstanceOf[js.Any])
    if (rubiconNonGuaranteedTerms != null) __obj.updateDynamic("rubiconNonGuaranteedTerms")(rubiconNonGuaranteedTerms.asInstanceOf[js.Any])
    if (sellerTimeZone != null) __obj.updateDynamic("sellerTimeZone")(sellerTimeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDealTerms]
  }
}

