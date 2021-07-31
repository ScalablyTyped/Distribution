package typings.jpm.anon

import typings.jpm.FFAddonSDK.ActionButton
import typings.jpm.FFAddonSDK.ActionButtonState
import typings.jpm.FFAddonSDK.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Badge extends StObject {
  
  var badge: js.UndefOr[String | Double] = js.undefined
  
  var badgeColor: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icon: Icon
  
  var id: String
  
  var label: String
  
  var onChange: js.UndefOr[js.Function1[/* state */ ActionButtonState, js.Any]] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* state */ ActionButton, js.Any]] = js.undefined
}
object Badge {
  
  @scala.inline
  def apply(icon: Icon, id: String, label: String): Badge = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
  
  @scala.inline
  implicit class BadgeMutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeColor(value: String): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: /* state */ ActionButtonState => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* state */ ActionButton => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
