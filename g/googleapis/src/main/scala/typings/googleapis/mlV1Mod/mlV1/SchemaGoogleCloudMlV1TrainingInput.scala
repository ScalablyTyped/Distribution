package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents input parameters for a training job. When using the gcloud
  * command to submit your training job, you can specify the input parameters
  * as command-line arguments and/or in a YAML configuration file referenced
  * from the --config command-line argument. For details, see the guide to
  * &lt;a
  * href=&quot;/ml-engine/docs/tensorflow/training-jobs&quot;&gt;submitting a
  * training job&lt;/a&gt;.
  */
@js.native
trait SchemaGoogleCloudMlV1TrainingInput extends StObject {
  
  /**
    * Optional. Command line arguments to pass to the program.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The set of Hyperparameters to tune.
    */
  var hyperparameters: js.UndefOr[SchemaGoogleCloudMlV1HyperparameterSpec] = js.native
  
  /**
    * Optional. A Google Cloud Storage path in which to store training outputs
    * and other data needed for training. This path is passed to your
    * TensorFlow program as the &#39;--job-dir&#39; command-line argument. The
    * benefit of specifying this field is that Cloud ML validates the path for
    * use in training.
    */
  var jobDir: js.UndefOr[String] = js.native
  
  /**
    * Optional. The configuration for your master worker.  You should only set
    * `masterConfig.acceleratorConfig` if `masterType` is set to a Compute
    * Engine machine type. Learn about [restrictions on accelerator
    * configurations for
    * training.](/ml-engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
    * Set `masterConfig.imageUri` only if you build a custom image. Only one of
    * `masterConfig.imageUri` and `runtimeVersion` should be set. Learn more
    * about [configuring custom
    * containers](/ml-engine/docs/distributed-training-containers).
    */
  var masterConfig: js.UndefOr[SchemaGoogleCloudMlV1ReplicaConfig] = js.native
  
  /**
    * Optional. Specifies the type of virtual machine to use for your training
    * job&#39;s master worker.  The following types are supported:  &lt;dl&gt;
    * &lt;dt&gt;standard&lt;/dt&gt;   &lt;dd&gt;   A basic machine
    * configuration suitable for training simple models with   small to
    * moderate datasets.   &lt;/dd&gt;   &lt;dt&gt;large_model&lt;/dt&gt;
    * &lt;dd&gt;   A machine with a lot of memory, specially suited for
    * parameter servers   when your model is large (having many hidden layers
    * or layers with very   large numbers of nodes).   &lt;/dd&gt;
    * &lt;dt&gt;complex_model_s&lt;/dt&gt;   &lt;dd&gt;   A machine suitable
    * for the master and workers of the cluster when your   model requires more
    * computation than the standard machine can handle   satisfactorily.
    * &lt;/dd&gt;   &lt;dt&gt;complex_model_m&lt;/dt&gt;   &lt;dd&gt;   A
    * machine with roughly twice the number of cores and roughly double the
    * memory of &lt;i&gt;complex_model_s&lt;/i&gt;.   &lt;/dd&gt;
    * &lt;dt&gt;complex_model_l&lt;/dt&gt;   &lt;dd&gt;   A machine with
    * roughly twice the number of cores and roughly double the   memory of
    * &lt;i&gt;complex_model_m&lt;/i&gt;.   &lt;/dd&gt;
    * &lt;dt&gt;standard_gpu&lt;/dt&gt;   &lt;dd&gt;   A machine equivalent to
    * &lt;i&gt;standard&lt;/i&gt; that   also includes a single NVIDIA Tesla
    * K80 GPU. See more about   &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/using-gpus&quot;&gt;using GPUs to
    * train your model&lt;/a&gt;.   &lt;/dd&gt;
    * &lt;dt&gt;complex_model_m_gpu&lt;/dt&gt;   &lt;dd&gt;   A machine
    * equivalent to &lt;i&gt;complex_model_m&lt;/i&gt; that also includes four
    * NVIDIA Tesla K80 GPUs.   &lt;/dd&gt;
    * &lt;dt&gt;complex_model_l_gpu&lt;/dt&gt;   &lt;dd&gt;   A machine
    * equivalent to &lt;i&gt;complex_model_l&lt;/i&gt; that also includes eight
    * NVIDIA Tesla K80 GPUs.   &lt;/dd&gt;   &lt;dt&gt;standard_p100&lt;/dt&gt;
    * &lt;dd&gt;   A machine equivalent to &lt;i&gt;standard&lt;/i&gt; that
    * also includes a single NVIDIA Tesla P100 GPU.   &lt;/dd&gt;
    * &lt;dt&gt;complex_model_m_p100&lt;/dt&gt;   &lt;dd&gt;   A machine
    * equivalent to &lt;i&gt;complex_model_m&lt;/i&gt; that also includes four
    * NVIDIA Tesla P100 GPUs.   &lt;/dd&gt; &lt;dt&gt;standard_v100&lt;/dt&gt;
    * &lt;dd&gt;   A machine equivalent to &lt;i&gt;standard&lt;/i&gt; that
    * also includes a single NVIDIA Tesla V100 GPU.   &lt;/dd&gt;
    * &lt;dt&gt;large_model_v100&lt;/dt&gt;   &lt;dd&gt;   A machine equivalent
    * to &lt;i&gt;large_model&lt;/i&gt; that   also includes a single NVIDIA
    * Tesla V100 GPU.   &lt;/dd&gt;   &lt;dt&gt;complex_model_m_v100&lt;/dt&gt;
    * &lt;dd&gt;   A machine equivalent to &lt;i&gt;complex_model_m&lt;/i&gt;
    * that   also includes four NVIDIA Tesla V100 GPUs.   &lt;/dd&gt;
    * &lt;dt&gt;complex_model_l_v100&lt;/dt&gt;   &lt;dd&gt;   A machine
    * equivalent to &lt;i&gt;complex_model_l&lt;/i&gt; that   also includes
    * eight NVIDIA Tesla V100 GPUs.   &lt;/dd&gt;
    * &lt;dt&gt;cloud_tpu&lt;/dt&gt;   &lt;dd&gt;   A TPU VM including one
    * Cloud TPU. See more about   &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/using-tpus&quot;&gt;using TPUs to
    * train   your model&lt;/a&gt;.   &lt;/dd&gt; &lt;/dl&gt;  You may also use
    * certain Compute Engine machine types directly in this field. The
    * following types are supported:  - `n1-standard-4` - `n1-standard-8` -
    * `n1-standard-16` - `n1-standard-32` - `n1-standard-64` - `n1-standard-96`
    * - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` -
    * `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` -
    * `n1-highcpu-32` - `n1-highcpu-64` - `n1-highcpu-96`  See more about
    * [using Compute Engine machine
    * types](/ml-engine/docs/tensorflow/machine-types#compute-engine-machine-types).
    * You must set this value when `scaleTier` is set to `CUSTOM`.
    */
  var masterType: js.UndefOr[String] = js.native
  
