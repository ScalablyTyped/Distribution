package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RESTDataSourceSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Settings related to REST compliant update routine
    */
  var restSettings: js.UndefOr[RESTDataSourceSettingsRestSettings] = js.undefined
}
object RESTDataSourceSettings {
  
  inline def apply(): RESTDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RESTDataSourceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RESTDataSourceSettings] (val x: Self) extends AnyVal {
    
    inline def setRestSettings(value: RESTDataSourceSettingsRestSettings): Self = StObject.set(x, "restSettings", value.asInstanceOf[js.Any])
    
    inline def setRestSettingsUndefined: Self = StObject.set(x, "restSettings", js.undefined)
  }
}
