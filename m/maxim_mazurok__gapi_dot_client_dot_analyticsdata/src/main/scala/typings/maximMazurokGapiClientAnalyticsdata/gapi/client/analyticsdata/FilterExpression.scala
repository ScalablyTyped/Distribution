package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterExpression extends js.Object {
  
  /** The FilterExpressions in and_group have an AND relationship. */
  var andGroup: js.UndefOr[FilterExpressionList] = js.native
  
  /** A primitive filter. All fields in filter in same FilterExpression needs to be either all dimensions or metrics. */
  var filter: js.UndefOr[Filter] = js.native
  
  /** The FilterExpression is NOT of not_expression. */
  var notExpression: js.UndefOr[FilterExpression] = js.native
  
  /** The FilterExpressions in or_group have an OR relationship. */
  var orGroup: js.UndefOr[FilterExpressionList] = js.native
}
object FilterExpression {
  
  @scala.inline
  def apply(): FilterExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterExpression]
  }
  
  @scala.inline
  implicit class FilterExpressionOps[Self <: FilterExpression] (val x: Self) extends AnyVal {
    
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
    def setAndGroup(value: FilterExpressionList): Self = this.set("andGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndGroup: Self = this.set("andGroup", js.undefined)
    
    @scala.inline
    def setFilter(value: Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setNotExpression(value: FilterExpression): Self = this.set("notExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotExpression: Self = this.set("notExpression", js.undefined)
    
    @scala.inline
    def setOrGroup(value: FilterExpressionList): Self = this.set("orGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrGroup: Self = this.set("orGroup", js.undefined)
  }
}
