package typings.maximMazurokGapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComparisonType extends js.Object {
  
  /** Type of comparison. Possible values are LESS_THAN, GREATER_THAN or EQUAL. */
  var comparisonType: js.UndefOr[String] = js.native
  
  /** Value used for this comparison. */
  var comparisonValue: js.UndefOr[String] = js.native
  
  /** Expression used for this match. */
  var expression: js.UndefOr[String] = js.native
  
  /** Type of the match to be performed. Possible values are REGEXP, BEGINS_WITH, or EXACT. */
  var matchType: js.UndefOr[String] = js.native
  
  /** Type of this event condition. Possible values are CATEGORY, ACTION, LABEL, or VALUE. */
  var `type`: js.UndefOr[String] = js.native
}
object ComparisonType {
  
  @scala.inline
  def apply(): ComparisonType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparisonType]
  }
  
  @scala.inline
  implicit class ComparisonTypeOps[Self <: ComparisonType] (val x: Self) extends AnyVal {
    
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
    def setComparisonType(value: String): Self = this.set("comparisonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonType: Self = this.set("comparisonType", js.undefined)
    
    @scala.inline
    def setComparisonValue(value: String): Self = this.set("comparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonValue: Self = this.set("comparisonValue", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    
    @scala.inline
    def setMatchType(value: String): Self = this.set("matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchType: Self = this.set("matchType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
