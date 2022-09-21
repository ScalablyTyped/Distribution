package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsExecutesqlquery
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the Connection. Format: projects/{project\}/locations/{location\}/connections/{connection\}
    */
  var connection: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExecuteSqlQueryRequest] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsExecutesqlquery {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsExecutesqlquery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsExecutesqlquery]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsExecutesqlquery](x: Self) {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setRequestBody(value: SchemaExecuteSqlQueryRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
