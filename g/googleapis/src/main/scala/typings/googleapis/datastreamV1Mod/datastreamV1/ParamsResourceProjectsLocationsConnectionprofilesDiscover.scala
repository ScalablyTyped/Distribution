package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionprofilesDiscover
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource of the connection profile type. Must be in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDiscoverConnectionProfileRequest] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionprofilesDiscover {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionprofilesDiscover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionprofilesDiscover]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionprofilesDiscover](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaDiscoverConnectionProfileRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
