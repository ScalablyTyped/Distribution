package typings.ionicCore.gestureMod

import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureDetail extends js.Object {
  
  var currentTime: Double = js.native
  
  var currentX: Double = js.native
  
  var currentY: Double = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var deltaX: Double = js.native
  
  var deltaY: Double = js.native
  
  var event: UIEvent = js.native
  
  var startTime: Double = js.native
  
  var startX: Double = js.native
  
  var startY: Double = js.native
  
  var `type`: String = js.native
  
  var velocityX: Double = js.native
  
  var velocityY: Double = js.native
}
object GestureDetail {
  
  @scala.inline
  def apply(
    currentTime: Double,
    currentX: Double,
    currentY: Double,
    deltaX: Double,
    deltaY: Double,
    event: UIEvent,
    startTime: Double,
    startX: Double,
    startY: Double,
    `type`: String,
    velocityX: Double,
    velocityY: Double
  ): GestureDetail = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureDetail]
  }
  
  @scala.inline
  implicit class GestureDetailOps[Self <: GestureDetail] (val x: Self) extends AnyVal {
    
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentX(value: Double): Self = this.set("currentX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentY(value: Double): Self = this.set("currentY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: UIEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityX(value: Double): Self = this.set("velocityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityY(value: Double): Self = this.set("velocityY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
