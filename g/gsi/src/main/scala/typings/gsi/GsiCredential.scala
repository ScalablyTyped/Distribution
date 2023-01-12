package typings.gsi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GsiCredential extends StObject {
  
  /** Identifies the user. */
  var id: String
  
  /** The password. */
  var password: String
}
object GsiCredential {
  
  inline def apply(id: String, password: String): GsiCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[GsiCredential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GsiCredential] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
