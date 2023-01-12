package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridRowSelectorsMethods extends StObject {
  
  /**
    * Changes the check state of a row by index to specified value
    *
    * @param index Row index
    * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
    */
  def changeCheckState(index: Double, toCheck: Boolean): Unit
  
  /**
    * Change the check state of a row by row id
    *
    * @param rowId Row Id
    * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
    */
  def changeCheckStateById(rowId: js.Object, toCheck: Boolean): Unit
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igtreegridrowselectors#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igtreegridrowselectors#options:language) or [locale](ui.igtreegridrowselectors#options:locale) option setter
    */
  def changeLocale(): Unit
  
  /**
    * Returns the check state of the row by id.
    *
    * @param rowId
    */
  def checkStateById(rowId: js.Object): String
  
  /**
    * Gets an array of all the checked rows. Every object from the array has the following format { element: , id: , index: }
    */
  def checkedRows(): js.Array[Any]
  
  def destroy(): Unit
  
  /**
    * Gets an array of all the partially checked rows. Every object from the array has the following format { element: , id: , index: }
    */
  def partiallyCheckedRows(): js.Array[Any]
  
  def rsRenderColgroup(): Unit
  
  /**
    * Toggles the check state of a row by index
    *
    * @param index Row index
    */
  def toggleCheckState(index: Double): Unit
  
  /**
    * Toggles the check state of a row by row id
    *
    * @param rowId Row Id
    */
  def toggleCheckStateById(rowId: js.Object): Unit
  
  /**
    * Gets an array of all the unchecked rows. Every object from the array has the following format { element: , id: , index: }
    */
  def uncheckedRows(): js.Array[Any]
}
object IgTreeGridRowSelectorsMethods {
  
  inline def apply(
    changeCheckState: (Double, Boolean) => Unit,
    changeCheckStateById: (js.Object, Boolean) => Unit,
    changeLocale: () => Unit,
    checkStateById: js.Object => String,
    checkedRows: () => js.Array[Any],
    destroy: () => Unit,
    partiallyCheckedRows: () => js.Array[Any],
    rsRenderColgroup: () => Unit,
    toggleCheckState: Double => Unit,
    toggleCheckStateById: js.Object => Unit,
    uncheckedRows: () => js.Array[Any]
  ): IgTreeGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal(changeCheckState = js.Any.fromFunction2(changeCheckState), changeCheckStateById = js.Any.fromFunction2(changeCheckStateById), changeLocale = js.Any.fromFunction0(changeLocale), checkStateById = js.Any.fromFunction1(checkStateById), checkedRows = js.Any.fromFunction0(checkedRows), destroy = js.Any.fromFunction0(destroy), partiallyCheckedRows = js.Any.fromFunction0(partiallyCheckedRows), rsRenderColgroup = js.Any.fromFunction0(rsRenderColgroup), toggleCheckState = js.Any.fromFunction1(toggleCheckState), toggleCheckStateById = js.Any.fromFunction1(toggleCheckStateById), uncheckedRows = js.Any.fromFunction0(uncheckedRows))
    __obj.asInstanceOf[IgTreeGridRowSelectorsMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgTreeGridRowSelectorsMethods] (val x: Self) extends AnyVal {
    
    inline def setChangeCheckState(value: (Double, Boolean) => Unit): Self = StObject.set(x, "changeCheckState", js.Any.fromFunction2(value))
    
    inline def setChangeCheckStateById(value: (js.Object, Boolean) => Unit): Self = StObject.set(x, "changeCheckStateById", js.Any.fromFunction2(value))
    
    inline def setChangeLocale(value: () => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction0(value))
    
    inline def setCheckStateById(value: js.Object => String): Self = StObject.set(x, "checkStateById", js.Any.fromFunction1(value))
    
    inline def setCheckedRows(value: () => js.Array[Any]): Self = StObject.set(x, "checkedRows", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setPartiallyCheckedRows(value: () => js.Array[Any]): Self = StObject.set(x, "partiallyCheckedRows", js.Any.fromFunction0(value))
    
    inline def setRsRenderColgroup(value: () => Unit): Self = StObject.set(x, "rsRenderColgroup", js.Any.fromFunction0(value))
    
    inline def setToggleCheckState(value: Double => Unit): Self = StObject.set(x, "toggleCheckState", js.Any.fromFunction1(value))
    
    inline def setToggleCheckStateById(value: js.Object => Unit): Self = StObject.set(x, "toggleCheckStateById", js.Any.fromFunction1(value))
    
    inline def setUncheckedRows(value: () => js.Array[Any]): Self = StObject.set(x, "uncheckedRows", js.Any.fromFunction0(value))
  }
}
