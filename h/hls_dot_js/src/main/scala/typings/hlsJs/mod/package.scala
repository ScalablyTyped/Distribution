package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * checks whether your browser is supporting MediaSource Extensions
  */
/* static member */
inline def isSupported(): scala.Boolean = typings.hlsJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[scala.Boolean]

/**
  * returns hls.js dist version number
  */
/* static member */
inline def version: java.lang.String = typings.hlsJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
inline def version_=(x: java.lang.String): scala.Unit = typings.hlsJs.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

type K_AUDIO_TRACKS_UPDATED = typings.hlsJs.hlsJsStrings.hlsAudioTracksUpdated

type K_AUDIO_TRACK_LOADED = typings.hlsJs.hlsJsStrings.hlsAudioTrackLoaded

type K_AUDIO_TRACK_LOADING = typings.hlsJs.hlsJsStrings.hlsAudioTrackLoading

type K_AUDIO_TRACK_LOAD_ERROR = typings.hlsJs.hlsJsStrings.audioTrackLoadError

type K_AUDIO_TRACK_LOAD_TIMEOUT = typings.hlsJs.hlsJsStrings.audioTrackLoadTimeout

type K_AUDIO_TRACK_SWITCH = typings.hlsJs.hlsJsStrings.hlsAudioTrackSwitch

type K_AUDIO_TRACK_SWITCHED = typings.hlsJs.hlsJsStrings.hlsAudioTrackSwitched

type K_AUDIO_TRACK_SWITCHING = typings.hlsJs.hlsJsStrings.hlsAudioTrackSwitching

type K_BUFFER_ADD_CODEC_ERROR = typings.hlsJs.hlsJsStrings.bufferAddCodecError

type K_BUFFER_APPENDED = typings.hlsJs.hlsJsStrings.hlsBufferAppended

type K_BUFFER_APPENDING = typings.hlsJs.hlsJsStrings.hlsBufferAppending

type K_BUFFER_APPENDING_ERROR = typings.hlsJs.hlsJsStrings.bufferAppendingError

type K_BUFFER_APPEND_ERROR = typings.hlsJs.hlsJsStrings.bufferAppendError

type K_BUFFER_CODECS = typings.hlsJs.hlsJsStrings.hlsBufferCodecs

type K_BUFFER_CREATED = typings.hlsJs.hlsJsStrings.hlsBufferCreated

type K_BUFFER_EOS = typings.hlsJs.hlsJsStrings.hlsBufferEOS

type K_BUFFER_FLUSHED = typings.hlsJs.hlsJsStrings.hlsBufferFlushed

type K_BUFFER_FLUSHING = typings.hlsJs.hlsJsStrings.hlsBufferFlushing

type K_BUFFER_FULL_ERROR = typings.hlsJs.hlsJsStrings.bufferFullError

type K_BUFFER_NUDGE_ON_STALL = typings.hlsJs.hlsJsStrings.bufferNudgeOnStall

type K_BUFFER_RESET = typings.hlsJs.hlsJsStrings.hlsBufferReset

type K_BUFFER_SEEK_OVER_HOLE = typings.hlsJs.hlsJsStrings.bufferSeekOverHole

type K_BUFFER_STALLED_ERROR = typings.hlsJs.hlsJsStrings.bufferStalledError

type K_DESTROYING = typings.hlsJs.hlsJsStrings.hlsDestroying

type K_ERROR = typings.hlsJs.hlsJsStrings.hlsError

type K_FPS_DROP = typings.hlsJs.hlsJsStrings.hlsFpsDrop

type K_FPS_DROP_LEVEL_CAPPING = typings.hlsJs.hlsJsStrings.hlsFpsDropLevelCapping

type K_FRAG_BUFFERED = typings.hlsJs.hlsJsStrings.hlsFragBuffered

type K_FRAG_CHANGED = typings.hlsJs.hlsJsStrings.hlsFragChanged

type K_FRAG_DECRYPTED = typings.hlsJs.hlsJsStrings.hlsFragDecrypted

type K_FRAG_DECRYPT_ERROR = typings.hlsJs.hlsJsStrings.fragDecryptError

type K_FRAG_LOADED = typings.hlsJs.hlsJsStrings.hlsFragLoaded

type K_FRAG_LOADING = typings.hlsJs.hlsJsStrings.hlsFragLoading

type K_FRAG_LOAD_EMERGENCY_ABORTED = typings.hlsJs.hlsJsStrings.hlsFragLoadEmergencyAborted

type K_FRAG_LOAD_ERROR = typings.hlsJs.hlsJsStrings.fragLoadError

type K_FRAG_LOAD_PROGRESS = typings.hlsJs.hlsJsStrings.hlsFragLoadProgress

type K_FRAG_LOAD_TIMEOUT = typings.hlsJs.hlsJsStrings.fragLoadTimeout

type K_FRAG_LOOP_LOADING_ERROR = typings.hlsJs.hlsJsStrings.fragLoopLoadingError

type K_FRAG_PARSED = typings.hlsJs.hlsJsStrings.hlsFragParsed

type K_FRAG_PARSING_DATA = typings.hlsJs.hlsJsStrings.hlsFragParsingData

