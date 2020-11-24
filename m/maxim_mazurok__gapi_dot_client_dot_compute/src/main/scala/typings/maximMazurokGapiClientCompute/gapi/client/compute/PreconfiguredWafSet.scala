package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreconfiguredWafSet extends js.Object {
  
  /** List of entities that are currently supported for WAF rules. */
  var expressionSets: js.UndefOr[js.Array[WafExpressionSet]] = js.native
}
object PreconfiguredWafSet {
  
  @scala.inline
  def apply(): PreconfiguredWafSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreconfiguredWafSet]
  }
  
  @scala.inline
  implicit class PreconfiguredWafSetOps[Self <: PreconfiguredWafSet] (val x: Self) extends AnyVal {
    
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
    def setExpressionSetsVarargs(value: WafExpressionSet*): Self = this.set("expressionSets", js.Array(value :_*))
    
    @scala.inline
    def setExpressionSets(value: js.Array[WafExpressionSet]): Self = this.set("expressionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionSets: Self = this.set("expressionSets", js.undefined)
  }
}
