package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the configuration for a replica in a cluster.
  */
trait SchemaGoogleCloudMlV1ReplicaConfig extends StObject {
  
  /**
    * Represents the type and number of accelerators used by the replica.
    * [Learn about restrictions on accelerator configurations for
    * training.](/ml-engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
    */
  var acceleratorConfig: js.UndefOr[SchemaGoogleCloudMlV1AcceleratorConfig] = js.undefined
  
  /**
    * The Docker image to run on the replica. This image must be in Container
    * Registry. Learn more about [configuring custom
    * containers](/ml-engine/docs/distributed-training-containers).
    */
  var imageUri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudMlV1ReplicaConfig {
  
  inline def apply(): SchemaGoogleCloudMlV1ReplicaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ReplicaConfig]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ReplicaConfig](x: Self) {
    
    inline def setAcceleratorConfig(value: SchemaGoogleCloudMlV1AcceleratorConfig): Self = StObject.set(x, "acceleratorConfig", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorConfigUndefined: Self = StObject.set(x, "acceleratorConfig", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
