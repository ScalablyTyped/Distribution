package typings.karmaViewport.viewportMod

import typings.karmaViewport.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewportBreakpoint extends js.Object {
  var name: String = js.native
  var size: Height = js.native
}

object ViewportBreakpoint {
  @scala.inline
  def apply(name: String, size: Height): ViewportBreakpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportBreakpoint]
  }
  @scala.inline
  implicit class ViewportBreakpointOps[Self <: ViewportBreakpoint] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Height): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

