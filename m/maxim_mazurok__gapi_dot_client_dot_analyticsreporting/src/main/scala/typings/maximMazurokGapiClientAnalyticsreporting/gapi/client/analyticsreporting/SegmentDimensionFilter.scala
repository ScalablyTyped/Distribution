package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentDimensionFilter extends StObject {
  
  /** Should the match be case sensitive, ignored for `IN_LIST` operator. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /** Name of the dimension for which the filter is being applied. */
  var dimensionName: js.UndefOr[String] = js.undefined
  
  /** The list of expressions, only the first element is used for all operators */
  var expressions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Maximum comparison values for `BETWEEN` match type. */
  var maxComparisonValue: js.UndefOr[String] = js.undefined
  
  /** Minimum comparison values for `BETWEEN` match type. */
  var minComparisonValue: js.UndefOr[String] = js.undefined
  
  /** The operator to use to match the dimension with the expressions. */
  var operator: js.UndefOr[String] = js.undefined
}
object SegmentDimensionFilter {
  
  @scala.inline
  def apply(): SegmentDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDimensionFilter]
  }
  
  @scala.inline
  implicit class SegmentDimensionFilterMutableBuilder[Self <: SegmentDimensionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    @scala.inline
    def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    @scala.inline
    def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setMaxComparisonValue(value: String): Self = StObject.set(x, "maxComparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxComparisonValueUndefined: Self = StObject.set(x, "maxComparisonValue", js.undefined)
    
    @scala.inline
    def setMinComparisonValue(value: String): Self = StObject.set(x, "minComparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinComparisonValueUndefined: Self = StObject.set(x, "minComparisonValue", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}
