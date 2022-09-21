package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProvidersConnectorsList
  extends StObject
     with StandardParameters {
  
  /**
    * Page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Parent resource of the connectors, of the form: `projects/x/locations/x/providers/x` Only global location is supported for Connector resource.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsProvidersConnectorsList {
  
  inline def apply(): ParamsResourceProjectsLocationsProvidersConnectorsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProvidersConnectorsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProvidersConnectorsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
