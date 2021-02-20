package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `StreamingAnnotateVideoResponse` is the only message returned to the client
  * by `StreamingAnnotateVideo`. A series of zero or more
  * `StreamingAnnotateVideoResponse` messages are streamed back to the client.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse extends StObject {
  
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
  implicit class SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponseMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationResults(value: SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults): Self = StObject.set(x, "annotationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationResultsUndefined: Self = StObject.set(x, "annotationResults", js.undefined)
    
    @scala.inline
    def setAnnotationResultsUri(value: String): Self = StObject.set(x, "annotationResultsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationResultsUriUndefined: Self = StObject.set(x, "annotationResultsUri", js.undefined)
    
    @scala.inline
    def setError(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
