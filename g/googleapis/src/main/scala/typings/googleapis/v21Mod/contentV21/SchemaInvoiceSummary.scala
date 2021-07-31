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
  
  @scala.inline
  def apply(): SchemaInvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoiceSummary]
  }
  
  @scala.inline
  implicit class SchemaInvoiceSummaryMutableBuilder[Self <: SchemaInvoiceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalChargeSummaries(value: js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]): Self = StObject.set(x, "additionalChargeSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalChargeSummariesUndefined: Self = StObject.set(x, "additionalChargeSummaries", js.undefined)
    
    @scala.inline
    def setAdditionalChargeSummariesVarargs(value: SchemaInvoiceSummaryAdditionalChargeSummary*): Self = StObject.set(x, "additionalChargeSummaries", js.Array(value :_*))
    
    @scala.inline
    def setProductTotal(value: SchemaAmount): Self = StObject.set(x, "productTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTotalUndefined: Self = StObject.set(x, "productTotal", js.undefined)
  }
}
