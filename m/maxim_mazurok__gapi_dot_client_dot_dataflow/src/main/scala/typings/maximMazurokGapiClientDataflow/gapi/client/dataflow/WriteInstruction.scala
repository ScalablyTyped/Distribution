package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteInstruction extends StObject {
  
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.undefined
  
  /** The sink to write to. */
  var sink: js.UndefOr[Sink] = js.undefined
}
object WriteInstruction {
  
  inline def apply(): WriteInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteInstruction]
  }
  
  extension [Self <: WriteInstruction](x: Self) {
    
    inline def setInput(value: InstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setSink(value: Sink): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setSinkUndefined: Self = StObject.set(x, "sink", js.undefined)
  }
}
