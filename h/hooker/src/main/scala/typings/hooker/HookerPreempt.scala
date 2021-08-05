package typings.hooker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookerPreempt
  extends StObject
     with IHookerPreHookResult {
  
  var value: js.Any
}
object HookerPreempt {
  
  inline def apply(value: js.Any): HookerPreempt = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookerPreempt]
  }
  
  extension [Self <: HookerPreempt](x: Self) {
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
