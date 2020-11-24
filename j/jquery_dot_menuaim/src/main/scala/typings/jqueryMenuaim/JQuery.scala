package typings.jqueryMenuaim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  /** Dropdown menus that can differentiate between a user trying hover over a dropdown item vs trying to navigate into a submenu's contents.
    * @author Ben Kamens
    * https://github.com/kamens/jQuery-menu-aim
    */
  def menuAim(options: JQueryMenuAimOptions): JQuery = js.native
}
object JQuery {
  
  @scala.inline
  def apply(menuAim: JQueryMenuAimOptions => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(menuAim = js.Any.fromFunction1(menuAim))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    
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
    def setMenuAim(value: JQueryMenuAimOptions => JQuery): Self = this.set("menuAim", js.Any.fromFunction1(value))
  }
}
