package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClustersNodepoolsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The parent (project, location, cluster name) where the node pool will be created. Specified in the format `projects/x/locations/x/clusters/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreateNodePoolRequest] = js.undefined
}
object ParamsResourceProjectsLocationsClustersNodepoolsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsClustersNodepoolsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersNodepoolsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClustersNodepoolsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaCreateNodePoolRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
