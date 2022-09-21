package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartialGroupByKeyInstruction extends StObject {
  
  /**
    * Describes the input to the partial group-by-key instruction.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.undefined
  
  /**
    * The codec to use for interpreting an element in the input PTable.
    */
  var inputElementCodec: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * If this instruction includes a combining function this is the name of the intermediate store between the GBK and the CombineValues.
    */
  var originalCombineValuesInputStoreName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If this instruction includes a combining function, this is the name of the CombineValues instruction lifted into this instruction.
    */
  var originalCombineValuesStepName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Zero or more side inputs.
    */
  var sideInputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.undefined
  
  /**
    * The value combining function to invoke.
    */
  var valueCombiningFn: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaPartialGroupByKeyInstruction {
  
  inline def apply(): SchemaPartialGroupByKeyInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartialGroupByKeyInstruction]
  }
  
  extension [Self <: SchemaPartialGroupByKeyInstruction](x: Self) {
    
    inline def setInput(value: SchemaInstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputElementCodec(value: StringDictionary[Any]): Self = StObject.set(x, "inputElementCodec", value.asInstanceOf[js.Any])
    
    inline def setInputElementCodecNull: Self = StObject.set(x, "inputElementCodec", null)
    
    inline def setInputElementCodecUndefined: Self = StObject.set(x, "inputElementCodec", js.undefined)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setOriginalCombineValuesInputStoreName(value: String): Self = StObject.set(x, "originalCombineValuesInputStoreName", value.asInstanceOf[js.Any])
    
    inline def setOriginalCombineValuesInputStoreNameNull: Self = StObject.set(x, "originalCombineValuesInputStoreName", null)
    
    inline def setOriginalCombineValuesInputStoreNameUndefined: Self = StObject.set(x, "originalCombineValuesInputStoreName", js.undefined)
    
    inline def setOriginalCombineValuesStepName(value: String): Self = StObject.set(x, "originalCombineValuesStepName", value.asInstanceOf[js.Any])
    
    inline def setOriginalCombineValuesStepNameNull: Self = StObject.set(x, "originalCombineValuesStepName", null)
    
    inline def setOriginalCombineValuesStepNameUndefined: Self = StObject.set(x, "originalCombineValuesStepName", js.undefined)
    
    inline def setSideInputs(value: js.Array[SchemaSideInputInfo]): Self = StObject.set(x, "sideInputs", value.asInstanceOf[js.Any])
    
    inline def setSideInputsUndefined: Self = StObject.set(x, "sideInputs", js.undefined)
    
    inline def setSideInputsVarargs(value: SchemaSideInputInfo*): Self = StObject.set(x, "sideInputs", js.Array(value*))
    
    inline def setValueCombiningFn(value: StringDictionary[Any]): Self = StObject.set(x, "valueCombiningFn", value.asInstanceOf[js.Any])
    
    inline def setValueCombiningFnNull: Self = StObject.set(x, "valueCombiningFn", null)
    
    inline def setValueCombiningFnUndefined: Self = StObject.set(x, "valueCombiningFn", js.undefined)
  }
}
