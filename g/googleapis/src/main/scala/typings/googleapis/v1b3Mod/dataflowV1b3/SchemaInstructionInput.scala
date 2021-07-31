package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An input of an instruction, as a reference to an output of a producer
  * instruction.
  */
trait SchemaInstructionInput extends StObject {
  
  /**
    * The output index (origin zero) within the producer.
    */
  var outputNum: js.UndefOr[Double] = js.undefined
  
  /**
    * The index (origin zero) of the parallel instruction that produces the
    * output to be consumed by this input.  This index is relative to the list
    * of instructions in this input&#39;s instruction&#39;s containing MapTask.
    */
  var producerInstructionIndex: js.UndefOr[Double] = js.undefined
}
object SchemaInstructionInput {
  
  @scala.inline
  def apply(): SchemaInstructionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstructionInput]
  }
  
  @scala.inline
  implicit class SchemaInstructionInputMutableBuilder[Self <: SchemaInstructionInput] (val x: Self) extends AnyVal {
    
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
