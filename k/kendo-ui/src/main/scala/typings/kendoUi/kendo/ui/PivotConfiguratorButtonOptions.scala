package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotConfiguratorButtonOptions extends StObject {
  
  var configurator: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PivotConfiguratorButtonOptions {
  
  inline def apply(): PivotConfiguratorButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotConfiguratorButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setConfigurator(value: String): Self = StObject.set(x, "configurator", value.asInstanceOf[js.Any])
    
    inline def setConfiguratorUndefined: Self = StObject.set(x, "configurator", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
