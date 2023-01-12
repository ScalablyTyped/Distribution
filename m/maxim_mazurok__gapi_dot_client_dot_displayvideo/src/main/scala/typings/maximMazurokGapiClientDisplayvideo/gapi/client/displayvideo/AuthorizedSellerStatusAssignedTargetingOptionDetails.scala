package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizedSellerStatusAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The authorized seller status to target. */
  var authorizedSellerStatus: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_AUTHORIZED_SELLER_STATUS`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object AuthorizedSellerStatusAssignedTargetingOptionDetails {
  
  inline def apply(): AuthorizedSellerStatusAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizedSellerStatusAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizedSellerStatusAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setAuthorizedSellerStatus(value: String): Self = StObject.set(x, "authorizedSellerStatus", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedSellerStatusUndefined: Self = StObject.set(x, "authorizedSellerStatus", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
