package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyAny extends StObject {
  
  var key: Any
}
object KeyAny {
  
  inline def apply(key: Any): KeyAny = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAny]
  }
  
  extension [Self <: KeyAny](x: Self) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
