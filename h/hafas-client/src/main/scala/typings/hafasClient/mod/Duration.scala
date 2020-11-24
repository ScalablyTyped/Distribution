package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration extends js.Object {
  
  var duration: Double = js.native
  
  var stations: js.Array[Station | Stop | Location] = js.native
}
object Duration {
  
  @scala.inline
  def apply(duration: Double, stations: js.Array[Station | Stop | Location]): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], stations = stations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStationsVarargs(value: (Station | Stop | Location)*): Self = this.set("stations", js.Array(value :_*))
    
    @scala.inline
    def setStations(value: js.Array[Station | Stop | Location]): Self = this.set("stations", value.asInstanceOf[js.Any])
  }
}
