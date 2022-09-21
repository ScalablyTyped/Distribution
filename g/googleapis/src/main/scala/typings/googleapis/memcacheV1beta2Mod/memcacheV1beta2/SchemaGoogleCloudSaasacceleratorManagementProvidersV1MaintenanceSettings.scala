package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings extends StObject {
  
  /**
    * Optional. Exclude instance from maintenance. When true, rollout service will not attempt maintenance on the instance. Rollout service will include the instance in reported rollout progress as not attempted.
    */
  var exclude: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. If the update call is triggered from rollback, set the value as true.
    */
  var isRollback: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The MaintenancePolicies that have been attached to the instance. The key must be of the type name of the oneof policy name defined in MaintenancePolicy, and the embedded policy must define the same policy type. For complete details of MaintenancePolicy, please refer to go/cloud-saas-mw-ug. If only the name is needed, then only populate MaintenancePolicy.name.
    */
  var maintenancePolicies: js.UndefOr[StringDictionary[SchemaMaintenancePolicy] | Null] = js.undefined
}
object SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings {
  
  inline def apply(): SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings]
  }
  
  extension [Self <: SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings](x: Self) {
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeNull: Self = StObject.set(x, "exclude", null)
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setIsRollback(value: Boolean): Self = StObject.set(x, "isRollback", value.asInstanceOf[js.Any])
    
    inline def setIsRollbackNull: Self = StObject.set(x, "isRollback", null)
    
    inline def setIsRollbackUndefined: Self = StObject.set(x, "isRollback", js.undefined)
    
    inline def setMaintenancePolicies(value: StringDictionary[SchemaMaintenancePolicy]): Self = StObject.set(x, "maintenancePolicies", value.asInstanceOf[js.Any])
    
    inline def setMaintenancePoliciesNull: Self = StObject.set(x, "maintenancePolicies", null)
    
    inline def setMaintenancePoliciesUndefined: Self = StObject.set(x, "maintenancePolicies", js.undefined)
  }
}
