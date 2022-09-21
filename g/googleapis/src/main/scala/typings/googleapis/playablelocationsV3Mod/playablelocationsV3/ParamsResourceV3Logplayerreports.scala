package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV3Logplayerreports
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsRequest] = js.undefined
}
object ParamsResourceV3Logplayerreports {
  
  inline def apply(): ParamsResourceV3Logplayerreports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV3Logplayerreports]
  }
  
  extension [Self <: ParamsResourceV3Logplayerreports](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleMapsPlayablelocationsV3LogPlayerReportsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
