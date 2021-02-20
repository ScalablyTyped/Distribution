package typings.hapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteOptionsAccessScopeObject extends _RouteOptionsAccessObject {
  
  var scope: RouteOptionsAccessScope = js.native
}
object RouteOptionsAccessScopeObject {
  
  @scala.inline
  def apply(scope: RouteOptionsAccessScope): RouteOptionsAccessScopeObject = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsAccessScopeObject]
  }
  
  @scala.inline
  implicit class RouteOptionsAccessScopeObjectMutableBuilder[Self <: RouteOptionsAccessScopeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: RouteOptionsAccessScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
