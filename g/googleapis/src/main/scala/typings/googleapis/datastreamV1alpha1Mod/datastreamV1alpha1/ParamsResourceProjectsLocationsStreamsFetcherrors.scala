package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsStreamsFetcherrors
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFetchErrorsRequest] = js.undefined
  
  /**
    * Name of the Stream resource for which to fetch any errors.
    */
  var stream: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsStreamsFetcherrors {
  
  inline def apply(): ParamsResourceProjectsLocationsStreamsFetcherrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsStreamsFetcherrors]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsStreamsFetcherrors](x: Self) {
    
    inline def setRequestBody(value: SchemaFetchErrorsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
