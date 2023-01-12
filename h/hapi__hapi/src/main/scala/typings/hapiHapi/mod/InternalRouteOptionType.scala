package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalRouteOptionType extends StObject {
  
  var Scope: RouteOptionsAccessScope
  
  var Strategy: String
}
object InternalRouteOptionType {
  
  inline def apply(Scope: RouteOptionsAccessScope, Strategy: String): InternalRouteOptionType = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any], Strategy = Strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalRouteOptionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalRouteOptionType] (val x: Self) extends AnyVal {
    
    inline def setScope(value: RouteOptionsAccessScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "Scope", js.Array(value*))
    
    inline def setStrategy(value: String): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
  }
}
