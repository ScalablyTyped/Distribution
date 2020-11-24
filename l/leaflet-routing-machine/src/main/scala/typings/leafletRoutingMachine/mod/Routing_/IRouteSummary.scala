package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
@js.native
trait IRouteSummary extends js.Object {
  
  var totalDistance: Double = js.native
  
  var totalTime: Double = js.native
}
object IRouteSummary {
  
  @scala.inline
  def apply(totalDistance: Double, totalTime: Double): IRouteSummary = {
    val __obj = js.Dynamic.literal(totalDistance = totalDistance.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteSummary]
  }
  
  @scala.inline
  implicit class IRouteSummaryOps[Self <: IRouteSummary] (val x: Self) extends AnyVal {
    
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
    def setTotalDistance(value: Double): Self = this.set("totalDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTime(value: Double): Self = this.set("totalTime", value.asInstanceOf[js.Any])
  }
}
