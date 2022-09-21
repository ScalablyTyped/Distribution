package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClustersSetmasterauth
  extends StObject
     with StandardParameters {
  
  /**
    * The name (project, location, cluster) of the cluster to set auth. Specified in the format `projects/x/locations/x/clusters/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetMasterAuthRequest] = js.undefined
}
object ParamsResourceProjectsLocationsClustersSetmasterauth {
  
  inline def apply(): ParamsResourceProjectsLocationsClustersSetmasterauth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersSetmasterauth]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClustersSetmasterauth](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSetMasterAuthRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
