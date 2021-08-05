package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelGroupingRule extends StObject {
  
  /** The disjunctive match statements contained within this rule. */
  var disjunctiveMatchStatements: js.UndefOr[js.Array[DisjunctiveMatchStatement]] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#channelGroupingRule. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Rule name. */
  var name: js.UndefOr[String] = js.undefined
}
object ChannelGroupingRule {
  
  inline def apply(): ChannelGroupingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGroupingRule]
  }
  
  extension [Self <: ChannelGroupingRule](x: Self) {
    
    inline def setDisjunctiveMatchStatements(value: js.Array[DisjunctiveMatchStatement]): Self = StObject.set(x, "disjunctiveMatchStatements", value.asInstanceOf[js.Any])
    
    inline def setDisjunctiveMatchStatementsUndefined: Self = StObject.set(x, "disjunctiveMatchStatements", js.undefined)
    
    inline def setDisjunctiveMatchStatementsVarargs(value: DisjunctiveMatchStatement*): Self = StObject.set(x, "disjunctiveMatchStatements", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
