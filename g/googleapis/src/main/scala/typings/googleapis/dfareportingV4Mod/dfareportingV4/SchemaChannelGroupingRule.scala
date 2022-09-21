package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelGroupingRule extends StObject {
  
  /**
    * The disjunctive match statements contained within this rule.
    */
  var disjunctiveMatchStatements: js.UndefOr[js.Array[SchemaDisjunctiveMatchStatement]] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#channelGroupingRule.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rule name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannelGroupingRule {
  
  inline def apply(): SchemaChannelGroupingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelGroupingRule]
  }
  
  extension [Self <: SchemaChannelGroupingRule](x: Self) {
    
    inline def setDisjunctiveMatchStatements(value: js.Array[SchemaDisjunctiveMatchStatement]): Self = StObject.set(x, "disjunctiveMatchStatements", value.asInstanceOf[js.Any])
    
    inline def setDisjunctiveMatchStatementsUndefined: Self = StObject.set(x, "disjunctiveMatchStatements", js.undefined)
    
    inline def setDisjunctiveMatchStatementsVarargs(value: SchemaDisjunctiveMatchStatement*): Self = StObject.set(x, "disjunctiveMatchStatements", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
