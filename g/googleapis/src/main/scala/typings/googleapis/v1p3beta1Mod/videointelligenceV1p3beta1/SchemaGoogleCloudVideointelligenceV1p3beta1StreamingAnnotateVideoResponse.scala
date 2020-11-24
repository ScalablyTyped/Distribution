package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponseOps[Self <: SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse] (val x: Self) extends AnyVal {
    
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
    def setAnnotationResults(value: SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults): Self = this.set("annotationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationResults: Self = this.set("annotationResults", js.undefined)
    
    @scala.inline
    def setAnnotationResultsUri(value: String): Self = this.set("annotationResultsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationResultsUri: Self = this.set("annotationResultsUri", js.undefined)
    
    @scala.inline
    def setError(value: SchemaGoogleRpcStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
