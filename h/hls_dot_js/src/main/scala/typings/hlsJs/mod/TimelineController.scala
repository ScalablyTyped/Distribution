package typings.hlsJs.mod

import typings.hlsJs.mod.Events.BUFFER_FLUSHING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineController
  extends StObject
     with ComponentAPI {
  
  /* private */ var Cues: Any
  
  /* private */ var _appendCues: Any
  
  /* private */ var _captionsOrSubtitlesFromCharacteristics: Any
  
  /* private */ var _cleanTracks: Any
  
  /* private */ var _fallbackToIMSC1: Any
  
  /* private */ var _parseIMSC1: Any
  
  /* private */ var _parseVTTs: Any
  
  def addCues(
    trackName: String,
    startTime: Double,
    endTime: Double,
    screen: CaptionScreen,
    cueRanges: js.Array[js.Tuple2[Double, Double]]
  ): Unit
  
  /* private */ var captionsProperties: Any
  
  /* private */ var captionsTracks: Any
  
  /* private */ var cea608Parser1: Any
  
  /* private */ var cea608Parser2: Any
  
  /* private */ var closedCaptionsForLevel: Any
  
  /* private */ var config: Any
  
  def createCaptionsTrack(trackName: String): Unit
  
  /* private */ var createNativeTrack: Any
  
  /* private */ var createNonNativeTrack: Any
  
  /* private */ var createTextTrack: Any
  
  /* private */ var enabled: Any
  
  /* private */ var extractCea608Data: Any
  
  /* private */ var getExistingTrack: Any
  
  /* private */ var hls: Any
  
  /* private */ var initPTS: Any
  
  /* private */ var lastPartIndex: Any
  
  /* private */ var lastSn: Any
  
  /* private */ var media: Any
  
  /* private */ var nonNativeCaptionsTracks: Any
  
  def onBufferFlushing(event: BUFFER_FLUSHING, param1: BufferFlushingData): Unit
  
  /* private */ var onFragDecrypted: Any
  
  /* private */ var onFragLoaded: Any
  
  /* private */ var onFragLoading: Any
  
  /* private */ var onFragParsingUserdata: Any
  
  /* private */ var onInitPtsFound: Any
  
  /* private */ var onManifestLoaded: Any
  
  /* private */ var onManifestLoading: Any
  
  /* private */ var onMediaAttaching: Any
  
  /* private */ var onMediaDetaching: Any
  
  /* private */ var onSubtitleTracksCleared: Any
  
  /* private */ var onSubtitleTracksUpdated: Any
  
  /* private */ var prevCC: Any
  
  /* private */ var textTracks: Any
  
  /* private */ var timescale: Any
  
  /* private */ var tracks: Any
  
  /* private */ var unparsedVttFrags: Any
  
  /* private */ var vttCCs: Any
}
object TimelineController {
  
