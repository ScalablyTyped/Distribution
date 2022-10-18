package typings.materializeCss.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dropdown
  extends StObject
     with Component[DropdownOptions] {
  
  /**
    * Close dropdown
    */
  def close(): Unit
  
  /**
    * The DOM element of the dropdown
    */
  var dropdownEl: Element
  
  /**
    * The index of the item focused
    */
  var focusedIndex: Double
  
  /**
    * ID of the dropdown element
    */
  var id: String
  
  /**
    * If the dropdown is open
    */
  var isOpen: Boolean
  
  /**
    * If the dropdown content is scrollable
    */
  var isScrollable: Boolean
  
  /**
    * Open dropdown
    */
  def open(): Unit
  
  /**
    * While dropdown is open, you can recalculate its dimensions if its contents have changed
    */
  def recalculateDimensions(): Unit
}
object Dropdown {
  
  inline def apply(
    close: () => Unit,
    destroy: () => Unit,
    dropdownEl: Element,
    el: Element,
    focusedIndex: Double,
    id: String,
    isOpen: Boolean,
    isScrollable: Boolean,
    open: () => Unit,
    options: DropdownOptions,
    recalculateDimensions: () => Unit
  ): Dropdown = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), dropdownEl = dropdownEl.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], focusedIndex = focusedIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isScrollable = isScrollable.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), options = options.asInstanceOf[js.Any], recalculateDimensions = js.Any.fromFunction0(recalculateDimensions))
    __obj.asInstanceOf[Dropdown]
  }
  
  extension [Self <: Dropdown](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDropdownEl(value: Element): Self = StObject.set(x, "dropdownEl", value.asInstanceOf[js.Any])
    
    inline def setFocusedIndex(value: Double): Self = StObject.set(x, "focusedIndex", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsScrollable(value: Boolean): Self = StObject.set(x, "isScrollable", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setRecalculateDimensions(value: () => Unit): Self = StObject.set(x, "recalculateDimensions", js.Any.fromFunction0(value))
  }
}
