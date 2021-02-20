package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RESTDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Settings related to REST compliant update routine
    */
  var restSettings: js.UndefOr[RESTDataSourceSettingsRestSettings] = js.native
}
object RESTDataSourceSettings {
  
  @scala.inline
  def apply(): RESTDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RESTDataSourceSettings]
  }
  
  @scala.inline
  implicit class RESTDataSourceSettingsMutableBuilder[Self <: RESTDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestSettings(value: RESTDataSourceSettingsRestSettings): Self = StObject.set(x, "restSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestSettingsUndefined: Self = StObject.set(x, "restSettings", js.undefined)
  }
}
