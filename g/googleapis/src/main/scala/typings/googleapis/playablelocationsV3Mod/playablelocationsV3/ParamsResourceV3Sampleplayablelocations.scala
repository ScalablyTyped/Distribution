package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV3Sampleplayablelocations
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest] = js.undefined
}
object ParamsResourceV3Sampleplayablelocations {
  
  inline def apply(): ParamsResourceV3Sampleplayablelocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV3Sampleplayablelocations]
  }
  
  extension [Self <: ParamsResourceV3Sampleplayablelocations](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
