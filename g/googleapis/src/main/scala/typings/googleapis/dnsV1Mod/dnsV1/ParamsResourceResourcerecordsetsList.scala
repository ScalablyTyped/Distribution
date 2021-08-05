package typings.googleapis.dnsV1Mod.dnsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResourcerecordsetsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    *
    */
  var managedZone: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    *
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParamsResourceResourcerecordsetsList {
  
  inline def apply(): ParamsResourceResourcerecordsetsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResourcerecordsetsList]
  }
  
  extension [Self <: ParamsResourceResourcerecordsetsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setManagedZone(value: String): Self = StObject.set(x, "managedZone", value.asInstanceOf[js.Any])
    
    inline def setManagedZoneUndefined: Self = StObject.set(x, "managedZone", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
