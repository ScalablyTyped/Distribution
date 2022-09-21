package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersRepeatLastArgs extends StObject {
  
  var method: String
  
  var parameters: js.Array[MinValuePassSubtype | ArgumentTypeMinValuePassSubtype]
  
  var repeatLastArgs: Double
}
object ParametersRepeatLastArgs {
  
  inline def apply(
    method: String,
    parameters: js.Array[MinValuePassSubtype | ArgumentTypeMinValuePassSubtype],
    repeatLastArgs: Double
  ): ParametersRepeatLastArgs = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], repeatLastArgs = repeatLastArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRepeatLastArgs]
  }
  
  extension [Self <: ParametersRepeatLastArgs](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[MinValuePassSubtype | ArgumentTypeMinValuePassSubtype]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (MinValuePassSubtype | ArgumentTypeMinValuePassSubtype)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRepeatLastArgs(value: Double): Self = StObject.set(x, "repeatLastArgs", value.asInstanceOf[js.Any])
  }
}
