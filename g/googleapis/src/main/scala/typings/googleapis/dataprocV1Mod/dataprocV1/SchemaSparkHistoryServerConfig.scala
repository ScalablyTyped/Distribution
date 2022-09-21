package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSparkHistoryServerConfig extends StObject {
  
  /**
    * Optional. Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.Example: projects/[project_id]/regions/[region]/clusters/[cluster_name]
    */
  var dataprocCluster: js.UndefOr[String | Null] = js.undefined
}
object SchemaSparkHistoryServerConfig {
  
  inline def apply(): SchemaSparkHistoryServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSparkHistoryServerConfig]
  }
  
  extension [Self <: SchemaSparkHistoryServerConfig](x: Self) {
    
    inline def setDataprocCluster(value: String): Self = StObject.set(x, "dataprocCluster", value.asInstanceOf[js.Any])
    
    inline def setDataprocClusterNull: Self = StObject.set(x, "dataprocCluster", null)
    
    inline def setDataprocClusterUndefined: Self = StObject.set(x, "dataprocCluster", js.undefined)
  }
}
