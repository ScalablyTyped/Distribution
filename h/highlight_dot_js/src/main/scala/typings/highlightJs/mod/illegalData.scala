package typings.highlightJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait illegalData extends StObject {
  
  var context: String
  
  var index: Double
  
  var message: String
  
  var mode: CompiledMode
  
  var resultSoFar: String
}
object illegalData {
  
  inline def apply(context: String, index: Double, message: String, mode: CompiledMode, resultSoFar: String): illegalData = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], resultSoFar = resultSoFar.asInstanceOf[js.Any])
    __obj.asInstanceOf[illegalData]
  }
  
  extension [Self <: illegalData](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMode(value: CompiledMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setResultSoFar(value: String): Self = StObject.set(x, "resultSoFar", value.asInstanceOf[js.Any])
  }
}
