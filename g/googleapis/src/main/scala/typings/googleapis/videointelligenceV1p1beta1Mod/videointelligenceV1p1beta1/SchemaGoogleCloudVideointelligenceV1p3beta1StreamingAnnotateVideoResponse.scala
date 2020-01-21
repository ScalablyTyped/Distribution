package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `StreamingAnnotateVideoResponse` is the only message returned to the client
  * by `StreamingAnnotateVideo`. A series of zero or more
  * `StreamingAnnotateVideoResponse` messages are streamed back to the client.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse extends js.Object {
  /**
    * Streaming annotation results.
    */
  var annotationResults: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults] = js.native
  /**
    * GCS URI that stores annotation results of one streaming session. It is a
    * directory that can hold multiple files in JSON format. Example uri
    * format: gs://bucket_id/object_id/cloud_project_name-session_id
    */
  var annotationResultsUri: js.UndefOr[String] = js.native
  /**
    * If set, returns a google.rpc.Status message that specifies the error for
    * the operation.
    */
  var error: js.UndefOr[SchemaGoogleRpcStatus] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse {
  @scala.inline
  def apply(
    annotationResults: SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults = null,
    annotationResultsUri: String = null,
    error: SchemaGoogleRpcStatus = null
  ): SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationResults != null) __obj.updateDynamic("annotationResults")(annotationResults.asInstanceOf[js.Any])
    if (annotationResultsUri != null) __obj.updateDynamic("annotationResultsUri")(annotationResultsUri.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse]
  }
}

