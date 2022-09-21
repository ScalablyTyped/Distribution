package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClustersNodepoolsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The name (project, location, cluster, node pool) of the node pool to update. Specified in the format `projects/x/locations/x/clusters/x/nodePools/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateNodePoolRequest] = js.undefined
}
object ParamsResourceProjectsLocationsClustersNodepoolsUpdate {
  
  inline def apply(): ParamsResourceProjectsLocationsClustersNodepoolsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersNodepoolsUpdate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClustersNodepoolsUpdate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUpdateNodePoolRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
