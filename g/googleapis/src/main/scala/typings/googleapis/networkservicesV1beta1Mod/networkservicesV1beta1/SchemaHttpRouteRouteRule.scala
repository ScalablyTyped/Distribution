package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteRouteRule extends StObject {
  
  /**
    * The detailed rule defining how to route matched traffic.
    */
  var action: js.UndefOr[SchemaHttpRouteRouteAction] = js.undefined
  
  /**
    * A list of matches define conditions used for matching the rule against incoming HTTP requests. Each match is independent, i.e. this rule will be matched if ANY one of the matches is satisfied. If no matches field is specified, this rule will unconditionally match traffic. If a default rule is desired to be configured, add a rule with no matches specified to the end of the rules list.
    */
  var matches: js.UndefOr[js.Array[SchemaHttpRouteRouteMatch]] = js.undefined
}
object SchemaHttpRouteRouteRule {
  
  inline def apply(): SchemaHttpRouteRouteRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRouteRule]
  }
  
  extension [Self <: SchemaHttpRouteRouteRule](x: Self) {
    
    inline def setAction(value: SchemaHttpRouteRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMatches(value: js.Array[SchemaHttpRouteRouteMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: SchemaHttpRouteRouteMatch*): Self = StObject.set(x, "matches", js.Array(value*))
  }
}
