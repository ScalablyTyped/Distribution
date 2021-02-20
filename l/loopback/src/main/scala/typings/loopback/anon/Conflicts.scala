package typings.loopback.anon

import typings.loopback.mod.Conflict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conflicts extends StObject {
  
  var conflicts: js.Array[Conflict] = js.native
  
  var params: js.Any = js.native
}
object Conflicts {
  
  @scala.inline
  def apply(conflicts: js.Array[Conflict], params: js.Any): Conflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  
  @scala.inline
  implicit class ConflictsMutableBuilder[Self <: Conflicts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflicts(value: js.Array[Conflict]): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictsVarargs(value: Conflict*): Self = StObject.set(x, "conflicts", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
