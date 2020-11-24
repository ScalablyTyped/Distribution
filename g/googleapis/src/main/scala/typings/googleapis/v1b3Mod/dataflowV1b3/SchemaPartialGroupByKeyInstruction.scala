package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instruction that does a partial group-by-key. One input and one output.
  */
@js.native
trait SchemaPartialGroupByKeyInstruction extends js.Object {
  
  /**
    * Describes the input to the partial group-by-key instruction.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.native
  
  /**
    * The codec to use for interpreting an element in the input PTable.
    */
  var inputElementCodec: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * If this instruction includes a combining function this is the name of the
    * intermediate store between the GBK and the CombineValues.
    */
  var originalCombineValuesInputStoreName: js.UndefOr[String] = js.native
  
  /**
    * If this instruction includes a combining function, this is the name of
    * the CombineValues instruction lifted into this instruction.
    */
  var originalCombineValuesStepName: js.UndefOr[String] = js.native
  
  /**
    * Zero or more side inputs.
    */
  var sideInputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.native
  
  /**
    * The value combining function to invoke.
    */
  var valueCombiningFn: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object SchemaPartialGroupByKeyInstruction {
  
  @scala.inline
  def apply(): SchemaPartialGroupByKeyInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartialGroupByKeyInstruction]
  }
  
  @scala.inline
  implicit class SchemaPartialGroupByKeyInstructionOps[Self <: SchemaPartialGroupByKeyInstruction] (val x: Self) extends AnyVal {
    
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
    def setInput(value: SchemaInstructionInput): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInputElementCodec(value: StringDictionary[js.Any]): Self = this.set("inputElementCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputElementCodec: Self = this.set("inputElementCodec", js.undefined)
    
    @scala.inline
    def setOriginalCombineValuesInputStoreName(value: String): Self = this.set("originalCombineValuesInputStoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalCombineValuesInputStoreName: Self = this.set("originalCombineValuesInputStoreName", js.undefined)
    
    @scala.inline
    def setOriginalCombineValuesStepName(value: String): Self = this.set("originalCombineValuesStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalCombineValuesStepName: Self = this.set("originalCombineValuesStepName", js.undefined)
    
    @scala.inline
    def setSideInputsVarargs(value: SchemaSideInputInfo*): Self = this.set("sideInputs", js.Array(value :_*))
    
    @scala.inline
    def setSideInputs(value: js.Array[SchemaSideInputInfo]): Self = this.set("sideInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideInputs: Self = this.set("sideInputs", js.undefined)
    
    @scala.inline
    def setValueCombiningFn(value: StringDictionary[js.Any]): Self = this.set("valueCombiningFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueCombiningFn: Self = this.set("valueCombiningFn", js.undefined)
  }
}
