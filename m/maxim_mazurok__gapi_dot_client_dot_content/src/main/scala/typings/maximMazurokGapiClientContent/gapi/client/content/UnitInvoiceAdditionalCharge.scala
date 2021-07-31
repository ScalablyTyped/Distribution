package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitInvoiceAdditionalCharge extends StObject {
  
  /** [required] Amount of the additional charge. */
  var additionalChargeAmount: js.UndefOr[Amount] = js.undefined
  
  /** [required] Type of the additional charge. Acceptable values are: - "`shipping`" */
  var `type`: js.UndefOr[String] = js.undefined
}
object UnitInvoiceAdditionalCharge {
  
  @scala.inline
  def apply(): UnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitInvoiceAdditionalCharge]
  }
  
  @scala.inline
  implicit class UnitInvoiceAdditionalChargeMutableBuilder[Self <: UnitInvoiceAdditionalCharge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalChargeAmount(value: Amount): Self = StObject.set(x, "additionalChargeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalChargeAmountUndefined: Self = StObject.set(x, "additionalChargeAmount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
