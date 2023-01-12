package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelInstruction extends StObject {
  
  /** Additional information for Flatten instructions. */
  var flatten: js.UndefOr[FlattenInstruction] = js.undefined
  
  /** User-provided name of this operation. */
  var name: js.UndefOr[String] = js.undefined
  
  /** System-defined name for the operation in the original workflow graph. */
  var originalName: js.UndefOr[String] = js.undefined
  
  /** Describes the outputs of the instruction. */
  var outputs: js.UndefOr[js.Array[InstructionOutput]] = js.undefined
  
  /** Additional information for ParDo instructions. */
  var parDo: js.UndefOr[ParDoInstruction] = js.undefined
  
  /** Additional information for PartialGroupByKey instructions. */
  var partialGroupByKey: js.UndefOr[PartialGroupByKeyInstruction] = js.undefined
  
  /** Additional information for Read instructions. */
  var read: js.UndefOr[ReadInstruction] = js.undefined
  
  /** System-defined name of this operation. Unique across the workflow. */
  var systemName: js.UndefOr[String] = js.undefined
  
  /** Additional information for Write instructions. */
  var write: js.UndefOr[WriteInstruction] = js.undefined
}
object ParallelInstruction {
  
  inline def apply(): ParallelInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelInstruction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParallelInstruction] (val x: Self) extends AnyVal {
    
    inline def setFlatten(value: FlattenInstruction): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    
    inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setOutputs(value: js.Array[InstructionOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: InstructionOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setParDo(value: ParDoInstruction): Self = StObject.set(x, "parDo", value.asInstanceOf[js.Any])
    
    inline def setParDoUndefined: Self = StObject.set(x, "parDo", js.undefined)
    
    inline def setPartialGroupByKey(value: PartialGroupByKeyInstruction): Self = StObject.set(x, "partialGroupByKey", value.asInstanceOf[js.Any])
    
    inline def setPartialGroupByKeyUndefined: Self = StObject.set(x, "partialGroupByKey", js.undefined)
    
    inline def setRead(value: ReadInstruction): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    inline def setWrite(value: WriteInstruction): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
