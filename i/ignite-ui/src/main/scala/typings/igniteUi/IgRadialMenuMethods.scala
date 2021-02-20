package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgRadialMenuMethods extends StObject {
  
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
    * Destroys the widget.
    */
  def destroy(): Unit = js.native
  
  /**
    * Exports visual data from the radial menu to aid in unit testing
    */
  def exportVisualData(): Unit = js.native
  
  /**
    * Forces any pending deferred work to render on the radial menu before continuing
    */
  def flush(): Unit = js.native
  
  /**
    * Gets or sets the value of a property for the item created with the specified key
    *
    * @param itemKey The name of the item
    * @param key The name of the property/option
    * @param value The new value for the property or undefined to obtain the current value
    */
  def itemOption(itemKey: String, key: String, value: js.Object): js.Object = js.native
  
  /**
    * Notify the radial menu that style information used for rendering the menu may have been updated.
    */
  def styleUpdated(): Unit = js.native
}
object IgRadialMenuMethods {
  
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    destroy: () => Unit,
    exportVisualData: () => Unit,
    flush: () => Unit,
    itemOption: (String, String, js.Object) => js.Object,
    styleUpdated: () => Unit
  ): IgRadialMenuMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), itemOption = js.Any.fromFunction3(itemOption), styleUpdated = js.Any.fromFunction0(styleUpdated))
    __obj.asInstanceOf[IgRadialMenuMethods]
  }
  
  @scala.inline
  implicit class IgRadialMenuMethodsMutableBuilder[Self <: IgRadialMenuMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeLocale(value: js.Object => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportVisualData(value: () => Unit): Self = StObject.set(x, "exportVisualData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemOption(value: (String, String, js.Object) => js.Object): Self = StObject.set(x, "itemOption", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStyleUpdated(value: () => Unit): Self = StObject.set(x, "styleUpdated", js.Any.fromFunction0(value))
  }
}
