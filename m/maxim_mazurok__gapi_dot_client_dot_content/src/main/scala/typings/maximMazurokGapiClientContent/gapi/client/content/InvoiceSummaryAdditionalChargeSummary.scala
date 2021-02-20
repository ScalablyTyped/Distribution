package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvoiceSummaryAdditionalChargeSummary extends StObject {
  
  /** [required] Total additional charge for this type. */
  var totalAmount: js.UndefOr[Amount] = js.native
  
  /** [required] Type of the additional charge. Acceptable values are: - "`shipping`" */
  var `type`: js.UndefOr[String] = js.native
}
object InvoiceSummaryAdditionalChargeSummary {
  
  @scala.inline
  def apply(): InvoiceSummaryAdditionalChargeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceSummaryAdditionalChargeSummary]
  }
  
  @scala.inline
  implicit class InvoiceSummaryAdditionalChargeSummaryMutableBuilder[Self <: InvoiceSummaryAdditionalChargeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotalAmount(value: Amount): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAmountUndefined: Self = StObject.set(x, "totalAmount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
