package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLauncher extends StObject {
  
  var base: String
  
  var browserName: js.UndefOr[String] = js.undefined
  
  var flags: js.UndefOr[js.Array[String]] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
}
object CustomLauncher {
  
  inline def apply(base: String): CustomLauncher = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLauncher]
  }
  
  extension [Self <: CustomLauncher](x: Self) {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    inline def setBrowserNameUndefined: Self = StObject.set(x, "browserName", js.undefined)
    
    inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
