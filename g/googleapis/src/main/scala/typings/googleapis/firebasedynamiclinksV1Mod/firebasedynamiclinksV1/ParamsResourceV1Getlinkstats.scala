package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1Getlinkstats
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The span of time requested in days.
    */
  var durationDays: js.UndefOr[String] = js.undefined
  
  /**
    * Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz
    */
  var dynamicLink: js.UndefOr[String] = js.undefined
  
  /**
    * Google SDK version. Version takes the form "$major.$minor.$patch"
    */
  var sdkVersion: js.UndefOr[String] = js.undefined
}
object ParamsResourceV1Getlinkstats {
  
  inline def apply(): ParamsResourceV1Getlinkstats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Getlinkstats]
  }
  
  extension [Self <: ParamsResourceV1Getlinkstats](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDurationDays(value: String): Self = StObject.set(x, "durationDays", value.asInstanceOf[js.Any])
    
    inline def setDurationDaysUndefined: Self = StObject.set(x, "durationDays", js.undefined)
    
    inline def setDynamicLink(value: String): Self = StObject.set(x, "dynamicLink", value.asInstanceOf[js.Any])
    
    inline def setDynamicLinkUndefined: Self = StObject.set(x, "dynamicLink", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
  }
}
