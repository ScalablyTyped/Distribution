package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPhoto extends StObject {
  
  /**
    * Optional. Absolute time when the photo was captured. When the photo has no exif timestamp, this is used to set a timestamp in the photo metadata.
    */
  var captureTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Connections to other photos. A connection represents the link from this photo to another photo.
    */
  var connections: js.UndefOr[js.Array[SchemaConnection]] = js.undefined
  
  /**
    * Output only. The download URL for the photo bytes. This field is set only when GetPhotoRequest.view is set to PhotoView.INCLUDE_DOWNLOAD_URL.
    */
  var downloadUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Status in Google Maps, whether this photo was published or rejected.
    */
  var mapsPublishStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Output only. Required when updating a photo. Output only when creating a photo. Identifier for the photo, which is unique among all photos in Google.
    */
  var photoId: js.UndefOr[SchemaPhotoId] = js.undefined
  
  /**
    * Optional. Places where this photo belongs.
    */
  var places: js.UndefOr[js.Array[SchemaPlace]] = js.undefined
  
  /**
    * Optional. Pose of the photo.
    */
  var pose: js.UndefOr[SchemaPose] = js.undefined
  
  /**
    * Output only. The share link for the photo.
    */
  var shareLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The thumbnail URL for showing a preview of the given photo.
    */
  var thumbnailUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Status of rights transfer on this photo.
    */
  var transferStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. Required when creating a photo. Input only. The resource URL where the photo bytes are uploaded to.
    */
  var uploadReference: js.UndefOr[SchemaUploadRef] = js.undefined
  
  /**
    * Output only. Time when the image was uploaded.
    */
  var uploadTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. View count of the photo.
    */
  var viewCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaPhoto {
  
  inline def apply(): SchemaPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoto]
  }
  
  extension [Self <: SchemaPhoto](x: Self) {
    
    inline def setCaptureTime(value: String): Self = StObject.set(x, "captureTime", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeNull: Self = StObject.set(x, "captureTime", null)
    
    inline def setCaptureTimeUndefined: Self = StObject.set(x, "captureTime", js.undefined)
    
    inline def setConnections(value: js.Array[SchemaConnection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: SchemaConnection*): Self = StObject.set(x, "connections", js.Array(value*))
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlNull: Self = StObject.set(x, "downloadUrl", null)
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setMapsPublishStatus(value: String): Self = StObject.set(x, "mapsPublishStatus", value.asInstanceOf[js.Any])
    
    inline def setMapsPublishStatusNull: Self = StObject.set(x, "mapsPublishStatus", null)
    
    inline def setMapsPublishStatusUndefined: Self = StObject.set(x, "mapsPublishStatus", js.undefined)
    
    inline def setPhotoId(value: SchemaPhotoId): Self = StObject.set(x, "photoId", value.asInstanceOf[js.Any])
    
    inline def setPhotoIdUndefined: Self = StObject.set(x, "photoId", js.undefined)
    
    inline def setPlaces(value: js.Array[SchemaPlace]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
    
    inline def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
    
    inline def setPlacesVarargs(value: SchemaPlace*): Self = StObject.set(x, "places", js.Array(value*))
    
    inline def setPose(value: SchemaPose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
    
    inline def setPoseUndefined: Self = StObject.set(x, "pose", js.undefined)
    
    inline def setShareLink(value: String): Self = StObject.set(x, "shareLink", value.asInstanceOf[js.Any])
    
    inline def setShareLinkNull: Self = StObject.set(x, "shareLink", null)
    
    inline def setShareLinkUndefined: Self = StObject.set(x, "shareLink", js.undefined)
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlNull: Self = StObject.set(x, "thumbnailUrl", null)
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setTransferStatus(value: String): Self = StObject.set(x, "transferStatus", value.asInstanceOf[js.Any])
    
    inline def setTransferStatusNull: Self = StObject.set(x, "transferStatus", null)
    
    inline def setTransferStatusUndefined: Self = StObject.set(x, "transferStatus", js.undefined)
    
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
