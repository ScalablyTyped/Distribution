package typings.hlsParser.anon

import typings.hlsParser.hlsParserStrings.EVENT
import typings.hlsParser.hlsParserStrings.VOD
import typings.hlsParser.mod.types.LowLatencyCompatibility
import typings.hlsParser.mod.types.PrefetchSegment
import typings.hlsParser.mod.types.RenditionReport
import typings.hlsParser.mod.types.Segment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  targetDuration :number,   mediaSequenceBase :number | undefined,   discontinuitySequenceBase :number | undefined,   endlist :boolean | undefined,   playlistType :'EVENT' | 'VOD' | undefined,   isIFrame :boolean | undefined,   segments :std.Array<hls-parser.hls-parser.types.Segment> | undefined,   prefetchSegments :std.Array<hls-parser.hls-parser.types.PrefetchSegment> | undefined,   source :string | undefined,   lowLatencyCompatibility :hls-parser.hls-parser.types.LowLatencyCompatibility | undefined,   partTargetDuration :number | undefined,   renditionReports :std.Array<hls-parser.hls-parser.types.RenditionReport> | undefined,   skip :number | undefined} */
trait BasePlaylistConstructorPrDiscontinuitySequenceBase extends StObject {
  
  var discontinuitySequenceBase: js.UndefOr[Double] = js.undefined
  
  var endlist: js.UndefOr[Boolean] = js.undefined
  
  var independentSegments: js.UndefOr[Boolean] = js.undefined
  
  var isIFrame: js.UndefOr[Boolean] = js.undefined
  
  var lowLatencyCompatibility: js.UndefOr[LowLatencyCompatibility] = js.undefined
  
  var mediaSequenceBase: js.UndefOr[Double] = js.undefined
  
  var partTargetDuration: js.UndefOr[Double] = js.undefined
  
  var playlistType: js.UndefOr[EVENT | VOD] = js.undefined
  
  var prefetchSegments: js.UndefOr[js.Array[PrefetchSegment]] = js.undefined
  
  var renditionReports: js.UndefOr[js.Array[RenditionReport]] = js.undefined
  
  var segments: js.UndefOr[js.Array[Segment]] = js.undefined
  
  var skip: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[Offset] = js.undefined
  
  var targetDuration: Double
  
  var uri: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object BasePlaylistConstructorPrDiscontinuitySequenceBase {
  
  inline def apply(targetDuration: Double): BasePlaylistConstructorPrDiscontinuitySequenceBase = {
    val __obj = js.Dynamic.literal(targetDuration = targetDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePlaylistConstructorPrDiscontinuitySequenceBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasePlaylistConstructorPrDiscontinuitySequenceBase] (val x: Self) extends AnyVal {
    
    inline def setDiscontinuitySequenceBase(value: Double): Self = StObject.set(x, "discontinuitySequenceBase", value.asInstanceOf[js.Any])
    
    inline def setDiscontinuitySequenceBaseUndefined: Self = StObject.set(x, "discontinuitySequenceBase", js.undefined)
    
    inline def setEndlist(value: Boolean): Self = StObject.set(x, "endlist", value.asInstanceOf[js.Any])
    
    inline def setEndlistUndefined: Self = StObject.set(x, "endlist", js.undefined)
    
    inline def setIndependentSegments(value: Boolean): Self = StObject.set(x, "independentSegments", value.asInstanceOf[js.Any])
    
    inline def setIndependentSegmentsUndefined: Self = StObject.set(x, "independentSegments", js.undefined)
    
    inline def setIsIFrame(value: Boolean): Self = StObject.set(x, "isIFrame", value.asInstanceOf[js.Any])
    
    inline def setIsIFrameUndefined: Self = StObject.set(x, "isIFrame", js.undefined)
    
    inline def setLowLatencyCompatibility(value: LowLatencyCompatibility): Self = StObject.set(x, "lowLatencyCompatibility", value.asInstanceOf[js.Any])
    
    inline def setLowLatencyCompatibilityUndefined: Self = StObject.set(x, "lowLatencyCompatibility", js.undefined)
    
    inline def setMediaSequenceBase(value: Double): Self = StObject.set(x, "mediaSequenceBase", value.asInstanceOf[js.Any])
    
    inline def setMediaSequenceBaseUndefined: Self = StObject.set(x, "mediaSequenceBase", js.undefined)
    
    inline def setPartTargetDuration(value: Double): Self = StObject.set(x, "partTargetDuration", value.asInstanceOf[js.Any])
    
    inline def setPartTargetDurationUndefined: Self = StObject.set(x, "partTargetDuration", js.undefined)
    
    inline def setPlaylistType(value: EVENT | VOD): Self = StObject.set(x, "playlistType", value.asInstanceOf[js.Any])
    
    inline def setPlaylistTypeUndefined: Self = StObject.set(x, "playlistType", js.undefined)
    
    inline def setPrefetchSegments(value: js.Array[PrefetchSegment]): Self = StObject.set(x, "prefetchSegments", value.asInstanceOf[js.Any])
    
    inline def setPrefetchSegmentsUndefined: Self = StObject.set(x, "prefetchSegments", js.undefined)
    
    inline def setPrefetchSegmentsVarargs(value: PrefetchSegment*): Self = StObject.set(x, "prefetchSegments", js.Array(value*))
    
    inline def setRenditionReports(value: js.Array[RenditionReport]): Self = StObject.set(x, "renditionReports", value.asInstanceOf[js.Any])
    
    inline def setRenditionReportsUndefined: Self = StObject.set(x, "renditionReports", js.undefined)
    
    inline def setRenditionReportsVarargs(value: RenditionReport*): Self = StObject.set(x, "renditionReports", js.Array(value*))
    
    inline def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStart(value: Offset): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTargetDuration(value: Double): Self = StObject.set(x, "targetDuration", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
