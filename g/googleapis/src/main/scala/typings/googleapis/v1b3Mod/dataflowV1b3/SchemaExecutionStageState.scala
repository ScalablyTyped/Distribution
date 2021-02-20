package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message describing the state of a particular execution stage.
  */
@js.native
trait SchemaExecutionStageState extends StObject {
  
  /**
    * The time at which the stage transitioned to this state.
    */
  var currentStateTime: js.UndefOr[String] = js.native
  
  /**
    * The name of the execution stage.
    */
  var executionStageName: js.UndefOr[String] = js.native
  
  /**
    * Executions stage states allow the same set of values as JobState.
    */
  var executionStageState: js.UndefOr[String] = js.native
}
object SchemaExecutionStageState {
  
  @scala.inline
  def apply(): SchemaExecutionStageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionStageState]
  }
  
  @scala.inline
  implicit class SchemaExecutionStageStateMutableBuilder[Self <: SchemaExecutionStageState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentStateTime(value: String): Self = StObject.set(x, "currentStateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStateTimeUndefined: Self = StObject.set(x, "currentStateTime", js.undefined)
    
    @scala.inline
    def setExecutionStageName(value: String): Self = StObject.set(x, "executionStageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStageNameUndefined: Self = StObject.set(x, "executionStageName", js.undefined)
    
    @scala.inline
    def setExecutionStageState(value: String): Self = StObject.set(x, "executionStageState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStageStateUndefined: Self = StObject.set(x, "executionStageState", js.undefined)
  }
}