  inline def apply(
    Cues: Any,
    _appendCues: Any,
    _captionsOrSubtitlesFromCharacteristics: Any,
    _cleanTracks: Any,
    _fallbackToIMSC1: Any,
    _parseIMSC1: Any,
    _parseVTTs: Any,
    addCues: (String, Double, Double, CaptionScreen, js.Array[js.Tuple2[Double, Double]]) => Unit,
    captionsProperties: Any,
    captionsTracks: Any,
    cea608Parser1: Any,
    cea608Parser2: Any,
    closedCaptionsForLevel: Any,
    config: Any,
    createCaptionsTrack: String => Unit,
    createNativeTrack: Any,
    createNonNativeTrack: Any,
    createTextTrack: Any,
    destroy: () => Unit,
    enabled: Any,
    extractCea608Data: Any,
    getExistingTrack: Any,
    hls: Any,
    initPTS: Any,
    lastPartIndex: Any,
    lastSn: Any,
    media: Any,
    nonNativeCaptionsTracks: Any,
    onBufferFlushing: (BUFFER_FLUSHING, BufferFlushingData) => Unit,
    onFragDecrypted: Any,
    onFragLoaded: Any,
    onFragLoading: Any,
    onFragParsingUserdata: Any,
    onInitPtsFound: Any,
    onManifestLoaded: Any,
    onManifestLoading: Any,
    onMediaAttaching: Any,
    onMediaDetaching: Any,
    onSubtitleTracksCleared: Any,
    onSubtitleTracksUpdated: Any,
    prevCC: Any,
    textTracks: Any,
    timescale: Any,
    tracks: Any,
    unparsedVttFrags: Any,
    vttCCs: Any
  ): TimelineController = {
    val __obj = js.Dynamic.literal(Cues = Cues.asInstanceOf[js.Any], _appendCues = _appendCues.asInstanceOf[js.Any], _captionsOrSubtitlesFromCharacteristics = _captionsOrSubtitlesFromCharacteristics.asInstanceOf[js.Any], _cleanTracks = _cleanTracks.asInstanceOf[js.Any], _fallbackToIMSC1 = _fallbackToIMSC1.asInstanceOf[js.Any], _parseIMSC1 = _parseIMSC1.asInstanceOf[js.Any], _parseVTTs = _parseVTTs.asInstanceOf[js.Any], addCues = js.Any.fromFunction5(addCues), captionsProperties = captionsProperties.asInstanceOf[js.Any], captionsTracks = captionsTracks.asInstanceOf[js.Any], cea608Parser1 = cea608Parser1.asInstanceOf[js.Any], cea608Parser2 = cea608Parser2.asInstanceOf[js.Any], closedCaptionsForLevel = closedCaptionsForLevel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], createCaptionsTrack = js.Any.fromFunction1(createCaptionsTrack), createNativeTrack = createNativeTrack.asInstanceOf[js.Any], createNonNativeTrack = createNonNativeTrack.asInstanceOf[js.Any], createTextTrack = createTextTrack.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extractCea608Data = extractCea608Data.asInstanceOf[js.Any], getExistingTrack = getExistingTrack.asInstanceOf[js.Any], hls = hls.asInstanceOf[js.Any], initPTS = initPTS.asInstanceOf[js.Any], lastPartIndex = lastPartIndex.asInstanceOf[js.Any], lastSn = lastSn.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], nonNativeCaptionsTracks = nonNativeCaptionsTracks.asInstanceOf[js.Any], onBufferFlushing = js.Any.fromFunction2(onBufferFlushing), onFragDecrypted = onFragDecrypted.asInstanceOf[js.Any], onFragLoaded = onFragLoaded.asInstanceOf[js.Any], onFragLoading = onFragLoading.asInstanceOf[js.Any], onFragParsingUserdata = onFragParsingUserdata.asInstanceOf[js.Any], onInitPtsFound = onInitPtsFound.asInstanceOf[js.Any], onManifestLoaded = onManifestLoaded.asInstanceOf[js.Any], onManifestLoading = onManifestLoading.asInstanceOf[js.Any], onMediaAttaching = onMediaAttaching.asInstanceOf[js.Any], onMediaDetaching = onMediaDetaching.asInstanceOf[js.Any], onSubtitleTracksCleared = onSubtitleTracksCleared.asInstanceOf[js.Any], onSubtitleTracksUpdated = onSubtitleTracksUpdated.asInstanceOf[js.Any], prevCC = prevCC.asInstanceOf[js.Any], textTracks = textTracks.asInstanceOf[js.Any], timescale = timescale.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], unparsedVttFrags = unparsedVttFrags.asInstanceOf[js.Any], vttCCs = vttCCs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineController]
  }
  
  extension [Self <: TimelineController](x: Self) {
    
    inline def setAddCues(value: (String, Double, Double, CaptionScreen, js.Array[js.Tuple2[Double, Double]]) => Unit): Self = StObject.set(x, "addCues", js.Any.fromFunction5(value))
    
    inline def setCaptionsProperties(value: Any): Self = StObject.set(x, "captionsProperties", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTracks(value: Any): Self = StObject.set(x, "captionsTracks", value.asInstanceOf[js.Any])
    
    inline def setCea608Parser1(value: Any): Self = StObject.set(x, "cea608Parser1", value.asInstanceOf[js.Any])
    
    inline def setCea608Parser2(value: Any): Self = StObject.set(x, "cea608Parser2", value.asInstanceOf[js.Any])
    
    inline def setClosedCaptionsForLevel(value: Any): Self = StObject.set(x, "closedCaptionsForLevel", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCreateCaptionsTrack(value: String => Unit): Self = StObject.set(x, "createCaptionsTrack", js.Any.fromFunction1(value))
    
    inline def setCreateNativeTrack(value: Any): Self = StObject.set(x, "createNativeTrack", value.asInstanceOf[js.Any])
    
    inline def setCreateNonNativeTrack(value: Any): Self = StObject.set(x, "createNonNativeTrack", value.asInstanceOf[js.Any])
    
    inline def setCreateTextTrack(value: Any): Self = StObject.set(x, "createTextTrack", value.asInstanceOf[js.Any])
    
    inline def setCues(value: Any): Self = StObject.set(x, "Cues", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Any): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExtractCea608Data(value: Any): Self = StObject.set(x, "extractCea608Data", value.asInstanceOf[js.Any])
    
    inline def setGetExistingTrack(value: Any): Self = StObject.set(x, "getExistingTrack", value.asInstanceOf[js.Any])
    
    inline def setHls(value: Any): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setInitPTS(value: Any): Self = StObject.set(x, "initPTS", value.asInstanceOf[js.Any])
    
    inline def setLastPartIndex(value: Any): Self = StObject.set(x, "lastPartIndex", value.asInstanceOf[js.Any])
    
    inline def setLastSn(value: Any): Self = StObject.set(x, "lastSn", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setNonNativeCaptionsTracks(value: Any): Self = StObject.set(x, "nonNativeCaptionsTracks", value.asInstanceOf[js.Any])
    
    inline def setOnBufferFlushing(value: (BUFFER_FLUSHING, BufferFlushingData) => Unit): Self = StObject.set(x, "onBufferFlushing", js.Any.fromFunction2(value))
    
    inline def setOnFragDecrypted(value: Any): Self = StObject.set(x, "onFragDecrypted", value.asInstanceOf[js.Any])
    
    inline def setOnFragLoaded(value: Any): Self = StObject.set(x, "onFragLoaded", value.asInstanceOf[js.Any])
    
    inline def setOnFragLoading(value: Any): Self = StObject.set(x, "onFragLoading", value.asInstanceOf[js.Any])
    
    inline def setOnFragParsingUserdata(value: Any): Self = StObject.set(x, "onFragParsingUserdata", value.asInstanceOf[js.Any])
    
    inline def setOnInitPtsFound(value: Any): Self = StObject.set(x, "onInitPtsFound", value.asInstanceOf[js.Any])
    
    inline def setOnManifestLoaded(value: Any): Self = StObject.set(x, "onManifestLoaded", value.asInstanceOf[js.Any])
    
    inline def setOnManifestLoading(value: Any): Self = StObject.set(x, "onManifestLoading", value.asInstanceOf[js.Any])
    
    inline def setOnMediaAttaching(value: Any): Self = StObject.set(x, "onMediaAttaching", value.asInstanceOf[js.Any])
    
    inline def setOnMediaDetaching(value: Any): Self = StObject.set(x, "onMediaDetaching", value.asInstanceOf[js.Any])
    
    inline def setOnSubtitleTracksCleared(value: Any): Self = StObject.set(x, "onSubtitleTracksCleared", value.asInstanceOf[js.Any])
    
    inline def setOnSubtitleTracksUpdated(value: Any): Self = StObject.set(x, "onSubtitleTracksUpdated", value.asInstanceOf[js.Any])
    
    inline def setPrevCC(value: Any): Self = StObject.set(x, "prevCC", value.asInstanceOf[js.Any])
    
    inline def setTextTracks(value: Any): Self = StObject.set(x, "textTracks", value.asInstanceOf[js.Any])
    
    inline def setTimescale(value: Any): Self = StObject.set(x, "timescale", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: Any): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setUnparsedVttFrags(value: Any): Self = StObject.set(x, "unparsedVttFrags", value.asInstanceOf[js.Any])
    
    inline def setVttCCs(value: Any): Self = StObject.set(x, "vttCCs", value.asInstanceOf[js.Any])
    
    inline def set_appendCues(value: Any): Self = StObject.set(x, "_appendCues", value.asInstanceOf[js.Any])
    
    inline def set_captionsOrSubtitlesFromCharacteristics(value: Any): Self = StObject.set(x, "_captionsOrSubtitlesFromCharacteristics", value.asInstanceOf[js.Any])
    
    inline def set_cleanTracks(value: Any): Self = StObject.set(x, "_cleanTracks", value.asInstanceOf[js.Any])
    
    inline def set_fallbackToIMSC1(value: Any): Self = StObject.set(x, "_fallbackToIMSC1", value.asInstanceOf[js.Any])
    
    inline def set_parseIMSC1(value: Any): Self = StObject.set(x, "_parseIMSC1", value.asInstanceOf[js.Any])
    
    inline def set_parseVTTs(value: Any): Self = StObject.set(x, "_parseVTTs", value.asInstanceOf[js.Any])
  }
}
