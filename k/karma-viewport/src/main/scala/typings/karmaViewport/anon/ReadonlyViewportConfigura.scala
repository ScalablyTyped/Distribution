package typings.karmaViewport.anon

import typings.karmaViewport.viewportMod.ViewportBreakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<karma-viewport.karma-viewport/dist/adapter/viewport.ViewportConfiguration> */
@js.native
trait ReadonlyViewportConfigura extends js.Object {
  val breakpoints: js.Array[ViewportBreakpoint] = js.native
  val context: String = js.native
}

object ReadonlyViewportConfigura {
  @scala.inline
  def apply(breakpoints: js.Array[ViewportBreakpoint], context: String): ReadonlyViewportConfigura = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyViewportConfigura]
  }
  @scala.inline
  implicit class ReadonlyViewportConfiguraOps[Self <: ReadonlyViewportConfigura] (val x: Self) extends AnyVal {
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

