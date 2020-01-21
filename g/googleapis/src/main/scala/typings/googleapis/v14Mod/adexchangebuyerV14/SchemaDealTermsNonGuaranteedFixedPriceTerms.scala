package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDealTermsNonGuaranteedFixedPriceTerms extends js.Object {
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
}

object SchemaDealTermsNonGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(fixedPrices: js.Array[SchemaPricePerBuyer] = null): SchemaDealTermsNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    if (fixedPrices != null) __obj.updateDynamic("fixedPrices")(fixedPrices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDealTermsNonGuaranteedFixedPriceTerms]
  }
}

