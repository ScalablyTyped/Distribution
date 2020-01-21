package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLegacyPromotionBenefit extends js.Object {
  /**
    * The discount in the order price when the promotion is applied.
    */
  var discount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The OfferId(s) that were purchased in this order and map to this specific
    * benefit of the promotion.
    */
  var offerIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Further describes the benefit of the promotion. Note that we will expand
    * on this enumeration as we support new promotion sub-types.
    */
  var subType: js.UndefOr[String] = js.native
  /**
    * The impact on tax when the promotion is applied.
    */
  var taxImpact: js.UndefOr[SchemaPrice] = js.native
  /**
    * Describes whether the promotion applies to products (e.g. 20% off) or to
    * shipping (e.g. Free Shipping).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaOrderLegacyPromotionBenefit {
  @scala.inline
  def apply(
    discount: SchemaPrice = null,
    offerIds: js.Array[String] = null,
    subType: String = null,
    taxImpact: SchemaPrice = null,
    `type`: String = null
  ): SchemaOrderLegacyPromotionBenefit = {
    val __obj = js.Dynamic.literal()
    if (discount != null) __obj.updateDynamic("discount")(discount.asInstanceOf[js.Any])
    if (offerIds != null) __obj.updateDynamic("offerIds")(offerIds.asInstanceOf[js.Any])
    if (subType != null) __obj.updateDynamic("subType")(subType.asInstanceOf[js.Any])
    if (taxImpact != null) __obj.updateDynamic("taxImpact")(taxImpact.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderLegacyPromotionBenefit]
  }
}

