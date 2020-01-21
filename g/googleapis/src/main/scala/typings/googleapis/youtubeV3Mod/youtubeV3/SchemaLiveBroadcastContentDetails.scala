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
  def apply(
    boundStreamId: String = null,
    boundStreamLastUpdateTimeMs: String = null,
    closedCaptionsType: String = null,
    enableAutoStart: js.UndefOr[Boolean] = js.undefined,
    enableClosedCaptions: js.UndefOr[Boolean] = js.undefined,
    enableContentEncryption: js.UndefOr[Boolean] = js.undefined,
    enableDvr: js.UndefOr[Boolean] = js.undefined,
    enableEmbed: js.UndefOr[Boolean] = js.undefined,
    enableLowLatency: js.UndefOr[Boolean] = js.undefined,
    latencyPreference: String = null,
    mesh: String = null,
    monitorStream: SchemaMonitorStreamInfo = null,
    projection: String = null,
    recordFromStart: js.UndefOr[Boolean] = js.undefined,
    startWithSlate: js.UndefOr[Boolean] = js.undefined,
    stereoLayout: String = null
  ): SchemaLiveBroadcastContentDetails = {
    val __obj = js.Dynamic.literal()
    if (boundStreamId != null) __obj.updateDynamic("boundStreamId")(boundStreamId.asInstanceOf[js.Any])
    if (boundStreamLastUpdateTimeMs != null) __obj.updateDynamic("boundStreamLastUpdateTimeMs")(boundStreamLastUpdateTimeMs.asInstanceOf[js.Any])
    if (closedCaptionsType != null) __obj.updateDynamic("closedCaptionsType")(closedCaptionsType.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutoStart)) __obj.updateDynamic("enableAutoStart")(enableAutoStart.asInstanceOf[js.Any])
    if (!js.isUndefined(enableClosedCaptions)) __obj.updateDynamic("enableClosedCaptions")(enableClosedCaptions.asInstanceOf[js.Any])
    if (!js.isUndefined(enableContentEncryption)) __obj.updateDynamic("enableContentEncryption")(enableContentEncryption.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDvr)) __obj.updateDynamic("enableDvr")(enableDvr.asInstanceOf[js.Any])
    if (!js.isUndefined(enableEmbed)) __obj.updateDynamic("enableEmbed")(enableEmbed.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLowLatency)) __obj.updateDynamic("enableLowLatency")(enableLowLatency.asInstanceOf[js.Any])
    if (latencyPreference != null) __obj.updateDynamic("latencyPreference")(latencyPreference.asInstanceOf[js.Any])
    if (mesh != null) __obj.updateDynamic("mesh")(mesh.asInstanceOf[js.Any])
    if (monitorStream != null) __obj.updateDynamic("monitorStream")(monitorStream.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(recordFromStart)) __obj.updateDynamic("recordFromStart")(recordFromStart.asInstanceOf[js.Any])
    if (!js.isUndefined(startWithSlate)) __obj.updateDynamic("startWithSlate")(startWithSlate.asInstanceOf[js.Any])
    if (stereoLayout != null) __obj.updateDynamic("stereoLayout")(stereoLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveBroadcastContentDetails]
  }
}

