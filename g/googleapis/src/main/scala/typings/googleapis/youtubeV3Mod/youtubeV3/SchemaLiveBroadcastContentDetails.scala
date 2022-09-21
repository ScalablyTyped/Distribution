package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveBroadcastContentDetails extends StObject {
  
  /**
    * This value uniquely identifies the live stream bound to the broadcast.
    */
  var boundStreamId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time that the live stream referenced by boundStreamId was last updated.
    */
  var boundStreamLastUpdateTimeMs: js.UndefOr[String | Null] = js.undefined
  
  var closedCaptionsType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This setting indicates whether auto start is enabled for this broadcast. The default value for this property is false. This setting can only be used by Events.
    */
  var enableAutoStart: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This setting indicates whether auto stop is enabled for this broadcast. The default value for this property is false. This setting can only be used by Events.
    */
  var enableAutoStop: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This setting indicates whether HTTP POST closed captioning is enabled for this broadcast. The ingestion URL of the closed captions is returned through the liveStreams API. This is mutually exclusive with using the closed_captions_type property, and is equivalent to setting closed_captions_type to CLOSED_CAPTIONS_HTTP_POST.
    */
  var enableClosedCaptions: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This setting indicates whether YouTube should enable content encryption for the broadcast.
    */
  var enableContentEncryption: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This setting determines whether viewers can access DVR controls while watching the video. DVR controls enable the viewer to control the video playback experience by pausing, rewinding, or fast forwarding content. The default value for this property is true. *Important:* You must set the value to true and also set the enableArchive property's value to true if you want to make playback available immediately after the broadcast ends.
    */
  var enableDvr: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This setting indicates whether the broadcast video can be played in an embedded player. If you choose to archive the video (using the enableArchive property), this setting will also apply to the archived video.
    */
  var enableEmbed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether this broadcast has low latency enabled.
    */
  var enableLowLatency: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If both this and enable_low_latency are set, they must match. LATENCY_NORMAL should match enable_low_latency=false LATENCY_LOW should match enable_low_latency=true LATENCY_ULTRA_LOW should have enable_low_latency omitted.
    */
  var latencyPreference: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mesh for projecting the video if projection is mesh. The mesh value must be a UTF-8 string containing the base-64 encoding of 3D mesh data that follows the Spherical Video V2 RFC specification for an mshp box, excluding the box size and type but including the following four reserved zero bytes for the version and flags.
    */
  var mesh: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The monitorStream object contains information about the monitor stream, which the broadcaster can use to review the event content before the broadcast stream is shown publicly.
    */
  var monitorStream: js.UndefOr[SchemaMonitorStreamInfo] = js.undefined
  
  /**
    * The projection format of this broadcast. This defaults to rectangular.
    */
  var projection: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Automatically start recording after the event goes live. The default value for this property is true. *Important:* You must also set the enableDvr property's value to true if you want the playback to be available immediately after the broadcast ends. If you set this property's value to true but do not also set the enableDvr property to true, there may be a delay of around one day before the archived video will be available for playback.
    */
  var recordFromStart: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This setting indicates whether the broadcast should automatically begin with an in-stream slate when you update the broadcast's status to live. After updating the status, you then need to send a liveCuepoints.insert request that sets the cuepoint's eventState to end to remove the in-stream slate and make your broadcast stream visible to viewers.
    */
  var startWithSlate: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The 3D stereo layout of this broadcast. This defaults to mono.
    */
  var stereoLayout: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveBroadcastContentDetails {
  
  inline def apply(): SchemaLiveBroadcastContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveBroadcastContentDetails]
  }
  
  extension [Self <: SchemaLiveBroadcastContentDetails](x: Self) {
    
    inline def setBoundStreamId(value: String): Self = StObject.set(x, "boundStreamId", value.asInstanceOf[js.Any])
    
    inline def setBoundStreamIdNull: Self = StObject.set(x, "boundStreamId", null)
    
    inline def setBoundStreamIdUndefined: Self = StObject.set(x, "boundStreamId", js.undefined)
    
    inline def setBoundStreamLastUpdateTimeMs(value: String): Self = StObject.set(x, "boundStreamLastUpdateTimeMs", value.asInstanceOf[js.Any])
    
    inline def setBoundStreamLastUpdateTimeMsNull: Self = StObject.set(x, "boundStreamLastUpdateTimeMs", null)
    
    inline def setBoundStreamLastUpdateTimeMsUndefined: Self = StObject.set(x, "boundStreamLastUpdateTimeMs", js.undefined)
    
    inline def setClosedCaptionsType(value: String): Self = StObject.set(x, "closedCaptionsType", value.asInstanceOf[js.Any])
    
    inline def setClosedCaptionsTypeNull: Self = StObject.set(x, "closedCaptionsType", null)
    
    inline def setClosedCaptionsTypeUndefined: Self = StObject.set(x, "closedCaptionsType", js.undefined)
    
    inline def setEnableAutoStart(value: Boolean): Self = StObject.set(x, "enableAutoStart", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoStartNull: Self = StObject.set(x, "enableAutoStart", null)
    
    inline def setEnableAutoStartUndefined: Self = StObject.set(x, "enableAutoStart", js.undefined)
    
    inline def setEnableAutoStop(value: Boolean): Self = StObject.set(x, "enableAutoStop", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoStopNull: Self = StObject.set(x, "enableAutoStop", null)
    
    inline def setEnableAutoStopUndefined: Self = StObject.set(x, "enableAutoStop", js.undefined)
    
    inline def setEnableClosedCaptions(value: Boolean): Self = StObject.set(x, "enableClosedCaptions", value.asInstanceOf[js.Any])
    
    inline def setEnableClosedCaptionsNull: Self = StObject.set(x, "enableClosedCaptions", null)
    
    inline def setEnableClosedCaptionsUndefined: Self = StObject.set(x, "enableClosedCaptions", js.undefined)
    
    inline def setEnableContentEncryption(value: Boolean): Self = StObject.set(x, "enableContentEncryption", value.asInstanceOf[js.Any])
    
    inline def setEnableContentEncryptionNull: Self = StObject.set(x, "enableContentEncryption", null)
    
    inline def setEnableContentEncryptionUndefined: Self = StObject.set(x, "enableContentEncryption", js.undefined)
    
    inline def setEnableDvr(value: Boolean): Self = StObject.set(x, "enableDvr", value.asInstanceOf[js.Any])
    
    inline def setEnableDvrNull: Self = StObject.set(x, "enableDvr", null)
    
    inline def setEnableDvrUndefined: Self = StObject.set(x, "enableDvr", js.undefined)
    
    inline def setEnableEmbed(value: Boolean): Self = StObject.set(x, "enableEmbed", value.asInstanceOf[js.Any])
    
    inline def setEnableEmbedNull: Self = StObject.set(x, "enableEmbed", null)
    
    inline def setEnableEmbedUndefined: Self = StObject.set(x, "enableEmbed", js.undefined)
    
    inline def setEnableLowLatency(value: Boolean): Self = StObject.set(x, "enableLowLatency", value.asInstanceOf[js.Any])
    
    inline def setEnableLowLatencyNull: Self = StObject.set(x, "enableLowLatency", null)
    
    inline def setEnableLowLatencyUndefined: Self = StObject.set(x, "enableLowLatency", js.undefined)
    
    inline def setLatencyPreference(value: String): Self = StObject.set(x, "latencyPreference", value.asInstanceOf[js.Any])
    
    inline def setLatencyPreferenceNull: Self = StObject.set(x, "latencyPreference", null)
    
    inline def setLatencyPreferenceUndefined: Self = StObject.set(x, "latencyPreference", js.undefined)
    
    inline def setMesh(value: String): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setMeshNull: Self = StObject.set(x, "mesh", null)
    
    inline def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
    
    inline def setMonitorStream(value: SchemaMonitorStreamInfo): Self = StObject.set(x, "monitorStream", value.asInstanceOf[js.Any])
    
    inline def setMonitorStreamUndefined: Self = StObject.set(x, "monitorStream", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionNull: Self = StObject.set(x, "projection", null)
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setRecordFromStart(value: Boolean): Self = StObject.set(x, "recordFromStart", value.asInstanceOf[js.Any])
    
    inline def setRecordFromStartNull: Self = StObject.set(x, "recordFromStart", null)
    
    inline def setRecordFromStartUndefined: Self = StObject.set(x, "recordFromStart", js.undefined)
    
    inline def setStartWithSlate(value: Boolean): Self = StObject.set(x, "startWithSlate", value.asInstanceOf[js.Any])
    
    inline def setStartWithSlateNull: Self = StObject.set(x, "startWithSlate", null)
    
    inline def setStartWithSlateUndefined: Self = StObject.set(x, "startWithSlate", js.undefined)
    
    inline def setStereoLayout(value: String): Self = StObject.set(x, "stereoLayout", value.asInstanceOf[js.Any])
    
    inline def setStereoLayoutNull: Self = StObject.set(x, "stereoLayout", null)
    
    inline def setStereoLayoutUndefined: Self = StObject.set(x, "stereoLayout", js.undefined)
  }
}
