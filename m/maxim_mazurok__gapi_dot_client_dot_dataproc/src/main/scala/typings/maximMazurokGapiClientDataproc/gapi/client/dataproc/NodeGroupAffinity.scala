package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupAffinity extends StObject {
  
  /**
    * Required. The URI of a sole-tenant node group resource (https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups) that the cluster will be created on.A full URL, partial
    * URI, or node group name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-central1-a/nodeGroups/node-group-1
    * projects/[project_id]/zones/us-central1-a/nodeGroups/node-group-1 node-group-1
    */
  var nodeGroupUri: js.UndefOr[String] = js.undefined
}
object NodeGroupAffinity {
  
  inline def apply(): NodeGroupAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupAffinity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeGroupAffinity] (val x: Self) extends AnyVal {
    
    inline def setNodeGroupUri(value: String): Self = StObject.set(x, "nodeGroupUri", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupUriUndefined: Self = StObject.set(x, "nodeGroupUri", js.undefined)
  }
}