  /**
    * Required. The Google Cloud Storage location of the packages with the
    * training program and any additional dependencies. The maximum number of
    * package URIs is 100.
    */
  var packageUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The configuration for parameter servers.  You should only set
    * `parameterServerConfig.acceleratorConfig` if `parameterServerConfigType`
    * is set to a Compute Engine machine type. [Learn about restrictions on
    * accelerator configurations for
    * training.](/ml-engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
    * Set `parameterServerConfig.imageUri` only if you build a custom image for
    * your parameter server. If `parameterServerConfig.imageUri` has not been
    * set, Cloud ML Engine uses the value of `masterConfig.imageUri`. Learn
    * more about [configuring custom
    * containers](/ml-engine/docs/distributed-training-containers).
    */
  var parameterServerConfig: js.UndefOr[SchemaGoogleCloudMlV1ReplicaConfig] = js.native
  
  /**
    * Optional. The number of parameter server replicas to use for the training
    * job. Each replica in the cluster will be of the type specified in
    * `parameter_server_type`.  This value can only be used when `scale_tier`
    * is set to `CUSTOM`.If you set this value, you must also set
    * `parameter_server_type`.  The default value is zero.
    */
  var parameterServerCount: js.UndefOr[String] = js.native
  
  /**
    * Optional. Specifies the type of virtual machine to use for your training
    * job&#39;s parameter server.  The supported values are the same as those
    * described in the entry for `master_type`.  This value must be consistent
    * with the category of machine type that `masterType` uses. In other words,
    * both must be Cloud ML Engine machine types or both must be Compute Engine
    * machine types.  This value must be present when `scaleTier` is set to
    * `CUSTOM` and `parameter_server_count` is greater than zero.
    */
  var parameterServerType: js.UndefOr[String] = js.native
  
  /**
    * Required. The Python module name to run after installing the packages.
    */
  var pythonModule: js.UndefOr[String] = js.native
  
  /**
    * Optional. The version of Python used in training. If not set, the default
    * version is &#39;2.7&#39;. Python &#39;3.5&#39; is available when
    * `runtime_version` is set to &#39;1.4&#39; and above. Python &#39;2.7&#39;
    * works with all supported &lt;a
    * href=&quot;/ml-engine/docs/runtime-version-list&quot;&gt;runtime
    * versions&lt;/a&gt;.
    */
  var pythonVersion: js.UndefOr[String] = js.native
  
  /**
    * Required. The Google Compute Engine region to run the training job in.
    * See the &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/regions&quot;&gt;available
    * regions&lt;/a&gt; for ML Engine services.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Optional. The Cloud ML Engine runtime version to use for training. If not
    * set, Cloud ML Engine uses the default stable version, 1.0. For more
    * information, see the &lt;a
    * href=&quot;/ml-engine/docs/runtime-version-list&quot;&gt;runtime version
    * list&lt;/a&gt; and &lt;a
    * href=&quot;/ml-engine/docs/versioning&quot;&gt;how to manage runtime
    * versions&lt;/a&gt;.
    */
  var runtimeVersion: js.UndefOr[String] = js.native
  
  /**
    * Required. Specifies the machine types, the number of replicas for workers
    * and parameter servers.
    */
  var scaleTier: js.UndefOr[String] = js.native
  
  /**
    * Optional. The configuration for workers.  You should only set
    * `workerConfig.acceleratorConfig` if `workerType` is set to a Compute
    * Engine machine type. [Learn about restrictions on accelerator
    * configurations for
    * training.](/ml-engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
    * Set `workerConfig.imageUri` only if you build a custom image for your
    * worker. If `workerConfig.imageUri` has not been set, Cloud ML Engine uses
    * the value of `masterConfig.imageUri`. Learn more about [configuring
    * custom containers](/ml-engine/docs/distributed-training-containers).
    */
  var workerConfig: js.UndefOr[SchemaGoogleCloudMlV1ReplicaConfig] = js.native
  
  /**
    * Optional. The number of worker replicas to use for the training job. Each
    * replica in the cluster will be of the type specified in `worker_type`.
    * This value can only be used when `scale_tier` is set to `CUSTOM`. If you
    * set this value, you must also set `worker_type`.  The default value is
    * zero.
    */
  var workerCount: js.UndefOr[String] = js.native
  
  /**
    * Optional. Specifies the type of virtual machine to use for your training
    * job&#39;s worker nodes.  The supported values are the same as those
    * described in the entry for `masterType`.  This value must be consistent
    * with the category of machine type that `masterType` uses. In other words,
    * both must be Cloud ML Engine machine types or both must be Compute Engine
    * machine types.  If you use `cloud_tpu` for this value, see special
    * instructions for [configuring a custom TPU
    * machine](/ml-engine/docs/tensorflow/using-tpus#configuring_a_custom_tpu_machine).
    * This value must be present when `scaleTier` is set to `CUSTOM` and
    * `workerCount` is greater than zero.
    */
  var workerType: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1TrainingInput {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1TrainingInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1TrainingInput]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1TrainingInputMutableBuilder[Self <: SchemaGoogleCloudMlV1TrainingInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setHyperparameters(value: SchemaGoogleCloudMlV1HyperparameterSpec): Self = StObject.set(x, "hyperparameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperparametersUndefined: Self = StObject.set(x, "hyperparameters", js.undefined)
    
    @scala.inline
    def setJobDir(value: String): Self = StObject.set(x, "jobDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDirUndefined: Self = StObject.set(x, "jobDir", js.undefined)
    
    @scala.inline
    def setMasterConfig(value: SchemaGoogleCloudMlV1ReplicaConfig): Self = StObject.set(x, "masterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterConfigUndefined: Self = StObject.set(x, "masterConfig", js.undefined)
    
    @scala.inline
    def setMasterType(value: String): Self = StObject.set(x, "masterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTypeUndefined: Self = StObject.set(x, "masterType", js.undefined)
    
    @scala.inline
    def setPackageUris(value: js.Array[String]): Self = StObject.set(x, "packageUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageUrisUndefined: Self = StObject.set(x, "packageUris", js.undefined)
    
    @scala.inline
    def setPackageUrisVarargs(value: String*): Self = StObject.set(x, "packageUris", js.Array(value :_*))
    
    @scala.inline
    def setParameterServerConfig(value: SchemaGoogleCloudMlV1ReplicaConfig): Self = StObject.set(x, "parameterServerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterServerConfigUndefined: Self = StObject.set(x, "parameterServerConfig", js.undefined)
    
    @scala.inline
    def setParameterServerCount(value: String): Self = StObject.set(x, "parameterServerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterServerCountUndefined: Self = StObject.set(x, "parameterServerCount", js.undefined)
    
    @scala.inline
    def setParameterServerType(value: String): Self = StObject.set(x, "parameterServerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterServerTypeUndefined: Self = StObject.set(x, "parameterServerType", js.undefined)
    
    @scala.inline
    def setPythonModule(value: String): Self = StObject.set(x, "pythonModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPythonModuleUndefined: Self = StObject.set(x, "pythonModule", js.undefined)
    
    @scala.inline
    def setPythonVersion(value: String): Self = StObject.set(x, "pythonVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPythonVersionUndefined: Self = StObject.set(x, "pythonVersion", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
    
    @scala.inline
    def setScaleTier(value: String): Self = StObject.set(x, "scaleTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleTierUndefined: Self = StObject.set(x, "scaleTier", js.undefined)
    
    @scala.inline
    def setWorkerConfig(value: SchemaGoogleCloudMlV1ReplicaConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
    
    @scala.inline
    def setWorkerCount(value: String): Self = StObject.set(x, "workerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerCountUndefined: Self = StObject.set(x, "workerCount", js.undefined)
    
    @scala.inline
    def setWorkerType(value: String): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
  }
}
