package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes original video file properties, including technical details about
  * audio and video streams, but also metadata information like content length,
  * digitization time, or geotagging information.
  */
@js.native
trait SchemaVideoFileDetails extends js.Object {
  /**
    * A list of audio streams contained in the uploaded video file. Each item
    * in the list contains detailed metadata about an audio stream.
    */
  var audioStreams: js.UndefOr[js.Array[SchemaVideoFileDetailsAudioStream]] = js.native
  /**
    * The uploaded video file&#39;s combined (video and audio) bitrate in bits
    * per second.
    */
  var bitrateBps: js.UndefOr[String] = js.native
  /**
    * The uploaded video file&#39;s container format.
    */
  var container: js.UndefOr[String] = js.native
  /**
    * The date and time when the uploaded video file was created. The value is
    * specified in ISO 8601 format. Currently, the following ISO 8601 formats
    * are supported:   - Date only: YYYY-MM-DD  - Naive time:
    * YYYY-MM-DDTHH:MM:SS  - Time with timezone: YYYY-MM-DDTHH:MM:SS+HH:MM
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * The length of the uploaded video in milliseconds.
    */
  var durationMs: js.UndefOr[String] = js.native
  /**
    * The uploaded file&#39;s name. This field is present whether a video file
    * or another type of file was uploaded.
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * The uploaded file&#39;s size in bytes. This field is present whether a
    * video file or another type of file was uploaded.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * The uploaded file&#39;s type as detected by YouTube&#39;s video
    * processing engine. Currently, YouTube only processes video files, but
    * this field is present whether a video file or another type of file was
    * uploaded.
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * A list of video streams contained in the uploaded video file. Each item
    * in the list contains detailed metadata about a video stream.
    */
  var videoStreams: js.UndefOr[js.Array[SchemaVideoFileDetailsVideoStream]] = js.native
}

object SchemaVideoFileDetails {
  @scala.inline
  def apply(
    audioStreams: js.Array[SchemaVideoFileDetailsAudioStream] = null,
    bitrateBps: String = null,
    container: String = null,
    creationTime: String = null,
    durationMs: String = null,
    fileName: String = null,
    fileSize: String = null,
    fileType: String = null,
    videoStreams: js.Array[SchemaVideoFileDetailsVideoStream] = null
  ): SchemaVideoFileDetails = {
    val __obj = js.Dynamic.literal()
    if (audioStreams != null) __obj.updateDynamic("audioStreams")(audioStreams.asInstanceOf[js.Any])
    if (bitrateBps != null) __obj.updateDynamic("bitrateBps")(bitrateBps.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (videoStreams != null) __obj.updateDynamic("videoStreams")(videoStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoFileDetails]
  }
}

