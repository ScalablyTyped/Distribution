package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a machine learning solution.  A model can have multiple
  * versions, each of which is a deployed, trained model ready to receive
  * prediction requests. The model itself is just a container.
  */
@js.native
trait SchemaGoogleCloudMlV1Model extends StObject {
  
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
  implicit class SchemaGoogleCloudMlV1ModelMutableBuilder[Self <: SchemaGoogleCloudMlV1Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultVersion(value: SchemaGoogleCloudMlV1Version): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnlinePredictionConsoleLogging(value: Boolean): Self = StObject.set(x, "onlinePredictionConsoleLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlinePredictionConsoleLoggingUndefined: Self = StObject.set(x, "onlinePredictionConsoleLogging", js.undefined)
    
    @scala.inline
    def setOnlinePredictionLogging(value: Boolean): Self = StObject.set(x, "onlinePredictionLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlinePredictionLoggingUndefined: Self = StObject.set(x, "onlinePredictionLogging", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
  }
}
