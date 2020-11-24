package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WafExpressionSet extends js.Object {
  
  /**
    * A list of alternate IDs. The format should be: - E.g. XSS-stable Generic suffix like "stable" is particularly useful if a policy likes to avail newer set of expressions without
    * having to change the policy. A given alias name can't be used for more than one entity set.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  /** List of available expressions. */
  var expressions: js.UndefOr[js.Array[WafExpressionSetExpression]] = js.native
  
  /** Google specified expression set ID. The format should be: - E.g. XSS-20170329 */
  var id: js.UndefOr[String] = js.native
}
object WafExpressionSet {
  
  @scala.inline
  def apply(): WafExpressionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WafExpressionSet]
  }
  
  @scala.inline
  implicit class WafExpressionSetOps[Self <: WafExpressionSet] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setExpressionsVarargs(value: WafExpressionSetExpression*): Self = this.set("expressions", js.Array(value :_*))
    
    @scala.inline
    def setExpressions(value: js.Array[WafExpressionSetExpression]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressions: Self = this.set("expressions", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
