package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatacenterConnector extends StObject {
  
  /**
    * Output only. Appliance OVA version. This is the OVA which is manually installed by the user and contains the infrastructure for the automatically updatable components on the appliance.
    */
  var applianceInfrastructureVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Appliance last installed update bundle version. This is the version of the automatically updatable components on the appliance.
    */
  var applianceSoftwareVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The available versions for updating this appliance.
    */
  var availableVersions: js.UndefOr[SchemaAvailableUpdates] = js.undefined
  
  /**
    * Output only. The communication channel between the datacenter connector and GCP.
    */
  var bucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the connector was created (as an API call, not when it was actually installed).
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Provides details on the state of the Datacenter Connector in case of an error.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Output only. The connector's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. A unique key for this connector. This key is internal to the OVA connector and is supplied with its creation during the registration process and can not be modified.
    */
  var registrationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The service account to use in the connector when communicating with the cloud.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the DatacenterConnector, as determined by the health checks.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the state was last set.
    */
  var stateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last time the connector was updated with an API call.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The status of the current / last upgradeAppliance operation.
    */
  var upgradeStatus: js.UndefOr[SchemaUpgradeStatus] = js.undefined
  
  /**
    * The version running in the DatacenterConnector. This is supplied by the OVA connector during the registration process and can not be modified.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaDatacenterConnector {
  
  inline def apply(): SchemaDatacenterConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatacenterConnector]
  }
  
  extension [Self <: SchemaDatacenterConnector](x: Self) {
    
    inline def setApplianceInfrastructureVersion(value: String): Self = StObject.set(x, "applianceInfrastructureVersion", value.asInstanceOf[js.Any])
    
    inline def setApplianceInfrastructureVersionNull: Self = StObject.set(x, "applianceInfrastructureVersion", null)
    
    inline def setApplianceInfrastructureVersionUndefined: Self = StObject.set(x, "applianceInfrastructureVersion", js.undefined)
    
    inline def setApplianceSoftwareVersion(value: String): Self = StObject.set(x, "applianceSoftwareVersion", value.asInstanceOf[js.Any])
    
    inline def setApplianceSoftwareVersionNull: Self = StObject.set(x, "applianceSoftwareVersion", null)
    
    inline def setApplianceSoftwareVersionUndefined: Self = StObject.set(x, "applianceSoftwareVersion", js.undefined)
    
    inline def setAvailableVersions(value: SchemaAvailableUpdates): Self = StObject.set(x, "availableVersions", value.asInstanceOf[js.Any])
    
    inline def setAvailableVersionsUndefined: Self = StObject.set(x, "availableVersions", js.undefined)
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketNull: Self = StObject.set(x, "bucket", null)
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegistrationId(value: String): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    inline def setRegistrationIdNull: Self = StObject.set(x, "registrationId", null)
    
    inline def setRegistrationIdUndefined: Self = StObject.set(x, "registrationId", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateTime(value: String): Self = StObject.set(x, "stateTime", value.asInstanceOf[js.Any])
    
    inline def setStateTimeNull: Self = StObject.set(x, "stateTime", null)
    
    inline def setStateTimeUndefined: Self = StObject.set(x, "stateTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUpgradeStatus(value: SchemaUpgradeStatus): Self = StObject.set(x, "upgradeStatus", value.asInstanceOf[js.Any])
    
    inline def setUpgradeStatusUndefined: Self = StObject.set(x, "upgradeStatus", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
