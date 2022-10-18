package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: typings.std.Node
  
  var listeners: js.Array[js.Tuple2[typings.interactjsTypes.coreEventsMod.Listener, Capture]]
  
  var selector: String
}
object Context {
  
  inline def apply(
    context: typings.std.Node,
    listeners: js.Array[js.Tuple2[typings.interactjsTypes.coreEventsMod.Listener, Capture]],
    selector: String
  ): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setContext(value: typings.std.Node): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setListeners(value: js.Array[js.Tuple2[typings.interactjsTypes.coreEventsMod.Listener, Capture]]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersVarargs(value: (js.Tuple2[typings.interactjsTypes.coreEventsMod.Listener, Capture])*): Self = StObject.set(x, "listeners", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
