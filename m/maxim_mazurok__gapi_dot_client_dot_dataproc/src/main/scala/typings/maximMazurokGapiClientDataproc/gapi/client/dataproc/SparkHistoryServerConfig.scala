package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkHistoryServerConfig extends StObject {
  
  /** Optional. Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.Example: projects/[project_id]/regions/[region]/clusters/[cluster_name] */
  var dataprocCluster: js.UndefOr[String] = js.undefined
}
object SparkHistoryServerConfig {
  
  inline def apply(): SparkHistoryServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkHistoryServerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SparkHistoryServerConfig] (val x: Self) extends AnyVal {
    
    inline def setDataprocCluster(value: String): Self = StObject.set(x, "dataprocCluster", value.asInstanceOf[js.Any])
    
    inline def setDataprocClusterUndefined: Self = StObject.set(x, "dataprocCluster", js.undefined)
  }
}
