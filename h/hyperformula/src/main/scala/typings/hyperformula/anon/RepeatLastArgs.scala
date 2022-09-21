package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatLastArgs extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentTypePassSubtype | ArgumentTypeArgumentTypes]
  
  var repeatLastArgs: Double
}
object RepeatLastArgs {
  
  inline def apply(
    method: String,
    parameters: js.Array[ArgumentTypePassSubtype | ArgumentTypeArgumentTypes],
    repeatLastArgs: Double
  ): RepeatLastArgs = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], repeatLastArgs = repeatLastArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatLastArgs]
  }
  
  extension [Self <: RepeatLastArgs](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentTypePassSubtype | ArgumentTypeArgumentTypes]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (ArgumentTypePassSubtype | ArgumentTypeArgumentTypes)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRepeatLastArgs(value: Double): Self = StObject.set(x, "repeatLastArgs", value.asInstanceOf[js.Any])
  }
}
