package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParDoInstruction extends StObject {
  
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.native
  
  /** Information about each of the outputs, if user_fn is a MultiDoFn. */
  var multiOutputInfos: js.UndefOr[js.Array[MultiOutputInfo]] = js.native
  
  /** The number of outputs. */
  var numOutputs: js.UndefOr[Double] = js.native
  
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.native
  
  /** The user function to invoke. */
  var userFn: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.ParDoInstruction with TopLevel[js.Any]
  ] = js.native
}
object ParDoInstruction {
  
  @scala.inline
  def apply(): ParDoInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParDoInstruction]
  }
  
  @scala.inline
  implicit class ParDoInstructionMutableBuilder[Self <: ParDoInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: InstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setMultiOutputInfos(value: js.Array[MultiOutputInfo]): Self = StObject.set(x, "multiOutputInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiOutputInfosUndefined: Self = StObject.set(x, "multiOutputInfos", js.undefined)
    
    @scala.inline
    def setMultiOutputInfosVarargs(value: MultiOutputInfo*): Self = StObject.set(x, "multiOutputInfos", js.Array(value :_*))
    
    @scala.inline
    def setNumOutputs(value: Double): Self = StObject.set(x, "numOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumOutputsUndefined: Self = StObject.set(x, "numOutputs", js.undefined)
    
    @scala.inline
    def setSideInputs(value: js.Array[SideInputInfo]): Self = StObject.set(x, "sideInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideInputsUndefined: Self = StObject.set(x, "sideInputs", js.undefined)
    
    @scala.inline
    def setSideInputsVarargs(value: SideInputInfo*): Self = StObject.set(x, "sideInputs", js.Array(value :_*))
    
    @scala.inline
    def setUserFn(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.ParDoInstruction with TopLevel[js.Any]
    ): Self = StObject.set(x, "userFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFnUndefined: Self = StObject.set(x, "userFn", js.undefined)
  }
}
