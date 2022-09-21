package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnitInvoiceTaxLine extends StObject {
  
  /**
    * [required] Tax amount for the tax type.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Optional name of the tax type. This should only be provided if `taxType` is `otherFeeTax`.
    */
  var taxName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [required] Type of the tax. Acceptable values are: - "`otherFee`" - "`otherFeeTax`" - "`sales`"
    */
  var taxType: js.UndefOr[String | Null] = js.undefined
}
object SchemaUnitInvoiceTaxLine {
  
  inline def apply(): SchemaUnitInvoiceTaxLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnitInvoiceTaxLine]
  }
  
  extension [Self <: SchemaUnitInvoiceTaxLine](x: Self) {
    
    inline def setTaxAmount(value: SchemaPrice): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
    
    inline def setTaxName(value: String): Self = StObject.set(x, "taxName", value.asInstanceOf[js.Any])
    
    inline def setTaxNameNull: Self = StObject.set(x, "taxName", null)
    
    inline def setTaxNameUndefined: Self = StObject.set(x, "taxName", js.undefined)
    
    inline def setTaxType(value: String): Self = StObject.set(x, "taxType", value.asInstanceOf[js.Any])
    
    inline def setTaxTypeNull: Self = StObject.set(x, "taxType", null)
    
    inline def setTaxTypeUndefined: Self = StObject.set(x, "taxType", js.undefined)
  }
}
