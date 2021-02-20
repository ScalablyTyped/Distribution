package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instruction that copies its inputs (zero or more) to its (single)
  * output.
  */
@js.native
trait SchemaFlattenInstruction extends StObject {
  
  /**
    * Describes the inputs to the flatten instruction.
    */
  var inputs: js.UndefOr[js.Array[SchemaInstructionInput]] = js.native
}
object SchemaFlattenInstruction {
  
  @scala.inline
  def apply(): SchemaFlattenInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlattenInstruction]
  }
  
  @scala.inline
  implicit class SchemaFlattenInstructionMutableBuilder[Self <: SchemaFlattenInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[SchemaInstructionInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: SchemaInstructionInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
  }
}
