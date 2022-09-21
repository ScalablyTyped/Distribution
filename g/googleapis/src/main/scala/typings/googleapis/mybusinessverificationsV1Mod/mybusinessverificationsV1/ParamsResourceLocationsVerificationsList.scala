package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsVerificationsList
  extends StObject
     with StandardParameters {
  
  /**
    * How many verification to include per page. Minimum is 1, and the default and maximum page size is 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * If specified, returns the next page of verifications.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the location that verification requests belong to.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsVerificationsList {
  
  inline def apply(): ParamsResourceLocationsVerificationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsVerificationsList]
  }
  
  extension [Self <: ParamsResourceLocationsVerificationsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
