package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV3Logimpressions
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleMapsPlayablelocationsV3LogImpressionsRequest] = js.undefined
}
object ParamsResourceV3Logimpressions {
  
  inline def apply(): ParamsResourceV3Logimpressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV3Logimpressions]
  }
  
  extension [Self <: ParamsResourceV3Logimpressions](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleMapsPlayablelocationsV3LogImpressionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
