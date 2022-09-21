package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrpcRouteRouteRule extends StObject {
  
  /**
    * Required. A detailed rule defining how to route traffic. This field is required.
    */
  var action: js.UndefOr[SchemaGrpcRouteRouteAction] = js.undefined
  
  /**
    * Optional. Matches define conditions used for matching the rule against incoming gRPC requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic.
    */
  var matches: js.UndefOr[js.Array[SchemaGrpcRouteRouteMatch]] = js.undefined
}
object SchemaGrpcRouteRouteRule {
  
  inline def apply(): SchemaGrpcRouteRouteRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcRouteRouteRule]
  }
  
  extension [Self <: SchemaGrpcRouteRouteRule](x: Self) {
    
    inline def setAction(value: SchemaGrpcRouteRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMatches(value: js.Array[SchemaGrpcRouteRouteMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: SchemaGrpcRouteRouteMatch*): Self = StObject.set(x, "matches", js.Array(value*))
  }
}
