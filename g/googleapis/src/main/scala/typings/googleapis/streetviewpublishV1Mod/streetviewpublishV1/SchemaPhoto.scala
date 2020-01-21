package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Photo is used to store 360 photos along with photo metadata.
  */
@js.native
trait SchemaPhoto extends js.Object {
  /**
    * Absolute time when the photo was captured. When the photo has no exif
    * timestamp, this is used to set a timestamp in the photo metadata.
    */
  var captureTime: js.UndefOr[String] = js.native
  /**
    * Connections to other photos. A connection represents the link from this
    * photo to another photo.
    */
  var connections: js.UndefOr[js.Array[SchemaConnection]] = js.native
  /**
    * Output only. The download URL for the photo bytes. This field is set only
    * when GetPhotoRequest.view is set to PhotoView.INCLUDE_DOWNLOAD_URL.
    */
  var downloadUrl: js.UndefOr[String] = js.native
  /**
    * Output only. Status in Google Maps, whether this photo was published or
    * rejected.
    */
  var mapsPublishStatus: js.UndefOr[String] = js.native
  /**
    * Required when updating a photo. Output only when creating a photo.
    * Identifier for the photo, which is unique among all photos in Google.
    */
  var photoId: js.UndefOr[SchemaPhotoId] = js.native
  /**
    * Places where this photo belongs.
    */
  var places: js.UndefOr[js.Array[SchemaPlace]] = js.native
  /**
    * Pose of the photo.
    */
  var pose: js.UndefOr[SchemaPose] = js.native
  /**
    * Output only. The share link for the photo.
    */
  var shareLink: js.UndefOr[String] = js.native
  /**
    * Output only. The thumbnail URL for showing a preview of the given photo.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  /**
    * Output only. Status of rights transfer on this photo.
    */
  var transferStatus: js.UndefOr[String] = js.native
  /**
    * Required when creating a photo. Input only. The resource URL where the
    * photo bytes are uploaded to.
    */
  var uploadReference: js.UndefOr[SchemaUploadRef] = js.native
  /**
    * Output only. View count of the photo.
    */
  var viewCount: js.UndefOr[String] = js.native
}

object SchemaPhoto {
  @scala.inline
  def apply(
    captureTime: String = null,
    connections: js.Array[SchemaConnection] = null,
    downloadUrl: String = null,
    mapsPublishStatus: String = null,
    photoId: SchemaPhotoId = null,
    places: js.Array[SchemaPlace] = null,
    pose: SchemaPose = null,
    shareLink: String = null,
    thumbnailUrl: String = null,
    transferStatus: String = null,
    uploadReference: SchemaUploadRef = null,
    viewCount: String = null
  ): SchemaPhoto = {
    val __obj = js.Dynamic.literal()
    if (captureTime != null) __obj.updateDynamic("captureTime")(captureTime.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl.asInstanceOf[js.Any])
    if (mapsPublishStatus != null) __obj.updateDynamic("mapsPublishStatus")(mapsPublishStatus.asInstanceOf[js.Any])
    if (photoId != null) __obj.updateDynamic("photoId")(photoId.asInstanceOf[js.Any])
    if (places != null) __obj.updateDynamic("places")(places.asInstanceOf[js.Any])
    if (pose != null) __obj.updateDynamic("pose")(pose.asInstanceOf[js.Any])
    if (shareLink != null) __obj.updateDynamic("shareLink")(shareLink.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    if (transferStatus != null) __obj.updateDynamic("transferStatus")(transferStatus.asInstanceOf[js.Any])
    if (uploadReference != null) __obj.updateDynamic("uploadReference")(uploadReference.asInstanceOf[js.Any])
    if (viewCount != null) __obj.updateDynamic("viewCount")(viewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPhoto]
  }
}

