package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelGroupingRule extends js.Object {
  
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
  implicit class ChannelGroupingRuleOps[Self <: ChannelGroupingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisjunctiveMatchStatementsVarargs(value: DisjunctiveMatchStatement*): Self = this.set("disjunctiveMatchStatements", js.Array(value :_*))
    
    @scala.inline
    def setDisjunctiveMatchStatements(value: js.Array[DisjunctiveMatchStatement]): Self = this.set("disjunctiveMatchStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisjunctiveMatchStatements: Self = this.set("disjunctiveMatchStatements", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
