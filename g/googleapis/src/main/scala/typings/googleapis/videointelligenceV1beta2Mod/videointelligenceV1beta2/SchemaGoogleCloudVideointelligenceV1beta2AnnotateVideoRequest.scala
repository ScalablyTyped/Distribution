package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video annotation request.
  */
trait SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequest extends StObject {
  
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
  var videoContext: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2VideoContext] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequestMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1beta2AnnotateVideoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setInputContent(value: String): Self = StObject.set(x, "inputContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContentUndefined: Self = StObject.set(x, "inputContent", js.undefined)
    
    @scala.inline
    def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
    
    @scala.inline
    def setVideoContext(value: SchemaGoogleCloudVideointelligenceV1beta2VideoContext): Self = StObject.set(x, "videoContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoContextUndefined: Self = StObject.set(x, "videoContext", js.undefined)
  }
}
