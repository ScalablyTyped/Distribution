package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvoiceSummary extends StObject {
  
  /** Summary of the total amounts of the additional charges. */
  var additionalChargeSummaries: js.UndefOr[js.Array[InvoiceSummaryAdditionalChargeSummary]] = js.native
  
  /** [required] Total price for the product. */
  var productTotal: js.UndefOr[Amount] = js.native
}
object InvoiceSummary {
  
  @scala.inline
  def apply(): InvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceSummary]
  }
  
  @scala.inline
  implicit class InvoiceSummaryMutableBuilder[Self <: InvoiceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalChargeSummaries(value: js.Array[InvoiceSummaryAdditionalChargeSummary]): Self = StObject.set(x, "additionalChargeSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalChargeSummariesUndefined: Self = StObject.set(x, "additionalChargeSummaries", js.undefined)
    
    @scala.inline
    def setAdditionalChargeSummariesVarargs(value: InvoiceSummaryAdditionalChargeSummary*): Self = StObject.set(x, "additionalChargeSummaries", js.Array(value :_*))
    
    @scala.inline
    def setProductTotal(value: Amount): Self = StObject.set(x, "productTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTotalUndefined: Self = StObject.set(x, "productTotal", js.undefined)
  }
}
