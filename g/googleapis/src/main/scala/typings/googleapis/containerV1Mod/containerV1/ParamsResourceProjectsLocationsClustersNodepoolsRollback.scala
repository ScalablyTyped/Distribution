package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClustersNodepoolsRollback
  extends StObject
     with StandardParameters {
  
  /**
    * The name (project, location, cluster, node pool id) of the node poll to rollback upgrade. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRollbackNodePoolUpgradeRequest] = js.undefined
}
object ParamsResourceProjectsLocationsClustersNodepoolsRollback {
  
  inline def apply(): ParamsResourceProjectsLocationsClustersNodepoolsRollback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersNodepoolsRollback]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClustersNodepoolsRollback](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaRollbackNodePoolUpgradeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
