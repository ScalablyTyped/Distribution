package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerApiKey extends StObject {
  
  var serverApiKey: String
}
object ServerApiKey {
  
  inline def apply(serverApiKey: String): ServerApiKey = {
    val __obj = js.Dynamic.literal(serverApiKey = serverApiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerApiKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerApiKey] (val x: Self) extends AnyVal {
    
    inline def setServerApiKey(value: String): Self = StObject.set(x, "serverApiKey", value.asInstanceOf[js.Any])
  }
}
