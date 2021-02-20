package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitInvoiceTaxLine extends StObject {
  
  /** [required] Tax amount for the tax type. */
  var taxAmount: js.UndefOr[Price] = js.native
  
  /** Optional name of the tax type. This should only be provided if `taxType` is `otherFeeTax`. */
  var taxName: js.UndefOr[String] = js.native
  
  /** [required] Type of the tax. Acceptable values are: - "`otherFee`" - "`otherFeeTax`" - "`sales`" */
  var taxType: js.UndefOr[String] = js.native
}
object UnitInvoiceTaxLine {
  
  @scala.inline
  def apply(): UnitInvoiceTaxLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitInvoiceTaxLine]
  }
  
  @scala.inline
  implicit class UnitInvoiceTaxLineMutableBuilder[Self <: UnitInvoiceTaxLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaxAmount(value: Price): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
    
    @scala.inline
    def setTaxName(value: String): Self = StObject.set(x, "taxName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxNameUndefined: Self = StObject.set(x, "taxName", js.undefined)
    
    @scala.inline
    def setTaxType(value: String): Self = StObject.set(x, "taxType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxTypeUndefined: Self = StObject.set(x, "taxType", js.undefined)
  }
}
