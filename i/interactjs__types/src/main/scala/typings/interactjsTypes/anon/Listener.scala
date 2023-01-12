package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listener extends StObject {
  
  def listener(args: Any*): Any
  @JSName("listener")
  var listener_Original: typings.interactjsTypes.coreTypesMod.Listener
  
  var `type`: String
}
object Listener {
  
  inline def apply(listener: typings.interactjsTypes.coreTypesMod.Listener, `type`: String): Listener = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
    
    inline def setListener(value: typings.interactjsTypes.coreTypesMod.Listener): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
