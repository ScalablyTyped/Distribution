package typings.kakaoJsSdk.anon

import typings.kakaoJsSdk.Kakao.Auth.AuthButtonSize
import typings.kakaoJsSdk.Kakao.Auth.AuthError
import typings.kakaoJsSdk.Kakao.Auth.AuthLanguage
import typings.kakaoJsSdk.Kakao.Auth.AuthSuccessObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var always: js.UndefOr[js.Function1[/* param */ AuthSuccessObject | AuthError, Unit]] = js.undefined
  
  var container: String | HTMLElement
  
  var fail: js.UndefOr[js.Function1[/* errorObj */ AuthError, Unit]] = js.undefined
  
  var lang: js.UndefOr[AuthLanguage] = js.undefined
  
  // additional agreement key ex) account_email,gender
  var persistAccessToken: js.UndefOr[Boolean] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  // default 'kr'
  var size: js.UndefOr[AuthButtonSize] = js.undefined
  
  // default 'medium'
  var success: js.UndefOr[js.Function1[/* authObj */ AuthSuccessObject, Unit]] = js.undefined
  
  // default true
  var throughTalk: js.UndefOr[Boolean] = js.undefined
}
object Container {
  
  inline def apply(container: String | HTMLElement): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setAlways(value: /* param */ AuthSuccessObject | AuthError => Unit): Self = StObject.set(x, "always", js.Any.fromFunction1(value))
    
    inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* errorObj */ AuthError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setLang(value: AuthLanguage): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setPersistAccessToken(value: Boolean): Self = StObject.set(x, "persistAccessToken", value.asInstanceOf[js.Any])
    
    inline def setPersistAccessTokenUndefined: Self = StObject.set(x, "persistAccessToken", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSize(value: AuthButtonSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSuccess(value: /* authObj */ AuthSuccessObject => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setThroughTalk(value: Boolean): Self = StObject.set(x, "throughTalk", value.asInstanceOf[js.Any])
    
    inline def setThroughTalkUndefined: Self = StObject.set(x, "throughTalk", js.undefined)
  }
}
