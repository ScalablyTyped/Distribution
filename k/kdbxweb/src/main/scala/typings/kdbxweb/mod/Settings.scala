package typings.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var binaries: js.UndefOr[Boolean] = js.undefined
  
  var customIcons: js.UndefOr[Boolean] = js.undefined
  
  var historyRules: js.UndefOr[Boolean] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setBinaries(value: Boolean): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
    
    inline def setBinariesUndefined: Self = StObject.set(x, "binaries", js.undefined)
    
    inline def setCustomIcons(value: Boolean): Self = StObject.set(x, "customIcons", value.asInstanceOf[js.Any])
    
    inline def setCustomIconsUndefined: Self = StObject.set(x, "customIcons", js.undefined)
    
    inline def setHistoryRules(value: Boolean): Self = StObject.set(x, "historyRules", value.asInstanceOf[js.Any])
    
    inline def setHistoryRulesUndefined: Self = StObject.set(x, "historyRules", js.undefined)
  }
}
