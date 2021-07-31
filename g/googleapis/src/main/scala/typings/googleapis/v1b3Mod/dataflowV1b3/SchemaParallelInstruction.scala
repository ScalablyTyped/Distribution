package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a particular operation comprising a MapTask.
  */
trait SchemaParallelInstruction extends StObject {
  
  /**
    * Additional information for Flatten instructions.
    */
  var flatten: js.UndefOr[SchemaFlattenInstruction] = js.undefined
  
  /**
    * User-provided name of this operation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * System-defined name for the operation in the original workflow graph.
    */
  var originalName: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the outputs of the instruction.
    */
  var outputs: js.UndefOr[js.Array[SchemaInstructionOutput]] = js.undefined
  
  /**
    * Additional information for ParDo instructions.
    */
  var parDo: js.UndefOr[SchemaParDoInstruction] = js.undefined
  
  /**
    * Additional information for PartialGroupByKey instructions.
    */
  var partialGroupByKey: js.UndefOr[SchemaPartialGroupByKeyInstruction] = js.undefined
  
  /**
    * Additional information for Read instructions.
    */
  var read: js.UndefOr[SchemaReadInstruction] = js.undefined
  
  /**
    * System-defined name of this operation. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.undefined
  
  /**
    * Additional information for Write instructions.
    */
  var write: js.UndefOr[SchemaWriteInstruction] = js.undefined
}
object SchemaParallelInstruction {
  
  @scala.inline
  def apply(): SchemaParallelInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParallelInstruction]
  }
  
  @scala.inline
  implicit class SchemaParallelInstructionMutableBuilder[Self <: SchemaParallelInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlatten(value: SchemaFlattenInstruction): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    @scala.inline
    def setOutputs(value: js.Array[SchemaInstructionOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: SchemaInstructionOutput*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setParDo(value: SchemaParDoInstruction): Self = StObject.set(x, "parDo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParDoUndefined: Self = StObject.set(x, "parDo", js.undefined)
    
    @scala.inline
    def setPartialGroupByKey(value: SchemaPartialGroupByKeyInstruction): Self = StObject.set(x, "partialGroupByKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialGroupByKeyUndefined: Self = StObject.set(x, "partialGroupByKey", js.undefined)
    
    @scala.inline
    def setRead(value: SchemaReadInstruction): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    @scala.inline
    def setWrite(value: SchemaWriteInstruction): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
