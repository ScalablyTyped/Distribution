package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTlsRouteRouteRule extends StObject {
  
  /**
    * Required. The detailed rule defining how to route matched traffic.
    */
  var action: js.UndefOr[SchemaTlsRouteRouteAction] = js.undefined
  
  /**
    * Required. RouteMatch defines the predicate used to match requests to a given action. Multiple match types are "OR"ed for evaluation.
    */
  var matches: js.UndefOr[js.Array[SchemaTlsRouteRouteMatch]] = js.undefined
}
object SchemaTlsRouteRouteRule {
  
  inline def apply(): SchemaTlsRouteRouteRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsRouteRouteRule]
  }
  
  extension [Self <: SchemaTlsRouteRouteRule](x: Self) {
    
    inline def setAction(value: SchemaTlsRouteRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMatches(value: js.Array[SchemaTlsRouteRouteMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: SchemaTlsRouteRouteMatch*): Self = StObject.set(x, "matches", js.Array(value*))
  }
}
