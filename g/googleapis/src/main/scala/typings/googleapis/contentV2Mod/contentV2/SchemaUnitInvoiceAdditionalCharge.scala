package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnitInvoiceAdditionalCharge extends StObject {
  
  /**
    * [required] Amount of the additional charge.
    */
  var additionalChargeAmount: js.UndefOr[SchemaAmount] = js.undefined
  
  /**
    * Deprecated.
    */
  var additionalChargePromotions: js.UndefOr[js.Array[SchemaPromotion]] = js.undefined
  
  /**
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaUnitInvoiceAdditionalCharge {
  
  inline def apply(): SchemaUnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnitInvoiceAdditionalCharge]
  }
  
  extension [Self <: SchemaUnitInvoiceAdditionalCharge](x: Self) {
    
    inline def setAdditionalChargeAmount(value: SchemaAmount): Self = StObject.set(x, "additionalChargeAmount", value.asInstanceOf[js.Any])
    
    inline def setAdditionalChargeAmountUndefined: Self = StObject.set(x, "additionalChargeAmount", js.undefined)
    
    inline def setAdditionalChargePromotions(value: js.Array[SchemaPromotion]): Self = StObject.set(x, "additionalChargePromotions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalChargePromotionsUndefined: Self = StObject.set(x, "additionalChargePromotions", js.undefined)
    
    inline def setAdditionalChargePromotionsVarargs(value: SchemaPromotion*): Self = StObject.set(x, "additionalChargePromotions", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
