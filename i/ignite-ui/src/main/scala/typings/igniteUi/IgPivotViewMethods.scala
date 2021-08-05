package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotViewMethods extends StObject {
  
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
    * Returns the igPivotDataSelector instance of the pivot view.
    */
  def dataSelector(): js.Object
  
  /**
    * Destroy is part of the jQuery UI widget API and does the following:
    * 1. Remove custom CSS classes that were added.
    * 2. Unwrap any wrapping elements such as scrolling divs and other containers.
    * 3. Unbind all events that were bound.
    */
  def destroy(): Unit
  
  /**
    * Returns the igPivotGrid instance of the pivot view.
    */
  def pivotGrid(): js.Object
  
  /**
    * Returns the igSplitter instance used to separate the pivot grid and the data selector.
    */
  def splitter(): js.Object
}
object IgPivotViewMethods {
  
  inline def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    dataSelector: () => js.Object,
    destroy: () => Unit,
    pivotGrid: () => js.Object,
    splitter: () => js.Object
  ): IgPivotViewMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), dataSelector = js.Any.fromFunction0(dataSelector), destroy = js.Any.fromFunction0(destroy), pivotGrid = js.Any.fromFunction0(pivotGrid), splitter = js.Any.fromFunction0(splitter))
    __obj.asInstanceOf[IgPivotViewMethods]
  }
  
  extension [Self <: IgPivotViewMethods](x: Self) {
    
    inline def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    inline def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    inline def setChangeLocale(value: js.Object => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1(value))
    
    inline def setDataSelector(value: () => js.Object): Self = StObject.set(x, "dataSelector", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setPivotGrid(value: () => js.Object): Self = StObject.set(x, "pivotGrid", js.Any.fromFunction0(value))
    
    inline def setSplitter(value: () => js.Object): Self = StObject.set(x, "splitter", js.Any.fromFunction0(value))
  }
}
