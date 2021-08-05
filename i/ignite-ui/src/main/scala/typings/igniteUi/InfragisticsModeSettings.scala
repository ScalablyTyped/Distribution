package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfragisticsModeSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var key: js.UndefOr[String] = js.undefined
  
  var visibilityTester: js.UndefOr[js.Any] = js.undefined
}
object InfragisticsModeSettings {
  
  inline def apply(): InfragisticsModeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfragisticsModeSettings]
  }
  
  extension [Self <: InfragisticsModeSettings](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setVisibilityTester(value: js.Any): Self = StObject.set(x, "visibilityTester", value.asInstanceOf[js.Any])
    
    inline def setVisibilityTesterUndefined: Self = StObject.set(x, "visibilityTester", js.undefined)
  }
}
