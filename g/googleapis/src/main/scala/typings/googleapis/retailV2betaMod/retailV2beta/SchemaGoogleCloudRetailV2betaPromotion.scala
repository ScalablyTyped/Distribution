package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaPromotion extends StObject {
  
  /**
    * Promotion identifier, which is the final component of name. For example, this field is "free_gift", if name is `projects/x/locations/global/catalogs/default_catalog/promotions/free_gift`. The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Corresponds to Google Merchant Center property [promotion_id](https://support.google.com/merchants/answer/7050148).
    */
  var promotionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaPromotion {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaPromotion]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaPromotion](x: Self) {
    
    inline def setPromotionId(value: String): Self = StObject.set(x, "promotionId", value.asInstanceOf[js.Any])
    
    inline def setPromotionIdNull: Self = StObject.set(x, "promotionId", null)
    
    inline def setPromotionIdUndefined: Self = StObject.set(x, "promotionId", js.undefined)
  }
}
