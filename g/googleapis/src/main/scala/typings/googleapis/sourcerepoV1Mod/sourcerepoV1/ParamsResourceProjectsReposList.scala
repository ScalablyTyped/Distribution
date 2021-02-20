package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsReposList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The project ID whose repos should be listed. Values are of the form
    * `projects/<project>`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of repositories to return; between 1 and 500. If not set
    * or zero, defaults to 100 at the server.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Resume listing repositories where a prior ListReposResponse left off.
    * This is an opaque token that must be obtained from a recent, prior
    * ListReposResponse's next_page_token field.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsReposList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsReposList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsReposList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsReposListMutableBuilder[Self <: ParamsResourceProjectsReposList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
