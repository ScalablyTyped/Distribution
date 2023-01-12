package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParDoInstruction extends StObject {
  
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.undefined
  
  /** Information about each of the outputs, if user_fn is a MultiDoFn. */
  var multiOutputInfos: js.UndefOr[js.Array[MultiOutputInfo]] = js.undefined
  
  /** The number of outputs. */
  var numOutputs: js.UndefOr[Double] = js.undefined
  
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.undefined
  
  /** The user function to invoke. */
  var userFn: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object ParDoInstruction {
  
  inline def apply(): ParDoInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParDoInstruction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParDoInstruction] (val x: Self) extends AnyVal {
    
    inline def setInput(value: InstructionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMultiOutputInfos(value: js.Array[MultiOutputInfo]): Self = StObject.set(x, "multiOutputInfos", value.asInstanceOf[js.Any])
    
    inline def setMultiOutputInfosUndefined: Self = StObject.set(x, "multiOutputInfos", js.undefined)
    
    inline def setMultiOutputInfosVarargs(value: MultiOutputInfo*): Self = StObject.set(x, "multiOutputInfos", js.Array(value*))
    
    inline def setNumOutputs(value: Double): Self = StObject.set(x, "numOutputs", value.asInstanceOf[js.Any])
    
    inline def setNumOutputsUndefined: Self = StObject.set(x, "numOutputs", js.undefined)
    
    inline def setSideInputs(value: js.Array[SideInputInfo]): Self = StObject.set(x, "sideInputs", value.asInstanceOf[js.Any])
    
    inline def setSideInputsUndefined: Self = StObject.set(x, "sideInputs", js.undefined)
    
    inline def setSideInputsVarargs(value: SideInputInfo*): Self = StObject.set(x, "sideInputs", js.Array(value*))
    
    inline def setUserFn(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "userFn", value.asInstanceOf[js.Any])
    
    inline def setUserFnUndefined: Self = StObject.set(x, "userFn", js.undefined)
  }
}
