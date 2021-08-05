package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderPromotion extends StObject {
  
  /**
    * Items which this promotion may be applied to. If empty, there are no
    * restrictions on applicable items and quantity.
    */
  var applicableItems: js.UndefOr[js.Array[SchemaOrderPromotionItem]] = js.undefined
  
  /**
    * Items which this promotion have been applied to.
    */
  var appliedItems: js.UndefOr[js.Array[SchemaOrderPromotionItem]] = js.undefined
  
  /**
    * The party funding the promotion.
    */
  var funder: js.UndefOr[String] = js.undefined
  
  /**
    * This field is used to identify promotions within merchants&#39; own
    * systems.
    */
  var merchantPromotionId: js.UndefOr[String] = js.undefined
  
  /**
    * Estimated discount applied to price. Amount is pre-tax or post-tax
    * depending on location of order.
    */
  var priceValue: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * A short title of the promotion to be shown on the checkout page.
    */
  var shortTitle: js.UndefOr[String] = js.undefined
  
  /**
    * The category of the promotion.
    */
  var subtype: js.UndefOr[String] = js.undefined
  
  /**
    * Estimated discount applied to tax (if allowed by law).
    */
  var taxValue: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The title of the promotion.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The scope of the promotion.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaOrderPromotion {
  
  inline def apply(): SchemaOrderPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderPromotion]
  }
  
  extension [Self <: SchemaOrderPromotion](x: Self) {
    
    inline def setApplicableItems(value: js.Array[SchemaOrderPromotionItem]): Self = StObject.set(x, "applicableItems", value.asInstanceOf[js.Any])
    
    inline def setApplicableItemsUndefined: Self = StObject.set(x, "applicableItems", js.undefined)
    
    inline def setApplicableItemsVarargs(value: SchemaOrderPromotionItem*): Self = StObject.set(x, "applicableItems", js.Array(value :_*))
    
    inline def setAppliedItems(value: js.Array[SchemaOrderPromotionItem]): Self = StObject.set(x, "appliedItems", value.asInstanceOf[js.Any])
    
    inline def setAppliedItemsUndefined: Self = StObject.set(x, "appliedItems", js.undefined)
    
    inline def setAppliedItemsVarargs(value: SchemaOrderPromotionItem*): Self = StObject.set(x, "appliedItems", js.Array(value :_*))
    
    inline def setFunder(value: String): Self = StObject.set(x, "funder", value.asInstanceOf[js.Any])
    
    inline def setFunderUndefined: Self = StObject.set(x, "funder", js.undefined)
    
    inline def setMerchantPromotionId(value: String): Self = StObject.set(x, "merchantPromotionId", value.asInstanceOf[js.Any])
    
    inline def setMerchantPromotionIdUndefined: Self = StObject.set(x, "merchantPromotionId", js.undefined)
    
    inline def setPriceValue(value: SchemaPrice): Self = StObject.set(x, "priceValue", value.asInstanceOf[js.Any])
    
    inline def setPriceValueUndefined: Self = StObject.set(x, "priceValue", js.undefined)
    
    inline def setShortTitle(value: String): Self = StObject.set(x, "shortTitle", value.asInstanceOf[js.Any])
    
    inline def setShortTitleUndefined: Self = StObject.set(x, "shortTitle", js.undefined)
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setTaxValue(value: SchemaPrice): Self = StObject.set(x, "taxValue", value.asInstanceOf[js.Any])
    
    inline def setTaxValueUndefined: Self = StObject.set(x, "taxValue", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
