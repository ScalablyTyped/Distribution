package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWorkspaceSourceContext extends StObject {
  
  /** The ID of the snapshot. An empty snapshot_id refers to the most recent snapshot. */
  var snapshotId: js.UndefOr[String] = js.undefined
  
  /** The ID of the workspace. */
  var workspaceId: js.UndefOr[CloudWorkspaceId] = js.undefined
}
object CloudWorkspaceSourceContext {
  
  inline def apply(): CloudWorkspaceSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWorkspaceSourceContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWorkspaceSourceContext] (val x: Self) extends AnyVal {
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    
    inline def setWorkspaceId(value: CloudWorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
