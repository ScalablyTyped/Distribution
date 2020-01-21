package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDealTermsRubiconNonGuaranteedTerms extends js.Object {
  /**
    * Optional price for Rubicon priority access in the auction.
    */
  var priorityPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Optional price for Rubicon standard access in the auction.
    */
  var standardPrice: js.UndefOr[SchemaPrice] = js.native
}

object SchemaDealTermsRubiconNonGuaranteedTerms {
  @scala.inline
  def apply(priorityPrice: SchemaPrice = null, standardPrice: SchemaPrice = null): SchemaDealTermsRubiconNonGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    if (priorityPrice != null) __obj.updateDynamic("priorityPrice")(priorityPrice.asInstanceOf[js.Any])
    if (standardPrice != null) __obj.updateDynamic("standardPrice")(standardPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDealTermsRubiconNonGuaranteedTerms]
  }
}

