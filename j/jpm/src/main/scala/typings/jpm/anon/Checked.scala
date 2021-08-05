package typings.jpm.anon

import typings.jpm.FFAddonSDK.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var badge: js.UndefOr[String | Double] = js.undefined
  
  var badgeColor: js.UndefOr[String] = js.undefined
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[Icon] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
}
object Checked {
  
  inline def apply(): Checked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checked]
  }
  
  extension [Self <: Checked](x: Self) {
    
    inline def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeColor(value: String): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
    
    inline def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
