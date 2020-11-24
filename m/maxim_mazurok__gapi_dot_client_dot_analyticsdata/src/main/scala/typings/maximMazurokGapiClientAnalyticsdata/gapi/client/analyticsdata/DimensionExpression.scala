package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionExpression extends js.Object {
  
  /** Used to combine dimension values to a single dimension. For example, dimension "country, city": concatenate(country, ", ", city). */
  var concatenate: js.UndefOr[ConcatenateExpression] = js.native
  
  /** Used to convert a dimension value to lower case. */
  var lowerCase: js.UndefOr[CaseExpression] = js.native
  
  /** Used to convert a dimension value to upper case. */
  var upperCase: js.UndefOr[CaseExpression] = js.native
}
object DimensionExpression {
  
  @scala.inline
  def apply(): DimensionExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionExpression]
  }
  
  @scala.inline
  implicit class DimensionExpressionOps[Self <: DimensionExpression] (val x: Self) extends AnyVal {
    
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
    def setConcatenate(value: ConcatenateExpression): Self = this.set("concatenate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcatenate: Self = this.set("concatenate", js.undefined)
    
    @scala.inline
    def setLowerCase(value: CaseExpression): Self = this.set("lowerCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCase: Self = this.set("lowerCase", js.undefined)
    
    @scala.inline
    def setUpperCase(value: CaseExpression): Self = this.set("upperCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpperCase: Self = this.set("upperCase", js.undefined)
  }
}
