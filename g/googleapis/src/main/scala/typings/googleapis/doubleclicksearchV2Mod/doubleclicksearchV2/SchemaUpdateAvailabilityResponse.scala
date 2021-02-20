package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to a update availability request.
  */
@js.native
trait SchemaUpdateAvailabilityResponse extends StObject {
  
  /**
    * The availabilities being returned.
    */
  var availabilities: js.UndefOr[js.Array[SchemaAvailability]] = js.native
}
object SchemaUpdateAvailabilityResponse {
  
  @scala.inline
  def apply(): SchemaUpdateAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateAvailabilityResponse]
  }
  
  @scala.inline
  implicit class SchemaUpdateAvailabilityResponseMutableBuilder[Self <: SchemaUpdateAvailabilityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilities(value: js.Array[SchemaAvailability]): Self = StObject.set(x, "availabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilitiesUndefined: Self = StObject.set(x, "availabilities", js.undefined)
    
    @scala.inline
    def setAvailabilitiesVarargs(value: SchemaAvailability*): Self = StObject.set(x, "availabilities", js.Array(value :_*))
  }
}
