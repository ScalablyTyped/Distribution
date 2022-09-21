package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMemcacheV1MaintenancePolicy extends StObject {
  
  /**
    * Output only. The time when the policy was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the policy was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_maintenance_windows is expected to be one.
    */
  var weeklyMaintenanceWindow: js.UndefOr[js.Array[SchemaWeeklyMaintenanceWindow]] = js.undefined
}
object SchemaGoogleCloudMemcacheV1MaintenancePolicy {
  
  inline def apply(): SchemaGoogleCloudMemcacheV1MaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMemcacheV1MaintenancePolicy]
  }
  
  extension [Self <: SchemaGoogleCloudMemcacheV1MaintenancePolicy](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWeeklyMaintenanceWindow(value: js.Array[SchemaWeeklyMaintenanceWindow]): Self = StObject.set(x, "weeklyMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceWindowUndefined: Self = StObject.set(x, "weeklyMaintenanceWindow", js.undefined)
    
    inline def setWeeklyMaintenanceWindowVarargs(value: SchemaWeeklyMaintenanceWindow*): Self = StObject.set(x, "weeklyMaintenanceWindow", js.Array(value*))
  }
}
