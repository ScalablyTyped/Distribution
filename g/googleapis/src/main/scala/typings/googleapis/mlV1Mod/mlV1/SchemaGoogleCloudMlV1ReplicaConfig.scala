package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the configuration for a replica in a cluster.
  */
@js.native
trait SchemaGoogleCloudMlV1ReplicaConfig extends js.Object {
  
  /**
    * Represents the type and number of accelerators used by the replica.
    * [Learn about restrictions on accelerator configurations for
    * training.](/ml-engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
    */
  var acceleratorConfig: js.UndefOr[SchemaGoogleCloudMlV1AcceleratorConfig] = js.native
  
  /**
    * The Docker image to run on the replica. This image must be in Container
    * Registry. Learn more about [configuring custom
    * containers](/ml-engine/docs/distributed-training-containers).
    */
  var imageUri: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1ReplicaConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1ReplicaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ReplicaConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ReplicaConfigOps[Self <: SchemaGoogleCloudMlV1ReplicaConfig] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorConfig(value: SchemaGoogleCloudMlV1AcceleratorConfig): Self = this.set("acceleratorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorConfig: Self = this.set("acceleratorConfig", js.undefined)
    
    @scala.inline
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
  }
}
