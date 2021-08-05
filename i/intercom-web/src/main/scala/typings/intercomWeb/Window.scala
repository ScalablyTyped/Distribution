package typings.intercomWeb

import typings.intercomWeb.Intercom.IntercomSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var intercomSettings: js.UndefOr[IntercomSettings] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setIntercomSettings(value: IntercomSettings): Self = StObject.set(x, "intercomSettings", value.asInstanceOf[js.Any])
    
    inline def setIntercomSettingsUndefined: Self = StObject.set(x, "intercomSettings", js.undefined)
  }
}
