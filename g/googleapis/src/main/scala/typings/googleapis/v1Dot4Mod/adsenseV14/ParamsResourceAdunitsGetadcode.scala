package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdunitsGetadcode
  extends StObject
     with StandardParameters {
  
  /**
    * Ad client with contains the ad unit.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad unit to get the code for.
    */
  var adUnitId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
}
object ParamsResourceAdunitsGetadcode {
  
  @scala.inline
  def apply(): ParamsResourceAdunitsGetadcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdunitsGetadcode]
  }
  
  @scala.inline
  implicit class ParamsResourceAdunitsGetadcodeMutableBuilder[Self <: ParamsResourceAdunitsGetadcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    @scala.inline
    def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdUnitIdUndefined: Self = StObject.set(x, "adUnitId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
