package typings.griddleReact.mod.components

import typings.griddleReact.mod.GriddleComponent
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsWrapperProps extends StObject {
  
  var Settings: js.UndefOr[GriddleComponent[SettingsProps]] = js.undefined
  
  var SettingsToggle: js.UndefOr[GriddleComponent[SettingsToggleProps]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  
  var isVisible: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object SettingsWrapperProps {
  
  inline def apply(): SettingsWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsWrapperProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettingsWrapperProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setSettings(value: GriddleComponent[SettingsProps]): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsToggle(value: GriddleComponent[SettingsToggleProps]): Self = StObject.set(x, "SettingsToggle", value.asInstanceOf[js.Any])
    
    inline def setSettingsToggleUndefined: Self = StObject.set(x, "SettingsToggle", js.undefined)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
