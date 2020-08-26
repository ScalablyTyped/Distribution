package typings.karmaViewport.viewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportConfiguration extends js.Object {
  var breakpoints: js.Array[ViewportBreakpoint] = js.native
  var context: String = js.native
}

object ViewportConfiguration {
  @scala.inline
  def apply(breakpoints: js.Array[ViewportBreakpoint], context: String): ViewportConfiguration = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportConfiguration]
  }
  @scala.inline
  implicit class ViewportConfigurationOps[Self <: ViewportConfiguration] (val x: Self) extends AnyVal {
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
    def setBreakpointsVarargs(value: ViewportBreakpoint*): Self = this.set("breakpoints", js.Array(value :_*))
    @scala.inline
    def setBreakpoints(value: js.Array[ViewportBreakpoint]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
  }
  
}

