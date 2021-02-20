package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request to update availability.
  */
@js.native
trait SchemaUpdateAvailabilityRequest extends StObject {
  
  /**
    * The availabilities being requested.
    */
  var availabilities: js.UndefOr[js.Array[SchemaAvailability]] = js.native
}
object SchemaUpdateAvailabilityRequest {
  
  @scala.inline
  def apply(): SchemaUpdateAvailabilityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateAvailabilityRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateAvailabilityRequestMutableBuilder[Self <: SchemaUpdateAvailabilityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilities(value: js.Array[SchemaAvailability]): Self = StObject.set(x, "availabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilitiesUndefined: Self = StObject.set(x, "availabilities", js.undefined)
    
    @scala.inline
    def setAvailabilitiesVarargs(value: SchemaAvailability*): Self = StObject.set(x, "availabilities", js.Array(value :_*))
  }
}
