package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCutoverJob extends StObject {
  
  /**
    * Output only. Details of the target VM in Compute Engine.
    */
  var computeEngineTargetDetails: js.UndefOr[SchemaComputeEngineTargetDetails] = js.undefined
  
  /**
    * Output only. The time the cutover job was created (as an API call, not when it was actually created in the target).
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the cutover job had finished.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Provides details for the errors that led to the Cutover Job's state.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Output only. The name of the cutover job.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current progress in percentage of the cutover job.
    */
  var progressPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. State of the cutover job.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A message providing possible extra details about the current state.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the state was last updated.
    */
  var stateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCutoverJob {
  
  inline def apply(): SchemaCutoverJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCutoverJob]
  }
  
  extension [Self <: SchemaCutoverJob](x: Self) {
    
    inline def setComputeEngineTargetDetails(value: SchemaComputeEngineTargetDetails): Self = StObject.set(x, "computeEngineTargetDetails", value.asInstanceOf[js.Any])
    
    inline def setComputeEngineTargetDetailsUndefined: Self = StObject.set(x, "computeEngineTargetDetails", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentNull: Self = StObject.set(x, "progressPercent", null)
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateTime(value: String): Self = StObject.set(x, "stateTime", value.asInstanceOf[js.Any])
    
    inline def setStateTimeNull: Self = StObject.set(x, "stateTime", null)
    
    inline def setStateTimeUndefined: Self = StObject.set(x, "stateTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
