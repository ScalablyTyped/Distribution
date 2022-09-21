package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthorizedSellerStatusAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The authorized seller status to target.
    */
  var authorizedSellerStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_AUTHORIZED_SELLER_STATUS`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthorizedSellerStatusAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaAuthorizedSellerStatusAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizedSellerStatusAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaAuthorizedSellerStatusAssignedTargetingOptionDetails](x: Self) {
    
    inline def setAuthorizedSellerStatus(value: String): Self = StObject.set(x, "authorizedSellerStatus", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedSellerStatusNull: Self = StObject.set(x, "authorizedSellerStatus", null)
    
    inline def setAuthorizedSellerStatusUndefined: Self = StObject.set(x, "authorizedSellerStatus", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
