package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstructionInput extends StObject {
  
  /**
    * The output index (origin zero) within the producer.
    */
  var outputNum: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The index (origin zero) of the parallel instruction that produces the output to be consumed by this input. This index is relative to the list of instructions in this input's instruction's containing MapTask.
    */
  var producerInstructionIndex: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInstructionInput {
  
  inline def apply(): SchemaInstructionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstructionInput]
  }
  
  extension [Self <: SchemaInstructionInput](x: Self) {
    
    inline def setOutputNum(value: Double): Self = StObject.set(x, "outputNum", value.asInstanceOf[js.Any])
    
    inline def setOutputNumNull: Self = StObject.set(x, "outputNum", null)
    
    inline def setOutputNumUndefined: Self = StObject.set(x, "outputNum", js.undefined)
    
    inline def setProducerInstructionIndex(value: Double): Self = StObject.set(x, "producerInstructionIndex", value.asInstanceOf[js.Any])
    
    inline def setProducerInstructionIndexNull: Self = StObject.set(x, "producerInstructionIndex", null)
    
    inline def setProducerInstructionIndexUndefined: Self = StObject.set(x, "producerInstructionIndex", js.undefined)
  }
}
