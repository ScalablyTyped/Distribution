package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironmentConfig extends StObject {
  
  /**
    * Output only. The URI of the Apache Airflow Web UI hosted within this environment (see [Airflow web interface](/composer/docs/how-to/accessing/airflow-web-interface)).
    */
  var airflowUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Cloud Storage prefix of the DAGs for this environment. Although Cloud Storage objects reside in a flat namespace, a hierarchical file tree can be simulated using "/"-delimited object name prefixes. DAG objects for this environment reside in a simulated directory with the given prefix.
    */
  var dagGcsPrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The configuration settings for Cloud SQL instance used internally by Apache Airflow software.
    */
  var databaseConfig: js.UndefOr[SchemaDatabaseConfig] = js.undefined
  
  /**
    * Optional. The encryption options for the Cloud Composer environment and its dependencies. Cannot be updated.
    */
  var encryptionConfig: js.UndefOr[SchemaEncryptionConfig] = js.undefined
  
  /**
    * Optional. The size of the Cloud Composer environment. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
    */
  var environmentSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Kubernetes Engine cluster used to run this environment.
    */
  var gkeCluster: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The maintenance window is the period when Cloud Composer components may undergo maintenance. It is defined so that maintenance is not executed during peak hours or critical time periods. The system will not be under maintenance for every occurrence of this window, but when maintenance is planned, it will be scheduled during the window. The maintenance window period must encompass at least 12 hours per week. This may be split into multiple chunks, each with a size of at least 4 hours. If this value is omitted, Cloud Composer components may be subject to maintenance at any time.
    */
  var maintenanceWindow: js.UndefOr[SchemaMaintenanceWindow] = js.undefined
  
  /**
    * Optional. The configuration options for GKE cluster master authorized networks. By default master authorized networks feature is: - in case of private environment: enabled with no external networks allowlisted. - in case of public environment: disabled.
    */
  var masterAuthorizedNetworksConfig: js.UndefOr[SchemaMasterAuthorizedNetworksConfig] = js.undefined
  
  /**
    * The configuration used for the Kubernetes Engine cluster.
    */
  var nodeConfig: js.UndefOr[SchemaNodeConfig] = js.undefined
  
  /**
    * The number of nodes in the Kubernetes Engine cluster that will be used to run this environment. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
    */
  var nodeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The configuration used for the Private IP Cloud Composer environment.
    */
  var privateEnvironmentConfig: js.UndefOr[SchemaPrivateEnvironmentConfig] = js.undefined
  
  /**
    * The configuration settings for software inside the environment.
    */
  var softwareConfig: js.UndefOr[SchemaSoftwareConfig] = js.undefined
  
  /**
    * Optional. The configuration settings for the Airflow web server App Engine instance. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
    */
  var webServerConfig: js.UndefOr[SchemaWebServerConfig] = js.undefined
  
  /**
    * Optional. The network-level access control policy for the Airflow web server. If unspecified, no network-level access restrictions will be applied.
    */
  var webServerNetworkAccessControl: js.UndefOr[SchemaWebServerNetworkAccessControl] = js.undefined
  
  /**
    * Optional. The workloads configuration settings for the GKE cluster associated with the Cloud Composer environment. The GKE cluster runs Airflow scheduler, web server and workers workloads. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
    */
  var workloadsConfig: js.UndefOr[SchemaWorkloadsConfig] = js.undefined
}
object SchemaEnvironmentConfig {
  
  inline def apply(): SchemaEnvironmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentConfig]
  }
  
  extension [Self <: SchemaEnvironmentConfig](x: Self) {
    
    inline def setAirflowUri(value: String): Self = StObject.set(x, "airflowUri", value.asInstanceOf[js.Any])
    
    inline def setAirflowUriNull: Self = StObject.set(x, "airflowUri", null)
    
    inline def setAirflowUriUndefined: Self = StObject.set(x, "airflowUri", js.undefined)
    
    inline def setDagGcsPrefix(value: String): Self = StObject.set(x, "dagGcsPrefix", value.asInstanceOf[js.Any])
    
    inline def setDagGcsPrefixNull: Self = StObject.set(x, "dagGcsPrefix", null)
    
    inline def setDagGcsPrefixUndefined: Self = StObject.set(x, "dagGcsPrefix", js.undefined)
    
    inline def setDatabaseConfig(value: SchemaDatabaseConfig): Self = StObject.set(x, "databaseConfig", value.asInstanceOf[js.Any])
    
    inline def setDatabaseConfigUndefined: Self = StObject.set(x, "databaseConfig", js.undefined)
    
    inline def setEncryptionConfig(value: SchemaEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setEnvironmentSize(value: String): Self = StObject.set(x, "environmentSize", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentSizeNull: Self = StObject.set(x, "environmentSize", null)
    
    inline def setEnvironmentSizeUndefined: Self = StObject.set(x, "environmentSize", js.undefined)
    
    inline def setGkeCluster(value: String): Self = StObject.set(x, "gkeCluster", value.asInstanceOf[js.Any])
    
    inline def setGkeClusterNull: Self = StObject.set(x, "gkeCluster", null)
    
    inline def setGkeClusterUndefined: Self = StObject.set(x, "gkeCluster", js.undefined)
    
    inline def setMaintenanceWindow(value: SchemaMaintenanceWindow): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
    
    inline def setMasterAuthorizedNetworksConfig(value: SchemaMasterAuthorizedNetworksConfig): Self = StObject.set(x, "masterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    
    inline def setMasterAuthorizedNetworksConfigUndefined: Self = StObject.set(x, "masterAuthorizedNetworksConfig", js.undefined)
    
    inline def setNodeConfig(value: SchemaNodeConfig): Self = StObject.set(x, "nodeConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeConfigUndefined: Self = StObject.set(x, "nodeConfig", js.undefined)
    
    inline def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountNull: Self = StObject.set(x, "nodeCount", null)
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "nodeCount", js.undefined)
    
    inline def setPrivateEnvironmentConfig(value: SchemaPrivateEnvironmentConfig): Self = StObject.set(x, "privateEnvironmentConfig", value.asInstanceOf[js.Any])
    
    inline def setPrivateEnvironmentConfigUndefined: Self = StObject.set(x, "privateEnvironmentConfig", js.undefined)
    
    inline def setSoftwareConfig(value: SchemaSoftwareConfig): Self = StObject.set(x, "softwareConfig", value.asInstanceOf[js.Any])
    
    inline def setSoftwareConfigUndefined: Self = StObject.set(x, "softwareConfig", js.undefined)
    
    inline def setWebServerConfig(value: SchemaWebServerConfig): Self = StObject.set(x, "webServerConfig", value.asInstanceOf[js.Any])
    
    inline def setWebServerConfigUndefined: Self = StObject.set(x, "webServerConfig", js.undefined)
    
    inline def setWebServerNetworkAccessControl(value: SchemaWebServerNetworkAccessControl): Self = StObject.set(x, "webServerNetworkAccessControl", value.asInstanceOf[js.Any])
    
    inline def setWebServerNetworkAccessControlUndefined: Self = StObject.set(x, "webServerNetworkAccessControl", js.undefined)
    
    inline def setWorkloadsConfig(value: SchemaWorkloadsConfig): Self = StObject.set(x, "workloadsConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkloadsConfigUndefined: Self = StObject.set(x, "workloadsConfig", js.undefined)
  }
}
