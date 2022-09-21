package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSegmentDimensionFilter extends StObject {
  
  /**
    * Should the match be case sensitive, ignored for `IN_LIST` operator.
    */
  var caseSensitive: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Name of the dimension for which the filter is being applied.
    */
  var dimensionName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of expressions, only the first element is used for all operators
    */
  var expressions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Maximum comparison values for `BETWEEN` match type.
    */
  var maxComparisonValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum comparison values for `BETWEEN` match type.
    */
  var minComparisonValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The operator to use to match the dimension with the expressions.
    */
  var operator: js.UndefOr[String | Null] = js.undefined
}
object SchemaSegmentDimensionFilter {
  
  inline def apply(): SchemaSegmentDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentDimensionFilter]
  }
  
  extension [Self <: SchemaSegmentDimensionFilter](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveNull: Self = StObject.set(x, "caseSensitive", null)
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameNull: Self = StObject.set(x, "dimensionName", null)
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsNull: Self = StObject.set(x, "expressions", null)
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setMaxComparisonValue(value: String): Self = StObject.set(x, "maxComparisonValue", value.asInstanceOf[js.Any])
    
    inline def setMaxComparisonValueNull: Self = StObject.set(x, "maxComparisonValue", null)
    
    inline def setMaxComparisonValueUndefined: Self = StObject.set(x, "maxComparisonValue", js.undefined)
    
    inline def setMinComparisonValue(value: String): Self = StObject.set(x, "minComparisonValue", value.asInstanceOf[js.Any])
    
    inline def setMinComparisonValueNull: Self = StObject.set(x, "minComparisonValue", null)
    
    inline def setMinComparisonValueUndefined: Self = StObject.set(x, "minComparisonValue", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}
