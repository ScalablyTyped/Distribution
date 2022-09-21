package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResponsepolicyrulesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A tag returned by a previous list request that was truncated. Use this parameter to continue a previous list request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the project addressed by this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * User assigned name of the Response Policy to list.
    */
  var responsePolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceResponsepolicyrulesList {
  
  inline def apply(): ParamsResourceResponsepolicyrulesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResponsepolicyrulesList]
  }
  
  extension [Self <: ParamsResourceResponsepolicyrulesList](x: Self) {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setResponsePolicy(value: String): Self = StObject.set(x, "responsePolicy", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyUndefined: Self = StObject.set(x, "responsePolicy", js.undefined)
  }
}
