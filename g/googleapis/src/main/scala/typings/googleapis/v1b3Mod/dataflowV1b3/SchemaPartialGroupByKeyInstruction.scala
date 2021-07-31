package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instruction that does a partial group-by-key. One input and one output.
  */
trait SchemaPartialGroupByKeyInstruction extends StObject {
  
  /**
    * Describes the input to the partial group-by-key instruction.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.undefined
  
  /**
    * The codec to use for interpreting an element in the input PTable.
    */
  var inputElementCodec: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * If this instruction includes a combining function this is the name of the
    * intermediate store between the GBK and the CombineValues.
    */
  var originalCombineValuesInputStoreName: js.UndefOr[String] = js.undefined
  
  /**
    * If this instruction includes a combining function, this is the name of
    * the CombineValues instruction lifted into this instruction.
    */
  var originalCombineValuesStepName: js.UndefOr[String] = js.undefined
  
  /**
    * Zero or more side inputs.
    */
  var sideInputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.undefined
  
  /**
    * The value combining function to invoke.
    */
  var valueCombiningFn: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaPartialGroupByKeyInstruction {
  
  @scala.inline
  def apply(): SchemaPartialGroupByKeyInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartialGroupByKeyInstruction]
  }
  
  @scala.inline
  implicit class SchemaPartialGroupByKeyInstructionMutableBuilder[Self <: SchemaPartialGroupByKeyInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: SchemaInstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputElementCodec(value: StringDictionary[js.Any]): Self = StObject.set(x, "inputElementCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputElementCodecUndefined: Self = StObject.set(x, "inputElementCodec", js.undefined)
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setOriginalCombineValuesInputStoreName(value: String): Self = StObject.set(x, "originalCombineValuesInputStoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalCombineValuesInputStoreNameUndefined: Self = StObject.set(x, "originalCombineValuesInputStoreName", js.undefined)
    
    @scala.inline
    def setOriginalCombineValuesStepName(value: String): Self = StObject.set(x, "originalCombineValuesStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalCombineValuesStepNameUndefined: Self = StObject.set(x, "originalCombineValuesStepName", js.undefined)
    
    @scala.inline
    def setSideInputs(value: js.Array[SchemaSideInputInfo]): Self = StObject.set(x, "sideInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideInputsUndefined: Self = StObject.set(x, "sideInputs", js.undefined)
    
    @scala.inline
    def setSideInputsVarargs(value: SchemaSideInputInfo*): Self = StObject.set(x, "sideInputs", js.Array(value :_*))
    
    @scala.inline
    def setValueCombiningFn(value: StringDictionary[js.Any]): Self = StObject.set(x, "valueCombiningFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueCombiningFnUndefined: Self = StObject.set(x, "valueCombiningFn", js.undefined)
  }
}
