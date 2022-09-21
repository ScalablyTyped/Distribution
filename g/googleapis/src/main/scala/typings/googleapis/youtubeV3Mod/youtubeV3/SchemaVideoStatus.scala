package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoStatus extends StObject {
  
  /**
    * This value indicates if the video can be embedded on another website. @mutable youtube.videos.insert youtube.videos.update
    */
  var embeddable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This value explains why a video failed to upload. This property is only present if the uploadStatus property indicates that the upload failed.
    */
  var failureReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The video's license. @mutable youtube.videos.insert youtube.videos.update
    */
  var license: js.UndefOr[String | Null] = js.undefined
  
  var madeForKids: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The video's privacy status.
    */
  var privacyStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This value indicates if the extended video statistics on the watch page can be viewed by everyone. Note that the view count, likes, etc will still be visible if this is disabled. @mutable youtube.videos.insert youtube.videos.update
    */
  var publicStatsViewable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The date and time when the video is scheduled to publish. It can be set only if the privacy status of the video is private..
    */
  var publishAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This value explains why YouTube rejected an uploaded video. This property is only present if the uploadStatus property indicates that the upload was rejected.
    */
  var rejectionReason: js.UndefOr[String | Null] = js.undefined
  
  var selfDeclaredMadeForKids: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The status of the uploaded video.
    */
  var uploadStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoStatus {
  
  inline def apply(): SchemaVideoStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoStatus]
  }
  
  extension [Self <: SchemaVideoStatus](x: Self) {
    
    inline def setEmbeddable(value: Boolean): Self = StObject.set(x, "embeddable", value.asInstanceOf[js.Any])
    
    inline def setEmbeddableNull: Self = StObject.set(x, "embeddable", null)
    
    inline def setEmbeddableUndefined: Self = StObject.set(x, "embeddable", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseNull: Self = StObject.set(x, "license", null)
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMadeForKids(value: Boolean): Self = StObject.set(x, "madeForKids", value.asInstanceOf[js.Any])
    
    inline def setMadeForKidsNull: Self = StObject.set(x, "madeForKids", null)
    
    inline def setMadeForKidsUndefined: Self = StObject.set(x, "madeForKids", js.undefined)
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
    
    inline def setPrivacyStatusNull: Self = StObject.set(x, "privacyStatus", null)
    
    inline def setPrivacyStatusUndefined: Self = StObject.set(x, "privacyStatus", js.undefined)
    
    inline def setPublicStatsViewable(value: Boolean): Self = StObject.set(x, "publicStatsViewable", value.asInstanceOf[js.Any])
    
    inline def setPublicStatsViewableNull: Self = StObject.set(x, "publicStatsViewable", null)
    
    inline def setPublicStatsViewableUndefined: Self = StObject.set(x, "publicStatsViewable", js.undefined)
    
    inline def setPublishAt(value: String): Self = StObject.set(x, "publishAt", value.asInstanceOf[js.Any])
    
    inline def setPublishAtNull: Self = StObject.set(x, "publishAt", null)
    
    inline def setPublishAtUndefined: Self = StObject.set(x, "publishAt", js.undefined)
    
    inline def setRejectionReason(value: String): Self = StObject.set(x, "rejectionReason", value.asInstanceOf[js.Any])
    
    inline def setRejectionReasonNull: Self = StObject.set(x, "rejectionReason", null)
    
    inline def setRejectionReasonUndefined: Self = StObject.set(x, "rejectionReason", js.undefined)
    
    inline def setSelfDeclaredMadeForKids(value: Boolean): Self = StObject.set(x, "selfDeclaredMadeForKids", value.asInstanceOf[js.Any])
    
    inline def setSelfDeclaredMadeForKidsNull: Self = StObject.set(x, "selfDeclaredMadeForKids", null)
    
    inline def setSelfDeclaredMadeForKidsUndefined: Self = StObject.set(x, "selfDeclaredMadeForKids", js.undefined)
    
    inline def setUploadStatus(value: String): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
    
    inline def setUploadStatusNull: Self = StObject.set(x, "uploadStatus", null)
    
    inline def setUploadStatusUndefined: Self = StObject.set(x, "uploadStatus", js.undefined)
  }
}
