package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dimension filter specifies the filtering options on a dimension.
  */
@js.native
trait SchemaDimensionFilter extends StObject {
  
  /**
    * Should the match be case sensitive? Default is false.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * The dimension to filter on. A DimensionFilter must contain a dimension.
    */
  var dimensionName: js.UndefOr[String] = js.native
  
  /**
    * Strings or regular expression to match against. Only the first value of
    * the list is used for comparison unless the operator is `IN_LIST`. If
    * `IN_LIST` operator, then the entire list is used to filter the dimensions
    * as explained in the description of the `IN_LIST` operator.
    */
  var expressions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Logical `NOT` operator. If this boolean is set to true, then the matching
    * dimension values will be excluded in the report. The default is false.
    */
  var not: js.UndefOr[Boolean] = js.native
  
  /**
    * How to match the dimension to the expression. The default is REGEXP.
    */
  var operator: js.UndefOr[String] = js.native
}
object SchemaDimensionFilter {
  
  @scala.inline
  def apply(): SchemaDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionFilter]
  }
  
  @scala.inline
  implicit class SchemaDimensionFilterMutableBuilder[Self <: SchemaDimensionFilter] (val x: Self) extends AnyVal {
    
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
    def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}
