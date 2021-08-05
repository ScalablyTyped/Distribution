package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `StreamingAnnotateVideoResponse` is the only message returned to the client
  * by `StreamingAnnotateVideo`. A series of zero or more
  * `StreamingAnnotateVideoResponse` messages are streamed back to the client.
  */
trait SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse extends StObject {
  
  /**
    * Streaming annotation results.
    */
  var annotationResults: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults] = js.undefined
  
  /**
    * GCS URI that stores annotation results of one streaming session. It is a
    * directory that can hold multiple files in JSON format. Example uri
    * format: gs://bucket_id/object_id/cloud_project_name-session_id
    */
  var annotationResultsUri: js.UndefOr[String] = js.undefined
  
  /**
    * If set, returns a google.rpc.Status message that specifies the error for
    * the operation.
    */
  var error: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse](x: Self) {
    
    inline def setAnnotationResults(value: SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults): Self = StObject.set(x, "annotationResults", value.asInstanceOf[js.Any])
    
    inline def setAnnotationResultsUndefined: Self = StObject.set(x, "annotationResults", js.undefined)
    
    inline def setAnnotationResultsUri(value: String): Self = StObject.set(x, "annotationResultsUri", value.asInstanceOf[js.Any])
    
    inline def setAnnotationResultsUriUndefined: Self = StObject.set(x, "annotationResultsUri", js.undefined)
    
    inline def setError(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
