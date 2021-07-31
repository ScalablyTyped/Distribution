package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookies extends StObject {
  
  var cookies: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var currentUserLiteral: js.UndefOr[String] = js.undefined
  
  var enableDoublecheck: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var model: js.UndefOr[js.Function0[Unit | String]] = js.undefined
  
  var overwriteExistingToken: js.UndefOr[Boolean] = js.undefined
  
  var params: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var searchDefaultTokenKeys: js.UndefOr[Boolean] = js.undefined
}
object Cookies {
  
  @scala.inline
  def apply(): Cookies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cookies]
  }
  
  @scala.inline
  implicit class CookiesMutableBuilder[Self <: Cookies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookies(value: js.Array[js.Any]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    @scala.inline
    def setCookiesVarargs(value: js.Any*): Self = StObject.set(x, "cookies", js.Array(value :_*))
    
    @scala.inline
    def setCurrentUserLiteral(value: String): Self = StObject.set(x, "currentUserLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUserLiteralUndefined: Self = StObject.set(x, "currentUserLiteral", js.undefined)
    
    @scala.inline
    def setEnableDoublecheck(value: Boolean): Self = StObject.set(x, "enableDoublecheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDoublecheckUndefined: Self = StObject.set(x, "enableDoublecheck", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Array[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setModel(value: () => Unit | String): Self = StObject.set(x, "model", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setOverwriteExistingToken(value: Boolean): Self = StObject.set(x, "overwriteExistingToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteExistingTokenUndefined: Self = StObject.set(x, "overwriteExistingToken", js.undefined)
    
    @scala.inline
    def setParams(value: js.Array[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setSearchDefaultTokenKeys(value: Boolean): Self = StObject.set(x, "searchDefaultTokenKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchDefaultTokenKeysUndefined: Self = StObject.set(x, "searchDefaultTokenKeys", js.undefined)
  }
}
