package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessFilter extends StObject {
  
  /**
    * A filter for two values.
    */
  var betweenFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessBetweenFilter] = js.undefined
  
  /**
    * The dimension name or metric name.
    */
  var fieldName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A filter for in list values.
    */
  var inListFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessInListFilter] = js.undefined
  
  /**
    * A filter for numeric or date values.
    */
  var numericFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessNumericFilter] = js.undefined
  
  /**
    * Strings related filter.
    */
  var stringFilter: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAccessStringFilter] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessFilter {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessFilter]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessFilter](x: Self) {
    
    inline def setBetweenFilter(value: SchemaGoogleAnalyticsAdminV1alphaAccessBetweenFilter): Self = StObject.set(x, "betweenFilter", value.asInstanceOf[js.Any])
    
    inline def setBetweenFilterUndefined: Self = StObject.set(x, "betweenFilter", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameNull: Self = StObject.set(x, "fieldName", null)
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setInListFilter(value: SchemaGoogleAnalyticsAdminV1alphaAccessInListFilter): Self = StObject.set(x, "inListFilter", value.asInstanceOf[js.Any])
    
    inline def setInListFilterUndefined: Self = StObject.set(x, "inListFilter", js.undefined)
    
    inline def setNumericFilter(value: SchemaGoogleAnalyticsAdminV1alphaAccessNumericFilter): Self = StObject.set(x, "numericFilter", value.asInstanceOf[js.Any])
    
    inline def setNumericFilterUndefined: Self = StObject.set(x, "numericFilter", js.undefined)
    
    inline def setStringFilter(value: SchemaGoogleAnalyticsAdminV1alphaAccessStringFilter): Self = StObject.set(x, "stringFilter", value.asInstanceOf[js.Any])
    
    inline def setStringFilterUndefined: Self = StObject.set(x, "stringFilter", js.undefined)
  }
}
