package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartnerRevenueModel extends StObject {
  
  /**
    * Required. The markup amount of the partner revenue model. Must be greater than or equal to 0. * When the markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_CPM`, this field represents the CPM markup in micros of advertiser's currency. For example, 1500000 represents 1.5 standard units of the currency. * When the markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_MEDIA_COST_MARKUP`, this field represents the media cost percent markup in millis. For example, 100 represents 0.1% (decimal 0.001). * When the markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_TOTAL_MEDIA_COST_MARKUP`, this field represents the total media cost percent markup in millis. For example, 100 represents 0.1% (decimal 0.001).
    */
  var markupAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The markup type of the partner revenue model.
    */
  var markupType: js.UndefOr[String | Null] = js.undefined
}
object SchemaPartnerRevenueModel {
  
  inline def apply(): SchemaPartnerRevenueModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartnerRevenueModel]
  }
  
  extension [Self <: SchemaPartnerRevenueModel](x: Self) {
    
    inline def setMarkupAmount(value: String): Self = StObject.set(x, "markupAmount", value.asInstanceOf[js.Any])
    
    inline def setMarkupAmountNull: Self = StObject.set(x, "markupAmount", null)
    
    inline def setMarkupAmountUndefined: Self = StObject.set(x, "markupAmount", js.undefined)
    
    inline def setMarkupType(value: String): Self = StObject.set(x, "markupType", value.asInstanceOf[js.Any])
    
    inline def setMarkupTypeNull: Self = StObject.set(x, "markupType", null)
    
    inline def setMarkupTypeUndefined: Self = StObject.set(x, "markupType", js.undefined)
  }
}
