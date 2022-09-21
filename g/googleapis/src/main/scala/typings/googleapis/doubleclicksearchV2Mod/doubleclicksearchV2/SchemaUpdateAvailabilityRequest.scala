package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateAvailabilityRequest extends StObject {
  
  /**
    * The availabilities being requested.
    */
  var availabilities: js.UndefOr[js.Array[SchemaAvailability]] = js.undefined
}
object SchemaUpdateAvailabilityRequest {
  
  inline def apply(): SchemaUpdateAvailabilityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateAvailabilityRequest]
  }
  
  extension [Self <: SchemaUpdateAvailabilityRequest](x: Self) {
    
    inline def setAvailabilities(value: js.Array[SchemaAvailability]): Self = StObject.set(x, "availabilities", value.asInstanceOf[js.Any])
    
    inline def setAvailabilitiesUndefined: Self = StObject.set(x, "availabilities", js.undefined)
    
    inline def setAvailabilitiesVarargs(value: SchemaAvailability*): Self = StObject.set(x, "availabilities", js.Array(value*))
  }
}
