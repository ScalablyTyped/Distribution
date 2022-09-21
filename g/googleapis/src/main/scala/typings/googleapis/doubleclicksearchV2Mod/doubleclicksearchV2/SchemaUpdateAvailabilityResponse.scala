package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateAvailabilityResponse extends StObject {
  
  /**
    * The availabilities being returned.
    */
  var availabilities: js.UndefOr[js.Array[SchemaAvailability]] = js.undefined
}
object SchemaUpdateAvailabilityResponse {
  
  inline def apply(): SchemaUpdateAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateAvailabilityResponse]
  }
  
  extension [Self <: SchemaUpdateAvailabilityResponse](x: Self) {
    
    inline def setAvailabilities(value: js.Array[SchemaAvailability]): Self = StObject.set(x, "availabilities", value.asInstanceOf[js.Any])
    
    inline def setAvailabilitiesUndefined: Self = StObject.set(x, "availabilities", js.undefined)
    
    inline def setAvailabilitiesVarargs(value: SchemaAvailability*): Self = StObject.set(x, "availabilities", js.Array(value*))
  }
}
