package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /** Required. The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused. */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /** Output only. A cluster UUID (Unique Universal Identifier). Dataproc generates this value when it creates the cluster. */
  var clusterUuid: js.UndefOr[String] = js.undefined
  
  /** Required. The cluster config. Note that Dataproc may set default values, and values may change when clusters are updated. */
  var config: js.UndefOr[ClusterConfig] = js.undefined
  
  /**
    * Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values
    * may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a
    * cluster.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.Cluster & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before final release. */
  var metrics: js.UndefOr[ClusterMetrics] = js.undefined
  
  /** Required. The Google Cloud Platform project ID that the cluster belongs to. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Output only. Cluster status. */
  var status: js.UndefOr[ClusterStatus] = js.undefined
  
  /** Output only. The previous cluster status. */
  var statusHistory: js.UndefOr[js.Array[ClusterStatus]] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  extension [Self <: Cluster](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
    
    inline def setConfig(value: ClusterConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.Cluster & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMetrics(value: ClusterMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStatus(value: ClusterStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusHistory(value: js.Array[ClusterStatus]): Self = StObject.set(x, "statusHistory", value.asInstanceOf[js.Any])
    
    inline def setStatusHistoryUndefined: Self = StObject.set(x, "statusHistory", js.undefined)
    
    inline def setStatusHistoryVarargs(value: ClusterStatus*): Self = StObject.set(x, "statusHistory", js.Array(value :_*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
