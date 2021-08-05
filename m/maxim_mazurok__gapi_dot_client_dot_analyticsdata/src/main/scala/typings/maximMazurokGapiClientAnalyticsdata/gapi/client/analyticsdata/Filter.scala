package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /** A filter for two values. */
  var betweenFilter: js.UndefOr[BetweenFilter] = js.undefined
  
  /** The dimension name or metric name. Must be a name defined in dimensions or metrics. */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /** A filter for in list values. */
  var inListFilter: js.UndefOr[InListFilter] = js.undefined
  
  /**
    * A filter for null values. If True, a null dimension value is matched by this filter. Null filter is commonly used inside a NOT filter expression. For example, a NOT expression of a
    * null filter removes rows when a dimension is null.
    */
  var nullFilter: js.UndefOr[Boolean] = js.undefined
  
  /** A filter for numeric or date values. */
  var numericFilter: js.UndefOr[NumericFilter] = js.undefined
  
  /** Strings related filter. */
  var stringFilter: js.UndefOr[StringFilter] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setBetweenFilter(value: BetweenFilter): Self = StObject.set(x, "betweenFilter", value.asInstanceOf[js.Any])
    
    inline def setBetweenFilterUndefined: Self = StObject.set(x, "betweenFilter", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setInListFilter(value: InListFilter): Self = StObject.set(x, "inListFilter", value.asInstanceOf[js.Any])
    
    inline def setInListFilterUndefined: Self = StObject.set(x, "inListFilter", js.undefined)
    
    inline def setNullFilter(value: Boolean): Self = StObject.set(x, "nullFilter", value.asInstanceOf[js.Any])
    
    inline def setNullFilterUndefined: Self = StObject.set(x, "nullFilter", js.undefined)
    
    inline def setNumericFilter(value: NumericFilter): Self = StObject.set(x, "numericFilter", value.asInstanceOf[js.Any])
    
    inline def setNumericFilterUndefined: Self = StObject.set(x, "numericFilter", js.undefined)
    
    inline def setStringFilter(value: StringFilter): Self = StObject.set(x, "stringFilter", value.asInstanceOf[js.Any])
    
    inline def setStringFilterUndefined: Self = StObject.set(x, "stringFilter", js.undefined)
  }
}
