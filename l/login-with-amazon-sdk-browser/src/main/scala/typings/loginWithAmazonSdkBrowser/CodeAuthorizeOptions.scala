package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Option form to request a code.
  */
@js.native
trait CodeAuthorizeOptions extends AuthorizeOptions {
  
  @JSName("response_type")
  var response_type_CodeAuthorizeOptions: code = js.native
}
object CodeAuthorizeOptions {
  
  @scala.inline
  def apply(response_type: code, scope: AuthorizeScope): CodeAuthorizeOptions = {
    val __obj = js.Dynamic.literal(response_type = response_type.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAuthorizeOptions]
  }
  
  @scala.inline
  implicit class CodeAuthorizeOptionsMutableBuilder[Self <: CodeAuthorizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse_type(value: code): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
  }
}
