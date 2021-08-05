package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvoiceSummary extends StObject {
  
  /** Summary of the total amounts of the additional charges. */
  var additionalChargeSummaries: js.UndefOr[js.Array[InvoiceSummaryAdditionalChargeSummary]] = js.undefined
  
  /** [required] Total price for the product. */
  var productTotal: js.UndefOr[Amount] = js.undefined
}
object InvoiceSummary {
  
  inline def apply(): InvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceSummary]
  }
  
  extension [Self <: InvoiceSummary](x: Self) {
    
    inline def setAdditionalChargeSummaries(value: js.Array[InvoiceSummaryAdditionalChargeSummary]): Self = StObject.set(x, "additionalChargeSummaries", value.asInstanceOf[js.Any])
    
    inline def setAdditionalChargeSummariesUndefined: Self = StObject.set(x, "additionalChargeSummaries", js.undefined)
    
    inline def setAdditionalChargeSummariesVarargs(value: InvoiceSummaryAdditionalChargeSummary*): Self = StObject.set(x, "additionalChargeSummaries", js.Array(value :_*))
    
    inline def setProductTotal(value: Amount): Self = StObject.set(x, "productTotal", value.asInstanceOf[js.Any])
    
    inline def setProductTotalUndefined: Self = StObject.set(x, "productTotal", js.undefined)
  }
}
