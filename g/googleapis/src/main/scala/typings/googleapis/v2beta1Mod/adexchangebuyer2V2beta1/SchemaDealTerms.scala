package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The deal terms specify the details of a Product/deal. They specify things
  * like price per buyer, the type of pricing model (e.g., fixed price,
  * auction) and expected impressions from the publisher.
  */
@js.native
trait SchemaDealTerms extends js.Object {
  /**
    * Visibility of the URL in bid requests. (default: BRANDED)
    */
  var brandingType: js.UndefOr[String] = js.native
  /**
    * Publisher provided description for the terms.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Non-binding estimate of the estimated gross spend for this deal. Can be
    * set by buyer or seller.
    */
  var estimatedGrossSpend: js.UndefOr[SchemaPrice] = js.native
  /**
    * Non-binding estimate of the impressions served per day. Can be set by
    * buyer or seller.
    */
  var estimatedImpressionsPerDay: js.UndefOr[String] = js.native
  /**
    * The terms for guaranteed fixed price deals.
    */
  var guaranteedFixedPriceTerms: js.UndefOr[SchemaGuaranteedFixedPriceTerms] = js.native
  /**
    * The terms for non-guaranteed auction deals.
    */
  var nonGuaranteedAuctionTerms: js.UndefOr[SchemaNonGuaranteedAuctionTerms] = js.native
  /**
    * The terms for non-guaranteed fixed price deals.
    */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[SchemaNonGuaranteedFixedPriceTerms] = js.native
  /**
    * The time zone name. For deals with Cost Per Day billing, defines the time
    * zone used to mark the boundaries of a day. It should be an IANA TZ name,
    * such as &quot;America/Los_Angeles&quot;. For more information, see
    * https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
    */
  var sellerTimeZone: js.UndefOr[String] = js.native
}

object SchemaDealTerms {
  @scala.inline
  def apply(): SchemaDealTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTerms]
  }
  @scala.inline
  implicit class SchemaDealTermsOps[Self <: SchemaDealTerms] (val x: Self) extends AnyVal {
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
    def setBrandingType(value: String): Self = this.set("brandingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrandingType: Self = this.set("brandingType", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEstimatedGrossSpend(value: SchemaPrice): Self = this.set("estimatedGrossSpend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedGrossSpend: Self = this.set("estimatedGrossSpend", js.undefined)
    @scala.inline
    def setEstimatedImpressionsPerDay(value: String): Self = this.set("estimatedImpressionsPerDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedImpressionsPerDay: Self = this.set("estimatedImpressionsPerDay", js.undefined)
    @scala.inline
    def setGuaranteedFixedPriceTerms(value: SchemaGuaranteedFixedPriceTerms): Self = this.set("guaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuaranteedFixedPriceTerms: Self = this.set("guaranteedFixedPriceTerms", js.undefined)
    @scala.inline
    def setNonGuaranteedAuctionTerms(value: SchemaNonGuaranteedAuctionTerms): Self = this.set("nonGuaranteedAuctionTerms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonGuaranteedAuctionTerms: Self = this.set("nonGuaranteedAuctionTerms", js.undefined)
    @scala.inline
    def setNonGuaranteedFixedPriceTerms(value: SchemaNonGuaranteedFixedPriceTerms): Self = this.set("nonGuaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonGuaranteedFixedPriceTerms: Self = this.set("nonGuaranteedFixedPriceTerms", js.undefined)
    @scala.inline
    def setSellerTimeZone(value: String): Self = this.set("sellerTimeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellerTimeZone: Self = this.set("sellerTimeZone", js.undefined)
  }
  
}

