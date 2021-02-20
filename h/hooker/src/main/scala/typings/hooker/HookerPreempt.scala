package typings.hooker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookerPreempt extends IHookerPreHookResult {
  
  var value: js.Any = js.native
}
object HookerPreempt {
  
  @scala.inline
  def apply(value: js.Any): HookerPreempt = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookerPreempt]
  }
  
  @scala.inline
  implicit class HookerPreemptMutableBuilder[Self <: HookerPreempt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
