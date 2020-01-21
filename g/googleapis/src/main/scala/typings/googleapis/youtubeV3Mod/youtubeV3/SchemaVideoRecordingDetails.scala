package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Recording information associated with the video.
  */
@js.native
trait SchemaVideoRecordingDetails extends js.Object {
  /**
    * The geolocation information associated with the video.
    */
  var location: js.UndefOr[SchemaGeoPoint] = js.native
  /**
    * The text description of the location where the video was recorded.
    */
  var locationDescription: js.UndefOr[String] = js.native
  /**
    * The date and time when the video was recorded. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sssZ) format.
    */
  var recordingDate: js.UndefOr[String] = js.native
}

object SchemaVideoRecordingDetails {
  @scala.inline
  def apply(location: SchemaGeoPoint = null, locationDescription: String = null, recordingDate: String = null): SchemaVideoRecordingDetails = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locationDescription != null) __obj.updateDynamic("locationDescription")(locationDescription.asInstanceOf[js.Any])
    if (recordingDate != null) __obj.updateDynamic("recordingDate")(recordingDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoRecordingDetails]
  }
}

