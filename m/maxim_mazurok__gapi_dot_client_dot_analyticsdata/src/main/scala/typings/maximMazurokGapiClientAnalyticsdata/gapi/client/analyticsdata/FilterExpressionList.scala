package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterExpressionList extends js.Object {
  
  /** A list of filter expressions. */
  var expressions: js.UndefOr[js.Array[FilterExpression]] = js.native
}
object FilterExpressionList {
  
  @scala.inline
  def apply(): FilterExpressionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExpressionList]
  }
  
  @scala.inline
  implicit class FilterExpressionListOps[Self <: FilterExpressionList] (val x: Self) extends AnyVal {
    
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
    def setExpressionsVarargs(value: FilterExpression*): Self = this.set("expressions", js.Array(value :_*))
    
    @scala.inline
    def setExpressions(value: js.Array[FilterExpression]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressions: Self = this.set("expressions", js.undefined)
  }
}
