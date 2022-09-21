package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthModule extends StObject {
  
  def getToken(options: OAuthRequestOptions): js.Promise[OAuthResponse]
  
  def refreshToken(refreshToken: String): js.Promise[OAuthResponse]
}
object OAuthModule {
  
  inline def apply(
    getToken: OAuthRequestOptions => js.Promise[OAuthResponse],
    refreshToken: String => js.Promise[OAuthResponse]
  ): OAuthModule = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction1(getToken), refreshToken = js.Any.fromFunction1(refreshToken))
    __obj.asInstanceOf[OAuthModule]
  }
  
  extension [Self <: OAuthModule](x: Self) {
    
    inline def setGetToken(value: OAuthRequestOptions => js.Promise[OAuthResponse]): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
    
    inline def setRefreshToken(value: String => js.Promise[OAuthResponse]): Self = StObject.set(x, "refreshToken", js.Any.fromFunction1(value))
  }
}
