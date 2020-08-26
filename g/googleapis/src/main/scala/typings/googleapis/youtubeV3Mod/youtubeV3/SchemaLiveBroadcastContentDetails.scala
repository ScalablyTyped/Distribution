package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed settings of a broadcast.
  */
@js.native
trait SchemaLiveBroadcastContentDetails extends js.Object {
  /**
    * This value uniquely identifies the live stream bound to the broadcast.
    */
  var boundStreamId: js.UndefOr[String] = js.native
  /**
    * The date and time that the live stream referenced by boundStreamId was
    * last updated.
    */
  var boundStreamLastUpdateTimeMs: js.UndefOr[String] = js.native
  var closedCaptionsType: js.UndefOr[String] = js.native
  /**
    * This setting indicates whether auto start is enabled for this broadcast.
    */
  var enableAutoStart: js.UndefOr[Boolean] = js.native
  /**
    * This setting indicates whether HTTP POST closed captioning is enabled for
    * this broadcast. The ingestion URL of the closed captions is returned
    * through the liveStreams API. This is mutually exclusive with using the
    * closed_captions_type property, and is equivalent to setting
    * closed_captions_type to CLOSED_CAPTIONS_HTTP_POST.
    */
  var enableClosedCaptions: js.UndefOr[Boolean] = js.native
  /**
    * This setting indicates whether YouTube should enable content encryption
    * for the broadcast.
    */
  var enableContentEncryption: js.UndefOr[Boolean] = js.native
  /**
    * This setting determines whether viewers can access DVR controls while
    * watching the video. DVR controls enable the viewer to control the video
    * playback experience by pausing, rewinding, or fast forwarding content.
    * The default value for this property is true.    Important: You must set
    * the value to true and also set the enableArchive property&#39;s value to
    * true if you want to make playback available immediately after the
    * broadcast ends.
    */
  var enableDvr: js.UndefOr[Boolean] = js.native
  /**
    * This setting indicates whether the broadcast video can be played in an
    * embedded player. If you choose to archive the video (using the
    * enableArchive property), this setting will also apply to the archived
    * video.
    */
  var enableEmbed: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether this broadcast has low latency enabled.
    */
  var enableLowLatency: js.UndefOr[Boolean] = js.native
  /**
    * If both this and enable_low_latency are set, they must match.
    * LATENCY_NORMAL should match enable_low_latency=false LATENCY_LOW should
    * match enable_low_latency=true LATENCY_ULTRA_LOW should have
    * enable_low_latency omitted.
    */
  var latencyPreference: js.UndefOr[String] = js.native
  var mesh: js.UndefOr[String] = js.native
  /**
    * The monitorStream object contains information about the monitor stream,
    * which the broadcaster can use to review the event content before the
    * broadcast stream is shown publicly.
    */
  var monitorStream: js.UndefOr[SchemaMonitorStreamInfo] = js.native
  /**
    * The projection format of this broadcast. This defaults to rectangular.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Automatically start recording after the event goes live. The default
    * value for this property is true.    Important: You must also set the
    * enableDvr property&#39;s value to true if you want the playback to be
    * available immediately after the broadcast ends. If you set this
    * property&#39;s value to true but do not also set the enableDvr property
    * to true, there may be a delay of around one day before the archived video
    * will be available for playback.
    */
  var recordFromStart: js.UndefOr[Boolean] = js.native
  /**
    * This setting indicates whether the broadcast should automatically begin
    * with an in-stream slate when you update the broadcast&#39;s status to
    * live. After updating the status, you then need to send a
    * liveCuepoints.insert request that sets the cuepoint&#39;s eventState to
    * end to remove the in-stream slate and make your broadcast stream visible
    * to viewers.
    */
  var startWithSlate: js.UndefOr[Boolean] = js.native
  var stereoLayout: js.UndefOr[String] = js.native
}

object SchemaLiveBroadcastContentDetails {
  @scala.inline
  def apply(): SchemaLiveBroadcastContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveBroadcastContentDetails]
  }
  @scala.inline
  implicit class SchemaLiveBroadcastContentDetailsOps[Self <: SchemaLiveBroadcastContentDetails] (val x: Self) extends AnyVal {
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
    def setBoundStreamId(value: String): Self = this.set("boundStreamId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundStreamId: Self = this.set("boundStreamId", js.undefined)
    @scala.inline
    def setBoundStreamLastUpdateTimeMs(value: String): Self = this.set("boundStreamLastUpdateTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundStreamLastUpdateTimeMs: Self = this.set("boundStreamLastUpdateTimeMs", js.undefined)
    @scala.inline
    def setClosedCaptionsType(value: String): Self = this.set("closedCaptionsType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosedCaptionsType: Self = this.set("closedCaptionsType", js.undefined)
    @scala.inline
    def setEnableAutoStart(value: Boolean): Self = this.set("enableAutoStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAutoStart: Self = this.set("enableAutoStart", js.undefined)
    @scala.inline
    def setEnableClosedCaptions(value: Boolean): Self = this.set("enableClosedCaptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableClosedCaptions: Self = this.set("enableClosedCaptions", js.undefined)
    @scala.inline
    def setEnableContentEncryption(value: Boolean): Self = this.set("enableContentEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableContentEncryption: Self = this.set("enableContentEncryption", js.undefined)
    @scala.inline
    def setEnableDvr(value: Boolean): Self = this.set("enableDvr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDvr: Self = this.set("enableDvr", js.undefined)
    @scala.inline
    def setEnableEmbed(value: Boolean): Self = this.set("enableEmbed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableEmbed: Self = this.set("enableEmbed", js.undefined)
    @scala.inline
    def setEnableLowLatency(value: Boolean): Self = this.set("enableLowLatency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLowLatency: Self = this.set("enableLowLatency", js.undefined)
    @scala.inline
    def setLatencyPreference(value: String): Self = this.set("latencyPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatencyPreference: Self = this.set("latencyPreference", js.undefined)
    @scala.inline
    def setMesh(value: String): Self = this.set("mesh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMesh: Self = this.set("mesh", js.undefined)
    @scala.inline
    def setMonitorStream(value: SchemaMonitorStreamInfo): Self = this.set("monitorStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitorStream: Self = this.set("monitorStream", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setRecordFromStart(value: Boolean): Self = this.set("recordFromStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordFromStart: Self = this.set("recordFromStart", js.undefined)
    @scala.inline
    def setStartWithSlate(value: Boolean): Self = this.set("startWithSlate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartWithSlate: Self = this.set("startWithSlate", js.undefined)
    @scala.inline
    def setStereoLayout(value: String): Self = this.set("stereoLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStereoLayout: Self = this.set("stereoLayout", js.undefined)
  }
  
}

