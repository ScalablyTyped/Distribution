package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to a update availability request.
  */
@js.native
trait SchemaUpdateAvailabilityResponse extends js.Object {
  
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
  implicit class SchemaUpdateAvailabilityResponseOps[Self <: SchemaUpdateAvailabilityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilitiesVarargs(value: SchemaAvailability*): Self = this.set("availabilities", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilities(value: js.Array[SchemaAvailability]): Self = this.set("availabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilities: Self = this.set("availabilities", js.undefined)
  }
}
