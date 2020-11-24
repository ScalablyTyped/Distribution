package typings.gyronorm.mod

import typings.gyronorm.anon.Absolute
import typings.gyronorm.anon.Alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionAndOrientationPayload extends js.Object {
  
  var dm: Alpha = js.native
  
  var `do`: Absolute = js.native
}
object MotionAndOrientationPayload {
  
  @scala.inline
  def apply(dm: Alpha, `do`: Absolute): MotionAndOrientationPayload = {
    val __obj = js.Dynamic.literal(dm = dm.asInstanceOf[js.Any])
    __obj.updateDynamic("do")(`do`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionAndOrientationPayload]
  }
  
  @scala.inline
  implicit class MotionAndOrientationPayloadOps[Self <: MotionAndOrientationPayload] (val x: Self) extends AnyVal {
    
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
    def setDm(value: Alpha): Self = this.set("dm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDo(value: Absolute): Self = this.set("do", value.asInstanceOf[js.Any])
  }
}
