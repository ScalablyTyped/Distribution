package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFlattenInstruction extends StObject {
  
  /**
    * Describes the inputs to the flatten instruction.
    */
  var inputs: js.UndefOr[js.Array[SchemaInstructionInput]] = js.undefined
}
object SchemaFlattenInstruction {
  
  inline def apply(): SchemaFlattenInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlattenInstruction]
  }
  
  extension [Self <: SchemaFlattenInstruction](x: Self) {
    
    inline def setInputs(value: js.Array[SchemaInstructionInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: SchemaInstructionInput*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
