package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCapoolsFetchcacerts
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name for the CaPool in the format `projects/x/locations/x/caPools/x`.
    */
  var caPool: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFetchCaCertsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCapoolsFetchcacerts {
  
  inline def apply(): ParamsResourceProjectsLocationsCapoolsFetchcacerts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCapoolsFetchcacerts]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCapoolsFetchcacerts](x: Self) {
    
    inline def setCaPool(value: String): Self = StObject.set(x, "caPool", value.asInstanceOf[js.Any])
    
    inline def setCaPoolUndefined: Self = StObject.set(x, "caPool", js.undefined)
    
    inline def setRequestBody(value: SchemaFetchCaCertsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
