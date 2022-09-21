package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenInstruction extends StObject {
  
  /** Describes the inputs to the flatten instruction. */
  var inputs: js.UndefOr[js.Array[InstructionInput]] = js.undefined
}
object FlattenInstruction {
  
  inline def apply(): FlattenInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlattenInstruction]
  }
  
  extension [Self <: FlattenInstruction](x: Self) {
    
    inline def setInputs(value: js.Array[InstructionInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: InstructionInput*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
