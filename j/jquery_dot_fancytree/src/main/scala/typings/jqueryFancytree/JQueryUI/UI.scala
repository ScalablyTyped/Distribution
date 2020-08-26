package typings.jqueryFancytree.JQueryUI

import typings.jqueryFancytree.Fancytree.FancytreeStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UI extends js.Object {
  var fancytree: FancytreeStatic = js.native
}

object UI {
  @scala.inline
  def apply(fancytree: FancytreeStatic): UI = {
    val __obj = js.Dynamic.literal(fancytree = fancytree.asInstanceOf[js.Any])
    __obj.asInstanceOf[UI]
  }
  @scala.inline
  implicit class UIOps[Self <: UI] (val x: Self) extends AnyVal {
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
    def setFancytree(value: FancytreeStatic): Self = this.set("fancytree", value.asInstanceOf[js.Any])
  }
  
}

