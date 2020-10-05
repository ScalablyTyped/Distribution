package typings.materialUiCore.withMobileDialogWithMobileDialogMod

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithMobileDialogOptions extends js.Object {
  var breakpoint: Breakpoint = js.native
}

object WithMobileDialogOptions {
  @scala.inline
  def apply(breakpoint: Breakpoint): WithMobileDialogOptions = {
    val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithMobileDialogOptions]
  }
  @scala.inline
  implicit class WithMobileDialogOptionsOps[Self <: WithMobileDialogOptions] (val x: Self) extends AnyVal {
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
    def setBreakpoint(value: Breakpoint): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
  }
  
}

