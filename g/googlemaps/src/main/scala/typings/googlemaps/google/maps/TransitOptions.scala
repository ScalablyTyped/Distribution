package typings.googlemaps.google.maps

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitOptions extends js.Object {
  
  var arrivalTime: js.UndefOr[Date] = js.native
  
  var departureTime: js.UndefOr[Date] = js.native
  
  var modes: js.UndefOr[js.Array[TransitMode]] = js.native
  
  var routingPreference: js.UndefOr[TransitRoutePreference] = js.native
}
object TransitOptions {
  
  @scala.inline
  def apply(): TransitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitOptions]
  }
  
  @scala.inline
  implicit class TransitOptionsOps[Self <: TransitOptions] (val x: Self) extends AnyVal {
    
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
    def setArrivalTime(value: Date): Self = this.set("arrivalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrivalTime: Self = this.set("arrivalTime", js.undefined)
    
    @scala.inline
    def setDepartureTime(value: Date): Self = this.set("departureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartureTime: Self = this.set("departureTime", js.undefined)
    
    @scala.inline
    def setModesVarargs(value: TransitMode*): Self = this.set("modes", js.Array(value :_*))
    
    @scala.inline
    def setModes(value: js.Array[TransitMode]): Self = this.set("modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModes: Self = this.set("modes", js.undefined)
    
    @scala.inline
    def setRoutingPreference(value: TransitRoutePreference): Self = this.set("routingPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingPreference: Self = this.set("routingPreference", js.undefined)
  }
}
