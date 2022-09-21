package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.InputObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inputs extends StObject {
  
  var inputs: js.Array[InputObject]
}
object Inputs {
  
  inline def apply(inputs: js.Array[InputObject]): Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  
  extension [Self <: Inputs](x: Self) {
    
    inline def setInputs(value: js.Array[InputObject]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: InputObject*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
