package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hls events
  */
/* static member */
object Events {
  
  @JSImport("hls.js", "Events")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * fired to notify that audio track lists has been updated
    * data: { audioTracks : audioTracks }
    */
  @JSImport("hls.js", "Events.AUDIO_TRACKS_UPDATED")
  @js.native
  def AUDIO_TRACKS_UPDATED: K_AUDIO_TRACKS_UPDATED = js.native
  @scala.inline
  def AUDIO_TRACKS_UPDATED_=(x: K_AUDIO_TRACKS_UPDATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACKS_UPDATED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when an audio track loading finishes
    * data: { details : levelDetails object, id : audio track id, stats : { trequest, tfirst, tload, mtime } }
    */
  @JSImport("hls.js", "Events.AUDIO_TRACK_LOADED")
  @js.native
  def AUDIO_TRACK_LOADED: K_AUDIO_TRACK_LOADED = js.native
  @scala.inline
  def AUDIO_TRACK_LOADED_=(x: K_AUDIO_TRACK_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_LOADED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when an audio track loading starts
    * data: { url : audio track URL, id : audio track id }
    */
  @JSImport("hls.js", "Events.AUDIO_TRACK_LOADING")
  @js.native
  def AUDIO_TRACK_LOADING: K_AUDIO_TRACK_LOADING = js.native
  @scala.inline
  def AUDIO_TRACK_LOADING_=(x: K_AUDIO_TRACK_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_LOADING")(x.asInstanceOf[js.Any])
  
  /**
    * fired when an audio track switch occurs. deprecated in favor AUDIO_TRACK_SWITCHING
    * data: { id : audio track id }
    */
  @JSImport("hls.js", "Events.AUDIO_TRACK_SWITCH")
  @js.native
  def AUDIO_TRACK_SWITCH: K_AUDIO_TRACK_SWITCH = js.native
  
  /**
    * fired when an audio track switch actually occurs
    * data: { id : audio track id }
    */
  @JSImport("hls.js", "Events.AUDIO_TRACK_SWITCHED")
  @js.native
  def AUDIO_TRACK_SWITCHED: K_AUDIO_TRACK_SWITCHED = js.native
  @scala.inline
  def AUDIO_TRACK_SWITCHED_=(x: K_AUDIO_TRACK_SWITCHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_SWITCHED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when an audio track switching is requested
    * data: { id : audio track id }
    */
  @JSImport("hls.js", "Events.AUDIO_TRACK_SWITCHING")
  @js.native
  def AUDIO_TRACK_SWITCHING: K_AUDIO_TRACK_SWITCHING = js.native
  @scala.inline
  def AUDIO_TRACK_SWITCHING_=(x: K_AUDIO_TRACK_SWITCHING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_SWITCHING")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def AUDIO_TRACK_SWITCH_=(x: K_AUDIO_TRACK_SWITCH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_SWITCH")(x.asInstanceOf[js.Any])
  
  /**
    * fired when we are done with appending a media segment to the buffer
    * data: { parent : segment parent that triggered BUFFER_APPENDING, pending : nb of segments waiting for appending for this segment parent }
    */
  @JSImport("hls.js", "Events.BUFFER_APPENDED")
  @js.native
  def BUFFER_APPENDED: K_BUFFER_APPENDED = js.native
  @scala.inline
  def BUFFER_APPENDED_=(x: K_BUFFER_APPENDED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_APPENDED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when we append a segment to the buffer
    * data: { segment: segment object }
    */
  @JSImport("hls.js", "Events.BUFFER_APPENDING")
  @js.native
  def BUFFER_APPENDING: K_BUFFER_APPENDING = js.native
  @scala.inline
  def BUFFER_APPENDING_=(x: K_BUFFER_APPENDING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_APPENDING")(x.asInstanceOf[js.Any])
  
  /**
    * fired when we know about the codecs that we need buffers for to push into
    * data: { tracks : { container, codec, levelCodec, initSegment, metadata } }
    */
  @JSImport("hls.js", "Events.BUFFER_CODECS")
  @js.native
  def BUFFER_CODECS: K_BUFFER_CODECS = js.native
  @scala.inline
  def BUFFER_CODECS_=(x: K_BUFFER_CODECS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_CODECS")(x.asInstanceOf[js.Any])
  
  /**
    * fired when sourcebuffers have been created
    * data: { tracks: tracks }
    */
  @JSImport("hls.js", "Events.BUFFER_CREATED")
  @js.native
  def BUFFER_CREATED: K_BUFFER_CREATED = js.native
  @scala.inline
  def BUFFER_CREATED_=(x: K_BUFFER_CREATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_CREATED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when the stream is finished and we want to notify the media buffer that there will be no more data
    * data: { }
    */
  @JSImport("hls.js", "Events.BUFFER_EOS")
  @js.native
  def BUFFER_EOS: K_BUFFER_EOS = js.native
  @scala.inline
  def BUFFER_EOS_=(x: K_BUFFER_EOS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_EOS")(x.asInstanceOf[js.Any])
  
  /**
    * fired when the media buffer has been flushed
    * data: { }
    */
  @JSImport("hls.js", "Events.BUFFER_FLUSHED")
  @js.native
  def BUFFER_FLUSHED: K_BUFFER_FLUSHED = js.native
  @scala.inline
  def BUFFER_FLUSHED_=(x: K_BUFFER_FLUSHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_FLUSHED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when the media buffer should be flushed
    * data: { }
    */
  @JSImport("hls.js", "Events.BUFFER_FLUSHING")
  @js.native
  def BUFFER_FLUSHING: K_BUFFER_FLUSHING = js.native
  @scala.inline
  def BUFFER_FLUSHING_=(x: K_BUFFER_FLUSHING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_FLUSHING")(x.asInstanceOf[js.Any])
  
  /**
    * fired when the buffer is going to be reset
    * data: { }
    */
  @JSImport("hls.js", "Events.BUFFER_RESET")
  @js.native
  def BUFFER_RESET: K_BUFFER_RESET = js.native
  @scala.inline
  def BUFFER_RESET_=(x: K_BUFFER_RESET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_RESET")(x.asInstanceOf[js.Any])
  
  /**
    * fired when hls.js instance starts destroying. Different from MEDIA_DETACHED as one could want to detach and reattach a video to the instance of hls.js to handle mid-rolls for example.
    * data: { }
    */
  @JSImport("hls.js", "Events.DESTROYING")
  @js.native
  def DESTROYING: K_DESTROYING = js.native
  @scala.inline
  def DESTROYING_=(x: K_DESTROYING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DESTROYING")(x.asInstanceOf[js.Any])
  
  /**
    *  Identifier for an error event
    * data: { type : error type, details : error details, fatal : is error fatal or not, other error specific data }
    */
  @JSImport("hls.js", "Events.ERROR")
  @js.native
  def ERROR: K_ERROR = js.native
  @scala.inline
  def ERROR_=(x: K_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * triggered when FPS drop in last monitoring period is higher than given threshold
    * data: { curentDropped : nb of dropped frames in last monitoring period,
    *         currentDecoded : nb of decoded frames in last monitoring period,
    *         totalDropped : total dropped frames on this video element }
    */
  @JSImport("hls.js", "Events.FPS_DROP")
  @js.native
  def FPS_DROP: K_FPS_DROP = js.native
  @scala.inline
  def FPS_DROP_=(x: K_FPS_DROP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FPS_DROP")(x.asInstanceOf[js.Any])
  
  /**
    * triggered when FPS drop triggers auto level capping
    * data: { level: suggested new auto level capping by fps controller, droppedLevel : level has to much dropped frame will be restricted }
    */
  @JSImport("hls.js", "Events.FPS_DROP_LEVEL_CAPPING")
  @js.native
  def FPS_DROP_LEVEL_CAPPING: K_FPS_DROP_LEVEL_CAPPING = js.native
  @scala.inline
  def FPS_DROP_LEVEL_CAPPING_=(x: K_FPS_DROP_LEVEL_CAPPING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FPS_DROP_LEVEL_CAPPING")(x.asInstanceOf[js.Any])
  
  /**
    * fired when fragment remuxed MP4 boxes have all been appended into SourceBuffer
    * data: { id: demuxer id, frag : fragment object, stats : { trequest, tfirst, tload, tparsed, tbuffered, length} }
    */
  @JSImport("hls.js", "Events.FRAG_BUFFERED")
  @js.native
  def FRAG_BUFFERED: K_FRAG_BUFFERED = js.native
  @scala.inline
  def FRAG_BUFFERED_=(x: K_FRAG_BUFFERED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_BUFFERED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when fragment matching with current video position is changing
    * data: { frag : fragment object }
    */
  @JSImport("hls.js", "Events.FRAG_CHANGED")
  @js.native
  def FRAG_CHANGED: K_FRAG_CHANGED = js.native
  @scala.inline
  def FRAG_CHANGED_=(x: K_FRAG_CHANGED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_CHANGED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a fragment decryption is completed
    * data: { id: demuxer id, frag: fragment object, stats: { tstart, tdecrypt } }
    */
  @JSImport("hls.js", "Events.FRAG_DECRYPTED")
  @js.native
  def FRAG_DECRYPTED: K_FRAG_DECRYPTED = js.native
  @scala.inline
  def FRAG_DECRYPTED_=(x: K_FRAG_DECRYPTED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_DECRYPTED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a fragment loading is completed
    * data: { frag : fragment object, payload : fragment payload, stats : { trequest, tfirst, tload, length}}
    */
  @JSImport("hls.js", "Events.FRAG_LOADED")
  @js.native
  def FRAG_LOADED: K_FRAG_LOADED = js.native
  @scala.inline
  def FRAG_LOADED_=(x: K_FRAG_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOADED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a fragment loading starts
    * data: { frag : fragment object }
    */
  @JSImport("hls.js", "Events.FRAG_LOADING")
  @js.native
  def FRAG_LOADING: K_FRAG_LOADING = js.native
  @scala.inline
  def FRAG_LOADING_=(x: K_FRAG_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOADING")(x.asInstanceOf[js.Any])
  
  /**
    * identifier for fragment load aborting for emergency switch down
    * data: { frag: fragment object }
    */
  @JSImport("hls.js", "Events.FRAG_LOAD_EMERGENCY_ABORTED")
  @js.native
  def FRAG_LOAD_EMERGENCY_ABORTED: K_FRAG_LOAD_EMERGENCY_ABORTED = js.native
  @scala.inline
  def FRAG_LOAD_EMERGENCY_ABORTED_=(x: K_FRAG_LOAD_EMERGENCY_ABORTED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOAD_EMERGENCY_ABORTED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a fragment load is in progress
    * data: { frag : fragment object with frag.loaded=stats.loaded, stats : { trequest, tfirst, loaded, total } }
    */
  @JSImport("hls.js", "Events.FRAG_LOAD_PROGRESS")
  @js.native
  def FRAG_LOAD_PROGRESS: K_FRAG_LOAD_PROGRESS = js.native
  @scala.inline
  def FRAG_LOAD_PROGRESS_=(x: K_FRAG_LOAD_PROGRESS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOAD_PROGRESS")(x.asInstanceOf[js.Any])
  
  /**
    * fired when fragment parsing is completed
    * data: { id: demuxer id}
    */
  @JSImport("hls.js", "Events.FRAG_PARSED")
  @js.native
  def FRAG_PARSED: K_FRAG_PARSED = js.native
  @scala.inline
  def FRAG_PARSED_=(x: K_FRAG_PARSED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when moof/mdat have been extracted from fragment
    * data: { id: demuxer id,
    *        moof : moof MP4 box,
    *        mdat : mdat MP4 box,
    *        startPTS : PTS of first sample,
    *        endPTS : PTS of last sample,
    *        startDTS : DTS of first sample,
    *        endDTS : DTS of last sample,
    *        type : stream type (audio or video),
    *        nb : number of samples}
    */
  @JSImport("hls.js", "Events.FRAG_PARSING_DATA")
  @js.native
  def FRAG_PARSING_DATA: K_FRAG_PARSING_DATA = js.native
  @scala.inline
  def FRAG_PARSING_DATA_=(x: K_FRAG_PARSING_DATA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_DATA")(x.asInstanceOf[js.Any])
  
  /**
    * fired when Init Segment has been extracted from fragment
    * data: { id: demuxer id, moov : moov MP4 box, codecs : codecs found while parsing fragment}
    */
  @JSImport("hls.js", "Events.FRAG_PARSING_INIT_SEGMENT")
  @js.native
  def FRAG_PARSING_INIT_SEGMENT: K_FRAG_PARSING_INIT_SEGMENT = js.native
  @scala.inline
  def FRAG_PARSING_INIT_SEGMENT_=(x: K_FRAG_PARSING_INIT_SEGMENT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_INIT_SEGMENT")(x.asInstanceOf[js.Any])
  
  /**
    * fired when parsing id3 is completed
    * data: { id: demuxer id, samples : [ id3 pes - pts and dts timestamp are relative, values are in seconds]}
    */
  @JSImport("hls.js", "Events.FRAG_PARSING_METADATA")
  @js.native
  def FRAG_PARSING_METADATA: K_FRAG_PARSING_METADATA = js.native
  @scala.inline
  def FRAG_PARSING_METADATA_=(x: K_FRAG_PARSING_METADATA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_METADATA")(x.asInstanceOf[js.Any])
  
  /**
    * fired when parsing sei text is completed
    * data: { id : demuxer id, frag: fragment object, samples : [ sei samples pes ] }
    */
  @JSImport("hls.js", "Events.FRAG_PARSING_USERDATA")
  @js.native
  def FRAG_PARSING_USERDATA: K_FRAG_PARSING_USERDATA = js.native
  @scala.inline
  def FRAG_PARSING_USERDATA_=(x: K_FRAG_PARSING_USERDATA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_USERDATA")(x.asInstanceOf[js.Any])
  
  /**
    * fired when first timestamp has been found
    * data: { id: demuxer id, frag: fragment object, initPTS: initPTS }
    */
  @JSImport("hls.js", "Events.INIT_PTS_FOUND")
  @js.native
  def INIT_PTS_FOUND: K_INIT_PTS_FOUND = js.native
  @scala.inline
  def INIT_PTS_FOUND_=(x: K_INIT_PTS_FOUND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INIT_PTS_FOUND")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a decryption key loading is completed
    * data: { frag: fragment object }
    */
  @JSImport("hls.js", "Events.KEY_LOADED")
  @js.native
  def KEY_LOADED: K_KEY_LOADED = js.native
  @scala.inline
  def KEY_LOADED_=(x: K_KEY_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_LOADED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a decryption key loading starts
    * data: { frag: fragment object }
    */
  @JSImport("hls.js", "Events.KEY_LOADING")
  @js.native
  def KEY_LOADING: K_KEY_LOADING = js.native
  @scala.inline
  def KEY_LOADING_=(x: K_KEY_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_LOADING")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a level playlist loading finishes
    * data: { details : levelDetails object, levelId : id of loaded level, stats : { trequest, tfirst, tload, mtime } }
    */
  @JSImport("hls.js", "Events.LEVEL_LOADED")
  @js.native
  def LEVEL_LOADED: K_LEVEL_LOADED = js.native
  @scala.inline
  def LEVEL_LOADED_=(x: K_LEVEL_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOADED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a level playlist loading starts
    * data: { url : level URL, level : id of level being loaded }
    */
  @JSImport("hls.js", "Events.LEVEL_LOADING")
  @js.native
  def LEVEL_LOADING: K_LEVEL_LOADING = js.native
  @scala.inline
  def LEVEL_LOADING_=(x: K_LEVEL_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOADING")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a level's PTS information has been updated after parsing a fragment
    * data: { details: levelDetails object, level : id of updated level, drift: PTS drift observed when parsing last fragment }
    */
  @JSImport("hls.js", "Events.LEVEL_PTS_UPDATED")
  @js.native
  def LEVEL_PTS_UPDATED: K_LEVEL_PTS_UPDATED = js.native
  @scala.inline
  def LEVEL_PTS_UPDATED_=(x: K_LEVEL_PTS_UPDATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_PTS_UPDATED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a level switch is effective
    * data: { level: level object }
    */
  @JSImport("hls.js", "Events.LEVEL_SWITCHED")
  @js.native
  def LEVEL_SWITCHED: K_LEVEL_SWITCHED = js.native
  @scala.inline
  def LEVEL_SWITCHED_=(x: K_LEVEL_SWITCHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_SWITCHED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a level switch is requested
    * data: { level: Level }
    */
  @JSImport("hls.js", "Events.LEVEL_SWITCHING")
  @js.native
  def LEVEL_SWITCHING: K_LEVEL_SWITCHING = js.native
  @scala.inline
  def LEVEL_SWITCHING_=(x: K_LEVEL_SWITCHING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_SWITCHING")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a level's details have been updated based on previous details, after it has been loaded
    * data: { details : levelDetails object, level : id of updated level }
    */
  @JSImport("hls.js", "Events.LEVEL_UPDATED")
  @js.native
  def LEVEL_UPDATED: K_LEVEL_UPDATED = js.native
  @scala.inline
  def LEVEL_UPDATED_=(x: K_LEVEL_UPDATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_UPDATED")(x.asInstanceOf[js.Any])
  
  /**
    * fired after manifest has been loaded
    * data: { levels : [available quality levels] , audioTracks : [ available audio tracks], url : manifestURL, stats : { trequest, tfirst, tload, mtime}}
    */
  @JSImport("hls.js", "Events.MANIFEST_LOADED")
  @js.native
  def MANIFEST_LOADED: K_MANIFEST_LOADED = js.native
  @scala.inline
  def MANIFEST_LOADED_=(x: K_MANIFEST_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_LOADED")(x.asInstanceOf[js.Any])
  
  /**
    * fired to signal that a manifest loading starts
    * data: { url : manifestURL }
    */
  @JSImport("hls.js", "Events.MANIFEST_LOADING")
  @js.native
  def MANIFEST_LOADING: K_MANIFEST_LOADING = js.native
  @scala.inline
  def MANIFEST_LOADING_=(x: K_MANIFEST_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_LOADING")(x.asInstanceOf[js.Any])
  
  /**
    * fired after manifest has been parsed
    * data: { levels : [ available quality levels ], firstLevel : index of first quality level appearing in Manifest }
    */
  @JSImport("hls.js", "Events.MANIFEST_PARSED")
  @js.native
  def MANIFEST_PARSED: K_MANIFEST_PARSED = js.native
  @scala.inline
  def MANIFEST_PARSED_=(x: K_MANIFEST_PARSED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_PARSED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when Media has been succesfully attached to hls instance
    * data: { video , mediaSource }
    */
  @JSImport("hls.js", "Events.MEDIA_ATTACHED")
  @js.native
  def MEDIA_ATTACHED: K_MEDIA_ATTACHED = js.native
  @scala.inline
  def MEDIA_ATTACHED_=(x: K_MEDIA_ATTACHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ATTACHED")(x.asInstanceOf[js.Any])
  
  /**
    * fired to attach Media to hls instance
    * data: { video , mediaSource }
    */
  @JSImport("hls.js", "Events.MEDIA_ATTACHING")
  @js.native
  def MEDIA_ATTACHING: K_MEDIA_ATTACHING = js.native
  @scala.inline
  def MEDIA_ATTACHING_=(x: K_MEDIA_ATTACHING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ATTACHING")(x.asInstanceOf[js.Any])
  
  /**
    * fired when Media has been detached from hls instance
    * data: { }
    */
  @JSImport("hls.js", "Events.MEDIA_DETACHED")
  @js.native
  def MEDIA_DETACHED: K_MEDIA_DETACHED = js.native
  @scala.inline
  def MEDIA_DETACHED_=(x: K_MEDIA_DETACHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_DETACHED")(x.asInstanceOf[js.Any])
  
  /**
    * fired before detaching Media from hls instance
    * data: { }
    */
  @JSImport("hls.js", "Events.MEDIA_DETACHING")
  @js.native
  def MEDIA_DETACHING: K_MEDIA_DETACHING = js.native
  @scala.inline
  def MEDIA_DETACHING_=(x: K_MEDIA_DETACHING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_DETACHING")(x.asInstanceOf[js.Any])
  
  /**
    * fired upon stream controller state transitions
    * data: { previousState, nextState }
    */
  @JSImport("hls.js", "Events.STREAM_STATE_TRANSITION")
  @js.native
  def STREAM_STATE_TRANSITION: K_STREAM_STATE_TRANSITION = js.native
  @scala.inline
  def STREAM_STATE_TRANSITION_=(x: K_STREAM_STATE_TRANSITION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM_STATE_TRANSITION")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a subtitle fragment has been processed
    * data: { success : boolean, frag : the processed frag }
    */
  @JSImport("hls.js", "Events.SUBTITLE_FRAG_PROCESSED")
  @js.native
  def SUBTITLE_FRAG_PROCESSED: K_SUBTITLE_FRAG_PROCESSED = js.native
  @scala.inline
  def SUBTITLE_FRAG_PROCESSED_=(x: K_SUBTITLE_FRAG_PROCESSED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_FRAG_PROCESSED")(x.asInstanceOf[js.Any])
  
  /**
    * fired to notify that subtitle track lists has been updated
    * data: { subtitleTracks : subtitleTracks }
    */
  @JSImport("hls.js", "Events.SUBTITLE_TRACKS_UPDATED")
  @js.native
  def SUBTITLE_TRACKS_UPDATED: K_SUBTITLE_TRACKS_UPDATED = js.native
  @scala.inline
  def SUBTITLE_TRACKS_UPDATED_=(x: K_SUBTITLE_TRACKS_UPDATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACKS_UPDATED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a subtitle track loading finishes
    * data: { details : levelDetails object, id : subtitle track id, stats : { trequest, tfirst, tload, mtime } }
    */
  @JSImport("hls.js", "Events.SUBTITLE_TRACK_LOADED")
  @js.native
  def SUBTITLE_TRACK_LOADED: K_SUBTITLE_TRACK_LOADED = js.native
  @scala.inline
  def SUBTITLE_TRACK_LOADED_=(x: K_SUBTITLE_TRACK_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACK_LOADED")(x.asInstanceOf[js.Any])
  
  /**
    * fired when a subtitle track loading starts
    * data: { url : subtitle track URL, id : subtitle track id }
    */
  @JSImport("hls.js", "Events.SUBTITLE_TRACK_LOADING")
  @js.native
  def SUBTITLE_TRACK_LOADING: K_SUBTITLE_TRACK_LOADING = js.native
  @scala.inline
  def SUBTITLE_TRACK_LOADING_=(x: K_SUBTITLE_TRACK_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACK_LOADING")(x.asInstanceOf[js.Any])
  
  /**
    * fired when an subtitle track switch occurs
    * data: { id : subtitle track id }
    */
  @JSImport("hls.js", "Events.SUBTITLE_TRACK_SWITCH")
  @js.native
  def SUBTITLE_TRACK_SWITCH: K_SUBTITLE_TRACK_SWITCH = js.native
  @scala.inline
  def SUBTITLE_TRACK_SWITCH_=(x: K_SUBTITLE_TRACK_SWITCH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACK_SWITCH")(x.asInstanceOf[js.Any])
}
