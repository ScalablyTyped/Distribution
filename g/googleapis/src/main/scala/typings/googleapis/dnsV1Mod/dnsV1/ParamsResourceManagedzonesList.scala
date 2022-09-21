package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagedzonesList
  extends StObject
     with StandardParameters {
  
  /**
    * Restricts the list to return only zones with this domain name.
    */
  var dnsName: js.UndefOr[String] = js.undefined
  
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
object ParamsResourceManagedzonesList {
  
  inline def apply(): ParamsResourceManagedzonesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedzonesList]
  }
  
  extension [Self <: ParamsResourceManagedzonesList](x: Self) {
    
    inline def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
