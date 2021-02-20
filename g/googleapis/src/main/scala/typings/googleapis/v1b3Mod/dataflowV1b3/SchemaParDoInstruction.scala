package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instruction that does a ParDo operation. Takes one main input and zero
  * or more side inputs, and produces zero or more outputs. Runs user code.
  */
@js.native
trait SchemaParDoInstruction extends StObject {
  
  /**
    * The input.
    */
  var input: js.UndefOr[SchemaInstructionInput] = js.native
  
  /**
    * Information about each of the outputs, if user_fn is a  MultiDoFn.
    */
  var multiOutputInfos: js.UndefOr[js.Array[SchemaMultiOutputInfo]] = js.native
  
  /**
    * The number of outputs.
    */
  var numOutputs: js.UndefOr[Double] = js.native
  
  /**
    * Zero or more side inputs.
    */
  var sideInputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.native
  
  /**
    * The user function to invoke.
    */
  var userFn: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object SchemaParDoInstruction {
  
  @scala.inline
  def apply(): SchemaParDoInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParDoInstruction]
  }
  
  @scala.inline
  implicit class SchemaParDoInstructionMutableBuilder[Self <: SchemaParDoInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: SchemaInstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setMultiOutputInfos(value: js.Array[SchemaMultiOutputInfo]): Self = StObject.set(x, "multiOutputInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiOutputInfosUndefined: Self = StObject.set(x, "multiOutputInfos", js.undefined)
    
    @scala.inline
    def setMultiOutputInfosVarargs(value: SchemaMultiOutputInfo*): Self = StObject.set(x, "multiOutputInfos", js.Array(value :_*))
    
    @scala.inline
    def setNumOutputs(value: Double): Self = StObject.set(x, "numOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumOutputsUndefined: Self = StObject.set(x, "numOutputs", js.undefined)
    
    @scala.inline
    def setSideInputs(value: js.Array[SchemaSideInputInfo]): Self = StObject.set(x, "sideInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideInputsUndefined: Self = StObject.set(x, "sideInputs", js.undefined)
    
    @scala.inline
    def setSideInputsVarargs(value: SchemaSideInputInfo*): Self = StObject.set(x, "sideInputs", js.Array(value :_*))
    
    @scala.inline
    def setUserFn(value: StringDictionary[js.Any]): Self = StObject.set(x, "userFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFnUndefined: Self = StObject.set(x, "userFn", js.undefined)
  }
}
