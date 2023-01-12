package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessDimensionHeader extends StObject {
  
  /** The dimension's name; for example 'userEmail'. */
  var dimensionName: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessDimensionHeader {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessDimensionHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessDimensionHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAccessDimensionHeader] (val x: Self) extends AnyVal {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
  }
}
