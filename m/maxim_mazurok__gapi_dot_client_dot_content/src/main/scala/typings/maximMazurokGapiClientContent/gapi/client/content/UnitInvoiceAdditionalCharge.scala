package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitInvoiceAdditionalCharge extends StObject {
  
  /**
    * [required] Amount of the additional charge per unit. *Note:* Invoicing works on a per unit bases. The `additionalChargeAmount` is the amount charged per unit, and will be multiplied
    * by the number of entries in `shipmentUnitID`.
    */
  var additionalChargeAmount: js.UndefOr[Amount] = js.undefined
  
  /** [required] Type of the additional charge. Acceptable values are: - "`shipping`" */
  var `type`: js.UndefOr[String] = js.undefined
}
object UnitInvoiceAdditionalCharge {
  
  inline def apply(): UnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitInvoiceAdditionalCharge]
  }
  
  extension [Self <: UnitInvoiceAdditionalCharge](x: Self) {
    
    inline def setAdditionalChargeAmount(value: Amount): Self = StObject.set(x, "additionalChargeAmount", value.asInstanceOf[js.Any])
    
    inline def setAdditionalChargeAmountUndefined: Self = StObject.set(x, "additionalChargeAmount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
