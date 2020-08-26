package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a machine learning solution.  A model can have multiple
  * versions, each of which is a deployed, trained model ready to receive
  * prediction requests. The model itself is just a container.
  */
@js.native
trait SchemaGoogleCloudMlV1Model extends js.Object {
  /**
    * Output only. The default version of the model. This version will be used
    * to handle prediction requests that do not specify a version.  You can
    * change the default version by calling
    * [projects.methods.versions.setDefault](/ml-engine/reference/rest/v1/projects.models.versions/setDefault).
    */
  var defaultVersion: js.UndefOr[SchemaGoogleCloudMlV1Version] = js.native
  /**
    * Optional. The description specified for the model when it was created.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a model from overwriting each other. It
    * is strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform model updates in order to avoid race
    * conditions: An `etag` is returned in the response to `GetModel`, and
    * systems are expected to put that etag in the request to `UpdateModel` to
    * ensure that their change will be applied to the model as intended.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Optional. One or more labels that you can add, to organize your models.
    * Each label is a key-value pair, where both the key and the value are
    * arbitrary strings that you supply. For more information, see the
    * documentation on &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/resource-labels&quot;&gt;using
    * labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Required. The name specified for the model when it was created.  The
    * model name must be unique within the project it is created in.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. If true, enables logging of stderr and stdout streams for
    * online prediction in Stackdriver Logging. These can be more verbose than
    * the standard access logs (see `online_prediction_logging`) and thus can
    * incur higher cost. However, they are helpful for debugging. Note that
    * since Stackdriver logs may incur a cost, particularly if the total QPS in
    * your project is high, be sure to estimate your costs before enabling this
    * flag.  Default is false.
    */
  var onlinePredictionConsoleLogging: js.UndefOr[Boolean] = js.native
  /**
    * Optional. If true, online prediction access logs are sent to StackDriver
    * Logging. These logs are like standard server access logs, containing
    * information like timestamp and latency for each request. Note that
    * Stackdriver logs may incur a cost, particular if the total QPS in your
    * project is high.  Default is false.
    */
  var onlinePredictionLogging: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The list of regions where the model is going to be deployed.
    * Currently only one region per model is supported. Defaults to
    * &#39;us-central1&#39; if nothing is set. See the &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/regions&quot;&gt;available
    * regions&lt;/a&gt; for ML Engine services. Note: *   No matter where a
    * model is deployed, it can always be accessed by     users from anywhere,
    * both for online and batch prediction. *   The region for a batch
    * prediction job is set by the region field when     submitting the batch
    * prediction job and does not take its value from     this field.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleCloudMlV1Model {
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Model]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ModelOps[Self <: SchemaGoogleCloudMlV1Model] (val x: Self) extends AnyVal {
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
    def setDefaultVersion(value: SchemaGoogleCloudMlV1Version): Self = this.set("defaultVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVersion: Self = this.set("defaultVersion", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnlinePredictionConsoleLogging(value: Boolean): Self = this.set("onlinePredictionConsoleLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlinePredictionConsoleLogging: Self = this.set("onlinePredictionConsoleLogging", js.undefined)
    @scala.inline
    def setOnlinePredictionLogging(value: Boolean): Self = this.set("onlinePredictionLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlinePredictionLogging: Self = this.set("onlinePredictionLogging", js.undefined)
    @scala.inline
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
  }
  
}

