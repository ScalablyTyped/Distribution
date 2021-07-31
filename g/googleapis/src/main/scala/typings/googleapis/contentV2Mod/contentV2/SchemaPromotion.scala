package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPromotion extends StObject {
  
  /**
    * [required] Amount of the promotion. The values here are the promotion
    * applied to the unit price pretax and to the total of the tax amounts.
    */
  var promotionAmount: js.UndefOr[SchemaAmount] = js.undefined
  
  /**
    * [required] ID of the promotion.
    */
  var promotionId: js.UndefOr[String] = js.undefined
}
object SchemaPromotion {
  
  @scala.inline
  def apply(): SchemaPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPromotion]
  }
  
  @scala.inline
  implicit class SchemaPromotionMutableBuilder[Self <: SchemaPromotion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromotionAmount(value: SchemaAmount): Self = StObject.set(x, "promotionAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionAmountUndefined: Self = StObject.set(x, "promotionAmount", js.undefined)
    
    @scala.inline
    def setPromotionId(value: String): Self = StObject.set(x, "promotionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionIdUndefined: Self = StObject.set(x, "promotionId", js.undefined)
  }
}
