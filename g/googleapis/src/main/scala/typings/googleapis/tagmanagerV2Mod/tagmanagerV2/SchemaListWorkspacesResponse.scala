package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of workspaces in a container.
  */
trait SchemaListWorkspacesResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * All Workspaces of a GTM Container.
    */
  var workspace: js.UndefOr[js.Array[SchemaWorkspace]] = js.undefined
}
object SchemaListWorkspacesResponse {
  
  inline def apply(): SchemaListWorkspacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWorkspacesResponse]
  }
  
  extension [Self <: SchemaListWorkspacesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkspace(value: js.Array[SchemaWorkspace]): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceUndefined: Self = StObject.set(x, "workspace", js.undefined)
    
    inline def setWorkspaceVarargs(value: SchemaWorkspace*): Self = StObject.set(x, "workspace", js.Array(value :_*))
  }
}
