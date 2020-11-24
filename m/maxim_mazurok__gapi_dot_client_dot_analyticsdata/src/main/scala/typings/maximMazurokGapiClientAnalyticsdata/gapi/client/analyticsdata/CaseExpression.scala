package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseExpression extends js.Object {
  
  /** Name of a dimension. The name must refer back to a name in dimensions field of the request. */
  var dimensionName: js.UndefOr[String] = js.native
}
object CaseExpression {
  
  @scala.inline
  def apply(): CaseExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseExpression]
  }
  
  @scala.inline
  implicit class CaseExpressionOps[Self <: CaseExpression] (val x: Self) extends AnyVal {
    
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
    def setDimensionName(value: String): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionName: Self = this.set("dimensionName", js.undefined)
  }
}
