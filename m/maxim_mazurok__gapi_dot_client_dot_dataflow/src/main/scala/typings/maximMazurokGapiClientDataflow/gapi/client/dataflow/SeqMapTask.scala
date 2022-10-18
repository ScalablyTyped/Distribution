package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeqMapTask extends StObject {
  
  /** Information about each of the inputs. */
  var inputs: js.UndefOr[js.Array[SideInputInfo]] = js.undefined
  
  /** The user-provided name of the SeqDo operation. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Information about each of the outputs. */
  var outputInfos: js.UndefOr[js.Array[SeqMapTaskOutputInfo]] = js.undefined
  
  /** System-defined name of the stage containing the SeqDo operation. Unique across the workflow. */
  var stageName: js.UndefOr[String] = js.undefined
  
  /** System-defined name of the SeqDo operation. Unique across the workflow. */
  var systemName: js.UndefOr[String] = js.undefined
  
  /** The user function to invoke. */
  var userFn: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object SeqMapTask {
  
  inline def apply(): SeqMapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeqMapTask]
  }
  
  extension [Self <: SeqMapTask](x: Self) {
    
    inline def setInputs(value: js.Array[SideInputInfo]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: SideInputInfo*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputInfos(value: js.Array[SeqMapTaskOutputInfo]): Self = StObject.set(x, "outputInfos", value.asInstanceOf[js.Any])
    
    inline def setOutputInfosUndefined: Self = StObject.set(x, "outputInfos", js.undefined)
    
    inline def setOutputInfosVarargs(value: SeqMapTaskOutputInfo*): Self = StObject.set(x, "outputInfos", js.Array(value*))
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    inline def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    inline def setUserFn(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "userFn", value.asInstanceOf[js.Any])
    
    inline def setUserFnUndefined: Self = StObject.set(x, "userFn", js.undefined)
  }
}
