package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceConversionUpdateavailability
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateAvailabilityRequest] = js.undefined
}
object ParamsResourceConversionUpdateavailability {
  
  inline def apply(): ParamsResourceConversionUpdateavailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceConversionUpdateavailability]
  }
  
  extension [Self <: ParamsResourceConversionUpdateavailability](x: Self) {
    
    inline def setRequestBody(value: SchemaUpdateAvailabilityRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
