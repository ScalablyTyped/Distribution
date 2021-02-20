package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelGroupingRule extends StObject {
  
  /** The disjunctive match statements contained within this rule. */
  var disjunctiveMatchStatements: js.UndefOr[js.Array[DisjunctiveMatchStatement]] = js.native
  
  /** The kind of resource this is, in this case dfareporting#channelGroupingRule. */
  var kind: js.UndefOr[String] = js.native
  
  /** Rule name. */
  var name: js.UndefOr[String] = js.native
}
object ChannelGroupingRule {
  
  @scala.inline
  def apply(): ChannelGroupingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGroupingRule]
  }
  
  @scala.inline
  implicit class ChannelGroupingRuleMutableBuilder[Self <: ChannelGroupingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisjunctiveMatchStatements(value: js.Array[DisjunctiveMatchStatement]): Self = StObject.set(x, "disjunctiveMatchStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisjunctiveMatchStatementsUndefined: Self = StObject.set(x, "disjunctiveMatchStatements", js.undefined)
    
    @scala.inline
    def setDisjunctiveMatchStatementsVarargs(value: DisjunctiveMatchStatement*): Self = StObject.set(x, "disjunctiveMatchStatements", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
