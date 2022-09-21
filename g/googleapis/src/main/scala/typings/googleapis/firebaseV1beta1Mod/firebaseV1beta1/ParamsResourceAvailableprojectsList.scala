package typings.googleapis.firebaseV1beta1Mod.firebaseV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAvailableprojectsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of Projects to return in the response. The server may return fewer than this value at its discretion. If no value is specified (or too large a value is specified), the server will impose its own limit. This value cannot be negative.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token returned from a previous call to `ListAvailableProjects` indicating where in the set of Projects to resume listing.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAvailableprojectsList {
  
  inline def apply(): ParamsResourceAvailableprojectsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAvailableprojectsList]
  }
  
  extension [Self <: ParamsResourceAvailableprojectsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
