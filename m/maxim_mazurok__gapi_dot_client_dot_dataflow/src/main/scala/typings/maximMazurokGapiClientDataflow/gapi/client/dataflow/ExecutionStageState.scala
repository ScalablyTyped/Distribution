package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionStageState extends StObject {
  
  /** The time at which the stage transitioned to this state. */
  var currentStateTime: js.UndefOr[String] = js.undefined
  
  /** The name of the execution stage. */
  var executionStageName: js.UndefOr[String] = js.undefined
  
  /** Executions stage states allow the same set of values as JobState. */
  var executionStageState: js.UndefOr[String] = js.undefined
}
object ExecutionStageState {
  
  inline def apply(): ExecutionStageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStageState]
  }
  
  extension [Self <: ExecutionStageState](x: Self) {
    
    inline def setCurrentStateTime(value: String): Self = StObject.set(x, "currentStateTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateTimeUndefined: Self = StObject.set(x, "currentStateTime", js.undefined)
    
    inline def setExecutionStageName(value: String): Self = StObject.set(x, "executionStageName", value.asInstanceOf[js.Any])
    
    inline def setExecutionStageNameUndefined: Self = StObject.set(x, "executionStageName", js.undefined)
    
    inline def setExecutionStageState(value: String): Self = StObject.set(x, "executionStageState", value.asInstanceOf[js.Any])
    
    inline def setExecutionStageStateUndefined: Self = StObject.set(x, "executionStageState", js.undefined)
  }
}
