package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInvoiceSummaryAdditionalChargeSummary extends StObject {
  
  /**
    * [required] Total additional charge for this type.
    */
  var totalAmount: js.UndefOr[SchemaAmount] = js.undefined
  
  /**
    * [required] Type of the additional charge. Acceptable values are: - "`shipping`"
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaInvoiceSummaryAdditionalChargeSummary {
  
  inline def apply(): SchemaInvoiceSummaryAdditionalChargeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoiceSummaryAdditionalChargeSummary]
  }
  
  extension [Self <: SchemaInvoiceSummaryAdditionalChargeSummary](x: Self) {
    
    inline def setTotalAmount(value: SchemaAmount): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalAmountUndefined: Self = StObject.set(x, "totalAmount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
