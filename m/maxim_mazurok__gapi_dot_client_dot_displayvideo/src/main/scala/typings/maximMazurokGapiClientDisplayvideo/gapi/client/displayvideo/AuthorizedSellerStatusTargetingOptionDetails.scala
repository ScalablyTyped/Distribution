package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizedSellerStatusTargetingOptionDetails extends StObject {
  
  /** Output only. The authorized seller status. */
  var authorizedSellerStatus: js.UndefOr[String] = js.undefined
}
object AuthorizedSellerStatusTargetingOptionDetails {
  
  inline def apply(): AuthorizedSellerStatusTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizedSellerStatusTargetingOptionDetails]
  }
  
  extension [Self <: AuthorizedSellerStatusTargetingOptionDetails](x: Self) {
    
    inline def setAuthorizedSellerStatus(value: String): Self = StObject.set(x, "authorizedSellerStatus", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedSellerStatusUndefined: Self = StObject.set(x, "authorizedSellerStatus", js.undefined)
  }
}
