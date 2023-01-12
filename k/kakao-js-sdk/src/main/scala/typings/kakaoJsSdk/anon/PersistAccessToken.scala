package typings.kakaoJsSdk.anon

import typings.kakaoJsSdk.Kakao.Auth.AuthError
import typings.kakaoJsSdk.Kakao.Auth.AuthSuccessObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistAccessToken extends StObject {
  
  var always: js.UndefOr[js.Function1[/* param */ AuthSuccessObject | AuthError, Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* errorObj */ AuthError, Unit]] = js.undefined
  
  // additional agreement key ex) account_email,gender
  var persistAccessToken: js.UndefOr[Boolean] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* authObj */ AuthSuccessObject, Unit]] = js.undefined
}
object PersistAccessToken {
  
  inline def apply(): PersistAccessToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistAccessToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistAccessToken] (val x: Self) extends AnyVal {
    
    inline def setAlways(value: /* param */ AuthSuccessObject | AuthError => Unit): Self = StObject.set(x, "always", js.Any.fromFunction1(value))
    
    inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    inline def setFail(value: /* errorObj */ AuthError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setPersistAccessToken(value: Boolean): Self = StObject.set(x, "persistAccessToken", value.asInstanceOf[js.Any])
    
    inline def setPersistAccessTokenUndefined: Self = StObject.set(x, "persistAccessToken", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSuccess(value: /* authObj */ AuthSuccessObject => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
