package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter extends StObject {
  
  /**
    * Optional. If true, the match is case-sensitive. If false, the match is case-insensitive.
    */
  var caseSensitive: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The list of possible string values to match against. Must be non-empty.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveNull: Self = StObject.set(x, "caseSensitive", null)
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
