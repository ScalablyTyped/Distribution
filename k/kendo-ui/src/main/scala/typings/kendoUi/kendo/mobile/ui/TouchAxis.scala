package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchAxis extends js.Object {
  
  var client: js.UndefOr[Double] = js.native
  
  var delta: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[Double] = js.native
  
  var startLocation: js.UndefOr[Double] = js.native
  
  var velocity: js.UndefOr[Double] = js.native
}
object TouchAxis {
  
  @scala.inline
  def apply(): TouchAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchAxis]
  }
  
  @scala.inline
  implicit class TouchAxisOps[Self <: TouchAxis] (val x: Self) extends AnyVal {
    
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
    def setClient(value: Double): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setStartLocation(value: Double): Self = this.set("startLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartLocation: Self = this.set("startLocation", js.undefined)
    
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVelocity: Self = this.set("velocity", js.undefined)
  }
}
