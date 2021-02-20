package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteInstruction extends StObject {
  
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.native
  
  /** The sink to write to. */
  var sink: js.UndefOr[Sink] = js.native
}
object WriteInstruction {
  
  @scala.inline
  def apply(): WriteInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteInstruction]
  }
  
  @scala.inline
  implicit class WriteInstructionMutableBuilder[Self <: WriteInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: InstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setSink(value: Sink): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinkUndefined: Self = StObject.set(x, "sink", js.undefined)
  }
}
