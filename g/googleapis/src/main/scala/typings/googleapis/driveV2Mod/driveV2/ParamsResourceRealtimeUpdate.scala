package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceRealtimeUpdate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The revision of the model to diff the uploaded model against. If set, the
    * uploaded model is diffed against the provided revision and those
    * differences are merged with any changes made to the model after the
    * provided revision. If not set, the uploaded model replaces the current
    * model on the server.
    */
  var baseRevision: js.UndefOr[String] = js.native
  
  /**
    * The ID of the file that the Realtime API data model is associated with.
    */
  var fileId: js.UndefOr[String] = js.native
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
}
object ParamsResourceRealtimeUpdate {
  
  @scala.inline
  def apply(): ParamsResourceRealtimeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRealtimeUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceRealtimeUpdateMutableBuilder[Self <: ParamsResourceRealtimeUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBaseRevision(value: String): Self = StObject.set(x, "baseRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseRevisionUndefined: Self = StObject.set(x, "baseRevision", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
