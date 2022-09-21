package typings.lodash.mod

import typings.lodash.lodashBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebounceSettingsLeading
  extends StObject
     with DebounceSettings {
  
  @JSName("leading")
  var leading_DebounceSettingsLeading: `true`
}
object DebounceSettingsLeading {
  
  inline def apply(): DebounceSettingsLeading = {
    val __obj = js.Dynamic.literal(leading = true)
    __obj.asInstanceOf[DebounceSettingsLeading]
  }
  
  extension [Self <: DebounceSettingsLeading](x: Self) {
    
    inline def setLeading(value: `true`): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
  }
}
