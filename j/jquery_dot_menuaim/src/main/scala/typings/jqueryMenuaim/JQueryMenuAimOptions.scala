package typings.jqueryMenuaim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryMenuAimOptions extends StObject {
  
  /** Function to call when a row is purposefully activated. Use this
    * to show a submenu's content for the activated row.
    */
  var activate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Function to call when a row is deactivated.
    */
  var deactivate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Function to call when mouse enters a menu row. Entering a row
    * does not mean the row has been activated, as the user may be
    * mousing over to a submenu.
    */
  var enter: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Function to call when mouse exits a menu row.
    */
  var exit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Function to call when mouse exits the entire menu. If this returns
    * true, the current row's deactivation event and callback function
    * will be fired. Otherwise, if this isn't supplied or it returns
    * false, the currently activated row will stay activated when the
    * mouse leaves the menu entirely.
    */
  var exitMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Selector for identifying which elements in the menu are rows
    * that can trigger the above events. Defaults to "> li".
    * rowSelector: "> li",
    */
  var rowSelector: js.UndefOr[String] = js.undefined
  
  /** Direction the submenu opens relative to the main menu. This
    * controls which direction is "forgiving" as the user moves their
    * cursor from the main menu into the submenu. Can be one of "right",
    * "left", "above", or "below". Defaults to "right".
    * submenuDirection: "right"
    */
  var submenuDirection: js.UndefOr[String] = js.undefined
  
  /** You may have some menu rows that aren't submenus and therefore
    * shouldn't ever need to "activate." If so, filter submenu rows w/
    * this selector. Defaults to "*" (all elements).
    * submenuSelector: "*",
    */
  var submenuSelector: js.UndefOr[String] = js.undefined
}
object JQueryMenuAimOptions {
  
  inline def apply(): JQueryMenuAimOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryMenuAimOptions]
  }
  
  extension [Self <: JQueryMenuAimOptions](x: Self) {
    
    inline def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setDeactivate(value: () => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction0(value))
    
    inline def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    inline def setEnter(value: () => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: () => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
    
    inline def setExitMenu(value: () => Unit): Self = StObject.set(x, "exitMenu", js.Any.fromFunction0(value))
    
    inline def setExitMenuUndefined: Self = StObject.set(x, "exitMenu", js.undefined)
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setRowSelector(value: String): Self = StObject.set(x, "rowSelector", value.asInstanceOf[js.Any])
    
    inline def setRowSelectorUndefined: Self = StObject.set(x, "rowSelector", js.undefined)
    
    inline def setSubmenuDirection(value: String): Self = StObject.set(x, "submenuDirection", value.asInstanceOf[js.Any])
    
    inline def setSubmenuDirectionUndefined: Self = StObject.set(x, "submenuDirection", js.undefined)
    
    inline def setSubmenuSelector(value: String): Self = StObject.set(x, "submenuSelector", value.asInstanceOf[js.Any])
    
    inline def setSubmenuSelectorUndefined: Self = StObject.set(x, "submenuSelector", js.undefined)
  }
}
