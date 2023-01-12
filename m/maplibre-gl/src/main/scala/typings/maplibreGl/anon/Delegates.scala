package typings.maplibreGl.anon

import typings.maplibreGl.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delegates extends StObject {
  
  var delegates: typeinkeyofMapEventTypeea
  
  var layer: String
  
  def listener(a: Any): Any
  @JSName("listener")
  var listener_Original: Listener
}
object Delegates {
  
  inline def apply(delegates: typeinkeyofMapEventTypeea, layer: String, listener: /* a */ Any => Any): Delegates = {
    val __obj = js.Dynamic.literal(delegates = delegates.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener))
    __obj.asInstanceOf[Delegates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delegates] (val x: Self) extends AnyVal {
    
    inline def setDelegates(value: typeinkeyofMapEventTypeea): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setListener(value: /* a */ Any => Any): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
  }
}
