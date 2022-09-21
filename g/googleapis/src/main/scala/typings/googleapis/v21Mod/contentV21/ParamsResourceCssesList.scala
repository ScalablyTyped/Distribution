package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCssesList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The CSS group ID of CSS domains to be listed.
    */
  var cssGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of CSS domains to return. The service may return fewer than this value. If unspecified, at most 50 CSS domains will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListCsses` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListCsses` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceCssesList {
  
  inline def apply(): ParamsResourceCssesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCssesList]
  }
  
  extension [Self <: ParamsResourceCssesList](x: Self) {
    
    inline def setCssGroupId(value: String): Self = StObject.set(x, "cssGroupId", value.asInstanceOf[js.Any])
    
    inline def setCssGroupIdUndefined: Self = StObject.set(x, "cssGroupId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