type K_FRAG_PARSING_ERROR = typings.hlsJs.hlsJsStrings.fragParsingError

type K_FRAG_PARSING_INIT_SEGMENT = typings.hlsJs.hlsJsStrings.hlsFragParsingInitSegment

type K_FRAG_PARSING_METADATA = typings.hlsJs.hlsJsStrings.hlsFragParsingMetadata

type K_FRAG_PARSING_USERDATA = typings.hlsJs.hlsJsStrings.hlsFragParsingUserData

type K_INIT_PTS_FOUND = typings.hlsJs.hlsJsStrings.hlsInitPtsFound

type K_INTERNAL_EXCEPTION = typings.hlsJs.hlsJsStrings.interalException

type K_KEY_LOADED = typings.hlsJs.hlsJsStrings.hlsKeyLoaded

type K_KEY_LOADING = typings.hlsJs.hlsJsStrings.hlsKeyLoading

type K_KEY_LOAD_ERROR = typings.hlsJs.hlsJsStrings.keyLoadError

type K_KEY_LOAD_TIMEOUT = typings.hlsJs.hlsJsStrings.keyLoadTimeout

type K_KEY_SYSTEM_ERROR = typings.hlsJs.hlsJsStrings.keySystemError

type K_LEVEL_LOADED = typings.hlsJs.hlsJsStrings.hlsLevelLoaded

type K_LEVEL_LOADING = typings.hlsJs.hlsJsStrings.hlsLevelLoading

type K_LEVEL_LOAD_ERROR = typings.hlsJs.hlsJsStrings.levelLoadError

type K_LEVEL_LOAD_TIMEOUT = typings.hlsJs.hlsJsStrings.levelLoadTimeout

type K_LEVEL_PTS_UPDATED = typings.hlsJs.hlsJsStrings.hlsLevelPtsUpdated

type K_LEVEL_SWITCHED = typings.hlsJs.hlsJsStrings.hlsLevelSwitched

type K_LEVEL_SWITCHING = typings.hlsJs.hlsJsStrings.hlsLevelSwitching

// OTHER_ERROR //
type K_LEVEL_SWITCH_ERROR = typings.hlsJs.hlsJsStrings.levelSwitchError

type K_LEVEL_UPDATED = typings.hlsJs.hlsJsStrings.hlsLevelUpdated

// MEDIA_ERRORS //
type K_MANIFEST_INCOMPATIBLE_CODECS_ERROR = typings.hlsJs.hlsJsStrings.manifestIncompatibleCodecsError

type K_MANIFEST_LOADED = typings.hlsJs.hlsJsStrings.hlsManifestLoaded

type K_MANIFEST_LOADING = typings.hlsJs.hlsJsStrings.hlsManifestLoading

// Error Keys
type K_MANIFEST_LOAD_ERROR = typings.hlsJs.hlsJsStrings.manifestLoadError

type K_MANIFEST_LOAD_TIMEOUT = typings.hlsJs.hlsJsStrings.manifestLoadTimeout

type K_MANIFEST_PARSED = typings.hlsJs.hlsJsStrings.hlsManifestParsed

type K_MANIFEST_PARSING_ERROR = typings.hlsJs.hlsJsStrings.manifestParsingError

type K_MEDIA_ATTACHED = typings.hlsJs.hlsJsStrings.hlsMediaAttached

type K_MEDIA_ATTACHING = typings.hlsJs.hlsJsStrings.hlsMediaAttaching

type K_MEDIA_DETACHED = typings.hlsJs.hlsJsStrings.hlsMediaDetached

type K_MEDIA_DETACHING = typings.hlsJs.hlsJsStrings.hlsMediaDetaching

type K_MEDIA_ERROR = typings.hlsJs.hlsJsStrings.mediaError

type K_MUX_ERROR = typings.hlsJs.hlsJsStrings.muxError

// Error Type Keys
type K_NETWORK_ERROR = typings.hlsJs.hlsJsStrings.networkError

type K_OTHER_ERROR = typings.hlsJs.hlsJsStrings.otherError

// MUX_ERROR //
type K_REMUX_ALLOC_ERROR = typings.hlsJs.hlsJsStrings.remuxAllocError

type K_STREAM_STATE_TRANSITION = typings.hlsJs.hlsJsStrings.hlsStreamStateTransition

type K_SUBTITLE_FRAG_PROCESSED = typings.hlsJs.hlsJsStrings.hlsSubtitleFragProcessed

type K_SUBTITLE_TRACKS_UPDATED = typings.hlsJs.hlsJsStrings.hlsSubtitleTracksUpdated

type K_SUBTITLE_TRACK_LOADED = typings.hlsJs.hlsJsStrings.hlsSubtitleTrackLoaded

type K_SUBTITLE_TRACK_LOADING = typings.hlsJs.hlsJsStrings.hlsSubtitleTrackLoading

type K_SUBTITLE_TRACK_SWITCH = typings.hlsJs.hlsJsStrings.hlsSubtitleTrackSwitch

type LevelAttr = org.scalablytyped.runtime.StringDictionary[java.lang.String]
