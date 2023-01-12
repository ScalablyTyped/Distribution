package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options_ extends StObject {
  
  var createChildContextWithAs: Boolean
  
  var deferUpdates: Boolean
  
  var foreachHidesDestroyed: Boolean
  
  var useOnlyNativeEvents: Boolean
}
object Options_ {
  
  inline def apply(
    createChildContextWithAs: Boolean,
    deferUpdates: Boolean,
    foreachHidesDestroyed: Boolean,
    useOnlyNativeEvents: Boolean
  ): Options_ = {
    val __obj = js.Dynamic.literal(createChildContextWithAs = createChildContextWithAs.asInstanceOf[js.Any], deferUpdates = deferUpdates.asInstanceOf[js.Any], foreachHidesDestroyed = foreachHidesDestroyed.asInstanceOf[js.Any], useOnlyNativeEvents = useOnlyNativeEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options_] (val x: Self) extends AnyVal {
    
    inline def setCreateChildContextWithAs(value: Boolean): Self = StObject.set(x, "createChildContextWithAs", value.asInstanceOf[js.Any])
    
    inline def setDeferUpdates(value: Boolean): Self = StObject.set(x, "deferUpdates", value.asInstanceOf[js.Any])
    
    inline def setForeachHidesDestroyed(value: Boolean): Self = StObject.set(x, "foreachHidesDestroyed", value.asInstanceOf[js.Any])
    
    inline def setUseOnlyNativeEvents(value: Boolean): Self = StObject.set(x, "useOnlyNativeEvents", value.asInstanceOf[js.Any])
  }
}
