package typings.konva.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFrame extends js.Object {
  
  var frameRate: Double = js.native
  
  var lastTime: Double = js.native
  
  var time: Double = js.native
  
  var timeDiff: Double = js.native
}
object IFrame {
  
  @scala.inline
  def apply(frameRate: Double, lastTime: Double, time: Double, timeDiff: Double): IFrame = {
    val __obj = js.Dynamic.literal(frameRate = frameRate.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeDiff = timeDiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFrame]
  }
  
  @scala.inline
  implicit class IFrameOps[Self <: IFrame] (val x: Self) extends AnyVal {
    
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
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTime(value: Double): Self = this.set("lastTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDiff(value: Double): Self = this.set("timeDiff", value.asInstanceOf[js.Any])
  }
}
