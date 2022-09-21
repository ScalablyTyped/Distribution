package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPhotoSequence extends StObject {
  
  /**
    * Optional. Absolute time when the photo sequence starts to be captured. If the photo sequence is a video, this is the start time of the video. If this field is populated in input, it overrides the capture time in the video or XDM file.
    */
  var captureTimeOverride: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The computed distance of the photo sequence in meters.
    */
  var distanceMeters: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. If this sequence has `failure_reason` set, this may contain additional details about the failure.
    */
  var failureDetails: js.UndefOr[SchemaProcessingFailureDetails] = js.undefined
  
  /**
    * Output only. If this sequence has processing_state = FAILED, this will contain the reason why it failed. If the processing_state is any other value, this field will be unset.
    */
  var failureReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The filename of the upload. Does not include the directory path. Only available if the sequence was uploaded on a platform that provides the filename.
    */
  var filename: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. If both raw_gps_timeline and the Camera Motion Metadata Track (CAMM) contain GPS measurements, indicate which takes precedence.
    */
  var gpsSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique identifier for the photo sequence. This also acts as a long running operation ID if uploading is performed asynchronously.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Three axis IMU data for the collection. If this data is too large to put in the request, then it should be put in the CAMM track for the video. This data always takes precedence over the equivalent CAMM data, if it exists.
    */
  var imu: js.UndefOr[SchemaImu] = js.undefined
  
  /**
    * Output only. Photos with increasing timestamps.
    */
  var photos: js.UndefOr[js.Array[SchemaPhoto]] = js.undefined
  
  /**
    * Output only. The processing state of this sequence.
    */
  var processingState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Raw GPS measurements with increasing timestamps from the device that aren't time synced with each photo. These raw measurements will be used to infer the pose of each frame. Required in input when InputType is VIDEO and raw GPS measurements are not in Camera Motion Metadata Track (CAMM). User can indicate which takes precedence using gps_source if raw GPS measurements are provided in both raw_gps_timeline and Camera Motion Metadata Track (CAMM).
    */
  var rawGpsTimeline: js.UndefOr[js.Array[SchemaPose]] = js.undefined
  
  /**
    * Output only. A rectangular box that encapsulates every image in this photo sequence.
    */
  var sequenceBounds: js.UndefOr[SchemaLatLngBounds] = js.undefined
  
  /**
    * Input only. Required when creating photo sequence. The resource name where the bytes of the photo sequence (in the form of video) are uploaded.
    */
  var uploadReference: js.UndefOr[SchemaUploadRef] = js.undefined
  
  /**
    * Output only. The time this photo sequence was created in uSV Store service.
    */
  var uploadTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The total number of views that all the published images in this PhotoSequence have received.
    */
  var viewCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaPhotoSequence {
  
  inline def apply(): SchemaPhotoSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhotoSequence]
  }
  
  extension [Self <: SchemaPhotoSequence](x: Self) {
    
    inline def setCaptureTimeOverride(value: String): Self = StObject.set(x, "captureTimeOverride", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeOverrideNull: Self = StObject.set(x, "captureTimeOverride", null)
    
    inline def setCaptureTimeOverrideUndefined: Self = StObject.set(x, "captureTimeOverride", js.undefined)
    
    inline def setDistanceMeters(value: Double): Self = StObject.set(x, "distanceMeters", value.asInstanceOf[js.Any])
    
    inline def setDistanceMetersNull: Self = StObject.set(x, "distanceMeters", null)
    
    inline def setDistanceMetersUndefined: Self = StObject.set(x, "distanceMeters", js.undefined)
    
    inline def setFailureDetails(value: SchemaProcessingFailureDetails): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "failureDetails", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setGpsSource(value: String): Self = StObject.set(x, "gpsSource", value.asInstanceOf[js.Any])
    
    inline def setGpsSourceNull: Self = StObject.set(x, "gpsSource", null)
    
    inline def setGpsSourceUndefined: Self = StObject.set(x, "gpsSource", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImu(value: SchemaImu): Self = StObject.set(x, "imu", value.asInstanceOf[js.Any])
    
    inline def setImuUndefined: Self = StObject.set(x, "imu", js.undefined)
    
    inline def setPhotos(value: js.Array[SchemaPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setPhotosVarargs(value: SchemaPhoto*): Self = StObject.set(x, "photos", js.Array(value*))
    
    inline def setProcessingState(value: String): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
    
    inline def setProcessingStateNull: Self = StObject.set(x, "processingState", null)
    
    inline def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
    
    inline def setRawGpsTimeline(value: js.Array[SchemaPose]): Self = StObject.set(x, "rawGpsTimeline", value.asInstanceOf[js.Any])
    
    inline def setRawGpsTimelineUndefined: Self = StObject.set(x, "rawGpsTimeline", js.undefined)
    
    inline def setRawGpsTimelineVarargs(value: SchemaPose*): Self = StObject.set(x, "rawGpsTimeline", js.Array(value*))
    
    inline def setSequenceBounds(value: SchemaLatLngBounds): Self = StObject.set(x, "sequenceBounds", value.asInstanceOf[js.Any])
    
    inline def setSequenceBoundsUndefined: Self = StObject.set(x, "sequenceBounds", js.undefined)
    
    inline def setUploadReference(value: SchemaUploadRef): Self = StObject.set(x, "uploadReference", value.asInstanceOf[js.Any])
    
    inline def setUploadReferenceUndefined: Self = StObject.set(x, "uploadReference", js.undefined)
    
    inline def setUploadTime(value: String): Self = StObject.set(x, "uploadTime", value.asInstanceOf[js.Any])
    
    inline def setUploadTimeNull: Self = StObject.set(x, "uploadTime", null)
    
    inline def setUploadTimeUndefined: Self = StObject.set(x, "uploadTime", js.undefined)
    
    inline def setViewCount(value: String): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
    
    inline def setViewCountNull: Self = StObject.set(x, "viewCount", null)
    
    inline def setViewCountUndefined: Self = StObject.set(x, "viewCount", js.undefined)
  }
}
