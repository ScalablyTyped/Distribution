package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsRevisionsPermissionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of permissions to return per page. Default: 50. Max: 200.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The token of the page to return.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent Label resource name on which Label Permission are listed. Format: labels/{label\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    */
  var useAdminAccess: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceLabelsRevisionsPermissionsList {
  
  inline def apply(): ParamsResourceLabelsRevisionsPermissionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsRevisionsPermissionsList]
  }
  
  extension [Self <: ParamsResourceLabelsRevisionsPermissionsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
  }
}
