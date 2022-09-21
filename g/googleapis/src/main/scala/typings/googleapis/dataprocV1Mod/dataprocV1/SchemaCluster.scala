package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCluster extends StObject {
  
  /**
    * Required. The cluster name, which must be unique within a project. The name must start with a lowercase letter, and can contain up to 51 lowercase letters, numbers, and hyphens. It cannot end with a hyphen. The name of a deleted cluster can be reused.
    */
  var clusterName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A cluster UUID (Unique Universal Identifier). Dataproc generates this value when it creates the cluster.
    */
  var clusterUuid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The cluster config for a cluster of Compute Engine Instances. Note that Dataproc may set default values, and values may change when clusters are updated.Exactly one of ClusterConfig or VirtualClusterConfig must be specified.
    */
  var config: js.UndefOr[SchemaClusterConfig] = js.undefined
  
  /**
    * Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
    */
  var metrics: js.UndefOr[SchemaClusterMetrics] = js.undefined
  
  /**
    * Required. The Google Cloud Platform project ID that the cluster belongs to.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Cluster status.
    */
  var status: js.UndefOr[SchemaClusterStatus] = js.undefined
  
  /**
    * Output only. The previous cluster status.
    */
  var statusHistory: js.UndefOr[js.Array[SchemaClusterStatus]] = js.undefined
  
  /**
    * Optional. The virtual cluster config is used when creating a Dataproc cluster that does not directly control the underlying compute resources, for example, when creating a Dataproc-on-GKE cluster (https://cloud.google.com/dataproc/docs/guides/dpgke/dataproc-gke). Dataproc may set default values, and values may change when clusters are updated. Exactly one of config or virtual_cluster_config must be specified.
    */
  var virtualClusterConfig: js.UndefOr[SchemaVirtualClusterConfig] = js.undefined
}
object SchemaCluster {
  
  inline def apply(): SchemaCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCluster]
  }
  
  extension [Self <: SchemaCluster](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameNull: Self = StObject.set(x, "clusterName", null)
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidNull: Self = StObject.set(x, "clusterUuid", null)
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    inline def setConfig(value: SchemaClusterConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMetrics(value: SchemaClusterMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStatus(value: SchemaClusterStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[SchemaClusterStatus]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: SchemaClusterStatus*): Self = StObject.set(x, "statusHistory", js.Array(value*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVirtualClusterConfig(value: SchemaVirtualClusterConfig): Self = StObject.set(x, "virtualClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterConfigUndefined: Self = StObject.set(x, "virtualClusterConfig", js.undefined)
  }
}
