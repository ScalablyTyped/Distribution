package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockToolsGuiOptions extends StObject {
  
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * toolbar items. Each name refers to a unique key from the definitions
    * object.
    */
  var buttons: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * (Highstock) A CSS class name to apply to the stocktools' div, allowing
    * unique CSS styling for each chart.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) An options object of the buttons definitions. Each name
    * refers to unique key from buttons array.
    */
  var definitions: js.UndefOr[StockToolsGuiDefinitionsOptions] = js.undefined
  
  /**
    * (Highstock) Enable or disable the stockTools gui.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) A CSS class name to apply to the container of buttons,
    * allowing unique CSS styling for each chart.
    */
  var toolbarClassName: js.UndefOr[String] = js.undefined
}
object StockToolsGuiOptions {
  
  inline def apply(): StockToolsGuiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiOptions]
  }
  
  extension [Self <: StockToolsGuiOptions](x: Self) {
    
    inline def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefinitions(value: StockToolsGuiDefinitionsOptions): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setToolbarClassName(value: String): Self = StObject.set(x, "toolbarClassName", value.asInstanceOf[js.Any])
    
    inline def setToolbarClassNameUndefined: Self = StObject.set(x, "toolbarClassName", js.undefined)
  }
}
