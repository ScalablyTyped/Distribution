package typings.griddleReact.mod.components

import typings.griddleReact.mod.GriddleComponent
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var settingsComponents: js.UndefOr[js.Array[GriddleComponent[Any]]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object SettingsProps {
  
  inline def apply(): SettingsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsProps]
  }
  
  extension [Self <: SettingsProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setSettingsComponents(value: js.Array[GriddleComponent[Any]]): Self = StObject.set(x, "settingsComponents", value.asInstanceOf[js.Any])
    
    inline def setSettingsComponentsUndefined: Self = StObject.set(x, "settingsComponents", js.undefined)
    
    inline def setSettingsComponentsVarargs(value: GriddleComponent[Any]*): Self = StObject.set(x, "settingsComponents", js.Array(value*))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
