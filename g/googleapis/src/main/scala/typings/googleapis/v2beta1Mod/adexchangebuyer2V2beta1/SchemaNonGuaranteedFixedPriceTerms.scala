package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Terms for Preferred Deals. Note that Preferred Deals cannot be created via
  * the API at this time, but can be returned in a get or list request.
  */
@js.native
trait SchemaNonGuaranteedFixedPriceTerms extends js.Object {
  /**
    * Fixed price for the specified buyer.
    */
  var fixedPrices: js.UndefOr[js.Array[SchemaPricePerBuyer]] = js.native
}

object SchemaNonGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(fixedPrices: js.Array[SchemaPricePerBuyer] = null): SchemaNonGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    if (fixedPrices != null) __obj.updateDynamic("fixedPrices")(fixedPrices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNonGuaranteedFixedPriceTerms]
  }
}

