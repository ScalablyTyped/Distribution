package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestorePlan extends StObject {
  
  /**
    * Required. Immutable. A reference to the BackupPlan from which Backups may be used as the source for Restores created via this RestorePlan. Format: `projects/x/locations/x/backupPlans/x`.
    */
  var backupPlan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The target cluster into which Restores created via this RestorePlan will restore data. NOTE: the cluster's region must be the same as the RestorePlan. Valid formats: - `projects/x/locations/x/clusters/x` - `projects/x/zones/x/clusters/x`
    */
  var cluster: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this RestorePlan resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User specified descriptive string for this RestorePlan.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a restore from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform restore updates in order to avoid race conditions: An `etag` is returned in the response to `GetRestorePlan`, and systems are expected to put that etag in the request to `UpdateRestorePlan` or `DeleteRestorePlan` to ensure that their change will be applied to the same version of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A set of custom labels supplied by user.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The full name of the RestorePlan resource. Format: `projects/x/locations/x/restorePlans/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Configuration of Restores created via this RestorePlan.
    */
  var restoreConfig: js.UndefOr[SchemaRestoreConfig] = js.undefined
  
  /**
    * Output only. Server generated global unique identifier of [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when this RestorePlan resource was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestorePlan {
  
  inline def apply(): SchemaRestorePlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestorePlan]
  }
  
  extension [Self <: SchemaRestorePlan](x: Self) {
    
    inline def setBackupPlan(value: String): Self = StObject.set(x, "backupPlan", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanNull: Self = StObject.set(x, "backupPlan", null)
    
    inline def setBackupPlanUndefined: Self = StObject.set(x, "backupPlan", js.undefined)
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterNull: Self = StObject.set(x, "cluster", null)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestoreConfig(value: SchemaRestoreConfig): Self = StObject.set(x, "restoreConfig", value.asInstanceOf[js.Any])
    
    inline def setRestoreConfigUndefined: Self = StObject.set(x, "restoreConfig", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
