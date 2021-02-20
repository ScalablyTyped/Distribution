package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeqMapTask extends StObject {
  
  /** Information about each of the inputs. */
  var inputs: js.UndefOr[js.Array[SideInputInfo]] = js.native
  
  /** The user-provided name of the SeqDo operation. */
  var name: js.UndefOr[String] = js.native
  
  /** Information about each of the outputs. */
  var outputInfos: js.UndefOr[js.Array[SeqMapTaskOutputInfo]] = js.native
  
  /** System-defined name of the stage containing the SeqDo operation. Unique across the workflow. */
  var stageName: js.UndefOr[String] = js.native
  
  /** System-defined name of the SeqDo operation. Unique across the workflow. */
  var systemName: js.UndefOr[String] = js.native
  
  /** The user function to invoke. */
  var userFn: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.SeqMapTask with TopLevel[js.Any]
  ] = js.native
}
object SeqMapTask {
  
  @scala.inline
  def apply(): SeqMapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeqMapTask]
  }
  
  @scala.inline
  implicit class SeqMapTaskMutableBuilder[Self <: SeqMapTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[SideInputInfo]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: SideInputInfo*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutputInfos(value: js.Array[SeqMapTaskOutputInfo]): Self = StObject.set(x, "outputInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputInfosUndefined: Self = StObject.set(x, "outputInfos", js.undefined)
    
    @scala.inline
    def setOutputInfosVarargs(value: SeqMapTaskOutputInfo*): Self = StObject.set(x, "outputInfos", js.Array(value :_*))
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
    
    @scala.inline
    def setUserFn(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.SeqMapTask with TopLevel[js.Any]
    ): Self = StObject.set(x, "userFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFnUndefined: Self = StObject.set(x, "userFn", js.undefined)
  }
}
