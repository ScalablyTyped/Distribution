package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSnapshotsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Maximum number of snapshots to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The value returned by the last `ListSnapshotsResponse`; indicates that
    * this is a continuation of a prior `ListSnapshots` call, and that the
    * system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project in which to list snapshots. Format is
    * `projects/{project-id}`.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSnapshotsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsSnapshotsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSnapshotsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsSnapshotsListMutableBuilder[Self <: ParamsResourceProjectsSnapshotsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
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
