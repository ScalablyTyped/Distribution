package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineTouchedEvent extends js.Object {
  
  var afterIndex: Double = js.native
  
  var latlng: Double = js.native
}
object LineTouchedEvent {
  
  @scala.inline
  def apply(afterIndex: Double, latlng: Double): LineTouchedEvent = {
    val __obj = js.Dynamic.literal(afterIndex = afterIndex.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineTouchedEvent]
  }
  
  @scala.inline
  implicit class LineTouchedEventOps[Self <: LineTouchedEvent] (val x: Self) extends AnyVal {
    
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
    def setAfterIndex(value: Double): Self = this.set("afterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatlng(value: Double): Self = this.set("latlng", value.asInstanceOf[js.Any])
  }
}
