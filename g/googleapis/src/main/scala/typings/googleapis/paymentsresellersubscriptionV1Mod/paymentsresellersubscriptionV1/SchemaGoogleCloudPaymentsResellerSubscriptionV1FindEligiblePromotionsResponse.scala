package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is empty, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The promotions for the current user.
    */
  var promotions: js.UndefOr[js.Array[SchemaGoogleCloudPaymentsResellerSubscriptionV1Promotion]] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPromotions(value: js.Array[SchemaGoogleCloudPaymentsResellerSubscriptionV1Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    inline def setPromotionsVarargs(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Promotion*): Self = StObject.set(x, "promotions", js.Array(value*))
  }
}
