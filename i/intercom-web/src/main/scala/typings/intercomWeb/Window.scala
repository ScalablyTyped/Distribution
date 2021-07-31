package typings.intercomWeb

import typings.intercomWeb.Intercom.IntercomSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var intercomSettings: js.UndefOr[IntercomSettings] = js.undefined
}
object Window {
  
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntercomSettings(value: IntercomSettings): Self = StObject.set(x, "intercomSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntercomSettingsUndefined: Self = StObject.set(x, "intercomSettings", js.undefined)
  }
}
