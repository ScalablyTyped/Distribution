package typings.hooker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookerFilter extends IHookerPreHookResult {
  
  var args: js.Array[_] = js.native
  
  var context: js.Any = js.native
}
object HookerFilter {
  
  @scala.inline
  def apply(args: js.Array[_], context: js.Any): HookerFilter = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookerFilter]
  }
  
  @scala.inline
  implicit class HookerFilterMutableBuilder[Self <: HookerFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
