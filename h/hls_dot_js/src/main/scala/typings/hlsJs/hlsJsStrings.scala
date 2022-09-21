package typings.hlsJs

import typings.hlsJs.mod.SourceBufferName
import typings.hlsJs.mod.SubtitlePlaylistType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hlsJsStrings {
  
  @js.native
  sealed trait AUDIO extends StObject
  inline def AUDIO: AUDIO = "AUDIO".asInstanceOf[AUDIO]
  
  @js.native
  sealed trait `CLOSED-CAPTIONS`
    extends StObject
       with SubtitlePlaylistType
  inline def `CLOSED-CAPTIONS`: `CLOSED-CAPTIONS` = "CLOSED-CAPTIONS".asInstanceOf[`CLOSED-CAPTIONS`]
  
  @js.native
  sealed trait SUBTITLES
    extends StObject
       with SubtitlePlaylistType
  inline def SUBTITLES: SUBTITLES = "SUBTITLES".asInstanceOf[SUBTITLES]
  
  @js.native
  sealed trait VIDEO extends StObject
  inline def VIDEO: VIDEO = "VIDEO".asInstanceOf[VIDEO]
  
  @js.native
  sealed trait audio_
    extends StObject
       with SourceBufferName
  inline def audio_ : audio_ = "audio".asInstanceOf[audio_]
  
  @js.native
  sealed trait audiovideo
    extends StObject
       with SourceBufferName
  inline def audiovideo: audiovideo = "audiovideo".asInstanceOf[audiovideo]
  
  @js.native
  sealed trait captions extends StObject
  inline def captions: captions = "captions".asInstanceOf[captions]
  
  @js.native
  sealed trait demuxerWorker extends StObject
  inline def demuxerWorker: demuxerWorker = "demuxerWorker".asInstanceOf[demuxerWorker]
  
  @js.native
  sealed trait initSegment extends StObject
  inline def initSegment: initSegment = "initSegment".asInstanceOf[initSegment]
  
  @js.native
  sealed trait main extends StObject
  inline def main: main = "main".asInstanceOf[main]
  
  @js.native
  sealed trait subtitles_ extends StObject
  inline def subtitles_ : subtitles_ = "subtitles".asInstanceOf[subtitles_]
  
  @js.native
  sealed trait video_
    extends StObject
       with SourceBufferName
  inline def video_ : video_ = "video".asInstanceOf[video_]
}
