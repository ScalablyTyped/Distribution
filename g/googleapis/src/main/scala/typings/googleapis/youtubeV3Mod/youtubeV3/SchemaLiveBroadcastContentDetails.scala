package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed settings of a broadcast.
  */
trait SchemaLiveBroadcastContentDetails extends StObject {
  
  /**
    * This value uniquely identifies the live stream bound to the broadcast.
    */
  var boundStreamId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the live stream referenced by boundStreamId was
    * last updated.
    */
  var boundStreamLastUpdateTimeMs: js.UndefOr[String] = js.undefined
  
  var closedCaptionsType: js.UndefOr[String] = js.undefined
  
  /**
    * This setting indicates whether auto start is enabled for this broadcast.
    */
  var enableAutoStart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This setting indicates whether HTTP POST closed captioning is enabled for
    * this broadcast. The ingestion URL of the closed captions is returned
    * through the liveStreams API. This is mutually exclusive with using the
    * closed_captions_type property, and is equivalent to setting
    * closed_captions_type to CLOSED_CAPTIONS_HTTP_POST.
    */
  var enableClosedCaptions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This setting indicates whether YouTube should enable content encryption
    * for the broadcast.
    */
  var enableContentEncryption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This setting determines whether viewers can access DVR controls while
    * watching the video. DVR controls enable the viewer to control the video
    * playback experience by pausing, rewinding, or fast forwarding content.
    * The default value for this property is true.    Important: You must set
    * the value to true and also set the enableArchive property&#39;s value to
    * true if you want to make playback available immediately after the
    * broadcast ends.
    */
  var enableDvr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This setting indicates whether the broadcast video can be played in an
    * embedded player. If you choose to archive the video (using the
    * enableArchive property), this setting will also apply to the archived
    * video.
    */
  var enableEmbed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether this broadcast has low latency enabled.
    */
  var enableLowLatency: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If both this and enable_low_latency are set, they must match.
    * LATENCY_NORMAL should match enable_low_latency=false LATENCY_LOW should
    * match enable_low_latency=true LATENCY_ULTRA_LOW should have
    * enable_low_latency omitted.
    */
  var latencyPreference: js.UndefOr[String] = js.undefined
  
  var mesh: js.UndefOr[String] = js.undefined
  
  /**
    * The monitorStream object contains information about the monitor stream,
    * which the broadcaster can use to review the event content before the
    * broadcast stream is shown publicly.
    */
  var monitorStream: js.UndefOr[SchemaMonitorStreamInfo] = js.undefined
  
  /**
    * The projection format of this broadcast. This defaults to rectangular.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * Automatically start recording after the event goes live. The default
    * value for this property is true.    Important: You must also set the
    * enableDvr property&#39;s value to true if you want the playback to be
    * available immediately after the broadcast ends. If you set this
    * property&#39;s value to true but do not also set the enableDvr property
    * to true, there may be a delay of around one day before the archived video
    * will be available for playback.
    */
  var recordFromStart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This setting indicates whether the broadcast should automatically begin
    * with an in-stream slate when you update the broadcast&#39;s status to
    * live. After updating the status, you then need to send a
    * liveCuepoints.insert request that sets the cuepoint&#39;s eventState to
    * end to remove the in-stream slate and make your broadcast stream visible
    * to viewers.
    */
  var startWithSlate: js.UndefOr[Boolean] = js.undefined
  
  var stereoLayout: js.UndefOr[String] = js.undefined
}
object SchemaLiveBroadcastContentDetails {
  
  @scala.inline
  def apply(): SchemaLiveBroadcastContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveBroadcastContentDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveBroadcastContentDetailsMutableBuilder[Self <: SchemaLiveBroadcastContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundStreamId(value: String): Self = StObject.set(x, "boundStreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundStreamIdUndefined: Self = StObject.set(x, "boundStreamId", js.undefined)
    
    @scala.inline
    def setBoundStreamLastUpdateTimeMs(value: String): Self = StObject.set(x, "boundStreamLastUpdateTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundStreamLastUpdateTimeMsUndefined: Self = StObject.set(x, "boundStreamLastUpdateTimeMs", js.undefined)
    
    @scala.inline
    def setClosedCaptionsType(value: String): Self = StObject.set(x, "closedCaptionsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedCaptionsTypeUndefined: Self = StObject.set(x, "closedCaptionsType", js.undefined)
    
    @scala.inline
    def setEnableAutoStart(value: Boolean): Self = StObject.set(x, "enableAutoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoStartUndefined: Self = StObject.set(x, "enableAutoStart", js.undefined)
    
    @scala.inline
    def setEnableClosedCaptions(value: Boolean): Self = StObject.set(x, "enableClosedCaptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableClosedCaptionsUndefined: Self = StObject.set(x, "enableClosedCaptions", js.undefined)
    
    @scala.inline
    def setEnableContentEncryption(value: Boolean): Self = StObject.set(x, "enableContentEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableContentEncryptionUndefined: Self = StObject.set(x, "enableContentEncryption", js.undefined)
    
    @scala.inline
    def setEnableDvr(value: Boolean): Self = StObject.set(x, "enableDvr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDvrUndefined: Self = StObject.set(x, "enableDvr", js.undefined)
    
    @scala.inline
    def setEnableEmbed(value: Boolean): Self = StObject.set(x, "enableEmbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEmbedUndefined: Self = StObject.set(x, "enableEmbed", js.undefined)
    
    @scala.inline
    def setEnableLowLatency(value: Boolean): Self = StObject.set(x, "enableLowLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableLowLatencyUndefined: Self = StObject.set(x, "enableLowLatency", js.undefined)
    
    @scala.inline
    def setLatencyPreference(value: String): Self = StObject.set(x, "latencyPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyPreferenceUndefined: Self = StObject.set(x, "latencyPreference", js.undefined)
    
    @scala.inline
    def setMesh(value: String): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
    
    @scala.inline
    def setMonitorStream(value: SchemaMonitorStreamInfo): Self = StObject.set(x, "monitorStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorStreamUndefined: Self = StObject.set(x, "monitorStream", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRecordFromStart(value: Boolean): Self = StObject.set(x, "recordFromStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordFromStartUndefined: Self = StObject.set(x, "recordFromStart", js.undefined)
    
    @scala.inline
    def setStartWithSlate(value: Boolean): Self = StObject.set(x, "startWithSlate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWithSlateUndefined: Self = StObject.set(x, "startWithSlate", js.undefined)
    
    @scala.inline
    def setStereoLayout(value: String): Self = StObject.set(x, "stereoLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStereoLayoutUndefined: Self = StObject.set(x, "stereoLayout", js.undefined)
  }
}
