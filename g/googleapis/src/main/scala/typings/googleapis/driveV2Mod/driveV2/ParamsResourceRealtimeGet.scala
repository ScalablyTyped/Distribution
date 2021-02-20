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
trait ParamsResourceRealtimeGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the file that the Realtime API data model is associated with.
    */
  var fileId: js.UndefOr[String] = js.native
  
  /**
    * The revision of the Realtime API data model to export. Revisions start at
    * 1 (the initial empty data model) and are incremented with each change. If
    * this parameter is excluded, the most recent data model will be returned.
    */
  var revision: js.UndefOr[Double] = js.native
}
object ParamsResourceRealtimeGet {
  
  @scala.inline
  def apply(): ParamsResourceRealtimeGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRealtimeGet]
  }
  
  @scala.inline
  implicit class ParamsResourceRealtimeGetMutableBuilder[Self <: ParamsResourceRealtimeGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
