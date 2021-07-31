package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAboutGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Whether to count changes outside the My Drive hierarchy. When set to
    * false, changes to files such as those in the Application Data folder or
    * shared files which have not been added to My Drive will be omitted from
    * the maxChangeIdCount.
    */
  var includeSubscribed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of remaining change IDs to count
    */
  var maxChangeIdCount: js.UndefOr[String] = js.undefined
  
  /**
    * Change ID to start counting from when calculating number of remaining
    * change IDs
    */
  var startChangeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAboutGet {
  
  @scala.inline
  def apply(): ParamsResourceAboutGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAboutGet]
  }
  
  @scala.inline
  implicit class ParamsResourceAboutGetMutableBuilder[Self <: ParamsResourceAboutGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIncludeSubscribed(value: Boolean): Self = StObject.set(x, "includeSubscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSubscribedUndefined: Self = StObject.set(x, "includeSubscribed", js.undefined)
    
    @scala.inline
    def setMaxChangeIdCount(value: String): Self = StObject.set(x, "maxChangeIdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxChangeIdCountUndefined: Self = StObject.set(x, "maxChangeIdCount", js.undefined)
    
    @scala.inline
    def setStartChangeId(value: String): Self = StObject.set(x, "startChangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartChangeIdUndefined: Self = StObject.set(x, "startChangeId", js.undefined)
  }
}
