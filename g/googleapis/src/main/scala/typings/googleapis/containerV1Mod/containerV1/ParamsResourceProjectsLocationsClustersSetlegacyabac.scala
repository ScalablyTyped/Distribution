package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClustersSetlegacyabac
  extends StObject
     with StandardParameters {
  
  /**
    * The name (project, location, cluster name) of the cluster to set legacy abac. Specified in the format `projects/x/locations/x/clusters/x`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetLegacyAbacRequest] = js.undefined
}
object ParamsResourceProjectsLocationsClustersSetlegacyabac {
  
  inline def apply(): ParamsResourceProjectsLocationsClustersSetlegacyabac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersSetlegacyabac]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClustersSetlegacyabac](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSetLegacyAbacRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
