package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthRequestOptions extends StObject {
  
  var code: String
  
  var state: String
}
object OAuthRequestOptions {
  
  inline def apply(code: String, state: String): OAuthRequestOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthRequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuthRequestOptions] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
