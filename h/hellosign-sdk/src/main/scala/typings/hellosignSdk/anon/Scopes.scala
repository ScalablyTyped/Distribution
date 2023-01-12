package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scopes extends StObject {
  
  var callback_url: String
  
  var scopes: String
}
object Scopes {
  
  inline def apply(callback_url: String, scopes: String): Scopes = {
    val __obj = js.Dynamic.literal(callback_url = callback_url.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scopes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scopes] (val x: Self) extends AnyVal {
    
    inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: String): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
  }
}
