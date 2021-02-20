package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionStageInfo extends StObject {
  
  /** The steps associated with the execution stage. Note that stages may have several steps, and that a given step might be run by more than one stage. */
  var stepName: js.UndefOr[js.Array[String]] = js.native
}
object JobExecutionStageInfo {
  
  @scala.inline
  def apply(): JobExecutionStageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionStageInfo]
  }
  
  @scala.inline
  implicit class JobExecutionStageInfoMutableBuilder[Self <: JobExecutionStageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStepName(value: js.Array[String]): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepNameUndefined: Self = StObject.set(x, "stepName", js.undefined)
    
    @scala.inline
    def setStepNameVarargs(value: String*): Self = StObject.set(x, "stepName", js.Array(value :_*))
  }
}
