package typings.jestMessageUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackTraceOptions extends js.Object {
  
  var noStackTrace: Boolean = js.native
}
object StackTraceOptions {
  
  @scala.inline
  def apply(noStackTrace: Boolean): StackTraceOptions = {
    val __obj = js.Dynamic.literal(noStackTrace = noStackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTraceOptions]
  }
  
  @scala.inline
  implicit class StackTraceOptionsOps[Self <: StackTraceOptions] (val x: Self) extends AnyVal {
    
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
    def setNoStackTrace(value: Boolean): Self = this.set("noStackTrace", value.asInstanceOf[js.Any])
  }
}
