package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParDoInstruction extends StObject {
  
  /**
    * The input.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.undefined
  
  /**
    * Information about each of the outputs, if user_fn is a MultiDoFn.
    */
  var multiOutputInfos: js.UndefOr[js.Array[SchemaMultiOutputInfo]] = js.undefined
  
  /**
    * The number of outputs.
    */
  var numOutputs: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Zero or more side inputs.
    */
  var sideInputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.undefined
  
  /**
    * The user function to invoke.
    */
  var userFn: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaParDoInstruction {
  
  inline def apply(): SchemaParDoInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParDoInstruction]
  }
  
  extension [Self <: SchemaParDoInstruction](x: Self) {
    
    inline def setInput(value: SchemaInstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMultiOutputInfos(value: js.Array[SchemaMultiOutputInfo]): Self = StObject.set(x, "multiOutputInfos", value.asInstanceOf[js.Any])
    
    inline def setMultiOutputInfosUndefined: Self = StObject.set(x, "multiOutputInfos", js.undefined)
    
    inline def setMultiOutputInfosVarargs(value: SchemaMultiOutputInfo*): Self = StObject.set(x, "multiOutputInfos", js.Array(value*))
    
    inline def setNumOutputs(value: Double): Self = StObject.set(x, "numOutputs", value.asInstanceOf[js.Any])
    
    inline def setNumOutputsNull: Self = StObject.set(x, "numOutputs", null)
    
    inline def setNumOutputsUndefined: Self = StObject.set(x, "numOutputs", js.undefined)
    
    inline def setSideInputs(value: js.Array[SchemaSideInputInfo]): Self = StObject.set(x, "sideInputs", value.asInstanceOf[js.Any])
    
    inline def setSideInputsUndefined: Self = StObject.set(x, "sideInputs", js.undefined)
    
    inline def setSideInputsVarargs(value: SchemaSideInputInfo*): Self = StObject.set(x, "sideInputs", js.Array(value*))
    
    inline def setUserFn(value: StringDictionary[Any]): Self = StObject.set(x, "userFn", value.asInstanceOf[js.Any])
    
    inline def setUserFnNull: Self = StObject.set(x, "userFn", null)
    
    inline def setUserFnUndefined: Self = StObject.set(x, "userFn", js.undefined)
  }
}
