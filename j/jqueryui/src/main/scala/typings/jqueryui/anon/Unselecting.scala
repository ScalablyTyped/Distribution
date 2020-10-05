package typings.jqueryui.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unselecting extends js.Object {
  var unselecting: Element = js.native
}

object Unselecting {
  @scala.inline
  def apply(unselecting: Element): Unselecting = {
    val __obj = js.Dynamic.literal(unselecting = unselecting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unselecting]
  }
  @scala.inline
  implicit class UnselectingOps[Self <: Unselecting] (val x: Self) extends AnyVal {
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
    def setUnselecting(value: Element): Self = this.set("unselecting", value.asInstanceOf[js.Any])
  }
  
}

