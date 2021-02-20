package typings.materializeCss.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<DropdownOptions> * / any */ @js.native
trait Dropdown extends StObject {
  
  /**
    * Close dropdown
    */
  def close(): Unit = js.native
  
  /**
    * The DOM element of the dropdown
    */
  var dropdownEl: Element = js.native
  
  /**
    * The index of the item focused
    */
  var focusedIndex: Double = js.native
  
  /**
    * ID of the dropdown element
    */
  var id: String = js.native
  
  /**
    * If the dropdown is open
    */
  var isOpen: Boolean = js.native
  
  /**
    * If the dropdown content is scrollable
    */
  var isScrollable: Boolean = js.native
  
  /**
    * Open dropdown
    */
  def open(): Unit = js.native
  
  /**
    * While dropdown is open, you can recalculate its dimensions if its contents have changed
    */
  def recalculateDimensions(): Unit = js.native
}
object Dropdown {
  
  @scala.inline
  def apply(
    close: () => Unit,
    dropdownEl: Element,
    focusedIndex: Double,
    id: String,
    isOpen: Boolean,
    isScrollable: Boolean,
    open: () => Unit,
    recalculateDimensions: () => Unit
  ): Dropdown = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dropdownEl = dropdownEl.asInstanceOf[js.Any], focusedIndex = focusedIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isScrollable = isScrollable.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), recalculateDimensions = js.Any.fromFunction0(recalculateDimensions))
    __obj.asInstanceOf[Dropdown]
  }
  
  @scala.inline
  implicit class DropdownMutableBuilder[Self <: Dropdown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDropdownEl(value: Element): Self = StObject.set(x, "dropdownEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedIndex(value: Double): Self = StObject.set(x, "focusedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrollable(value: Boolean): Self = StObject.set(x, "isScrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecalculateDimensions(value: () => Unit): Self = StObject.set(x, "recalculateDimensions", js.Any.fromFunction0(value))
  }
}
