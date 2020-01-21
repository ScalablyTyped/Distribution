package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents input parameters for a prediction job.
  */
@js.native
trait SchemaGoogleCloudMlV1PredictionInput extends js.Object {
  /**
    * Optional. Number of records per batch, defaults to 64. The service will
    * buffer batch_size number of records in memory before invoking one
    * Tensorflow prediction call internally. So take the record size and memory
    * available into consideration when setting this parameter.
    */
  var batchSize: js.UndefOr[String] = js.native
  /**
    * Required. The format of the input data files.
    */
  var dataFormat: js.UndefOr[String] = js.native
  /**
    * Required. The Google Cloud Storage location of the input data files. May
    * contain wildcards. See &lt;a
    * href=&quot;https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames&lt;/a&gt;
    */
  var inputPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The maximum number of workers to be used for parallel
    * processing. Defaults to 10 if not specified.
    */
  var maxWorkerCount: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to use the default version for the specified
    * model. The string must use the following format:
    * `&quot;projects/YOUR_PROJECT/models/YOUR_MODEL&quot;`
    */
  var modelName: js.UndefOr[String] = js.native
  /**
    * Optional. Format of the output data files, defaults to JSON.
    */
  var outputDataFormat: js.UndefOr[String] = js.native
  /**
    * Required. The output Google Cloud Storage location.
    */
  var outputPath: js.UndefOr[String] = js.native
  /**
    * Required. The Google Compute Engine region to run the prediction job in.
    * See the &lt;a
    * href=&quot;/ml-engine/docs/tensorflow/regions&quot;&gt;available
    * regions&lt;/a&gt; for ML Engine services.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Optional. The Cloud ML Engine runtime version to use for this batch
    * prediction. If not set, Cloud ML Engine will pick the runtime version
    * used during the CreateVersion request for this model version, or choose
    * the latest stable version when model version information is not available
    * such as when the model is specified by uri.
    */
  var runtimeVersion: js.UndefOr[String] = js.native
  /**
    * Optional. The name of the signature defined in the SavedModel to use for
    * this job. Please refer to
    * [SavedModel](https://tensorflow.github.io/serving/serving_basic.html) for
    * information about how to use signatures.  Defaults to
    * [DEFAULT_SERVING_SIGNATURE_DEF_KEY](https://www.tensorflow.org/api_docs/python/tf/saved_model/signature_constants)
    * , which is &quot;serving_default&quot;.
    */
  var signatureName: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to specify a Google Cloud Storage path for the
    * model to use.
    */
  var uri: js.UndefOr[String] = js.native
  /**
    * Use this field if you want to specify a version of the model to use. The
    * string is formatted the same way as `model_version`, with the addition of
    * the version information:
    * `&quot;projects/YOUR_PROJECT/models/YOUR_MODEL/versions/YOUR_VERSION&quot;`
    */
  var versionName: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1PredictionInput {
  @scala.inline
  def apply(
    batchSize: String = null,
    dataFormat: String = null,
    inputPaths: js.Array[String] = null,
    maxWorkerCount: String = null,
    modelName: String = null,
    outputDataFormat: String = null,
    outputPath: String = null,
    region: String = null,
    runtimeVersion: String = null,
    signatureName: String = null,
    uri: String = null,
    versionName: String = null
  ): SchemaGoogleCloudMlV1PredictionInput = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat.asInstanceOf[js.Any])
    if (inputPaths != null) __obj.updateDynamic("inputPaths")(inputPaths.asInstanceOf[js.Any])
    if (maxWorkerCount != null) __obj.updateDynamic("maxWorkerCount")(maxWorkerCount.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (outputDataFormat != null) __obj.updateDynamic("outputDataFormat")(outputDataFormat.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (runtimeVersion != null) __obj.updateDynamic("runtimeVersion")(runtimeVersion.asInstanceOf[js.Any])
    if (signatureName != null) __obj.updateDynamic("signatureName")(signatureName.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (versionName != null) __obj.updateDynamic("versionName")(versionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1PredictionInput]
  }
}

