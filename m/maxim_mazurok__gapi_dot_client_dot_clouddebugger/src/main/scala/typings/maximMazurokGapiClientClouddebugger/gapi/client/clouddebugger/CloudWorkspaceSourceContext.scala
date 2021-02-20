package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWorkspaceSourceContext extends StObject {
  
  /** The ID of the snapshot. An empty snapshot_id refers to the most recent snapshot. */
  var snapshotId: js.UndefOr[String] = js.native
  
  /** The ID of the workspace. */
  var workspaceId: js.UndefOr[CloudWorkspaceId] = js.native
}
object CloudWorkspaceSourceContext {
  
  @scala.inline
  def apply(): CloudWorkspaceSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWorkspaceSourceContext]
  }
  
  @scala.inline
  implicit class CloudWorkspaceSourceContextMutableBuilder[Self <: CloudWorkspaceSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: CloudWorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
