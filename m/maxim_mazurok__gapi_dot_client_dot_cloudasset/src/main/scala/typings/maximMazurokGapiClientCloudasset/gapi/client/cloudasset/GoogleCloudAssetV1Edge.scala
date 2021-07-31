package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssetV1Edge extends StObject {
  
  /** The source node of the edge. For example, it could be a full resource name for a resource node or an email of an identity. */
  var sourceNode: js.UndefOr[String] = js.undefined
  
  /** The target node of the edge. For example, it could be a full resource name for a resource node or an email of an identity. */
  var targetNode: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssetV1Edge {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1Edge]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1EdgeMutableBuilder[Self <: GoogleCloudAssetV1Edge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceNode(value: String): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
    
    @scala.inline
    def setTargetNode(value: String): Self = StObject.set(x, "targetNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNodeUndefined: Self = StObject.set(x, "targetNode", js.undefined)
  }
}
