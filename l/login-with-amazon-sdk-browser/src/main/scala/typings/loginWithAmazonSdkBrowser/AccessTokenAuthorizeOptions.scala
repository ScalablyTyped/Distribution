package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessTokenAuthorizeOptions
  extends StObject
     with AuthorizeOptions {
  
  @JSName("response_type")
  var response_type_AccessTokenAuthorizeOptions: js.UndefOr[token] = js.undefined
}
object AccessTokenAuthorizeOptions {
  
  inline def apply(scope: AuthorizeScope): AccessTokenAuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenAuthorizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessTokenAuthorizeOptions] (val x: Self) extends AnyVal {
    
    inline def setResponse_type(value: token): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
  }
}
