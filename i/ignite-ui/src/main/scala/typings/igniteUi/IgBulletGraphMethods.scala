package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgBulletGraphMethods extends StObject {
  
  /**
    * Adds a new range to the bullet graph.
    *
    * @param value The range object to be added.
    */
  def addRange(value: js.Object): Unit
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit
  
  /**
    * Destroys widget.
    */
  def destroy(): Unit
  
  /**
    * Returns information about how the bullet graph is rendered.
    */
  def exportVisualData(): js.Object
  
  /**
    * Causes all pending changes of the bullet graph e.g. by changed property values to be rendered immediately.
    */
  def flush(): Unit
  
  /**
    * Returns a string containing the names of all the ranges delimited with a \n symbol.
    */
  def getRangeNames(): Unit
  
  /**
    * Removes a range from the bullet graph.
    *
    * @param value A JS object with properties set as follows: name: nameOfTheRangeToRemove, remove: true
    */
  def removeRange(value: js.Object): Unit
  
  /**
    * Re-polls the css styles for the widget. Use this method when the css styles have been modified.
    */
  def styleUpdated(): Unit
  
  /**
    * Updates the specified range of the bullet graph.
    *
    * @param value The range object to be updated.
    */
  def updateRange(value: js.Object): Unit
}
object IgBulletGraphMethods {
  
  @scala.inline
  def apply(
    addRange: js.Object => Unit,
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    destroy: () => Unit,
    exportVisualData: () => js.Object,
    flush: () => Unit,
    getRangeNames: () => Unit,
    removeRange: js.Object => Unit,
    styleUpdated: () => Unit,
    updateRange: js.Object => Unit
  ): IgBulletGraphMethods = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), getRangeNames = js.Any.fromFunction0(getRangeNames), removeRange = js.Any.fromFunction1(removeRange), styleUpdated = js.Any.fromFunction0(styleUpdated), updateRange = js.Any.fromFunction1(updateRange))
    __obj.asInstanceOf[IgBulletGraphMethods]
  }
  
  @scala.inline
  implicit class IgBulletGraphMethodsMutableBuilder[Self <: IgBulletGraphMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRange(value: js.Object => Unit): Self = StObject.set(x, "addRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeLocale(value: js.Object => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportVisualData(value: () => js.Object): Self = StObject.set(x, "exportVisualData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRangeNames(value: () => Unit): Self = StObject.set(x, "getRangeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveRange(value: js.Object => Unit): Self = StObject.set(x, "removeRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyleUpdated(value: () => Unit): Self = StObject.set(x, "styleUpdated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateRange(value: js.Object => Unit): Self = StObject.set(x, "updateRange", js.Any.fromFunction1(value))
  }
}
