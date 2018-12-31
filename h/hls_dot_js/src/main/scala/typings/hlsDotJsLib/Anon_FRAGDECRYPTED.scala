package typings
package hlsDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FRAGDECRYPTED extends js.Object {
  /**
    * fired to notify that audio track lists has been updated
    * data: { audioTracks : audioTracks }
    */
  var AUDIO_TRACKS_UPDATED: K_AUDIO_TRACKS_UPDATED
  /**
    * fired when an audio track loading finishes
    * data: { details : levelDetails object, id : audio track id, stats : { trequest, tfirst, tload, mtime } }
    */
  var AUDIO_TRACK_LOADED: K_AUDIO_TRACK_LOADED
  /**
    * fired when an audio track loading starts
    * data: { url : audio track URL, id : audio track id }
    */
  var AUDIO_TRACK_LOADING: K_AUDIO_TRACK_LOADING
  /**
    * fired when an audio track switch occurs. deprecated in favor AUDIO_TRACK_SWITCHING
    * data: { id : audio track id }
    */
  var AUDIO_TRACK_SWITCH: K_AUDIO_TRACK_SWITCH
  /**
    * fired when an audio track switch actually occurs
    * data: { id : audio track id }
    */
  var AUDIO_TRACK_SWITCHED: K_AUDIO_TRACK_SWITCHED
  /**
    * fired when an audio track switching is requested
    * data: { id : audio track id }
    */
  var AUDIO_TRACK_SWITCHING: K_AUDIO_TRACK_SWITCHING
  /**
    * fired when we are done with appending a media segment to the buffer
    * data: { parent : segment parent that triggered BUFFER_APPENDING, pending : nb of segments waiting for appending for this segment parent }
    */
  var BUFFER_APPENDED: K_BUFFER_APPENDED
  /**
    * fired when we append a segment to the buffer
    * data: { segment: segment object }
    */
  var BUFFER_APPENDING: K_BUFFER_APPENDING
  /**
    * fired when we know about the codecs that we need buffers for to push into
    * data: { tracks : { container, codec, levelCodec, initSegment, metadata } }
    */
  var BUFFER_CODECS: K_BUFFER_CODECS
  /**
    * fired when sourcebuffers have been created
    * data: { tracks: tracks }
    */
  var BUFFER_CREATED: K_BUFFER_CREATED
  /**
    * fired when the stream is finished and we want to notify the media buffer that there will be no more data
    * data: { }
    */
  var BUFFER_EOS: K_BUFFER_EOS
  /**
    * fired when the media buffer has been flushed
    * data: { }
    */
  var BUFFER_FLUSHED: K_BUFFER_FLUSHED
  /**
    * fired when the media buffer should be flushed
    * data: { }
    */
  var BUFFER_FLUSHING: K_BUFFER_FLUSHING
  /**
    * fired when the buffer is going to be reset
    * data: { }
    */
  var BUFFER_RESET: K_BUFFER_RESET
  /**
    * fired when hls.js instance starts destroying. Different from MEDIA_DETACHED as one could want to detach and reattach a video to the instance of hls.js to handle mid-rolls for example.
    * data: { }
    */
  var DESTROYING: K_DESTROYING
  /**
    *  Identifier for an error event
    * data: { type : error type, details : error details, fatal : is error fatal or not, other error specific data }
    */
  var ERROR: K_ERROR
  /**
    * triggered when FPS drop in last monitoring period is higher than given threshold
    * data: { curentDropped : nb of dropped frames in last monitoring period,
    *         currentDecoded : nb of decoded frames in last monitoring period,
    *         totalDropped : total dropped frames on this video element }
    */
  var FPS_DROP: K_FPS_DROP
  /**
    * triggered when FPS drop triggers auto level capping
    * data: { level: suggested new auto level capping by fps controller, droppedLevel : level has to much dropped frame will be restricted }
    */
  var FPS_DROP_LEVEL_CAPPING: K_FPS_DROP_LEVEL_CAPPING
  /**
    * fired when fragment remuxed MP4 boxes have all been appended into SourceBuffer
    * data: { id: demuxer id, frag : fragment object, stats : { trequest, tfirst, tload, tparsed, tbuffered, length} }
    */
  var FRAG_BUFFERED: K_FRAG_BUFFERED
  /**
    * fired when fragment matching with current video position is changing
    * data: { frag : fragment object }
    */
  var FRAG_CHANGED: K_FRAG_CHANGED
  /**
    * fired when a fragment decryption is completed
    * data: { id: demuxer id, frag: fragment object, stats: { tstart, tdecrypt } }
    */
  var FRAG_DECRYPTED: K_FRAG_DECRYPTED
  /**
    * fired when a fragment loading is completed
    * data: { frag : fragment object, payload : fragment payload, stats : { trequest, tfirst, tload, length}}
    */
  var FRAG_LOADED: K_FRAG_LOADED
  /**
    * fired when a fragment loading starts
    * data: { frag : fragment object }
    */
  var FRAG_LOADING: K_FRAG_LOADING
  /**
    * identifier for fragment load aborting for emergency switch down
    * data: { frag: fragment object }
    */
  var FRAG_LOAD_EMERGENCY_ABORTED: K_FRAG_LOAD_EMERGENCY_ABORTED
  /**
    * fired when a fragment load is in progress
    * data: { frag : fragment object with frag.loaded=stats.loaded, stats : { trequest, tfirst, loaded, total } }
    */
  var FRAG_LOAD_PROGRESS: K_FRAG_LOAD_PROGRESS
  /**
    * fired when fragment parsing is completed
    * data: { id: demuxer id}
    */
  var FRAG_PARSED: K_FRAG_PARSED
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
  var FRAG_PARSING_DATA: K_FRAG_PARSING_DATA
  /**
    * fired when Init Segment has been extracted from fragment
    * data: { id: demuxer id, moov : moov MP4 box, codecs : codecs found while parsing fragment}
    */
  var FRAG_PARSING_INIT_SEGMENT: K_FRAG_PARSING_INIT_SEGMENT
  /**
    * fired when parsing id3 is completed
    * data: { id: demuxer id, samples : [ id3 pes - pts and dts timestamp are relative, values are in seconds]}
    */
  var FRAG_PARSING_METADATA: K_FRAG_PARSING_METADATA
  /**
    * fired when parsing sei text is completed
    * data: { id : demuxer id, frag: fragment object, samples : [ sei samples pes ] }
    */
  var FRAG_PARSING_USERDATA: K_FRAG_PARSING_USERDATA
  /**
    * fired when first timestamp has been found
    * data: { id: demuxer id, frag: fragment object, initPTS: initPTS }
    */
  var INIT_PTS_FOUND: K_INIT_PTS_FOUND
  /**
    * fired when a decryption key loading is completed
    * data: { frag: fragment object }
    */
  var KEY_LOADED: K_KEY_LOADED
  /**
    * fired when a decryption key loading starts
    * data: { frag: fragment object }
    */
  var KEY_LOADING: K_KEY_LOADING
  /**
    * fired when a level playlist loading finishes
    * data: { details : levelDetails object, levelId : id of loaded level, stats : { trequest, tfirst, tload, mtime } }
    */
  var LEVEL_LOADED: K_LEVEL_LOADED
  /**
    * fired when a level playlist loading starts
    * data: { url : level URL, level : id of level being loaded }
    */
  var LEVEL_LOADING: K_LEVEL_LOADING
  /**
    * fired when a level's PTS information has been updated after parsing a fragment
    * data: { details: levelDetails object, level : id of updated level, drift: PTS drift observed when parsing last fragment }
    */
  var LEVEL_PTS_UPDATED: K_LEVEL_PTS_UPDATED
  /**
    * fired when a level switch is effective
    * data: { level: level object }
    */
  var LEVEL_SWITCHED: K_LEVEL_SWITCHED
  /**
    * fired when a level switch is requested
    * data: { level: Level }
    */
  var LEVEL_SWITCHING: K_LEVEL_SWITCHING
  /**
    * fired when a level's details have been updated based on previous details, after it has been loaded
    * data: { details : levelDetails object, level : id of updated level }
    */
  var LEVEL_UPDATED: K_LEVEL_UPDATED
  /**
    * fired after manifest has been loaded
    * data: { levels : [available quality levels] , audioTracks : [ available audio tracks], url : manifestURL, stats : { trequest, tfirst, tload, mtime}}
    */
  var MANIFEST_LOADED: K_MANIFEST_LOADED
  /**
    * fired to signal that a manifest loading starts
    * data: { url : manifestURL }
    */
  var MANIFEST_LOADING: K_MANIFEST_LOADING
  /**
    * fired after manifest has been parsed
    * data: { levels : [ available quality levels ], firstLevel : index of first quality level appearing in Manifest }
    */
  var MANIFEST_PARSED: K_MANIFEST_PARSED
  /**
    * fired when Media has been succesfully attached to hls instance
    * data: { video , mediaSource }
    */
  var MEDIA_ATTACHED: K_MEDIA_ATTACHED
  /**
    * fired to attach Media to hls instance
    * data: { video , mediaSource }
    */
  var MEDIA_ATTACHING: K_MEDIA_ATTACHING
  /**
    * fired when Media has been detached from hls instance
    * data: { }
    */
  var MEDIA_DETACHED: K_MEDIA_DETACHED
  /**
    * fired before detaching Media from hls instance
    * data: { }
    */
  var MEDIA_DETACHING: K_MEDIA_DETACHING
  /**
    * fired upon stream controller state transitions
    * data: { previousState, nextState }
    */
  var STREAM_STATE_TRANSITION: K_STREAM_STATE_TRANSITION
  /**
    * fired when a subtitle fragment has been processed
    * data: { success : boolean, frag : the processed frag }
    */
  var SUBTITLE_FRAG_PROCESSED: K_SUBTITLE_FRAG_PROCESSED
  /**
    * fired to notify that subtitle track lists has been updated
    * data: { subtitleTracks : subtitleTracks }
    */
  var SUBTITLE_TRACKS_UPDATED: K_SUBTITLE_TRACKS_UPDATED
  /**
    * fired when a subtitle track loading finishes
    * data: { details : levelDetails object, id : subtitle track id, stats : { trequest, tfirst, tload, mtime } }
    */
  var SUBTITLE_TRACK_LOADED: K_SUBTITLE_TRACK_LOADED
  /**
    * fired when a subtitle track loading starts
    * data: { url : subtitle track URL, id : subtitle track id }
    */
  var SUBTITLE_TRACK_LOADING: K_SUBTITLE_TRACK_LOADING
  /**
    * fired when an subtitle track switch occurs
    * data: { id : subtitle track id }
    */
  var SUBTITLE_TRACK_SWITCH: K_SUBTITLE_TRACK_SWITCH
}

