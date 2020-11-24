package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackFrames extends js.Object {
  
  /** The number of stack frames that were dropped because there were too many stack frames. If this value is 0, then no stack frames were dropped. */
  var droppedFramesCount: js.UndefOr[Double] = js.native
  
  /** Stack frames in this call stack. */
  var frame: js.UndefOr[js.Array[StackFrame]] = js.native
}
object StackFrames {
  
  @scala.inline
  def apply(): StackFrames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackFrames]
  }
  
  @scala.inline
  implicit class StackFramesOps[Self <: StackFrames] (val x: Self) extends AnyVal {
    
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
    def setDroppedFramesCount(value: Double): Self = this.set("droppedFramesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDroppedFramesCount: Self = this.set("droppedFramesCount", js.undefined)
    
    @scala.inline
    def setFrameVarargs(value: StackFrame*): Self = this.set("frame", js.Array(value :_*))
    
    @scala.inline
    def setFrame(value: js.Array[StackFrame]): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
  }
}
