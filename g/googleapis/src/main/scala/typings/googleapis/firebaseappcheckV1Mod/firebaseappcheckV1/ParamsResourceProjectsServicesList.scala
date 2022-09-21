package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsServicesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of Services to return in the response. Only explicitly configured services are returned. The server may return fewer than this at its own discretion. If no value is specified (or too large a value is specified), the server will impose its own limit.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token returned from a previous call to ListServices indicating where in the set of Services to resume listing. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ListServices must match the call that provided the page token; if they do not match, the result is undefined.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The relative resource name of the parent project for which to list each associated Service, in the format: ``` projects/{project_number\} ```
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsServicesList {
  
  inline def apply(): ParamsResourceProjectsServicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsServicesList]
  }
  
  extension [Self <: ParamsResourceProjectsServicesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
