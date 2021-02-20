package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WorkloadMetadataConfig defines the metadata configuration to expose to
  * workloads on the node pool.
  */
@js.native
trait SchemaWorkloadMetadataConfig extends StObject {
  
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
  implicit class SchemaWorkloadMetadataConfigMutableBuilder[Self <: SchemaWorkloadMetadataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeMetadata(value: String): Self = StObject.set(x, "nodeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeMetadataUndefined: Self = StObject.set(x, "nodeMetadata", js.undefined)
  }
}
