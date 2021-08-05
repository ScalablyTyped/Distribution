package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthSettings extends StObject {
  
  var access: js.UndefOr[js.Array[AccessSetting]] = js.undefined
  
  var mode: AuthMode
  
  var strategies: js.Array[String]
}
object AuthSettings {
  
  inline def apply(mode: AuthMode, strategies: js.Array[String]): AuthSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], strategies = strategies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSettings]
  }
  
  extension [Self <: AuthSettings](x: Self) {
    
    inline def setAccess(value: js.Array[AccessSetting]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setAccessVarargs(value: AccessSetting*): Self = StObject.set(x, "access", js.Array(value :_*))
    
    inline def setMode(value: AuthMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setStrategies(value: js.Array[String]): Self = StObject.set(x, "strategies", value.asInstanceOf[js.Any])
    
    inline def setStrategiesVarargs(value: String*): Self = StObject.set(x, "strategies", js.Array(value :_*))
  }
}
