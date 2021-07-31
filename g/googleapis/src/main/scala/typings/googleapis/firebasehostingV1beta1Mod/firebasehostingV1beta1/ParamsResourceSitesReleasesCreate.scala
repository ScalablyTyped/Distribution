package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitesReleasesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The site that the release belongs to, in the format:
    * <code>sites/<var>site-name</var></code>
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRelease] = js.undefined
  
  /**
    * The unique identifier for a version, in the format:
    * <code>/sites/<var>site-name</var>/versions/<var>versionID</var></code>
    * The <var>site-name</var> in this version identifier must match the
    * <var>site-name</var> in the `parent` parameter. <br> <br>This query
    * parameter must be empty if the `type` field in the request body is
    * `SITE_DISABLE`.
    */
  var versionName: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitesReleasesCreate {
  
  @scala.inline
  def apply(): ParamsResourceSitesReleasesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesReleasesCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceSitesReleasesCreateMutableBuilder[Self <: ParamsResourceSitesReleasesCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaRelease): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
