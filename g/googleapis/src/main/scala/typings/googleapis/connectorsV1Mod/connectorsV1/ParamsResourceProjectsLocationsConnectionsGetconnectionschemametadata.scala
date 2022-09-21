package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsGetconnectionschemametadata
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Connection name Format: projects/{project\}/locations/{location\}/connections/{connection\}/connectionSchemaMetadata
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsGetconnectionschemametadata {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsGetconnectionschemametadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsGetconnectionschemametadata]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsGetconnectionschemametadata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
