package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSplitterMethods extends StObject {
  
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
    * Collapse the specified panel.
    *
    * @param index Specifies the index of the panel to collapse.
    */
  def collapseAt(index: js.Object): Unit
  
  /**
    * Destroys the igSplitter widget
    */
  def destroy(): Unit
  
  /**
    * Expand the specified panel by index.
    *
    * @param index Specifies the index of the panel to expand.
    */
  def expandAt(index: js.Object): Unit
  
  /**
    * Retrieves the jQuery element of the first panel.
    */
  def firstPanel(): js.Object
  
  /**
    * Refresh splitter layout, use this method to re-render the splitter if some changes to the layout are applied.
    */
  def refreshLayout(): Unit
  
  /**
    * Retrieves the jQuery element of the second panel.
    */
  def secondPanel(): js.Object
  
  /**
    * You can set new size of the first panel after the splitter is rendered.
    *
    * @param size Specifies the new size of the first panel.
    */
  def setFirstPanelSize(size: js.Object): Unit
  
  /**
    * You can set new size of the second panel after the splitter is rendered.
    *
    * @param size Specifies the new size of the second panel.
    */
  def setSecondPanelSize(size: js.Object): Unit
  
  /**
    * Returns the element that represents this widget.
    */
  def widget(): js.Object
}
object IgSplitterMethods {
  
  inline def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    collapseAt: js.Object => Unit,
    destroy: () => Unit,
    expandAt: js.Object => Unit,
    firstPanel: () => js.Object,
    refreshLayout: () => Unit,
    secondPanel: () => js.Object,
    setFirstPanelSize: js.Object => Unit,
    setSecondPanelSize: js.Object => Unit,
    widget: () => js.Object
  ): IgSplitterMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), collapseAt = js.Any.fromFunction1(collapseAt), destroy = js.Any.fromFunction0(destroy), expandAt = js.Any.fromFunction1(expandAt), firstPanel = js.Any.fromFunction0(firstPanel), refreshLayout = js.Any.fromFunction0(refreshLayout), secondPanel = js.Any.fromFunction0(secondPanel), setFirstPanelSize = js.Any.fromFunction1(setFirstPanelSize), setSecondPanelSize = js.Any.fromFunction1(setSecondPanelSize), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgSplitterMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgSplitterMethods] (val x: Self) extends AnyVal {
    
    inline def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    inline def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    inline def setChangeLocale(value: js.Object => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1(value))
    
    inline def setCollapseAt(value: js.Object => Unit): Self = StObject.set(x, "collapseAt", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setExpandAt(value: js.Object => Unit): Self = StObject.set(x, "expandAt", js.Any.fromFunction1(value))
    
    inline def setFirstPanel(value: () => js.Object): Self = StObject.set(x, "firstPanel", js.Any.fromFunction0(value))
    
    inline def setRefreshLayout(value: () => Unit): Self = StObject.set(x, "refreshLayout", js.Any.fromFunction0(value))
    
    inline def setSecondPanel(value: () => js.Object): Self = StObject.set(x, "secondPanel", js.Any.fromFunction0(value))
    
    inline def setSetFirstPanelSize(value: js.Object => Unit): Self = StObject.set(x, "setFirstPanelSize", js.Any.fromFunction1(value))
    
    inline def setSetSecondPanelSize(value: js.Object => Unit): Self = StObject.set(x, "setSecondPanelSize", js.Any.fromFunction1(value))
    
    inline def setWidget(value: () => js.Object): Self = StObject.set(x, "widget", js.Any.fromFunction0(value))
  }
}
