package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptionsAccessScopeObject
  extends StObject
     with _RouteOptionsAccessObject {
  
  var scope: RouteOptionsAccessScope
}
object RouteOptionsAccessScopeObject {
  
  inline def apply(scope: RouteOptionsAccessScope): RouteOptionsAccessScopeObject = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsAccessScopeObject]
  }
  
  extension [Self <: RouteOptionsAccessScopeObject](x: Self) {
    
    inline def setScope(value: RouteOptionsAccessScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
