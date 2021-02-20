package typings.griddleReact.mod.components

import typings.griddleReact.mod.GriddleComponent
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsWrapperProps extends StObject {
  
  var Settings: js.UndefOr[GriddleComponent[SettingsProps]] = js.native
  
  var SettingsToggle: js.UndefOr[GriddleComponent[SettingsToggleProps]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var isEnabled: js.UndefOr[Boolean] = js.native
  
  var isVisible: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object SettingsWrapperProps {
  
  @scala.inline
  def apply(): SettingsWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsWrapperProps]
  }
  
  @scala.inline
  implicit class SettingsWrapperPropsMutableBuilder[Self <: SettingsWrapperProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    @scala.inline
    def setSettings(value: GriddleComponent[SettingsProps]): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsToggle(value: GriddleComponent[SettingsToggleProps]): Self = StObject.set(x, "SettingsToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsToggleUndefined: Self = StObject.set(x, "SettingsToggle", js.undefined)
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
