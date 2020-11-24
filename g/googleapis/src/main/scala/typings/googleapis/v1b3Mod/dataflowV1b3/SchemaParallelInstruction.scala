package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a particular operation comprising a MapTask.
  */
@js.native
trait SchemaParallelInstruction extends js.Object {
  
  /**
    * Additional information for Flatten instructions.
    */
  var flatten: js.UndefOr[SchemaFlattenInstruction] = js.native
  
  /**
    * User-provided name of this operation.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * System-defined name for the operation in the original workflow graph.
    */
  var originalName: js.UndefOr[String] = js.native
  
  /**
    * Describes the outputs of the instruction.
    */
  var outputs: js.UndefOr[js.Array[SchemaInstructionOutput]] = js.native
  
  /**
    * Additional information for ParDo instructions.
    */
  var parDo: js.UndefOr[SchemaParDoInstruction] = js.native
  
  /**
    * Additional information for PartialGroupByKey instructions.
    */
  var partialGroupByKey: js.UndefOr[SchemaPartialGroupByKeyInstruction] = js.native
  
  /**
    * Additional information for Read instructions.
    */
  var read: js.UndefOr[SchemaReadInstruction] = js.native
  
  /**
    * System-defined name of this operation. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
  
  /**
    * Additional information for Write instructions.
    */
  var write: js.UndefOr[SchemaWriteInstruction] = js.native
}
object SchemaParallelInstruction {
  
  @scala.inline
  def apply(): SchemaParallelInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParallelInstruction]
  }
  
  @scala.inline
  implicit class SchemaParallelInstructionOps[Self <: SchemaParallelInstruction] (val x: Self) extends AnyVal {
    
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
    def setFlatten(value: SchemaFlattenInstruction): Self = this.set("flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOriginalName(value: String): Self = this.set("originalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalName: Self = this.set("originalName", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: SchemaInstructionOutput*): Self = this.set("outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: js.Array[SchemaInstructionOutput]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    
    @scala.inline
    def setParDo(value: SchemaParDoInstruction): Self = this.set("parDo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParDo: Self = this.set("parDo", js.undefined)
    
    @scala.inline
    def setPartialGroupByKey(value: SchemaPartialGroupByKeyInstruction): Self = this.set("partialGroupByKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialGroupByKey: Self = this.set("partialGroupByKey", js.undefined)
    
    @scala.inline
    def setRead(value: SchemaReadInstruction): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = this.set("systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemName: Self = this.set("systemName", js.undefined)
    
    @scala.inline
    def setWrite(value: SchemaWriteInstruction): Self = this.set("write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
}
