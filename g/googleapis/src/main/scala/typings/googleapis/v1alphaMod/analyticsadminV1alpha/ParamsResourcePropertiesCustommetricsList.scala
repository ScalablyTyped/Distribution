package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesCustommetricsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum).
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListCustomMetrics` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListCustomMetrics` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Example format: properties/1234
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesCustommetricsList {
  
  inline def apply(): ParamsResourcePropertiesCustommetricsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesCustommetricsList]
  }
  
  extension [Self <: ParamsResourcePropertiesCustommetricsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
