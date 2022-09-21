package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCycleStep extends StObject {
  
  /**
    * The time the cycle step has ended.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Initializing replication step.
    */
  var initializingReplication: js.UndefOr[SchemaInitializingReplicationStep] = js.undefined
  
  /**
    * Post processing step.
    */
  var postProcessing: js.UndefOr[SchemaPostProcessingStep] = js.undefined
  
  /**
    * Replicating step.
    */
  var replicating: js.UndefOr[SchemaReplicatingStep] = js.undefined
  
  /**
    * The time the cycle step has started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCycleStep {
  
  inline def apply(): SchemaCycleStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCycleStep]
  }
  
  extension [Self <: SchemaCycleStep](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setInitializingReplication(value: SchemaInitializingReplicationStep): Self = StObject.set(x, "initializingReplication", value.asInstanceOf[js.Any])
    
    inline def setInitializingReplicationUndefined: Self = StObject.set(x, "initializingReplication", js.undefined)
    
    inline def setPostProcessing(value: SchemaPostProcessingStep): Self = StObject.set(x, "postProcessing", value.asInstanceOf[js.Any])
    
    inline def setPostProcessingUndefined: Self = StObject.set(x, "postProcessing", js.undefined)
    
    inline def setReplicating(value: SchemaReplicatingStep): Self = StObject.set(x, "replicating", value.asInstanceOf[js.Any])
    
    inline def setReplicatingUndefined: Self = StObject.set(x, "replicating", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
