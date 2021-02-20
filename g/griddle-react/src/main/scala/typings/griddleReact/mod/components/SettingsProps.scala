package typings.griddleReact.mod.components

import typings.griddleReact.mod.GriddleComponent
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var settingsComponents: js.UndefOr[js.Array[GriddleComponent[_]]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object SettingsProps {
  
  @scala.inline
  def apply(): SettingsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsProps]
  }
  
  @scala.inline
  implicit class SettingsPropsMutableBuilder[Self <: SettingsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setSettingsComponents(value: js.Array[GriddleComponent[_]]): Self = StObject.set(x, "settingsComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsComponentsUndefined: Self = StObject.set(x, "settingsComponents", js.undefined)
    
    @scala.inline
    def setSettingsComponentsVarargs(value: GriddleComponent[js.Any]*): Self = StObject.set(x, "settingsComponents", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
