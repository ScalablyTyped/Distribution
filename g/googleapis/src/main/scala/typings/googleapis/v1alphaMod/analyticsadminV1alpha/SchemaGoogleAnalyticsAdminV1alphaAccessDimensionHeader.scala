package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAccessDimensionHeader extends StObject {
  
  /**
    * The dimension's name; for example 'userEmail'.
    */
  var dimensionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAccessDimensionHeader {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAccessDimensionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAccessDimensionHeader]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAccessDimensionHeader](x: Self) {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameNull: Self = StObject.set(x, "dimensionName", null)
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
  }
}
