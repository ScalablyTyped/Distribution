package typings.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionStorage extends StObject {
  
  var sessionStorage: Boolean
}
object SessionStorage {
  
  inline def apply(sessionStorage: Boolean): SessionStorage = {
    val __obj = js.Dynamic.literal(sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionStorage] (val x: Self) extends AnyVal {
    
    inline def setSessionStorage(value: Boolean): Self = StObject.set(x, "sessionStorage", value.asInstanceOf[js.Any])
  }
}
