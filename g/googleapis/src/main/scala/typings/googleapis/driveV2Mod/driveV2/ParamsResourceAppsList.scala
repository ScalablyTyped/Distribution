package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAppsList extends StandardParameters {
  
  /**
    * A comma-separated list of file extensions for open with filtering. All
    * apps within the given app query scope which can open any of the given
    * file extensions will be included in the response. If appFilterMimeTypes
    * are provided as well, the result is a union of the two resulting app
    * lists.
    */
  var appFilterExtensions: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of MIME types for open with filtering. All apps
    * within the given app query scope which can open any of the given MIME
    * types will be included in the response. If appFilterExtensions are
    * provided as well, the result is a union of the two resulting app lists.
    */
  var appFilterMimeTypes: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A language or locale code, as defined by BCP 47, with some extensions
    * from Unicode's LDML format (http://www.unicode.org/reports/tr35/).
    */
  var languageCode: js.UndefOr[String] = js.native
}
object ParamsResourceAppsList {
  
  @scala.inline
  def apply(): ParamsResourceAppsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsListMutableBuilder[Self <: ParamsResourceAppsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppFilterExtensions(value: String): Self = StObject.set(x, "appFilterExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppFilterExtensionsUndefined: Self = StObject.set(x, "appFilterExtensions", js.undefined)
    
    @scala.inline
    def setAppFilterMimeTypes(value: String): Self = StObject.set(x, "appFilterMimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppFilterMimeTypesUndefined: Self = StObject.set(x, "appFilterMimeTypes", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
