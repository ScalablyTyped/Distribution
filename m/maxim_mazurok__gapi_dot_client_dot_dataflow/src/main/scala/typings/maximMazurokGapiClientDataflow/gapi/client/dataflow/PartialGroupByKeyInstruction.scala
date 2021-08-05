package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialGroupByKeyInstruction extends StObject {
  
  /** Describes the input to the partial group-by-key instruction. */
  var input: js.UndefOr[InstructionInput] = js.undefined
  
  /** The codec to use for interpreting an element in the input PTable. */
  var inputElementCodec: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.PartialGroupByKeyInstruction & TopLevel[js.Any]
  ] = js.undefined
  
  /** If this instruction includes a combining function this is the name of the intermediate store between the GBK and the CombineValues. */
  var originalCombineValuesInputStoreName: js.UndefOr[String] = js.undefined
  
  /** If this instruction includes a combining function, this is the name of the CombineValues instruction lifted into this instruction. */
  var originalCombineValuesStepName: js.UndefOr[String] = js.undefined
  
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.undefined
  
  /** The value combining function to invoke. */
  var valueCombiningFn: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.PartialGroupByKeyInstruction & TopLevel[js.Any]
  ] = js.undefined
}
object PartialGroupByKeyInstruction {
  
  inline def apply(): PartialGroupByKeyInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGroupByKeyInstruction]
  }
  
  extension [Self <: PartialGroupByKeyInstruction](x: Self) {
    
    inline def setInput(value: InstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputElementCodec(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.PartialGroupByKeyInstruction & TopLevel[js.Any]
    ): Self = StObject.set(x, "inputElementCodec", value.asInstanceOf[js.Any])
    
    inline def setInputElementCodecUndefined: Self = StObject.set(x, "inputElementCodec", js.undefined)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setOriginalCombineValuesInputStoreName(value: String): Self = StObject.set(x, "originalCombineValuesInputStoreName", value.asInstanceOf[js.Any])
    
    inline def setOriginalCombineValuesInputStoreNameUndefined: Self = StObject.set(x, "originalCombineValuesInputStoreName", js.undefined)
    
    inline def setOriginalCombineValuesStepName(value: String): Self = StObject.set(x, "originalCombineValuesStepName", value.asInstanceOf[js.Any])
    
    inline def setOriginalCombineValuesStepNameUndefined: Self = StObject.set(x, "originalCombineValuesStepName", js.undefined)
    
    inline def setSideInputs(value: js.Array[SideInputInfo]): Self = StObject.set(x, "sideInputs", value.asInstanceOf[js.Any])
    
    inline def setSideInputsUndefined: Self = StObject.set(x, "sideInputs", js.undefined)
    
    inline def setSideInputsVarargs(value: SideInputInfo*): Self = StObject.set(x, "sideInputs", js.Array(value :_*))
    
    inline def setValueCombiningFn(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.PartialGroupByKeyInstruction & TopLevel[js.Any]
    ): Self = StObject.set(x, "valueCombiningFn", value.asInstanceOf[js.Any])
    
    inline def setValueCombiningFnUndefined: Self = StObject.set(x, "valueCombiningFn", js.undefined)
  }
}
