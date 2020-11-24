package typings.kafkaNode.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.kafkaNode.anon.ControllerId
import typings.kafkaNode.anon.Isr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterMetadataResponse extends js.Object {
  
  var clusterMetadata: ControllerId = js.native
  
  var metadata: StringDictionary[NumberDictionary[Isr]] = js.native
}
object ClusterMetadataResponse {
  
  @scala.inline
  def apply(clusterMetadata: ControllerId, metadata: StringDictionary[NumberDictionary[Isr]]): ClusterMetadataResponse = {
    val __obj = js.Dynamic.literal(clusterMetadata = clusterMetadata.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMetadataResponse]
  }
  
  @scala.inline
  implicit class ClusterMetadataResponseOps[Self <: ClusterMetadataResponse] (val x: Self) extends AnyVal {
    
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
    def setClusterMetadata(value: ControllerId): Self = this.set("clusterMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: StringDictionary[NumberDictionary[Isr]]): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
}
