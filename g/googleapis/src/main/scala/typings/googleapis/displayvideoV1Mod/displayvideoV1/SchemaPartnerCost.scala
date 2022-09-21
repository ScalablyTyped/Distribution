package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartnerCost extends StObject {
  
  /**
    * Required. The type of the partner cost.
    */
  var costType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The CPM fee amount in micros of advertiser's currency. Applicable when the fee_type is `PARTNER_FEE_TYPE_CPM_FEE`. Must be greater than or equal to 0. For example, for 1.5 standard unit of the advertiser's currency, set this field to 1500000.
    */
  var feeAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The media fee percentage in millis (1/1000 of a percent). Applicable when the fee_type is `PARTNER_FEE_TYPE_MEDIA_FEE`. Must be greater than or equal to 0. For example: 100 represents 0.1%.
    */
  var feePercentageMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The fee type for this partner cost.
    */
  var feeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The invoice type for this partner cost. * Required when cost_type is one of: - `PARTNER_COST_TYPE_ADLOOX` - `PARTNER_COST_TYPE_DOUBLE_VERIFY` - `PARTNER_COST_TYPE_INTEGRAL_AD_SCIENCE`. * Output only for other types.
    */
  var invoiceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaPartnerCost {
  
  inline def apply(): SchemaPartnerCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartnerCost]
  }
  
  extension [Self <: SchemaPartnerCost](x: Self) {
    
    inline def setCostType(value: String): Self = StObject.set(x, "costType", value.asInstanceOf[js.Any])
    
    inline def setCostTypeNull: Self = StObject.set(x, "costType", null)
    
    inline def setCostTypeUndefined: Self = StObject.set(x, "costType", js.undefined)
    
    inline def setFeeAmount(value: String): Self = StObject.set(x, "feeAmount", value.asInstanceOf[js.Any])
    
    inline def setFeeAmountNull: Self = StObject.set(x, "feeAmount", null)
    
    inline def setFeeAmountUndefined: Self = StObject.set(x, "feeAmount", js.undefined)
    
    inline def setFeePercentageMillis(value: String): Self = StObject.set(x, "feePercentageMillis", value.asInstanceOf[js.Any])
    
    inline def setFeePercentageMillisNull: Self = StObject.set(x, "feePercentageMillis", null)
    
    inline def setFeePercentageMillisUndefined: Self = StObject.set(x, "feePercentageMillis", js.undefined)
    
    inline def setFeeType(value: String): Self = StObject.set(x, "feeType", value.asInstanceOf[js.Any])
    
    inline def setFeeTypeNull: Self = StObject.set(x, "feeType", null)
    
    inline def setFeeTypeUndefined: Self = StObject.set(x, "feeType", js.undefined)
    
    inline def setInvoiceType(value: String): Self = StObject.set(x, "invoiceType", value.asInstanceOf[js.Any])
    
    inline def setInvoiceTypeNull: Self = StObject.set(x, "invoiceType", null)
    
    inline def setInvoiceTypeUndefined: Self = StObject.set(x, "invoiceType", js.undefined)
  }
}
