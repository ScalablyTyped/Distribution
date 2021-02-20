package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComparisonType extends StObject {
  
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
  implicit class ComparisonTypeMutableBuilder[Self <: ComparisonType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonType(value: String): Self = StObject.set(x, "comparisonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonTypeUndefined: Self = StObject.set(x, "comparisonType", js.undefined)
    
    @scala.inline
    def setComparisonValue(value: String): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
