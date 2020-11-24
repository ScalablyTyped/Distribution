package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstructionInput extends js.Object {
  
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
  implicit class InstructionInputOps[Self <: InstructionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOutputNum(value: Double): Self = this.set("outputNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputNum: Self = this.set("outputNum", js.undefined)
    
    @scala.inline
    def setProducerInstructionIndex(value: Double): Self = this.set("producerInstructionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerInstructionIndex: Self = this.set("producerInstructionIndex", js.undefined)
  }
}
