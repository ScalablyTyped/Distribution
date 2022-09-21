package typings.googleapis.ideahubV1alphaMod.ideahubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePlatformsPropertiesLocalesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of locales to return. The service may return fewer than this value. If unspecified, at most 100 locales will be returned. The maximum value is 100; values above 100 will be coerced to 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListAvailableLocales` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAvailableLocales` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The web property to check idea availability for Format: platforms/{platform\}/property/{property\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourcePlatformsPropertiesLocalesList {
  
  inline def apply(): ParamsResourcePlatformsPropertiesLocalesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlatformsPropertiesLocalesList]
  }
  
  extension [Self <: ParamsResourcePlatformsPropertiesLocalesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
