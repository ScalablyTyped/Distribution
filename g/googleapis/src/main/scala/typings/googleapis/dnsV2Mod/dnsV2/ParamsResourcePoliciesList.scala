package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePoliciesList
  extends StObject
     with StandardParameters {
  
  /**
    * Specifies the location of the resource. This information will be used for routing and will be part of the resource name.
    */
  var location: js.UndefOr[String] = js.undefined
  
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
}
object ParamsResourcePoliciesList {
  
  inline def apply(): ParamsResourcePoliciesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoliciesList]
  }
  
  extension [Self <: ParamsResourcePoliciesList](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
