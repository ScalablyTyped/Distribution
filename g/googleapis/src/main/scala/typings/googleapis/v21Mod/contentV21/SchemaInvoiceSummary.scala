package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInvoiceSummary extends StObject {
  
  /**
    * Summary of the total amounts of the additional charges.
    */
  var additionalChargeSummaries: js.UndefOr[js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]] = js.undefined
  
  /**
    * [required] Total price for the product.
    */
  var productTotal: js.UndefOr[SchemaAmount] = js.undefined
}
object SchemaInvoiceSummary {
  
  inline def apply(): SchemaInvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoiceSummary]
  }
  
  extension [Self <: SchemaInvoiceSummary](x: Self) {
    
    inline def setAdditionalChargeSummaries(value: js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]): Self = StObject.set(x, "additionalChargeSummaries", value.asInstanceOf[js.Any])
    
    inline def setAdditionalChargeSummariesUndefined: Self = StObject.set(x, "additionalChargeSummaries", js.undefined)
    
    inline def setAdditionalChargeSummariesVarargs(value: SchemaInvoiceSummaryAdditionalChargeSummary*): Self = StObject.set(x, "additionalChargeSummaries", js.Array(value*))
    
    inline def setProductTotal(value: SchemaAmount): Self = StObject.set(x, "productTotal", value.asInstanceOf[js.Any])
    
    inline def setProductTotalUndefined: Self = StObject.set(x, "productTotal", js.undefined)
  }
}
