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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizedSellerStatusTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setAuthorizedSellerStatus(value: String): Self = StObject.set(x, "authorizedSellerStatus", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedSellerStatusUndefined: Self = StObject.set(x, "authorizedSellerStatus", js.undefined)
  }
}
