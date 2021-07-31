package typings.hooker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HookerOverride
  extends StObject
     with IHookerPostHookResult
     with IHookerPreHookResult {
  
  var value: js.Any
}
object HookerOverride {
  
  @scala.inline
  def apply(value: js.Any): HookerOverride = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookerOverride]
  }
  
  @scala.inline
  implicit class HookerOverrideMutableBuilder[Self <: HookerOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
