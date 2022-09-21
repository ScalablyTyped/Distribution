package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutionTemplate extends StObject {
  
  /**
    * Configuration (count and accelerator type) for hardware running notebook execution.
    */
  var acceleratorConfig: js.UndefOr[SchemaSchedulerAcceleratorConfig] = js.undefined
  
  /**
    * Container Image URI to a DLVM Example: 'gcr.io/deeplearning-platform-release/base-cu100' More examples can be found at: https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
    */
  var containerImageUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parameters used in Dataproc JobType executions.
    */
  var dataprocParameters: js.UndefOr[SchemaDataprocParameters] = js.undefined
  
  /**
    * Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: `gs://{bucket_name\}/{folder\}/{notebook_file_name\}` Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
    */
  var inputNotebookFile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of Job to be used on this execution.
    */
  var jobType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file.
    */
  var kernelSpec: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels for execution. If execution is scheduled, a field included will be 'nbs-scheduled'. Otherwise, it is an immediate execution, and an included field will be 'nbs-immediate'. Use fields to efficiently index between various types of executions.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Specifies the type of virtual machine to use for your training job's master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. The following types are supported: - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` - `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` - `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` - `n1-highcpu-64` - `n1-highcpu-96` Alternatively, you can use the following legacy machine types: - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` - `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` - `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` - `complex_model_l_v100` Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
    */
  var masterType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: `gs://{bucket_name\}/{folder\}` Ex: `gs://notebook_user/scheduled_notebooks`
    */
  var outputNotebookFolder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parameters used within the 'input_notebook_file' notebook.
    */
  var parameters: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input notebook and pass them here in an YAML file. Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
    */
  var paramsYamlFile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
    */
  var scaleTier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address of a service account to use when running the execution. You must have the `iam.serviceAccounts.actAs` permission for the specified service account.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of a Vertex AI [Tensorboard] resource to which this execution will upload Tensorboard logs. Format: `projects/{project\}/locations/{location\}/tensorboards/{tensorboard\}`
    */
  var tensorboard: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parameters used in Vertex AI JobType executions.
    */
  var vertexAiParameters: js.UndefOr[SchemaVertexAIParameters] = js.undefined
}
object SchemaExecutionTemplate {
  
  inline def apply(): SchemaExecutionTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionTemplate]
  }
  
  extension [Self <: SchemaExecutionTemplate](x: Self) {
    
    inline def setAcceleratorConfig(value: SchemaSchedulerAcceleratorConfig): Self = StObject.set(x, "acceleratorConfig", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorConfigUndefined: Self = StObject.set(x, "acceleratorConfig", js.undefined)
    
    inline def setContainerImageUri(value: String): Self = StObject.set(x, "containerImageUri", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUriNull: Self = StObject.set(x, "containerImageUri", null)
    
    inline def setContainerImageUriUndefined: Self = StObject.set(x, "containerImageUri", js.undefined)
    
    inline def setDataprocParameters(value: SchemaDataprocParameters): Self = StObject.set(x, "dataprocParameters", value.asInstanceOf[js.Any])
    
    inline def setDataprocParametersUndefined: Self = StObject.set(x, "dataprocParameters", js.undefined)
    
    inline def setInputNotebookFile(value: String): Self = StObject.set(x, "inputNotebookFile", value.asInstanceOf[js.Any])
    
    inline def setInputNotebookFileNull: Self = StObject.set(x, "inputNotebookFile", null)
    
    inline def setInputNotebookFileUndefined: Self = StObject.set(x, "inputNotebookFile", js.undefined)
    
    inline def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeNull: Self = StObject.set(x, "jobType", null)
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    inline def setKernelSpec(value: String): Self = StObject.set(x, "kernelSpec", value.asInstanceOf[js.Any])
    
    inline def setKernelSpecNull: Self = StObject.set(x, "kernelSpec", null)
    
    inline def setKernelSpecUndefined: Self = StObject.set(x, "kernelSpec", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMasterType(value: String): Self = StObject.set(x, "masterType", value.asInstanceOf[js.Any])
    
    inline def setMasterTypeNull: Self = StObject.set(x, "masterType", null)
    
    inline def setMasterTypeUndefined: Self = StObject.set(x, "masterType", js.undefined)
    
    inline def setOutputNotebookFolder(value: String): Self = StObject.set(x, "outputNotebookFolder", value.asInstanceOf[js.Any])
    
    inline def setOutputNotebookFolderNull: Self = StObject.set(x, "outputNotebookFolder", null)
    
    inline def setOutputNotebookFolderUndefined: Self = StObject.set(x, "outputNotebookFolder", js.undefined)
    
    inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParamsYamlFile(value: String): Self = StObject.set(x, "paramsYamlFile", value.asInstanceOf[js.Any])
    
    inline def setParamsYamlFileNull: Self = StObject.set(x, "paramsYamlFile", null)
    
    inline def setParamsYamlFileUndefined: Self = StObject.set(x, "paramsYamlFile", js.undefined)
    
    inline def setScaleTier(value: String): Self = StObject.set(x, "scaleTier", value.asInstanceOf[js.Any])
    
    inline def setScaleTierNull: Self = StObject.set(x, "scaleTier", null)
    
    inline def setScaleTierUndefined: Self = StObject.set(x, "scaleTier", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setTensorboard(value: String): Self = StObject.set(x, "tensorboard", value.asInstanceOf[js.Any])
    
    inline def setTensorboardNull: Self = StObject.set(x, "tensorboard", null)
    
    inline def setTensorboardUndefined: Self = StObject.set(x, "tensorboard", js.undefined)
    
    inline def setVertexAiParameters(value: SchemaVertexAIParameters): Self = StObject.set(x, "vertexAiParameters", value.asInstanceOf[js.Any])
    
    inline def setVertexAiParametersUndefined: Self = StObject.set(x, "vertexAiParameters", js.undefined)
  }
}
