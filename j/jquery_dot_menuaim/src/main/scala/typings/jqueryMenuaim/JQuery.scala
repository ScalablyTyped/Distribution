package typings.jqueryMenuaim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
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
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMenuAim(value: JQueryMenuAimOptions => JQuery): Self = StObject.set(x, "menuAim", js.Any.fromFunction1(value))
  }
}
