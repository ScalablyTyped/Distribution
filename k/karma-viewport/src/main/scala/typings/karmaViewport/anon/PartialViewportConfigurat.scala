package typings.karmaViewport.anon

import typings.karmaViewport.viewportMod.ViewportBreakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<karma-viewport.karma-viewport/dist/adapter/viewport.ViewportConfiguration> */
@js.native
trait PartialViewportConfigurat extends js.Object {
  
  var breakpoints: js.UndefOr[js.Array[ViewportBreakpoint]] = js.native
  
  var context: js.UndefOr[String] = js.native
}
object PartialViewportConfigurat {
  
  @scala.inline
  def apply(): PartialViewportConfigurat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialViewportConfigurat]
  }
  
  @scala.inline
  implicit class PartialViewportConfiguratOps[Self <: PartialViewportConfigurat] (val x: Self) extends AnyVal {
    
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
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
}
