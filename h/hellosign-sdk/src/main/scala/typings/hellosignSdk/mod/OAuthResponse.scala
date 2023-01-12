package typings.hellosignSdk.mod

import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthResponse
  extends StObject
     with BaseResponse {
  
  var oauth: OAuth
}
object OAuthResponse {
  
  inline def apply(oauth: OAuth, resHeaders: IncomingHttpHeaders): OAuthResponse = {
    val __obj = js.Dynamic.literal(oauth = oauth.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuthResponse] (val x: Self) extends AnyVal {
    
    inline def setOauth(value: OAuth): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
  }
}
