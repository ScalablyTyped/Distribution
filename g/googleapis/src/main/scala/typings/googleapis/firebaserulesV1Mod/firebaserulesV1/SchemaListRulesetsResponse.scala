package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRulesetsResponse extends StObject {
  
  /**
    * The pagination token to retrieve the next page of results. If the value is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of `Ruleset` instances.
    */
  var rulesets: js.UndefOr[js.Array[SchemaRuleset]] = js.undefined
}
object SchemaListRulesetsResponse {
  
  inline def apply(): SchemaListRulesetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRulesetsResponse]
  }
  
  extension [Self <: SchemaListRulesetsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRulesets(value: js.Array[SchemaRuleset]): Self = StObject.set(x, "rulesets", value.asInstanceOf[js.Any])
    
    inline def setRulesetsUndefined: Self = StObject.set(x, "rulesets", js.undefined)
    
    inline def setRulesetsVarargs(value: SchemaRuleset*): Self = StObject.set(x, "rulesets", js.Array(value*))
  }
}
