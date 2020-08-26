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
  def apply(): SchemaDealTermsRubiconNonGuaranteedTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsRubiconNonGuaranteedTerms]
  }
  @scala.inline
  implicit class SchemaDealTermsRubiconNonGuaranteedTermsOps[Self <: SchemaDealTermsRubiconNonGuaranteedTerms] (val x: Self) extends AnyVal {
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
    def setPriorityPrice(value: SchemaPrice): Self = this.set("priorityPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriorityPrice: Self = this.set("priorityPrice", js.undefined)
    @scala.inline
    def setStandardPrice(value: SchemaPrice): Self = this.set("standardPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardPrice: Self = this.set("standardPrice", js.undefined)
  }
  
}

