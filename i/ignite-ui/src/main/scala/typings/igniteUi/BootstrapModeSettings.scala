package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapModeSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  var key: js.UndefOr[String] = js.undefined
  
  var visibilityTester: js.UndefOr[Any] = js.undefined
}
object BootstrapModeSettings {
  
  inline def apply(): BootstrapModeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapModeSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapModeSettings] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setVisibilityTester(value: Any): Self = StObject.set(x, "visibilityTester", value.asInstanceOf[js.Any])
    
    inline def setVisibilityTesterUndefined: Self = StObject.set(x, "visibilityTester", js.undefined)
  }
}
