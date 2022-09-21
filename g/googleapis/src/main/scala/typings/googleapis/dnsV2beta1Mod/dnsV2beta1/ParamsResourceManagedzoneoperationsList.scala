package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagedzoneoperationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Identifies the managed zone addressed by this request.
    */
  var managedZone: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Maximum number of results to be returned. If unspecified, the server will decide how many results to return.
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
    * Sorting criterion. The only supported values are START_TIME and ID.
    */
  var sortBy: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagedzoneoperationsList {
  
  inline def apply(): ParamsResourceManagedzoneoperationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedzoneoperationsList]
  }
  
  extension [Self <: ParamsResourceManagedzoneoperationsList](x: Self) {
    
    inline def setManagedZone(value: String): Self = StObject.set(x, "managedZone", value.asInstanceOf[js.Any])
    
    inline def setManagedZoneUndefined: Self = StObject.set(x, "managedZone", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
