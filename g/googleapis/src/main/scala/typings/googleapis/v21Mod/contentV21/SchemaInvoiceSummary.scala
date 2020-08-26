package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInvoiceSummary extends js.Object {
  /**
    * Summary of the total amounts of the additional charges.
    */
  var additionalChargeSummaries: js.UndefOr[js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]] = js.native
  /**
    * [required] Total price for the product.
    */
  var productTotal: js.UndefOr[SchemaAmount] = js.native
}

object SchemaInvoiceSummary {
  @scala.inline
  def apply(): SchemaInvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoiceSummary]
  }
  @scala.inline
  implicit class SchemaInvoiceSummaryOps[Self <: SchemaInvoiceSummary] (val x: Self) extends AnyVal {
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
    def setAdditionalChargeSummariesVarargs(value: SchemaInvoiceSummaryAdditionalChargeSummary*): Self = this.set("additionalChargeSummaries", js.Array(value :_*))
    @scala.inline
    def setAdditionalChargeSummaries(value: js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]): Self = this.set("additionalChargeSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalChargeSummaries: Self = this.set("additionalChargeSummaries", js.undefined)
    @scala.inline
    def setProductTotal(value: SchemaAmount): Self = this.set("productTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductTotal: Self = this.set("productTotal", js.undefined)
  }
  
}

