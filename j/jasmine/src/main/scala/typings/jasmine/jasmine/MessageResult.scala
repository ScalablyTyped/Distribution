package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageResult
  extends StObject
     with Result {
  
  var trace: Trace
  
  var values: js.Any
}
object MessageResult {
  
  inline def apply(trace: Trace, `type`: String, values: js.Any): MessageResult = {
    val __obj = js.Dynamic.literal(trace = trace.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResult]
  }
  
  extension [Self <: MessageResult](x: Self) {
    
    inline def setTrace(value: Trace): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
