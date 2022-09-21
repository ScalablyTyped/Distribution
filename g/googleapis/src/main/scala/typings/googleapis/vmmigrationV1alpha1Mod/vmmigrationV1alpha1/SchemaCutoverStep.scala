package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCutoverStep extends StObject {
  
  /**
    * The time the step has ended.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Final sync step.
    */
  var finalSync: js.UndefOr[SchemaReplicationCycle] = js.undefined
  
  /**
    * Instantiating migrated VM step.
    */
  var instantiatingMigratedVm: js.UndefOr[SchemaInstantiatingMigratedVMStep] = js.undefined
  
  /**
    * Preparing VM disks step.
    */
  var preparingVmDisks: js.UndefOr[SchemaPreparingVMDisksStep] = js.undefined
  
  /**
    * A replication cycle prior cutover step.
    */
  var previousReplicationCycle: js.UndefOr[SchemaReplicationCycle] = js.undefined
  
  /**
    * Shutting down VM step.
    */
  var shuttingDownSourceVm: js.UndefOr[SchemaShuttingDownSourceVMStep] = js.undefined
  
  /**
    * The time the step has started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCutoverStep {
  
  inline def apply(): SchemaCutoverStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCutoverStep]
  }
  
  extension [Self <: SchemaCutoverStep](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFinalSync(value: SchemaReplicationCycle): Self = StObject.set(x, "finalSync", value.asInstanceOf[js.Any])
    
    inline def setFinalSyncUndefined: Self = StObject.set(x, "finalSync", js.undefined)
    
    inline def setInstantiatingMigratedVm(value: SchemaInstantiatingMigratedVMStep): Self = StObject.set(x, "instantiatingMigratedVm", value.asInstanceOf[js.Any])
    
    inline def setInstantiatingMigratedVmUndefined: Self = StObject.set(x, "instantiatingMigratedVm", js.undefined)
    
    inline def setPreparingVmDisks(value: SchemaPreparingVMDisksStep): Self = StObject.set(x, "preparingVmDisks", value.asInstanceOf[js.Any])
    
    inline def setPreparingVmDisksUndefined: Self = StObject.set(x, "preparingVmDisks", js.undefined)
    
    inline def setPreviousReplicationCycle(value: SchemaReplicationCycle): Self = StObject.set(x, "previousReplicationCycle", value.asInstanceOf[js.Any])
    
    inline def setPreviousReplicationCycleUndefined: Self = StObject.set(x, "previousReplicationCycle", js.undefined)
    
    inline def setShuttingDownSourceVm(value: SchemaShuttingDownSourceVMStep): Self = StObject.set(x, "shuttingDownSourceVm", value.asInstanceOf[js.Any])
    
    inline def setShuttingDownSourceVmUndefined: Self = StObject.set(x, "shuttingDownSourceVm", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
