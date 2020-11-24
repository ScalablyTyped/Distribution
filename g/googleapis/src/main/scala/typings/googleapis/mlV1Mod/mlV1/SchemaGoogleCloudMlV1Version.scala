package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a version of the model.  Each version is a trained model
  * deployed in the cloud, ready to handle prediction requests. A model can
  * have multiple versions. You can get information about all of the versions
  * of a given model by calling
  * [projects.models.versions.list](/ml-engine/reference/rest/v1/projects.models.versions/list).
  * Next ID: 30
  */
@js.native
trait SchemaGoogleCloudMlV1Version extends js.Object {
  
  /**
    * Automatically scale the number of nodes used to serve the model in
    * response to increases and decreases in traffic. Care should be taken to
    * ramp up traffic according to the model&#39;s ability to scale or you will
    * start seeing increases in latency and 429 response codes.
    */
  var autoScaling: js.UndefOr[SchemaGoogleCloudMlV1AutoScaling] = js.native
  
  /**
    * Output only. The time the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Required. The Google Cloud Storage location of the trained model used to
    * create the version. See the [guide to model
    * deployment](/ml-engine/docs/tensorflow/deploying-models) for more
    * information.  When passing Version to
    * [projects.models.versions.create](/ml-engine/reference/rest/v1/projects.models.versions/create)
    * the model service uses the specified location as the source of the model.
    * Once deployed, the model version is hosted by the prediction service, so
    * this location is useful only as a historical record. The total number of
    * model files can&#39;t exceed 1000.
    */
  var deploymentUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. The description specified for the version when it was created.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Output only. The details of a failure or a cancellation.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a model from overwriting each other. It
    * is strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform model updates in order to avoid race
    * conditions: An `etag` is returned in the response to `GetVersion`, and
    * systems are expected to put that etag in the request to `UpdateVersion`
    * to ensure that their change will be applied to the model as intended.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Optional. The machine learning framework Cloud ML Engine uses to train
    * this version of the model. Valid values are `TENSORFLOW`, `SCIKIT_LEARN`,
    * `XGBOOST`. If you do not specify a framework, Cloud ML Engine will
    * analyze files in the deployment_uri to determine a framework. If you
    * choose `SCIKIT_LEARN` or `XGBOOST`, you must also set the runtime version
    * of the model to 1.4 or greater.
    */
  var framework: js.UndefOr[String] = js.native
  
  /**
    * Output only. If true, this version will be used to handle prediction
    * requests that do not specify a version.  You can change the default
    * version by calling
    * [projects.methods.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. One or more labels that you can add, to organize your model
    * versions. Each label is a key-value pair, where both the key and the
    * value are arbitrary strings that you supply. For more information, see
    * the documentation on &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/resource-labels&quot;&gt;using
    * labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Output only. The time the version was last used for prediction.
    */
  var lastUseTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. The type of machine on which to serve the model. Currently only
    * applies to online prediction service. &lt;dl&gt;
    * &lt;dt&gt;mls1-c1-m2&lt;/dt&gt;   &lt;dd&gt;   The
    * &lt;b&gt;default&lt;/b&gt; machine type, with 1 core and 2 GB RAM. The
    * deprecated   name for this machine type is &quot;mls1-highmem-1&quot;.
    * &lt;/dd&gt;   &lt;dt&gt;mls1-c4-m2&lt;/dt&gt;   &lt;dd&gt;   In
    * &lt;b&gt;Beta&lt;/b&gt;. This machine type has 4 cores and 2 GB RAM. The
    * deprecated name for this machine type is &quot;mls1-highcpu-4&quot;.
    * &lt;/dd&gt; &lt;/dl&gt;
    */
  var machineType: js.UndefOr[String] = js.native
  
  /**
    * Manually select the number of nodes to use for serving the model. You
    * should generally use `auto_scaling` with an appropriate `min_nodes`
    * instead, but this option is available if you want more predictable
    * billing. Beware that latency and error rates will increase if the traffic
    * exceeds that capability of the system to serve it based on the selected
    * number of nodes.
    */
  var manualScaling: js.UndefOr[SchemaGoogleCloudMlV1ManualScaling] = js.native
  
  /**
    * Required.The name specified for the version when it was created.  The
    * version name must be unique within the model it is created in.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. The version of Python used in prediction. If not set, the
    * default version is &#39;2.7&#39;. Python &#39;3.5&#39; is available when
    * `runtime_version` is set to &#39;1.4&#39; and above. Python &#39;2.7&#39;
    * works with all supported runtime versions.
    */
  var pythonVersion: js.UndefOr[String] = js.native
  
  /**
    * Optional. The Cloud ML Engine runtime version to use for this deployment.
    * If not set, Cloud ML Engine uses the default stable version, 1.0. For
    * more information, see the [runtime version
    * list](/ml-engine/docs/runtime-version-list) and [how to manage runtime
    * versions](/ml-engine/docs/versioning).
    */
  var runtimeVersion: js.UndefOr[String] = js.native
  
  /**
    * Output only. The state of a version.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1Version {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Version]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1VersionOps[Self <: SchemaGoogleCloudMlV1Version] (val x: Self) extends AnyVal {
    
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
    def setAutoScaling(value: SchemaGoogleCloudMlV1AutoScaling): Self = this.set("autoScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScaling: Self = this.set("autoScaling", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDeploymentUri(value: String): Self = this.set("deploymentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentUri: Self = this.set("deploymentUri", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setFramework(value: String): Self = this.set("framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLastUseTime(value: String): Self = this.set("lastUseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUseTime: Self = this.set("lastUseTime", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setManualScaling(value: SchemaGoogleCloudMlV1ManualScaling): Self = this.set("manualScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualScaling: Self = this.set("manualScaling", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPythonVersion(value: String): Self = this.set("pythonVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePythonVersion: Self = this.set("pythonVersion", js.undefined)
    
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("runtimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeVersion: Self = this.set("runtimeVersion", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
