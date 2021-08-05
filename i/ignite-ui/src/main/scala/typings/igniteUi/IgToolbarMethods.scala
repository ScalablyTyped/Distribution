package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgToolbarMethods extends StObject {
  
  /**
    * Activate item matching provided index.
    *
    * @param index The index of the item.
    * @param activated The activate property value.
    */
  def activateItem(index: js.Object, activated: js.Object): Unit
  
  /**
    * Add item to widget item array
    *
    * @param item The item to be added.
    */
  def addItem(item: js.Object): Unit
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  
  def changeLocale(): Unit
  
  /**
    * Deactivate all buttons.
    */
  def deactivateAll(): Unit
  
  /**
    * Destroy the widget.
    */
  def destroy(): Unit
  
  /**
    * Disable item matching provided index.
    *
    * @param index The index of the item.
    * @param disabled The disabled property value.
    */
  def disableItem(index: js.Object, disabled: js.Object): Unit
  
  /**
    * Gets the item by matching the provided index.
    *
    * @param index The index of the item.
    */
  def getItem(index: js.Object): js.Object
  
  /**
    * Remove the item matching provided index.
    *
    * @param index The index of the item.
    */
  def removeItem(index: js.Object): js.Object
  
  /**
    * Returns the element on which the widget was instantiated
    */
  def widget(): Unit
}
object IgToolbarMethods {
  
  inline def apply(
    activateItem: (js.Object, js.Object) => Unit,
    addItem: js.Object => Unit,
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    deactivateAll: () => Unit,
    destroy: () => Unit,
    disableItem: (js.Object, js.Object) => Unit,
    getItem: js.Object => js.Object,
    removeItem: js.Object => js.Object,
    widget: () => Unit
  ): IgToolbarMethods = {
    val __obj = js.Dynamic.literal(activateItem = js.Any.fromFunction2(activateItem), addItem = js.Any.fromFunction1(addItem), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), deactivateAll = js.Any.fromFunction0(deactivateAll), destroy = js.Any.fromFunction0(destroy), disableItem = js.Any.fromFunction2(disableItem), getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgToolbarMethods]
  }
  
  extension [Self <: IgToolbarMethods](x: Self) {
    
    inline def setActivateItem(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "activateItem", js.Any.fromFunction2(value))
    
    inline def setAddItem(value: js.Object => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction1(value))
    
    inline def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    inline def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    inline def setChangeLocale(value: () => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction0(value))
    
    inline def setDeactivateAll(value: () => Unit): Self = StObject.set(x, "deactivateAll", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDisableItem(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "disableItem", js.Any.fromFunction2(value))
    
    inline def setGetItem(value: js.Object => js.Object): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setRemoveItem(value: js.Object => js.Object): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setWidget(value: () => Unit): Self = StObject.set(x, "widget", js.Any.fromFunction0(value))
  }
}
