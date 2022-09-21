package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse extends StObject {
  
  /**
    * Streaming annotation results.
    */
  var annotationResults: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults] = js.undefined
  
  /**
    * Google Cloud Storage URI that stores annotation results of one streaming session in JSON format. It is the annotation_result_storage_directory from the request followed by '/cloud_project_number-session_id'.
    */
  var annotationResultsUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, returns a google.rpc.Status message that specifies the error for the operation.
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
    
    inline def setAnnotationResultsUriNull: Self = StObject.set(x, "annotationResultsUri", null)
    
    inline def setAnnotationResultsUriUndefined: Self = StObject.set(x, "annotationResultsUri", js.undefined)
    
    inline def setError(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
