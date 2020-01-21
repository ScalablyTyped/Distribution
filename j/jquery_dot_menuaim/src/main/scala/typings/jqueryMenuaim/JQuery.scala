package typings.jqueryMenuaim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /** Dropdown menus that can differentiate between a user trying hover over a dropdown item vs trying to navigate into a submenu's contents.
    * @author Ben Kamens
    * https://github.com/kamens/jQuery-menu-aim
    */
  def menuAim(options: JQueryMenuAimOptions): JQuery
}

object JQuery {
  @scala.inline
  def apply(menuAim: JQueryMenuAimOptions => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(menuAim = js.Any.fromFunction1(menuAim))
  
    __obj.asInstanceOf[JQuery]
  }
}

