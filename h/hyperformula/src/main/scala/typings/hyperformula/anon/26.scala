package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var method: String
  
  var parameters: js.Array[
    ArgumentTypeMaxValueMinValueOptionalArg | MaxValueNumber | MaxValueMinValueOptionalArg
  ]
}
object `26` {
  
  inline def apply(
    method: String,
    parameters: js.Array[
      ArgumentTypeMaxValueMinValueOptionalArg | MaxValueNumber | MaxValueMinValueOptionalArg
    ]
  ): `26` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(
      value: js.Array[
          ArgumentTypeMaxValueMinValueOptionalArg | MaxValueNumber | MaxValueMinValueOptionalArg
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (ArgumentTypeMaxValueMinValueOptionalArg | MaxValueNumber | MaxValueMinValueOptionalArg)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
