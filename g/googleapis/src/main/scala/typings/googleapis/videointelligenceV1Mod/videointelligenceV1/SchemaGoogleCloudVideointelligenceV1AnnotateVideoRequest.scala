package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video annotation request.
  */
trait SchemaGoogleCloudVideointelligenceV1AnnotateVideoRequest extends StObject {
  
  /**
    * Requested video annotation features.
    */
  var features: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The video data bytes. If unset, the input video(s) should be specified
    * via `input_uri`. If set, `input_uri` should be unset.
    */
  var inputContent: js.UndefOr[String] = js.undefined
  
  /**
    * Input video location. Currently, only [Google Cloud
    * Storage](https://cloud.google.com/storage/) URIs are supported, which
    * must be specified in the following format: `gs://bucket-id/object-id`
    * (other URI formats return google.rpc.Code.INVALID_ARGUMENT). For more
    * information, see [Request URIs](/storage/docs/reference-uris). A video
    * URI may include wildcards in `object-id`, and thus identify multiple
    * videos. Supported wildcards: &#39;*&#39; to match 0 or more characters;
    * &#39;?&#39; to match 1 character. If unset, the input video should be
    * embedded in the request as `input_content`. If set, `input_content`
    * should be unset.
    */
  var inputUri: js.UndefOr[String] = js.undefined
  
  /**
    * Optional cloud region where annotation should take place. Supported cloud
    * regions: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no
    * region is specified, a region will be determined based on video file
    * location.
    */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional location where the output (in JSON format) should be stored.
    * Currently, only [Google Cloud Storage](https://cloud.google.com/storage/)
    * URIs are supported, which must be specified in the following format:
    * `gs://bucket-id/object-id` (other URI formats return
    * google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
    * URIs](/storage/docs/reference-uris).
    */
  var outputUri: js.UndefOr[String] = js.undefined
  
  /**
    * Additional video context and/or feature-specific parameters.
    */
  var videoContext: js.UndefOr[SchemaGoogleCloudVideointelligenceV1VideoContext] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1AnnotateVideoRequest {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1AnnotateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1AnnotateVideoRequest]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1AnnotateVideoRequest](x: Self) {
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setInputContent(value: String): Self = StObject.set(x, "inputContent", value.asInstanceOf[js.Any])
    
    inline def setInputContentUndefined: Self = StObject.set(x, "inputContent", js.undefined)
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
    
    inline def setVideoContext(value: SchemaGoogleCloudVideointelligenceV1VideoContext): Self = StObject.set(x, "videoContext", value.asInstanceOf[js.Any])
    
    inline def setVideoContextUndefined: Self = StObject.set(x, "videoContext", js.undefined)
  }
}
