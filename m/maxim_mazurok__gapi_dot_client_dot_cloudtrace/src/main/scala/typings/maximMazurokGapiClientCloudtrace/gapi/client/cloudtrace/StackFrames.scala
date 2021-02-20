package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackFrames extends StObject {
  
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
  implicit class StackFramesMutableBuilder[Self <: StackFrames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDroppedFramesCount(value: Double): Self = StObject.set(x, "droppedFramesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppedFramesCountUndefined: Self = StObject.set(x, "droppedFramesCount", js.undefined)
    
    @scala.inline
    def setFrame(value: js.Array[StackFrame]): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    @scala.inline
    def setFrameVarargs(value: StackFrame*): Self = StObject.set(x, "frame", js.Array(value :_*))
  }
}
