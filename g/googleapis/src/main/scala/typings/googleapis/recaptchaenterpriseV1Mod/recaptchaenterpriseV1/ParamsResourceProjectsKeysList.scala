package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsKeysList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The maximum number of keys to return. Default is 10. Max limit is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The next_page_token value returned from a previous. ListKeysRequest, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the project that contains the keys that will be listed, in the format "projects/{project\}".
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsKeysList {
  
  inline def apply(): ParamsResourceProjectsKeysList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsKeysList]
  }
  
  extension [Self <: ParamsResourceProjectsKeysList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
