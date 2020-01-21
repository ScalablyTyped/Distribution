package typings.materialUiCore.withWidthWithWidthMod

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithWidth extends js.Object {
  var width: Breakpoint = js.native
}

object WithWidth {
  @scala.inline
  def apply(width: Breakpoint): WithWidth = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithWidth]
  }
}

