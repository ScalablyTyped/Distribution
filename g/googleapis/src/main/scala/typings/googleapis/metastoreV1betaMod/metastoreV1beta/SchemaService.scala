package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaService extends StObject {
  
  /**
    * Output only. A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
    */
  var artifactGcsUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the metastore service was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The database type that the Metastore service stores its data.
    */
  var databaseType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Information used to configure the Dataproc Metastore service to encrypt customer data at rest. Cannot be updated.
    */
  var encryptionConfig: js.UndefOr[SchemaEncryptionConfig] = js.undefined
  
  /**
    * Output only. The URI of the endpoint used to access the metastore service.
    */
  var endpointUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration information specific to running Hive metastore software as the metastore service.
    */
  var hiveMetastoreConfig: js.UndefOr[SchemaHiveMetastoreConfig] = js.undefined
  
  /**
    * User-defined labels for the metastore service.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The one hour maintenance window of the metastore service. This specifies when the service can be restarted for maintenance purposes in UTC time. Maintenance window is not needed for services with the SPANNER database type.
    */
  var maintenanceWindow: js.UndefOr[SchemaMaintenanceWindow] = js.undefined
  
  /**
    * The setting that defines how metastore metadata should be integrated with external services and systems.
    */
  var metadataIntegration: js.UndefOr[SchemaMetadataIntegration] = js.undefined
  
  /**
    * Output only. The metadata management activities of the metastore service.
    */
  var metadataManagementActivity: js.UndefOr[SchemaMetadataManagementActivity] = js.undefined
  
  /**
    * Immutable. The relative resource name of the metastore service, of the form:projects/{project_number\}/locations/{location_id\}/services/{service_id\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:projects/{project_number\}/global/networks/{network_id\}.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The configuration specifying the network settings for the Dataproc Metastore service.
    */
  var networkConfig: js.UndefOr[SchemaNetworkConfig] = js.undefined
  
  /**
    * The TCP port at which the metastore service is reached. Default: 9083.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Immutable. The release channel of the service. If unspecified, defaults to STABLE.
    */
  var releaseChannel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of the metastore service.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Additional information about the current state of the metastore service, if available.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tier of the service.
    */
  var tier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The globally unique resource identifier of the metastore service.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the metastore service was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaService {
  
  inline def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  
  extension [Self <: SchemaService](x: Self) {
    
    inline def setArtifactGcsUri(value: String): Self = StObject.set(x, "artifactGcsUri", value.asInstanceOf[js.Any])
    
    inline def setArtifactGcsUriNull: Self = StObject.set(x, "artifactGcsUri", null)
    
    inline def setArtifactGcsUriUndefined: Self = StObject.set(x, "artifactGcsUri", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatabaseType(value: String): Self = StObject.set(x, "databaseType", value.asInstanceOf[js.Any])
    
    inline def setDatabaseTypeNull: Self = StObject.set(x, "databaseType", null)
    
    inline def setDatabaseTypeUndefined: Self = StObject.set(x, "databaseType", js.undefined)
    
    inline def setEncryptionConfig(value: SchemaEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setEndpointUri(value: String): Self = StObject.set(x, "endpointUri", value.asInstanceOf[js.Any])
    
    inline def setEndpointUriNull: Self = StObject.set(x, "endpointUri", null)
    
    inline def setEndpointUriUndefined: Self = StObject.set(x, "endpointUri", js.undefined)
    
    inline def setHiveMetastoreConfig(value: SchemaHiveMetastoreConfig): Self = StObject.set(x, "hiveMetastoreConfig", value.asInstanceOf[js.Any])
    
    inline def setHiveMetastoreConfigUndefined: Self = StObject.set(x, "hiveMetastoreConfig", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMaintenanceWindow(value: SchemaMaintenanceWindow): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
    
    inline def setMetadataIntegration(value: SchemaMetadataIntegration): Self = StObject.set(x, "metadataIntegration", value.asInstanceOf[js.Any])
    
    inline def setMetadataIntegrationUndefined: Self = StObject.set(x, "metadataIntegration", js.undefined)
    
    inline def setMetadataManagementActivity(value: SchemaMetadataManagementActivity): Self = StObject.set(x, "metadataManagementActivity", value.asInstanceOf[js.Any])
    
    inline def setMetadataManagementActivityUndefined: Self = StObject.set(x, "metadataManagementActivity", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfig(value: SchemaNetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setReleaseChannel(value: String): Self = StObject.set(x, "releaseChannel", value.asInstanceOf[js.Any])
    
    inline def setReleaseChannelNull: Self = StObject.set(x, "releaseChannel", null)
    
    inline def setReleaseChannelUndefined: Self = StObject.set(x, "releaseChannel", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierNull: Self = StObject.set(x, "tier", null)
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
