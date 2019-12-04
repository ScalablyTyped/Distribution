package typings.atIonicCore.distTypesComponentsHeaderHeaderDotUtilsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderIndex extends js.Object {
  var el: HTMLElement
  var toolbars: js.Array[js.Any | ToolbarIndex]
}

object HeaderIndex {
  @scala.inline
  def apply(el: HTMLElement, toolbars: js.Array[js.Any | ToolbarIndex]): HeaderIndex = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], toolbars = toolbars.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderIndex]
  }
}

