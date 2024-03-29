package typings.hooker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookerOverride
  extends StObject
     with IHookerPostHookResult
     with IHookerPreHookResult {
  
  var value: Any
}
object HookerOverride {
  
  inline def apply(value: Any): HookerOverride = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookerOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HookerOverride] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
