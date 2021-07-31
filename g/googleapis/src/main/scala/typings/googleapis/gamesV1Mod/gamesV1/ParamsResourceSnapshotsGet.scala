package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSnapshotsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var snapshotId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSnapshotsGet {
  
  @scala.inline
  def apply(): ParamsResourceSnapshotsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSnapshotsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceSnapshotsGetMutableBuilder[Self <: ParamsResourceSnapshotsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
