package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMigratingVm extends StObject {
  
  /**
    * Details of the target VM in Compute Engine.
    */
  var computeEngineTargetDefaults: js.UndefOr[SchemaComputeEngineTargetDefaults] = js.undefined
  
  /**
    * Output only. The time the migrating VM was created (this refers to this resource and not to the time it was installed in the source).
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The percentage progress of the current running replication cycle.
    */
  var currentSyncInfo: js.UndefOr[SchemaReplicationCycle] = js.undefined
  
  /**
    * The description attached to the migrating VM by the user.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name attached to the MigratingVm by the user.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Provides details on the state of the Migrating VM in case of an error in replication.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Output only. The group this migrating vm is included in, if any. The group is represented by the full path of the appropriate Group resource.
    */
  var group: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The labels of the migrating VM.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The most updated snapshot created time in the source that finished replication.
    */
  var lastSync: js.UndefOr[SchemaReplicationSync] = js.undefined
  
  /**
    * Output only. The identifier of the MigratingVm.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The replication schedule policy.
    */
  var policy: js.UndefOr[SchemaSchedulePolicy] = js.undefined
  
  /**
    * Output only. The recent clone jobs performed on the migrating VM. This field holds the vm's last completed clone job and the vm's running clone job, if one exists. Note: To have this field populated you need to explicitly request it via the "view" parameter of the Get/List request.
    */
  var recentCloneJobs: js.UndefOr[js.Array[SchemaCloneJob]] = js.undefined
  
  /**
    * Output only. The recent cutover jobs performed on the migrating VM. This field holds the vm's last completed cutover job and the vm's running cutover job, if one exists. Note: To have this field populated you need to explicitly request it via the "view" parameter of the Get/List request.
    */
  var recentCutoverJobs: js.UndefOr[js.Array[SchemaCutoverJob]] = js.undefined
  
  /**
    * The unique ID of the VM in the source. The VM's name in vSphere can be changed, so this is not the VM's name but rather its moRef id. This id is of the form vm-.
    */
  var sourceVmId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the MigratingVm.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last time the migrating VM state was updated.
    */
  var stateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last time the migrating VM resource was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaMigratingVm {
  
  inline def apply(): SchemaMigratingVm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMigratingVm]
  }
  
  extension [Self <: SchemaMigratingVm](x: Self) {
    
    inline def setComputeEngineTargetDefaults(value: SchemaComputeEngineTargetDefaults): Self = StObject.set(x, "computeEngineTargetDefaults", value.asInstanceOf[js.Any])
    
    inline def setComputeEngineTargetDefaultsUndefined: Self = StObject.set(x, "computeEngineTargetDefaults", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCurrentSyncInfo(value: SchemaReplicationCycle): Self = StObject.set(x, "currentSyncInfo", value.asInstanceOf[js.Any])
    
    inline def setCurrentSyncInfoUndefined: Self = StObject.set(x, "currentSyncInfo", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastSync(value: SchemaReplicationSync): Self = StObject.set(x, "lastSync", value.asInstanceOf[js.Any])
    
    inline def setLastSyncUndefined: Self = StObject.set(x, "lastSync", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicy(value: SchemaSchedulePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setRecentCloneJobs(value: js.Array[SchemaCloneJob]): Self = StObject.set(x, "recentCloneJobs", value.asInstanceOf[js.Any])
    
    inline def setRecentCloneJobsUndefined: Self = StObject.set(x, "recentCloneJobs", js.undefined)
    
    inline def setRecentCloneJobsVarargs(value: SchemaCloneJob*): Self = StObject.set(x, "recentCloneJobs", js.Array(value*))
    
    inline def setRecentCutoverJobs(value: js.Array[SchemaCutoverJob]): Self = StObject.set(x, "recentCutoverJobs", value.asInstanceOf[js.Any])
    
    inline def setRecentCutoverJobsUndefined: Self = StObject.set(x, "recentCutoverJobs", js.undefined)
    
    inline def setRecentCutoverJobsVarargs(value: SchemaCutoverJob*): Self = StObject.set(x, "recentCutoverJobs", js.Array(value*))
    
    inline def setSourceVmId(value: String): Self = StObject.set(x, "sourceVmId", value.asInstanceOf[js.Any])
    
    inline def setSourceVmIdNull: Self = StObject.set(x, "sourceVmId", null)
    
    inline def setSourceVmIdUndefined: Self = StObject.set(x, "sourceVmId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateTime(value: String): Self = StObject.set(x, "stateTime", value.asInstanceOf[js.Any])
    
    inline def setStateTimeNull: Self = StObject.set(x, "stateTime", null)
    
    inline def setStateTimeUndefined: Self = StObject.set(x, "stateTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
