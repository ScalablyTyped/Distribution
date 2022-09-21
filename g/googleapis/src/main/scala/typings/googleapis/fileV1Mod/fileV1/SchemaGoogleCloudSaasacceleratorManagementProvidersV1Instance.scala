package typings.googleapis.fileV1Mod.fileV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSaasacceleratorManagementProvidersV1Instance extends StObject {
  
  /**
    * consumer_defined_name is the name that is set by the consumer. On the other hand Name field represents system-assigned id of an instance so consumers are not necessarily aware of it. consumer_defined_name is used for notification/UI purposes for consumer to recognize their instances.
    */
  var consumerDefinedName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp when the resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The instance_type of this instance of format: projects/{project_number\}/locations/{location_id\}/instanceTypes/{instance_type_id\}. Instance Type represents a high-level tier or SKU of the service that this instance belong to. When enabled(eg: Maintenance Rollout), Rollout uses 'instance_type' along with 'software_versions' to determine whether instance needs an update or not.
    */
  var instanceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Resource labels to represent user provided metadata. Each label is a key-value pair, where both the key and the value are arbitrary strings provided by the user.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Deprecated. The MaintenancePolicies that have been attached to the instance. The key must be of the type name of the oneof policy name defined in MaintenancePolicy, and the referenced policy must define the same policy type. For complete details of MaintenancePolicy, please refer to go/cloud-saas-mw-ug.
    */
  var maintenancePolicyNames: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The MaintenanceSchedule contains the scheduling information of published maintenance schedule with same key as software_versions.
    */
  var maintenanceSchedules: js.UndefOr[
    StringDictionary[SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule] | Null
  ] = js.undefined
  
  /**
    * Optional. The MaintenanceSettings associated with instance.
    */
  var maintenanceSettings: js.UndefOr[SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings] = js.undefined
  
  /**
    * Unique name of the resource. It uses the form: `projects/{project_number\}/locations/{location_id\}/instances/{instance_id\}` Note: This name is passed, stored and logged across the rollout system. So use of consumer project_id or any other consumer PII in the name is strongly discouraged for wipeout (go/wipeout) compliance. See go/elysium/project_ids#storage-guidance for more details.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. notification_parameter are information that service producers may like to include that is not relevant to Rollout. This parameter will only be passed to Gamma and Cloud Logging for notification/logging purpose.
    */
  var notificationParameters: js.UndefOr[
    StringDictionary[SchemaGoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter] | Null
  ] = js.undefined
  
  /**
    * Output only. Custom string attributes used primarily to expose producer-specific information in monitoring dashboards. See go/get-instance-metadata.
    */
  var producerMetadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The list of data plane resources provisioned for this instance, e.g. compute VMs. See go/get-instance-metadata.
    */
  var provisionedResources: js.UndefOr[
    js.Array[SchemaGoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource]
  ] = js.undefined
  
  /**
    * Link to the SLM instance template. Only populated when updating SLM instances via SSA's Actuation service adaptor. Service producers with custom control plane (e.g. Cloud SQL) doesn't need to populate this field. Instead they should use software_versions.
    */
  var slmInstanceTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. SLO metadata for instance classification in the Standardized dataplane SLO platform. See go/cloud-ssa-standard-slo for feature description.
    */
  var sloMetadata: js.UndefOr[SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloMetadata] = js.undefined
  
  /**
    * Software versions that are used to deploy this instance. This can be mutated by rollout services.
    */
  var softwareVersions: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Current lifecycle state of the resource (e.g. if it's being created or ready to use).
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. ID of the associated GCP tenant project. See go/get-instance-metadata.
    */
  var tenantProjectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp when the resource was last modified.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSaasacceleratorManagementProvidersV1Instance {
  
  inline def apply(): SchemaGoogleCloudSaasacceleratorManagementProvidersV1Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSaasacceleratorManagementProvidersV1Instance]
  }
  
  extension [Self <: SchemaGoogleCloudSaasacceleratorManagementProvidersV1Instance](x: Self) {
    
    inline def setConsumerDefinedName(value: String): Self = StObject.set(x, "consumerDefinedName", value.asInstanceOf[js.Any])
    
    inline def setConsumerDefinedNameNull: Self = StObject.set(x, "consumerDefinedName", null)
    
    inline def setConsumerDefinedNameUndefined: Self = StObject.set(x, "consumerDefinedName", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeNull: Self = StObject.set(x, "instanceType", null)
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMaintenancePolicyNames(value: StringDictionary[String]): Self = StObject.set(x, "maintenancePolicyNames", value.asInstanceOf[js.Any])
    
    inline def setMaintenancePolicyNamesNull: Self = StObject.set(x, "maintenancePolicyNames", null)
    
    inline def setMaintenancePolicyNamesUndefined: Self = StObject.set(x, "maintenancePolicyNames", js.undefined)
    
    inline def setMaintenanceSchedules(value: StringDictionary[SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule]): Self = StObject.set(x, "maintenanceSchedules", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceSchedulesNull: Self = StObject.set(x, "maintenanceSchedules", null)
    
    inline def setMaintenanceSchedulesUndefined: Self = StObject.set(x, "maintenanceSchedules", js.undefined)
    
    inline def setMaintenanceSettings(value: SchemaGoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSettings): Self = StObject.set(x, "maintenanceSettings", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceSettingsUndefined: Self = StObject.set(x, "maintenanceSettings", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationParameters(
      value: StringDictionary[SchemaGoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter]
    ): Self = StObject.set(x, "notificationParameters", value.asInstanceOf[js.Any])
    
    inline def setNotificationParametersNull: Self = StObject.set(x, "notificationParameters", null)
    
    inline def setNotificationParametersUndefined: Self = StObject.set(x, "notificationParameters", js.undefined)
    
    inline def setProducerMetadata(value: StringDictionary[String]): Self = StObject.set(x, "producerMetadata", value.asInstanceOf[js.Any])
    
    inline def setProducerMetadataNull: Self = StObject.set(x, "producerMetadata", null)
    
    inline def setProducerMetadataUndefined: Self = StObject.set(x, "producerMetadata", js.undefined)
    
    inline def setProvisionedResources(value: js.Array[SchemaGoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource]): Self = StObject.set(x, "provisionedResources", value.asInstanceOf[js.Any])
    
    inline def setProvisionedResourcesUndefined: Self = StObject.set(x, "provisionedResources", js.undefined)
    
    inline def setProvisionedResourcesVarargs(value: SchemaGoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource*): Self = StObject.set(x, "provisionedResources", js.Array(value*))
    
    inline def setSlmInstanceTemplate(value: String): Self = StObject.set(x, "slmInstanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setSlmInstanceTemplateNull: Self = StObject.set(x, "slmInstanceTemplate", null)
    
    inline def setSlmInstanceTemplateUndefined: Self = StObject.set(x, "slmInstanceTemplate", js.undefined)
    
    inline def setSloMetadata(value: SchemaGoogleCloudSaasacceleratorManagementProvidersV1SloMetadata): Self = StObject.set(x, "sloMetadata", value.asInstanceOf[js.Any])
    
    inline def setSloMetadataUndefined: Self = StObject.set(x, "sloMetadata", js.undefined)
    
    inline def setSoftwareVersions(value: StringDictionary[String]): Self = StObject.set(x, "softwareVersions", value.asInstanceOf[js.Any])
    
    inline def setSoftwareVersionsNull: Self = StObject.set(x, "softwareVersions", null)
    
    inline def setSoftwareVersionsUndefined: Self = StObject.set(x, "softwareVersions", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTenantProjectId(value: String): Self = StObject.set(x, "tenantProjectId", value.asInstanceOf[js.Any])
    
    inline def setTenantProjectIdNull: Self = StObject.set(x, "tenantProjectId", null)
    
    inline def setTenantProjectIdUndefined: Self = StObject.set(x, "tenantProjectId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
