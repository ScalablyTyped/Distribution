package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Identifier to assign to the Connection. Must be unique within scope of the parent resource.
    */
  var connectionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Parent resource of the Connection, of the form: `projects/x/locations/x`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConnection] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsCreate](x: Self) {
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaConnection): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
