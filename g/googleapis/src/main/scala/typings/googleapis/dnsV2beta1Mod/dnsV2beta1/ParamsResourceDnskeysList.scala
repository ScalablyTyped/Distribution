package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDnskeysList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    *
    */
  var digestType: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var managedZone: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    *
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var project: js.UndefOr[String] = js.native
}
object ParamsResourceDnskeysList {
  
  @scala.inline
  def apply(): ParamsResourceDnskeysList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDnskeysList]
  }
  
  @scala.inline
  implicit class ParamsResourceDnskeysListMutableBuilder[Self <: ParamsResourceDnskeysList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDigestType(value: String): Self = StObject.set(x, "digestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestTypeUndefined: Self = StObject.set(x, "digestType", js.undefined)
    
    @scala.inline
    def setManagedZone(value: String): Self = StObject.set(x, "managedZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedZoneUndefined: Self = StObject.set(x, "managedZone", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
