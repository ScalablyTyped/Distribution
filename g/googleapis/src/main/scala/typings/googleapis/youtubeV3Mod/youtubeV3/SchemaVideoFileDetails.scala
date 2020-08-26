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
  def apply(): SchemaVideoFileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoFileDetails]
  }
  @scala.inline
  implicit class SchemaVideoFileDetailsOps[Self <: SchemaVideoFileDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioStreamsVarargs(value: SchemaVideoFileDetailsAudioStream*): Self = this.set("audioStreams", js.Array(value :_*))
    @scala.inline
    def setAudioStreams(value: js.Array[SchemaVideoFileDetailsAudioStream]): Self = this.set("audioStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioStreams: Self = this.set("audioStreams", js.undefined)
    @scala.inline
    def setBitrateBps(value: String): Self = this.set("bitrateBps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrateBps: Self = this.set("bitrateBps", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDurationMs(value: String): Self = this.set("durationMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationMs: Self = this.set("durationMs", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setVideoStreamsVarargs(value: SchemaVideoFileDetailsVideoStream*): Self = this.set("videoStreams", js.Array(value :_*))
    @scala.inline
    def setVideoStreams(value: js.Array[SchemaVideoFileDetailsVideoStream]): Self = this.set("videoStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoStreams: Self = this.set("videoStreams", js.undefined)
  }
  
}

