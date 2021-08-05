package typings.highlightJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait illegalData extends StObject {
  
  var context: String
  
  var mode: CompiledMode
  
  var msg: String
}
object illegalData {
  
  inline def apply(context: String, mode: CompiledMode, msg: String): illegalData = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[illegalData]
  }
  
  extension [Self <: illegalData](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setMode(value: CompiledMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
