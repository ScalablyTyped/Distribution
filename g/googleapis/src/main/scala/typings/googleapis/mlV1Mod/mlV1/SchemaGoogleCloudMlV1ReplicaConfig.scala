package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1ReplicaConfig extends StObject {
  
  /**
    * Represents the type and number of accelerators used by the replica. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu)
    */
  var acceleratorConfig: js.UndefOr[SchemaGoogleCloudMlV1AcceleratorConfig] = js.undefined
  
  /**
    * Arguments to the entrypoint command. The following rules apply for container_command and container_args: - If you do not supply command or args: The defaults defined in the Docker image are used. - If you supply a command but no args: The default EntryPoint and the default Cmd defined in the Docker image are ignored. Your command is run without any arguments. - If you supply only args: The default Entrypoint defined in the Docker image is run with the args that you supplied. - If you supply a command and args: The default Entrypoint and the default Cmd defined in the Docker image are ignored. Your command is run with your args. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
    */
  var containerArgs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The command with which the replica's custom container is run. If provided, it will override default ENTRYPOINT of the docker image. If not provided, the docker image's ENTRYPOINT is used. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
    */
  var containerCommand: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Represents the configuration of disk options.
    */
  var diskConfig: js.UndefOr[SchemaGoogleCloudMlV1DiskConfig] = js.undefined
  
  /**
    * The Docker image to run on the replica. This image must be in Container Registry. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
    */
  var imageUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The AI Platform runtime version that includes a TensorFlow version matching the one used in the custom container. This field is required if the replica is a TPU worker that uses a custom container. Otherwise, do not specify this field. This must be a [runtime version that currently supports training with TPUs](/ml-engine/docs/tensorflow/runtime-version-list#tpu-support). Note that the version of TensorFlow included in a runtime version may differ from the numbering of the runtime version itself, because it may have a different [patch version](https://www.tensorflow.org/guide/version_compat#semantic_versioning_20). In this field, you must specify the runtime version (TensorFlow minor version). For example, if your custom container runs TensorFlow `1.x.y`, specify `1.x`.
    */
  var tpuTfVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1ReplicaConfig {
  
  inline def apply(): SchemaGoogleCloudMlV1ReplicaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ReplicaConfig]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ReplicaConfig](x: Self) {
    
    inline def setAcceleratorConfig(value: SchemaGoogleCloudMlV1AcceleratorConfig): Self = StObject.set(x, "acceleratorConfig", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorConfigUndefined: Self = StObject.set(x, "acceleratorConfig", js.undefined)
    
    inline def setContainerArgs(value: js.Array[String]): Self = StObject.set(x, "containerArgs", value.asInstanceOf[js.Any])
    
    inline def setContainerArgsNull: Self = StObject.set(x, "containerArgs", null)
    
    inline def setContainerArgsUndefined: Self = StObject.set(x, "containerArgs", js.undefined)
    
    inline def setContainerArgsVarargs(value: String*): Self = StObject.set(x, "containerArgs", js.Array(value*))
    
    inline def setContainerCommand(value: js.Array[String]): Self = StObject.set(x, "containerCommand", value.asInstanceOf[js.Any])
    
    inline def setContainerCommandNull: Self = StObject.set(x, "containerCommand", null)
    
    inline def setContainerCommandUndefined: Self = StObject.set(x, "containerCommand", js.undefined)
    
    inline def setContainerCommandVarargs(value: String*): Self = StObject.set(x, "containerCommand", js.Array(value*))
    
    inline def setDiskConfig(value: SchemaGoogleCloudMlV1DiskConfig): Self = StObject.set(x, "diskConfig", value.asInstanceOf[js.Any])
    
    inline def setDiskConfigUndefined: Self = StObject.set(x, "diskConfig", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriNull: Self = StObject.set(x, "imageUri", null)
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    inline def setTpuTfVersion(value: String): Self = StObject.set(x, "tpuTfVersion", value.asInstanceOf[js.Any])
    
    inline def setTpuTfVersionNull: Self = StObject.set(x, "tpuTfVersion", null)
    
    inline def setTpuTfVersionUndefined: Self = StObject.set(x, "tpuTfVersion", js.undefined)
  }
}
