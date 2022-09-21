package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessBetweenFilter extends StObject {
  
  /**
    * Begins with this number.
    */
  var fromValue: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaNumericValue] = js.undefined
  
  /**
    * Ends with this number.
    */
  var toValue: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaNumericValue] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessBetweenFilter {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessBetweenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessBetweenFilter]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessBetweenFilter](x: Self) {
    
    inline def setFromValue(value: SchemaGoogleAnalyticsAdminV1alphaNumericValue): Self = StObject.set(x, "fromValue", value.asInstanceOf[js.Any])
    
    inline def setFromValueUndefined: Self = StObject.set(x, "fromValue", js.undefined)
    
    inline def setToValue(value: SchemaGoogleAnalyticsAdminV1alphaNumericValue): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
  }
}
