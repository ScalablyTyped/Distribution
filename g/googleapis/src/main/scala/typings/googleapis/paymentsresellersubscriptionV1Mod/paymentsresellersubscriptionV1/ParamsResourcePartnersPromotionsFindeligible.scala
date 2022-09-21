package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersPromotionsFindeligible
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent, the partner that can resell. Format: partners/{partner\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsRequest] = js.undefined
}
object ParamsResourcePartnersPromotionsFindeligible {
  
  inline def apply(): ParamsResourcePartnersPromotionsFindeligible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersPromotionsFindeligible]
  }
  
  extension [Self <: ParamsResourcePartnersPromotionsFindeligible](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1FindEligiblePromotionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
