package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the identifying information, config, and status of a cluster of
  * Compute Engine instances.
  */
@js.native
trait SchemaCluster extends StObject {
  
  /**
    * Required. The cluster name. Cluster names within a project must be
    * unique. Names of deleted clusters can be reused.
    */
  var clusterName: js.UndefOr[String] = js.native
  
  /**
    * Output only. A cluster UUID (Unique Universal Identifier). Cloud Dataproc
    * generates this value when it creates the cluster.
    */
  var clusterUuid: js.UndefOr[String] = js.native
  
  /**
    * Required. The cluster config. Note that Cloud Dataproc may set default
    * values, and values may change when clusters are updated.
    */
  var config: js.UndefOr[SchemaClusterConfig] = js.native
  
  /**
    * Optional. The labels to associate with this cluster. Label keys must
    * contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but,
    * if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
    * associated with a cluster.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature:
    * This report is available for testing purposes only. It may be changed
    * before final release.
    */
  var metrics: js.UndefOr[SchemaClusterMetrics] = js.native
  
  /**
    * Required. The Google Cloud Platform project ID that the cluster belongs
    * to.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Output only. Cluster status.
    */
  var status: js.UndefOr[SchemaClusterStatus] = js.native
  
  /**
    * Output only. The previous cluster status.
    */
  var statusHistory: js.UndefOr[js.Array[SchemaClusterStatus]] = js.native
}
object SchemaCluster {
  
  @scala.inline
  def apply(): SchemaCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCluster]
  }
  
  @scala.inline
  implicit class SchemaClusterMutableBuilder[Self <: SchemaCluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    @scala.inline
    def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    @scala.inline
    def setConfig(value: SchemaClusterConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMetrics(value: SchemaClusterMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaClusterStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusHistory(value: js.Array[SchemaClusterStatus]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    @scala.inline
    def setStatusHistoryVarargs(value: SchemaClusterStatus*): Self = StObject.set(x, "statusHistory", js.Array(value :_*))
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
