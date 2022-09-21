package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupAffinity extends StObject {
  
  /**
    * Required. The URI of a sole-tenant node group resource (https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups) that the cluster will be created on.A full URL, partial URI, or node group name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-central1-a/nodeGroups/node-group-1 projects/[project_id]/zones/us-central1-a/nodeGroups/node-group-1 node-group-1
    */
  var nodeGroupUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaNodeGroupAffinity {
  
  inline def apply(): SchemaNodeGroupAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupAffinity]
  }
  
  extension [Self <: SchemaNodeGroupAffinity](x: Self) {
    
    inline def setNodeGroupUri(value: String): Self = StObject.set(x, "nodeGroupUri", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupUriNull: Self = StObject.set(x, "nodeGroupUri", null)
    
    inline def setNodeGroupUriUndefined: Self = StObject.set(x, "nodeGroupUri", js.undefined)
  }
}
