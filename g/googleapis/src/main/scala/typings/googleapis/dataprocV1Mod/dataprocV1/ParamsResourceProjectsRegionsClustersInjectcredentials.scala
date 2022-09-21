package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsClustersInjectcredentials
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The cluster, in the form clusters/.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the Google Cloud Platform project the cluster belongs to, of the form projects/.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The region containing the cluster, of the form regions/.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInjectCredentialsRequest] = js.undefined
}
object ParamsResourceProjectsRegionsClustersInjectcredentials {
  
  inline def apply(): ParamsResourceProjectsRegionsClustersInjectcredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsClustersInjectcredentials]
  }
  
  extension [Self <: ParamsResourceProjectsRegionsClustersInjectcredentials](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRequestBody(value: SchemaInjectCredentialsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
