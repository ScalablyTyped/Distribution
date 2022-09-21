package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessNumericFilter extends StObject {
  
  /**
    * The operation type for this filter.
    */
  var operation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A numeric value or a date value.
    */
  var value: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaNumericValue] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessNumericFilter {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessNumericFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessNumericFilter]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessNumericFilter](x: Self) {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationNull: Self = StObject.set(x, "operation", null)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setValue(value: SchemaGoogleAnalyticsAdminV1alphaNumericValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
