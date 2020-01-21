package typings.materialUiCore.withMobileDialogWithMobileDialogMod

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

