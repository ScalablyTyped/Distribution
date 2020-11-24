package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WorkloadMetadataConfig defines the metadata configuration to expose to
  * workloads on the node pool.
  */
@js.native
trait SchemaWorkloadMetadataConfig extends js.Object {
  
  /**
    * NodeMetadata is the configuration for how to expose the node metadata to
    * the workload running on the node.
    */
  var nodeMetadata: js.UndefOr[String] = js.native
}
object SchemaWorkloadMetadataConfig {
  
  @scala.inline
  def apply(): SchemaWorkloadMetadataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkloadMetadataConfig]
  }
  
  @scala.inline
  implicit class SchemaWorkloadMetadataConfigOps[Self <: SchemaWorkloadMetadataConfig] (val x: Self) extends AnyVal {
    
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
    def setNodeMetadata(value: String): Self = this.set("nodeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeMetadata: Self = this.set("nodeMetadata", js.undefined)
  }
}
