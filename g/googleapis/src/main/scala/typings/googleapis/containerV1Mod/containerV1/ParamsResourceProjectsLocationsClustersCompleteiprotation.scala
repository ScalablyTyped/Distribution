package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClustersCompleteiprotation
  extends StObject
     with StandardParameters {
  
  /**
    * The name (project, location, cluster name) of the cluster to complete IP rotation. Specified in the format `projects/x/locations/x/clusters/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCompleteIPRotationRequest] = js.undefined
}
object ParamsResourceProjectsLocationsClustersCompleteiprotation {
  
  inline def apply(): ParamsResourceProjectsLocationsClustersCompleteiprotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersCompleteiprotation]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClustersCompleteiprotation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaCompleteIPRotationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
