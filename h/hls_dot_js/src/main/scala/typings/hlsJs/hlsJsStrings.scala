package typings.hlsJs

import typings.hlsJs.mod.CMCDObjectType
import typings.hlsJs.mod.CMCDStreamType
import typings.hlsJs.mod.ElementaryStreamTypes
import typings.hlsJs.mod.FragmentState
import typings.hlsJs.mod.HlsSkip
import typings.hlsJs.mod.KeySystemFormats
import typings.hlsJs.mod.KeySystems
import typings.hlsJs.mod.MetadataSchema
import typings.hlsJs.mod.PlaylistContextType
import typings.hlsJs.mod.PlaylistLevelType
import typings.hlsJs.mod.SourceBufferName
import typings.hlsJs.mod.SubtitlePlaylistType
import typings.hlsJs.mod._HdcpLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hlsJsStrings {
  
  @js.native
  sealed trait APPENDING
    extends StObject
       with FragmentState
  inline def APPENDING: APPENDING = "APPENDING".asInstanceOf[APPENDING]
  
  @js.native
  sealed trait AUDIO extends StObject
  inline def AUDIO: AUDIO = "AUDIO".asInstanceOf[AUDIO]
  
  @js.native
  sealed trait `CLOSED-CAPTIONS`
    extends StObject
       with SubtitlePlaylistType
  inline def `CLOSED-CAPTIONS`: `CLOSED-CAPTIONS` = "CLOSED-CAPTIONS".asInstanceOf[`CLOSED-CAPTIONS`]
  
  @js.native
  sealed trait HLG extends StObject
  inline def HLG: HLG = "HLG".asInstanceOf[HLG]
  
  @js.native
  sealed trait NO extends StObject
  inline def NO: NO = "NO".asInstanceOf[NO]
  
  @js.native
  sealed trait NONE
    extends StObject
       with _HdcpLevel
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait NOT_LOADED
    extends StObject
       with FragmentState
  inline def NOT_LOADED: NOT_LOADED = "NOT_LOADED".asInstanceOf[NOT_LOADED]
  
  @js.native
  sealed trait OK
    extends StObject
       with FragmentState
  inline def OK: OK = "OK".asInstanceOf[OK]
  
  @js.native
  sealed trait PARTIAL
    extends StObject
       with FragmentState
  inline def PARTIAL: PARTIAL = "PARTIAL".asInstanceOf[PARTIAL]
  
  @js.native
  sealed trait PQ extends StObject
  inline def PQ: PQ = "PQ".asInstanceOf[PQ]
  
  @js.native
  sealed trait SDR extends StObject
  inline def SDR: SDR = "SDR".asInstanceOf[SDR]
  
  @js.native
  sealed trait SUBTITLES
    extends StObject
       with SubtitlePlaylistType
  inline def SUBTITLES: SUBTITLES = "SUBTITLES".asInstanceOf[SUBTITLES]
  
  @js.native
  sealed trait `TYPE-0`
    extends StObject
       with _HdcpLevel
  inline def `TYPE-0`: `TYPE-0` = "TYPE-0".asInstanceOf[`TYPE-0`]
  
  @js.native
  sealed trait `TYPE-1`
    extends StObject
       with _HdcpLevel
  inline def `TYPE-1`: `TYPE-1` = "TYPE-1".asInstanceOf[`TYPE-1`]
  
  @js.native
  sealed trait VIDEO extends StObject
  inline def VIDEO: VIDEO = "VIDEO".asInstanceOf[VIDEO]
  
  @js.native
  sealed trait YES
    extends StObject
       with HlsSkip
  inline def YES: YES = "YES".asInstanceOf[YES]
  
  @js.native
  sealed trait _empty
    extends StObject
       with HlsSkip
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait a
    extends StObject
       with CMCDObjectType
  inline def a: a = "a".asInstanceOf[a]
  
  @js.native
  sealed trait audioTrack
    extends StObject
       with PlaylistContextType
  inline def audioTrack: audioTrack = "audioTrack".asInstanceOf[audioTrack]
  
  @js.native
  sealed trait audio_
    extends StObject
       with ElementaryStreamTypes
       with PlaylistLevelType
       with SourceBufferName
  inline def audio_ : audio_ = "audio".asInstanceOf[audio_]
  
  @js.native
  sealed trait audiovideo
    extends StObject
       with ElementaryStreamTypes
       with SourceBufferName
  inline def audiovideo: audiovideo = "audiovideo".asInstanceOf[audiovideo]
  
  @js.native
  sealed trait av
    extends StObject
       with CMCDObjectType
  inline def av: av = "av".asInstanceOf[av]
  
  @js.native
  sealed trait c
    extends StObject
       with CMCDObjectType
  inline def c: c = "c".asInstanceOf[c]
  
  @js.native
  sealed trait captions extends StObject
  inline def captions: captions = "captions".asInstanceOf[captions]
  
  @js.native
  sealed trait comDotappleDotfps
    extends StObject
       with KeySystems
  inline def comDotappleDotfps: comDotappleDotfps = "com.apple.fps".asInstanceOf[comDotappleDotfps]
  
  @js.native
  sealed trait comDotappleDotquicktimeDotHLS
    extends StObject
       with MetadataSchema
  inline def comDotappleDotquicktimeDotHLS: comDotappleDotquicktimeDotHLS = "com.apple.quicktime.HLS".asInstanceOf[comDotappleDotquicktimeDotHLS]
  
  @js.native
  sealed trait comDotappleDotstreamingkeydelivery
    extends StObject
       with KeySystemFormats
  inline def comDotappleDotstreamingkeydelivery: comDotappleDotstreamingkeydelivery = "com.apple.streamingkeydelivery".asInstanceOf[comDotappleDotstreamingkeydelivery]
  
  @js.native
  sealed trait comDotmicrosoftDotplayready
    extends StObject
       with KeySystemFormats
       with KeySystems
  inline def comDotmicrosoftDotplayready: comDotmicrosoftDotplayready = "com.microsoft.playready".asInstanceOf[comDotmicrosoftDotplayready]
  
  @js.native
  sealed trait comDotwidevineDotalpha
    extends StObject
       with KeySystems
  inline def comDotwidevineDotalpha: comDotwidevineDotalpha = "com.widevine.alpha".asInstanceOf[comDotwidevineDotalpha]
  
  @js.native
  sealed trait demuxerWorker extends StObject
  inline def demuxerWorker: demuxerWorker = "demuxerWorker".asInstanceOf[demuxerWorker]
  
  @js.native
  sealed trait exponential extends StObject
  inline def exponential: exponential = "exponential".asInstanceOf[exponential]
  
  @js.native
  sealed trait httpsColonSlashSlashaomediaDotorgSlashemsgSlashID3
    extends StObject
       with MetadataSchema
  inline def httpsColonSlashSlashaomediaDotorgSlashemsgSlashID3: httpsColonSlashSlashaomediaDotorgSlashemsgSlashID3 = "https://aomedia.org/emsg/ID3".asInstanceOf[httpsColonSlashSlashaomediaDotorgSlashemsgSlashID3]
  
  @js.native
  sealed trait i
    extends StObject
       with CMCDObjectType
  inline def i: i = "i".asInstanceOf[i]
  
  @js.native
  sealed trait initSegment extends StObject
  inline def initSegment: initSegment = "initSegment".asInstanceOf[initSegment]
  
  @js.native
  sealed trait k
    extends StObject
       with CMCDObjectType
  inline def k: k = "k".asInstanceOf[k]
  
  @js.native
  sealed trait l
    extends StObject
       with CMCDStreamType
  inline def l: l = "l".asInstanceOf[l]
  
  @js.native
  sealed trait level
    extends StObject
       with PlaylistContextType
  inline def level: level = "level".asInstanceOf[level]
  
  @js.native
  sealed trait linear extends StObject
  inline def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait m
    extends StObject
       with CMCDObjectType
  inline def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait main
    extends StObject
       with PlaylistLevelType
  inline def main: main = "main".asInstanceOf[main]
  
  @js.native
  sealed trait manifest
    extends StObject
       with PlaylistContextType
  inline def manifest: manifest = "manifest".asInstanceOf[manifest]
  
  @js.native
  sealed trait o
    extends StObject
       with CMCDObjectType
  inline def o: o = "o".asInstanceOf[o]
  
  @js.native
  sealed trait orgDotid3
    extends StObject
       with MetadataSchema
  inline def orgDotid3: orgDotid3 = "org.id3".asInstanceOf[orgDotid3]
  
  @js.native
  sealed trait orgDotw3Dotclearkey
    extends StObject
       with KeySystemFormats
       with KeySystems
  inline def orgDotw3Dotclearkey: orgDotw3Dotclearkey = "org.w3.clearkey".asInstanceOf[orgDotw3Dotclearkey]
  
  @js.native
  sealed trait subtitle
    extends StObject
       with PlaylistLevelType
  inline def subtitle: subtitle = "subtitle".asInstanceOf[subtitle]
  
  @js.native
  sealed trait subtitleTrack
    extends StObject
       with PlaylistContextType
  inline def subtitleTrack: subtitleTrack = "subtitleTrack".asInstanceOf[subtitleTrack]
  
  @js.native
  sealed trait subtitles_ extends StObject
  inline def subtitles_ : subtitles_ = "subtitles".asInstanceOf[subtitles_]
  
  @js.native
  sealed trait tt
    extends StObject
       with CMCDObjectType
  inline def tt: tt = "tt".asInstanceOf[tt]
  
  @js.native
  sealed trait `urnColonuuidColonedef8ba9-79d6-4ace-a3c8-27dcd51d21ed`
    extends StObject
       with KeySystemFormats
  inline def `urnColonuuidColonedef8ba9-79d6-4ace-a3c8-27dcd51d21ed`: `urnColonuuidColonedef8ba9-79d6-4ace-a3c8-27dcd51d21ed` = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".asInstanceOf[`urnColonuuidColonedef8ba9-79d6-4ace-a3c8-27dcd51d21ed`]
  
  @js.native
  sealed trait v
    extends StObject
       with CMCDObjectType
       with CMCDStreamType
  inline def v: v = "v".asInstanceOf[v]
  
  @js.native
  sealed trait v2
    extends StObject
       with HlsSkip
  inline def v2: v2 = "v2".asInstanceOf[v2]
  
  @js.native
  sealed trait video_
    extends StObject
       with ElementaryStreamTypes
       with SourceBufferName
  inline def video_ : video_ = "video".asInstanceOf[video_]
}
