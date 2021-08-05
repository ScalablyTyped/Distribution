package typings.loopback.anon

import typings.loopback.mod.Conflict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflicts extends StObject {
  
  var conflicts: js.Array[Conflict]
  
  var params: js.Any
}
object Conflicts {
  
  inline def apply(conflicts: js.Array[Conflict], params: js.Any): Conflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  
  extension [Self <: Conflicts](x: Self) {
    
    inline def setConflicts(value: js.Array[Conflict]): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    inline def setConflictsVarargs(value: Conflict*): Self = StObject.set(x, "conflicts", js.Array(value :_*))
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
