package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackTrace extends js.Object {
  
  /** Stack frames in this stack trace. A maximum of 128 frames are allowed. */
  var stackFrames: js.UndefOr[StackFrames] = js.native
  
  /**
    * The hash ID is used to conserve network bandwidth for duplicate stack traces within a single trace. Often multiple spans will have identical stack traces. The first occurrence of a
    * stack trace should contain both the `stackFrame` content and a value in `stackTraceHashId`. Subsequent spans within the same request can refer to that stack trace by only setting
    * `stackTraceHashId`.
    */
  var stackTraceHashId: js.UndefOr[String] = js.native
}
object StackTrace {
  
  @scala.inline
  def apply(): StackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackTrace]
  }
  
  @scala.inline
  implicit class StackTraceOps[Self <: StackTrace] (val x: Self) extends AnyVal {
    
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
    def setStackFrames(value: StackFrames): Self = this.set("stackFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackFrames: Self = this.set("stackFrames", js.undefined)
    
    @scala.inline
    def setStackTraceHashId(value: String): Self = this.set("stackTraceHashId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackTraceHashId: Self = this.set("stackTraceHashId", js.undefined)
  }
}
