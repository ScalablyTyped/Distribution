package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotViewMethods extends js.Object {
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit = js.native
  
  /**
    * Returns the igPivotDataSelector instance of the pivot view.
    */
  def dataSelector(): js.Object = js.native
  
  /**
    * Destroy is part of the jQuery UI widget API and does the following:
    * 1. Remove custom CSS classes that were added.
    * 2. Unwrap any wrapping elements such as scrolling divs and other containers.
    * 3. Unbind all events that were bound.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the igPivotGrid instance of the pivot view.
    */
  def pivotGrid(): js.Object = js.native
  
  /**
    * Returns the igSplitter instance used to separate the pivot grid and the data selector.
    */
  def splitter(): js.Object = js.native
}
object IgPivotViewMethods {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IgPivotViewMethodsOps[Self <: IgPivotViewMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = this.set("changeGlobalLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = this.set("changeGlobalRegional", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeLocale(value: js.Object => Unit): Self = this.set("changeLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataSelector(value: () => js.Object): Self = this.set("dataSelector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPivotGrid(value: () => js.Object): Self = this.set("pivotGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSplitter(value: () => js.Object): Self = this.set("splitter", js.Any.fromFunction0(value))
  }
}
