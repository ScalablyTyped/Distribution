package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthorizedSellerStatusTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The authorized seller status.
    */
  var authorizedSellerStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthorizedSellerStatusTargetingOptionDetails {
  
  inline def apply(): SchemaAuthorizedSellerStatusTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizedSellerStatusTargetingOptionDetails]
  }
  
  extension [Self <: SchemaAuthorizedSellerStatusTargetingOptionDetails](x: Self) {
    
    inline def setAuthorizedSellerStatus(value: String): Self = StObject.set(x, "authorizedSellerStatus", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedSellerStatusNull: Self = StObject.set(x, "authorizedSellerStatus", null)
    
    inline def setAuthorizedSellerStatusUndefined: Self = StObject.set(x, "authorizedSellerStatus", js.undefined)
  }
}
