package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    autoScaling: SchemaGoogleCloudMlV1AutoScaling = null,
    createTime: String = null,
    deploymentUri: String = null,
    description: String = null,
    errorMessage: String = null,
    etag: String = null,
    framework: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    labels: StringDictionary[String] = null,
    lastUseTime: String = null,
    machineType: String = null,
    manualScaling: SchemaGoogleCloudMlV1ManualScaling = null,
    name: String = null,
    pythonVersion: String = null,
    runtimeVersion: String = null,
    state: String = null
  ): SchemaGoogleCloudMlV1Version = {
    val __obj = js.Dynamic.literal()
    if (autoScaling != null) __obj.updateDynamic("autoScaling")(autoScaling.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (deploymentUri != null) __obj.updateDynamic("deploymentUri")(deploymentUri.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastUseTime != null) __obj.updateDynamic("lastUseTime")(lastUseTime.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (manualScaling != null) __obj.updateDynamic("manualScaling")(manualScaling.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pythonVersion != null) __obj.updateDynamic("pythonVersion")(pythonVersion.asInstanceOf[js.Any])
    if (runtimeVersion != null) __obj.updateDynamic("runtimeVersion")(runtimeVersion.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Version]
  }
}

