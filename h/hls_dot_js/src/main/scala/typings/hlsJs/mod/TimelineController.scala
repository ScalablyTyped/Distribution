package typings.hlsJs.mod

import typings.hlsJs.mod.Events.BUFFER_FLUSHING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "TimelineController")
@js.native
open class TimelineController protected ()
  extends StObject
     with ComponentAPI {
  def this(hls: Hls) = this()
  
  /* private */ var Cues: Any = js.native
  
  /* private */ var _appendCues: Any = js.native
  
  /* private */ var _captionsOrSubtitlesFromCharacteristics: Any = js.native
  
  /* private */ var _cleanTracks: Any = js.native
  
  /* private */ var _fallbackToIMSC1: Any = js.native
  
  /* private */ var _parseIMSC1: Any = js.native
  
  /* private */ var _parseVTTs: Any = js.native
  
  def addCues(
    trackName: String,
    startTime: Double,
    endTime: Double,
    screen: CaptionScreen,
    cueRanges: js.Array[js.Tuple2[Double, Double]]
  ): Unit = js.native
  
  /* private */ var captionsProperties: Any = js.native
  
  /* private */ var captionsTracks: Any = js.native
  
  /* private */ var cea608Parser1: Any = js.native
  
  /* private */ var cea608Parser2: Any = js.native
  
  /* private */ var closedCaptionsForLevel: Any = js.native
  
  /* private */ var config: Any = js.native
  
  def createCaptionsTrack(trackName: String): Unit = js.native
  
  /* private */ var createNativeTrack: Any = js.native
  
  /* private */ var createNonNativeTrack: Any = js.native
  
  /* private */ var createTextTrack: Any = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* private */ var enabled: Any = js.native
  
  /* private */ var extractCea608Data: Any = js.native
  
  /* private */ var getExistingTrack: Any = js.native
  
  /* private */ var hls: Any = js.native
  
  /* private */ var initPTS: Any = js.native
  
  /* private */ var lastPartIndex: Any = js.native
  
  /* private */ var lastSn: Any = js.native
  
  /* private */ var media: Any = js.native
  
  /* private */ var nonNativeCaptionsTracks: Any = js.native
  
  def onBufferFlushing(event: BUFFER_FLUSHING, param1: BufferFlushingData): Unit = js.native
  
  /* private */ var onFragDecrypted: Any = js.native
  
  /* private */ var onFragLoaded: Any = js.native
  
  /* private */ var onFragLoading: Any = js.native
  
  /* private */ var onFragParsingUserdata: Any = js.native
  
  /* private */ var onInitPtsFound: Any = js.native
  
  /* private */ var onManifestLoaded: Any = js.native
  
  /* private */ var onManifestLoading: Any = js.native
  
  /* private */ var onMediaAttaching: Any = js.native
  
  /* private */ var onMediaDetaching: Any = js.native
  
  /* private */ var onSubtitleTracksCleared: Any = js.native
  
  /* private */ var onSubtitleTracksUpdated: Any = js.native
  
  /* private */ var prevCC: Any = js.native
  
  /* private */ var textTracks: Any = js.native
  
  /* private */ var tracks: Any = js.native
  
  /* private */ var unparsedVttFrags: Any = js.native
  
  /* private */ var vttCCs: Any = js.native
}
