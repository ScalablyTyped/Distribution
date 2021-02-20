package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUnitInvoiceAdditionalCharge extends StObject {
  
  /**
    * [required] Amount of the additional charge.
    */
  var additionalChargeAmount: js.UndefOr[SchemaAmount] = js.native
  
  /**
    * Deprecated.
    */
  var additionalChargePromotions: js.UndefOr[js.Array[SchemaPromotion]] = js.native
  
  /**
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaUnitInvoiceAdditionalCharge {
  
  @scala.inline
  def apply(): SchemaUnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnitInvoiceAdditionalCharge]
  }
  
  @scala.inline
  implicit class SchemaUnitInvoiceAdditionalChargeMutableBuilder[Self <: SchemaUnitInvoiceAdditionalCharge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalChargeAmount(value: SchemaAmount): Self = StObject.set(x, "additionalChargeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalChargeAmountUndefined: Self = StObject.set(x, "additionalChargeAmount", js.undefined)
    
    @scala.inline
    def setAdditionalChargePromotions(value: js.Array[SchemaPromotion]): Self = StObject.set(x, "additionalChargePromotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalChargePromotionsUndefined: Self = StObject.set(x, "additionalChargePromotions", js.undefined)
    
    @scala.inline
    def setAdditionalChargePromotionsVarargs(value: SchemaPromotion*): Self = StObject.set(x, "additionalChargePromotions", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
