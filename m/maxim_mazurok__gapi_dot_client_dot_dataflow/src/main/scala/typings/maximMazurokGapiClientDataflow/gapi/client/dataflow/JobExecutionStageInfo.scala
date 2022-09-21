package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionStageInfo extends StObject {
  
  /** The steps associated with the execution stage. Note that stages may have several steps, and that a given step might be run by more than one stage. */
  var stepName: js.UndefOr[js.Array[String]] = js.undefined
}
object JobExecutionStageInfo {
  
  inline def apply(): JobExecutionStageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionStageInfo]
  }
  
  extension [Self <: JobExecutionStageInfo](x: Self) {
    
    inline def setStepName(value: js.Array[String]): Self = StObject.set(x, "stepName", value.asInstanceOf[js.Any])
    
    inline def setStepNameUndefined: Self = StObject.set(x, "stepName", js.undefined)
    
    inline def setStepNameVarargs(value: String*): Self = StObject.set(x, "stepName", js.Array(value*))
  }
}
