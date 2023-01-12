package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listeners extends StObject {
  
  var id: String
  
  var listeners: Any
}
object Listeners {
  
  inline def apply(id: String, listeners: Any): Listeners = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listeners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Listeners] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setListeners(value: Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
  }
}
