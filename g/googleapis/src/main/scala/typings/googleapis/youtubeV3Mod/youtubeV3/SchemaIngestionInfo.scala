package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes information necessary for ingesting an RTMP or an HTTP stream.
  */
@js.native
trait SchemaIngestionInfo extends js.Object {
  /**
    * The backup ingestion URL that you should use to stream video to YouTube.
    * You have the option of simultaneously streaming the content that you are
    * sending to the ingestionAddress to this URL.
    */
  var backupIngestionAddress: js.UndefOr[String] = js.native
  /**
    * The primary ingestion URL that you should use to stream video to YouTube.
    * You must stream video to this URL.  Depending on which application or
    * tool you use to encode your video stream, you may need to enter the
    * stream URL and stream name separately or you may need to concatenate them
    * in the following format:  STREAM_URL/STREAM_NAME
    */
  var ingestionAddress: js.UndefOr[String] = js.native
  /**
    * The HTTP or RTMP stream name that YouTube assigns to the video stream.
    */
  var streamName: js.UndefOr[String] = js.native
}

object SchemaIngestionInfo {
  @scala.inline
  def apply(backupIngestionAddress: String = null, ingestionAddress: String = null, streamName: String = null): SchemaIngestionInfo = {
    val __obj = js.Dynamic.literal()
    if (backupIngestionAddress != null) __obj.updateDynamic("backupIngestionAddress")(backupIngestionAddress.asInstanceOf[js.Any])
    if (ingestionAddress != null) __obj.updateDynamic("ingestionAddress")(ingestionAddress.asInstanceOf[js.Any])
    if (streamName != null) __obj.updateDynamic("streamName")(streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIngestionInfo]
  }
}

