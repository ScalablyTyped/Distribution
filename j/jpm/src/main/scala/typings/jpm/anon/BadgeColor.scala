package typings.jpm.anon

import typings.jpm.FFAddonSDK.Icon
import typings.jpm.FFAddonSDK.ToggleButtonState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeColor extends StObject {
  
  var badge: js.UndefOr[String | Double] = js.undefined
  
  var badgeColor: js.UndefOr[String] = js.undefined
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icon: Icon
  
  var id: String
  
  var label: String
  
  var onChange: js.UndefOr[js.Function1[/* state */ ToggleButtonState, js.Any]] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* state */ ToggleButtonState, js.Any]] = js.undefined
}
object BadgeColor {
  
  inline def apply(icon: Icon, id: String, label: String): BadgeColor = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeColor]
  }
  
  extension [Self <: BadgeColor](x: Self) {
    
    inline def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeColor(value: String): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
    
    inline def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: /* state */ ToggleButtonState => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: /* state */ ToggleButtonState => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
