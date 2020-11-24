package typings.jestEnvironmentJsdom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackTraceLimit extends js.Object {
  
  var stackTraceLimit: Double = js.native
}
object StackTraceLimit {
  
  @scala.inline
  def apply(stackTraceLimit: Double): StackTraceLimit = {
    val __obj = js.Dynamic.literal(stackTraceLimit = stackTraceLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTraceLimit]
  }
  
  @scala.inline
  implicit class StackTraceLimitOps[Self <: StackTraceLimit] (val x: Self) extends AnyVal {
    
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
    def setStackTraceLimit(value: Double): Self = this.set("stackTraceLimit", value.asInstanceOf[js.Any])
  }
}
