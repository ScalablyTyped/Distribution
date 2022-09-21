package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplicationCycle extends StObject {
  
  /**
    * The time the replication cycle has ended.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The identifier of the ReplicationCycle.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current progress in percentage of this cycle.
    */
  var progress: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The current progress in percentage of this cycle.
    */
  var progressPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time the replication cycle has started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The cycle's steps list representing its progress.
    */
  var steps: js.UndefOr[js.Array[SchemaCycleStep]] = js.undefined
  
  /**
    * The accumulated duration the replication cycle was paused.
    */
  var totalPauseDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplicationCycle {
  
  inline def apply(): SchemaReplicationCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplicationCycle]
  }
  
  extension [Self <: SchemaReplicationCycle](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentNull: Self = StObject.set(x, "progressPercent", null)
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSteps(value: js.Array[SchemaCycleStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: SchemaCycleStep*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setTotalPauseDuration(value: String): Self = StObject.set(x, "totalPauseDuration", value.asInstanceOf[js.Any])
    
    inline def setTotalPauseDurationNull: Self = StObject.set(x, "totalPauseDuration", null)
    
    inline def setTotalPauseDurationUndefined: Self = StObject.set(x, "totalPauseDuration", js.undefined)
  }
}
