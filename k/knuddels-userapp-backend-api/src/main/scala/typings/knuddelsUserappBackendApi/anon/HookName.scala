package typings.knuddelsUserappBackendApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookName extends StObject {
  
  var hookName: String
  
  var source: String
  
  var time: String
  
  var values: Calls
}
object HookName {
  
  inline def apply(hookName: String, source: String, time: String, values: Calls): HookName = {
    val __obj = js.Dynamic.literal(hookName = hookName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookName]
  }
  
  extension [Self <: HookName](x: Self) {
    
    inline def setHookName(value: String): Self = StObject.set(x, "hookName", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Calls): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
