package typings.hlsParser.anon

import typings.hlsParser.hlsParserStrings.EVENT
import typings.hlsParser.hlsParserStrings.VOD
import typings.hlsParser.mod.types.Segment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  targetDuration :number,   mediaSequenceBase :number | undefined,   discontinuitySequenceBase :number | undefined,   endlist :boolean | undefined,   playlistType :'EVENT' | 'VOD' | undefined,   isIFrame :boolean | undefined,   segments :std.Array<hls-parser.hls-parser.types.Segment> | undefined,   source :string | undefined} */
@js.native
trait BasePlaylistConstructorPrDiscontinuitySequenceBase extends StObject {
  
  var discontinuitySequenceBase: js.UndefOr[Double] = js.native
  
  var endlist: js.UndefOr[Boolean] = js.native
  
  var independentSegments: js.UndefOr[Boolean] = js.native
  
  var isIFrame: js.UndefOr[Boolean] = js.native
  
  var mediaSequenceBase: js.UndefOr[Double] = js.native
  
  var playlistType: js.UndefOr[EVENT | VOD] = js.native
  
  var segments: js.UndefOr[js.Array[Segment]] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[Offset] = js.native
  
  var targetDuration: Double = js.native
  
  var uri: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object BasePlaylistConstructorPrDiscontinuitySequenceBase {
  
  @scala.inline
  def apply(targetDuration: Double): BasePlaylistConstructorPrDiscontinuitySequenceBase = {
    val __obj = js.Dynamic.literal(targetDuration = targetDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePlaylistConstructorPrDiscontinuitySequenceBase]
  }
  
  @scala.inline
  implicit class BasePlaylistConstructorPrDiscontinuitySequenceBaseMutableBuilder[Self <: BasePlaylistConstructorPrDiscontinuitySequenceBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscontinuitySequenceBase(value: Double): Self = StObject.set(x, "discontinuitySequenceBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscontinuitySequenceBaseUndefined: Self = StObject.set(x, "discontinuitySequenceBase", js.undefined)
    
    @scala.inline
    def setEndlist(value: Boolean): Self = StObject.set(x, "endlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndlistUndefined: Self = StObject.set(x, "endlist", js.undefined)
    
    @scala.inline
    def setIndependentSegments(value: Boolean): Self = StObject.set(x, "independentSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndependentSegmentsUndefined: Self = StObject.set(x, "independentSegments", js.undefined)
    
    @scala.inline
    def setIsIFrame(value: Boolean): Self = StObject.set(x, "isIFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIFrameUndefined: Self = StObject.set(x, "isIFrame", js.undefined)
    
    @scala.inline
    def setMediaSequenceBase(value: Double): Self = StObject.set(x, "mediaSequenceBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSequenceBaseUndefined: Self = StObject.set(x, "mediaSequenceBase", js.undefined)
    
    @scala.inline
    def setPlaylistType(value: EVENT | VOD): Self = StObject.set(x, "playlistType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistTypeUndefined: Self = StObject.set(x, "playlistType", js.undefined)
    
    @scala.inline
    def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStart(value: Offset): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTargetDuration(value: Double): Self = StObject.set(x, "targetDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
