package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1TrainingInput extends StObject {
  
  /**
    * Optional. Command-line arguments passed to the training application when it starts. If your job uses a custom container, then the arguments are passed to the container's `ENTRYPOINT` command.
    */
  var args: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Whether you want AI Platform Training to enable [interactive shell access](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) to training containers. If set to `true`, you can access interactive shells at the URIs given by TrainingOutput.web_access_uris or HyperparameterOutput.web_access_uris (within TrainingOutput.trials).
    */
  var enableWebAccess: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Options for using customer-managed encryption keys (CMEK) to protect resources created by a training job, instead of using Google's default encryption. If this is set, then all resources created by the training job will be encrypted with the customer-managed encryption key that you specify. [Learn how and when to use CMEK with AI Platform Training](/ai-platform/training/docs/cmek).
    */
  var encryptionConfig: js.UndefOr[SchemaGoogleCloudMlV1EncryptionConfig] = js.undefined
  
  /**
    * Optional. The configuration for evaluators. You should only set `evaluatorConfig.acceleratorConfig` if `evaluatorType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `evaluatorConfig.imageUri` only if you build a custom image for your evaluator. If `evaluatorConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
    */
  var evaluatorConfig: js.UndefOr[SchemaGoogleCloudMlV1ReplicaConfig] = js.undefined
  
  /**
    * Optional. The number of evaluator replicas to use for the training job. Each replica in the cluster will be of the type specified in `evaluator_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `evaluator_type`. The default value is zero.
    */
  var evaluatorCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies the type of virtual machine to use for your training job's evaluator nodes. The supported values are the same as those described in the entry for `masterType`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. This value must be present when `scaleTier` is set to `CUSTOM` and `evaluatorCount` is greater than zero.
    */
  var evaluatorType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The set of Hyperparameters to tune.
    */
  var hyperparameters: js.UndefOr[SchemaGoogleCloudMlV1HyperparameterSpec] = js.undefined
  
  /**
    * Optional. A Google Cloud Storage path in which to store training outputs and other data needed for training. This path is passed to your TensorFlow program as the '--job-dir' command-line argument. The benefit of specifying this field is that Cloud ML validates the path for use in training.
    */
  var jobDir: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The configuration for your master worker. You should only set `masterConfig.acceleratorConfig` if `masterType` is set to a Compute Engine machine type. Learn about [restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `masterConfig.imageUri` only if you build a custom image. Only one of `masterConfig.imageUri` and `runtimeVersion` should be set. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
    */
  var masterConfig: js.UndefOr[SchemaGoogleCloudMlV1ReplicaConfig] = js.undefined
  
  /**
    * Optional. Specifies the type of virtual machine to use for your training job's master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. See the [list of compatible Compute Engine machine types](/ai-platform/training/docs/machine-types#compute-engine-machine-types). Alternatively, you can use the certain legacy machine types in this field. See the [list of legacy machine types](/ai-platform/training/docs/machine-types#legacy-machine-types). Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPUs](/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
    */
  var masterType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The full name of the [Compute Engine network](/vpc/docs/vpc) to which the Job is peered. For example, `projects/12345/global/networks/myVPC`. The format of this field is `projects/{project\}/global/networks/{network\}`, where {project\} is a project number (like `12345`) and {network\} is network name. Private services access must already be configured for the network. If left unspecified, the Job is not peered with any network. [Learn about using VPC Network Peering.](/ai-platform/training/docs/vpc-peering).
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The Google Cloud Storage location of the packages with the training program and any additional dependencies. The maximum number of package URIs is 100.
    */
  var packageUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The configuration for parameter servers. You should only set `parameterServerConfig.acceleratorConfig` if `parameterServerType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `parameterServerConfig.imageUri` only if you build a custom image for your parameter server. If `parameterServerConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
    */
  var parameterServerConfig: js.UndefOr[SchemaGoogleCloudMlV1ReplicaConfig] = js.undefined
  
  /**
    * Optional. The number of parameter server replicas to use for the training job. Each replica in the cluster will be of the type specified in `parameter_server_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `parameter_server_type`. The default value is zero.
    */
  var parameterServerCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies the type of virtual machine to use for your training job's parameter server. The supported values are the same as those described in the entry for `master_type`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. This value must be present when `scaleTier` is set to `CUSTOM` and `parameter_server_count` is greater than zero.
    */
  var parameterServerType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The Python module name to run after installing the packages.
    */
  var pythonModule: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The version of Python used in training. You must either specify this field or specify `masterConfig.imageUri`. The following Python versions are available: * Python '3.7' is available when `runtime_version` is set to '1.15' or later. * Python '3.5' is available when `runtime_version` is set to a version from '1.4' to '1.14'. * Python '2.7' is available when `runtime_version` is set to '1.15' or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
    */
  var pythonVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The region to run the training job in. See the [available regions](/ai-platform/training/docs/regions) for AI Platform Training.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The AI Platform runtime version to use for training. You must either specify this field or specify `masterConfig.imageUri`. For more information, see the [runtime version list](/ai-platform/training/docs/runtime-version-list) and learn [how to manage runtime versions](/ai-platform/training/docs/versioning).
    */
  var runtimeVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Specifies the machine types, the number of replicas for workers and parameter servers.
    */
  var scaleTier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Scheduling options for a training job.
    */
  var scheduling: js.UndefOr[SchemaGoogleCloudMlV1Scheduling] = js.undefined
  
  /**
    * Optional. The email address of a service account to use when running the training appplication. You must have the `iam.serviceAccounts.actAs` permission for the specified service account. In addition, the AI Platform Training Google-managed service account must have the `roles/iam.serviceAccountAdmin` role for the specified service account. [Learn more about configuring a service account.](/ai-platform/training/docs/custom-service-account) If not specified, the AI Platform Training Google-managed service account is used by default.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Use `chief` instead of `master` in the `TF_CONFIG` environment variable when training with a custom container. Defaults to `false`. [Learn more about this field.](/ai-platform/training/docs/distributed-training-details#chief-versus-master) This field has no effect for training jobs that don't use a custom container.
    */
  var useChiefInTfConfig: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The configuration for workers. You should only set `workerConfig.acceleratorConfig` if `workerType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `workerConfig.imageUri` only if you build a custom image for your worker. If `workerConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
    */
  var workerConfig: js.UndefOr[SchemaGoogleCloudMlV1ReplicaConfig] = js.undefined
  
  /**
    * Optional. The number of worker replicas to use for the training job. Each replica in the cluster will be of the type specified in `worker_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `worker_type`. The default value is zero.
    */
  var workerCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies the type of virtual machine to use for your training job's worker nodes. The supported values are the same as those described in the entry for `masterType`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. If you use `cloud_tpu` for this value, see special instructions for [configuring a custom TPU machine](/ml-engine/docs/tensorflow/using-tpus#configuring_a_custom_tpu_machine). This value must be present when `scaleTier` is set to `CUSTOM` and `workerCount` is greater than zero.
    */
  var workerType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1TrainingInput {
  
  inline def apply(): SchemaGoogleCloudMlV1TrainingInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1TrainingInput]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1TrainingInput](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setEnableWebAccess(value: Boolean): Self = StObject.set(x, "enableWebAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableWebAccessNull: Self = StObject.set(x, "enableWebAccess", null)
    
    inline def setEnableWebAccessUndefined: Self = StObject.set(x, "enableWebAccess", js.undefined)
    
    inline def setEncryptionConfig(value: SchemaGoogleCloudMlV1EncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setEvaluatorConfig(value: SchemaGoogleCloudMlV1ReplicaConfig): Self = StObject.set(x, "evaluatorConfig", value.asInstanceOf[js.Any])
    
    inline def setEvaluatorConfigUndefined: Self = StObject.set(x, "evaluatorConfig", js.undefined)
    
    inline def setEvaluatorCount(value: String): Self = StObject.set(x, "evaluatorCount", value.asInstanceOf[js.Any])
    
    inline def setEvaluatorCountNull: Self = StObject.set(x, "evaluatorCount", null)
    
    inline def setEvaluatorCountUndefined: Self = StObject.set(x, "evaluatorCount", js.undefined)
    
    inline def setEvaluatorType(value: String): Self = StObject.set(x, "evaluatorType", value.asInstanceOf[js.Any])
    
    inline def setEvaluatorTypeNull: Self = StObject.set(x, "evaluatorType", null)
    
    inline def setEvaluatorTypeUndefined: Self = StObject.set(x, "evaluatorType", js.undefined)
    
    inline def setHyperparameters(value: SchemaGoogleCloudMlV1HyperparameterSpec): Self = StObject.set(x, "hyperparameters", value.asInstanceOf[js.Any])
    
    inline def setHyperparametersUndefined: Self = StObject.set(x, "hyperparameters", js.undefined)
    
    inline def setJobDir(value: String): Self = StObject.set(x, "jobDir", value.asInstanceOf[js.Any])
    
    inline def setJobDirNull: Self = StObject.set(x, "jobDir", null)
    
    inline def setJobDirUndefined: Self = StObject.set(x, "jobDir", js.undefined)
    
    inline def setMasterConfig(value: SchemaGoogleCloudMlV1ReplicaConfig): Self = StObject.set(x, "masterConfig", value.asInstanceOf[js.Any])
    
    inline def setMasterConfigUndefined: Self = StObject.set(x, "masterConfig", js.undefined)
    
    inline def setMasterType(value: String): Self = StObject.set(x, "masterType", value.asInstanceOf[js.Any])
    
    inline def setMasterTypeNull: Self = StObject.set(x, "masterType", null)
    
    inline def setMasterTypeUndefined: Self = StObject.set(x, "masterType", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPackageUris(value: js.Array[String]): Self = StObject.set(x, "packageUris", value.asInstanceOf[js.Any])
    
    inline def setPackageUrisNull: Self = StObject.set(x, "packageUris", null)
    
    inline def setPackageUrisUndefined: Self = StObject.set(x, "packageUris", js.undefined)
    
    inline def setPackageUrisVarargs(value: String*): Self = StObject.set(x, "packageUris", js.Array(value*))
    
    inline def setParameterServerConfig(value: SchemaGoogleCloudMlV1ReplicaConfig): Self = StObject.set(x, "parameterServerConfig", value.asInstanceOf[js.Any])
    
    inline def setParameterServerConfigUndefined: Self = StObject.set(x, "parameterServerConfig", js.undefined)
    
    inline def setParameterServerCount(value: String): Self = StObject.set(x, "parameterServerCount", value.asInstanceOf[js.Any])
    
    inline def setParameterServerCountNull: Self = StObject.set(x, "parameterServerCount", null)
    
    inline def setParameterServerCountUndefined: Self = StObject.set(x, "parameterServerCount", js.undefined)
    
    inline def setParameterServerType(value: String): Self = StObject.set(x, "parameterServerType", value.asInstanceOf[js.Any])
    
    inline def setParameterServerTypeNull: Self = StObject.set(x, "parameterServerType", null)
    
    inline def setParameterServerTypeUndefined: Self = StObject.set(x, "parameterServerType", js.undefined)
    
    inline def setPythonModule(value: String): Self = StObject.set(x, "pythonModule", value.asInstanceOf[js.Any])
    
    inline def setPythonModuleNull: Self = StObject.set(x, "pythonModule", null)
    
    inline def setPythonModuleUndefined: Self = StObject.set(x, "pythonModule", js.undefined)
    
    inline def setPythonVersion(value: String): Self = StObject.set(x, "pythonVersion", value.asInstanceOf[js.Any])
    
    inline def setPythonVersionNull: Self = StObject.set(x, "pythonVersion", null)
    
    inline def setPythonVersionUndefined: Self = StObject.set(x, "pythonVersion", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionNull: Self = StObject.set(x, "runtimeVersion", null)
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
    
    inline def setScaleTier(value: String): Self = StObject.set(x, "scaleTier", value.asInstanceOf[js.Any])
    
    inline def setScaleTierNull: Self = StObject.set(x, "scaleTier", null)
    
    inline def setScaleTierUndefined: Self = StObject.set(x, "scaleTier", js.undefined)
    
    inline def setScheduling(value: SchemaGoogleCloudMlV1Scheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setUseChiefInTfConfig(value: Boolean): Self = StObject.set(x, "useChiefInTfConfig", value.asInstanceOf[js.Any])
    
    inline def setUseChiefInTfConfigNull: Self = StObject.set(x, "useChiefInTfConfig", null)
    
    inline def setUseChiefInTfConfigUndefined: Self = StObject.set(x, "useChiefInTfConfig", js.undefined)
    
    inline def setWorkerConfig(value: SchemaGoogleCloudMlV1ReplicaConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
    
    inline def setWorkerCount(value: String): Self = StObject.set(x, "workerCount", value.asInstanceOf[js.Any])
    
    inline def setWorkerCountNull: Self = StObject.set(x, "workerCount", null)
    
    inline def setWorkerCountUndefined: Self = StObject.set(x, "workerCount", js.undefined)
    
    inline def setWorkerType(value: String): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
    
    inline def setWorkerTypeNull: Self = StObject.set(x, "workerType", null)
    
    inline def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
  }
}
