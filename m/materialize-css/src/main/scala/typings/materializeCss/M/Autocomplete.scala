package typings.materializeCss.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<AutocompleteOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ trait Autocomplete extends StObject {
  
  /**
    * Index of the current selected option.
    */
  var activeIndex: Double
  
  /**
    * Hide autocomplete.
    */
  def close(): Unit
  
  /**
    * Number of matching autocomplete options.
    */
  var count: Double
  
  /**
    * If the autocomplete is open.
    */
  var isOpen: Boolean
  
  /**
    * Show autocomplete.
    */
  def open(): Unit
  
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  def selectOption(el: Element): Unit
  
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  def updateData(data: AutocompleteData): Unit
}
object Autocomplete {
  
  @scala.inline
  def apply(
    activeIndex: Double,
    close: () => Unit,
    count: Double,
    isOpen: Boolean,
    open: () => Unit,
    selectOption: Element => Unit,
    updateData: AutocompleteData => Unit
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), count = count.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), selectOption = js.Any.fromFunction1(selectOption), updateData = js.Any.fromFunction1(updateData))
    __obj.asInstanceOf[Autocomplete]
  }
  
  @scala.inline
  implicit class AutocompleteMutableBuilder[Self <: Autocomplete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectOption(value: Element => Unit): Self = StObject.set(x, "selectOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateData(value: AutocompleteData => Unit): Self = StObject.set(x, "updateData", js.Any.fromFunction1(value))
  }
}
