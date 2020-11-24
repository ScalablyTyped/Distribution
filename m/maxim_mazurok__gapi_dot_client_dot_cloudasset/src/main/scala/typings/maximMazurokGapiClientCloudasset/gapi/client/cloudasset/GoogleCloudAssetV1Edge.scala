package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssetV1Edge extends js.Object {
  
  /** The source node of the edge. For example, it could be a full resource name for a resource node or an email of an identity. */
  var sourceNode: js.UndefOr[String] = js.native
  
  /** The target node of the edge. For example, it could be a full resource name for a resource node or an email of an identity. */
  var targetNode: js.UndefOr[String] = js.native
}
object GoogleCloudAssetV1Edge {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1Edge]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1EdgeOps[Self <: GoogleCloudAssetV1Edge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSourceNode(value: String): Self = this.set("sourceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceNode: Self = this.set("sourceNode", js.undefined)
    
    @scala.inline
    def setTargetNode(value: String): Self = this.set("targetNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetNode: Self = this.set("targetNode", js.undefined)
  }
}
