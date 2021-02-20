package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstructionInput extends StObject {
  
  /** The output index (origin zero) within the producer. */
  var outputNum: js.UndefOr[Double] = js.native
  
  /**
    * The index (origin zero) of the parallel instruction that produces the output to be consumed by this input. This index is relative to the list of instructions in this input's
    * instruction's containing MapTask.
    */
  var producerInstructionIndex: js.UndefOr[Double] = js.native
}
object InstructionInput {
  
  @scala.inline
  def apply(): InstructionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstructionInput]
  }
  
  @scala.inline
  implicit class InstructionInputMutableBuilder[Self <: InstructionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputNum(value: Double): Self = StObject.set(x, "outputNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputNumUndefined: Self = StObject.set(x, "outputNum", js.undefined)
    
    @scala.inline
    def setProducerInstructionIndex(value: Double): Self = StObject.set(x, "producerInstructionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerInstructionIndexUndefined: Self = StObject.set(x, "producerInstructionIndex", js.undefined)
  }
}
