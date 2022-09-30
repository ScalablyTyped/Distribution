package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyvalidityurl extends StObject {
  
  var key_validity_url: String
  
  var public_key: String
}
object Keyvalidityurl {
  
  inline def apply(key_validity_url: String, public_key: String): Keyvalidityurl = {
    val __obj = js.Dynamic.literal(key_validity_url = key_validity_url.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyvalidityurl]
  }
  
  extension [Self <: Keyvalidityurl](x: Self) {
    
    inline def setKey_validity_url(value: String): Self = StObject.set(x, "key_validity_url", value.asInstanceOf[js.Any])
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
  }
}
