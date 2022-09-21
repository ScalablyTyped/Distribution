package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutionStageState extends StObject {
  
  /**
    * The time at which the stage transitioned to this state.
    */
  var currentStateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the execution stage.
    */
  var executionStageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Executions stage states allow the same set of values as JobState.
    */
  var executionStageState: js.UndefOr[String | Null] = js.undefined
}
object SchemaExecutionStageState {
  
  inline def apply(): SchemaExecutionStageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionStageState]
  }
  
  extension [Self <: SchemaExecutionStageState](x: Self) {
    
    inline def setCurrentStateTime(value: String): Self = StObject.set(x, "currentStateTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateTimeNull: Self = StObject.set(x, "currentStateTime", null)
    
    inline def setCurrentStateTimeUndefined: Self = StObject.set(x, "currentStateTime", js.undefined)
    
    inline def setExecutionStageName(value: String): Self = StObject.set(x, "executionStageName", value.asInstanceOf[js.Any])
    
    inline def setExecutionStageNameNull: Self = StObject.set(x, "executionStageName", null)
    
    inline def setExecutionStageNameUndefined: Self = StObject.set(x, "executionStageName", js.undefined)
    
    inline def setExecutionStageState(value: String): Self = StObject.set(x, "executionStageState", value.asInstanceOf[js.Any])
    
    inline def setExecutionStageStateNull: Self = StObject.set(x, "executionStageState", null)
    
    inline def setExecutionStageStateUndefined: Self = StObject.set(x, "executionStageState", js.undefined)
  }
}
