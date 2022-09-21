package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTcpRouteRouteRule extends StObject {
  
  /**
    * Required. The detailed rule defining how to route matched traffic.
    */
  var action: js.UndefOr[SchemaTcpRouteRouteAction] = js.undefined
  
  /**
    * Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple match types are "OR"ed for evaluation. If no routeMatch field is specified, this rule will unconditionally match traffic.
    */
  var matches: js.UndefOr[js.Array[SchemaTcpRouteRouteMatch]] = js.undefined
}
object SchemaTcpRouteRouteRule {
  
  inline def apply(): SchemaTcpRouteRouteRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTcpRouteRouteRule]
  }
  
  extension [Self <: SchemaTcpRouteRouteRule](x: Self) {
    
    inline def setAction(value: SchemaTcpRouteRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMatches(value: js.Array[SchemaTcpRouteRouteMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: SchemaTcpRouteRouteMatch*): Self = StObject.set(x, "matches", js.Array(value*))
  }
}
