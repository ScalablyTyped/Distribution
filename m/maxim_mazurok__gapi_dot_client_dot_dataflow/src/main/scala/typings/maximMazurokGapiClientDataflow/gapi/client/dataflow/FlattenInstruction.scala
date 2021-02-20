package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlattenInstruction extends StObject {
  
  /** Describes the inputs to the flatten instruction. */
  var inputs: js.UndefOr[js.Array[InstructionInput]] = js.native
}
object FlattenInstruction {
  
  @scala.inline
  def apply(): FlattenInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlattenInstruction]
  }
  
  @scala.inline
  implicit class FlattenInstructionMutableBuilder[Self <: FlattenInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[InstructionInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: InstructionInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
  }
}
