package typings.hlsParser.anon

import typings.hlsParser.hlsParserStrings.EVENT
import typings.hlsParser.hlsParserStrings.VOD
import typings.hlsParser.mod.types.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  targetDuration :number,   mediaSequenceBase :number | undefined,   discontinuitySequenceBase :number | undefined,   endlist :boolean | undefined,   playlistType :'EVENT' | 'VOD' | undefined,   isIFrame :boolean | undefined,   segments :std.Array<hls-parser.hls-parser.types.Segment> | undefined,   source :string | undefined} */
@js.native
trait BasePlaylistConstructorPrDiscontinuitySequenceBase extends js.Object {
  
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
  implicit class BasePlaylistConstructorPrDiscontinuitySequenceBaseOps[Self <: BasePlaylistConstructorPrDiscontinuitySequenceBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTargetDuration(value: Double): Self = this.set("targetDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscontinuitySequenceBase(value: Double): Self = this.set("discontinuitySequenceBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscontinuitySequenceBase: Self = this.set("discontinuitySequenceBase", js.undefined)
    
    @scala.inline
    def setEndlist(value: Boolean): Self = this.set("endlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndlist: Self = this.set("endlist", js.undefined)
    
    @scala.inline
    def setIndependentSegments(value: Boolean): Self = this.set("independentSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndependentSegments: Self = this.set("independentSegments", js.undefined)
    
    @scala.inline
    def setIsIFrame(value: Boolean): Self = this.set("isIFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIFrame: Self = this.set("isIFrame", js.undefined)
    
    @scala.inline
    def setMediaSequenceBase(value: Double): Self = this.set("mediaSequenceBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaSequenceBase: Self = this.set("mediaSequenceBase", js.undefined)
    
    @scala.inline
    def setPlaylistType(value: EVENT | VOD): Self = this.set("playlistType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylistType: Self = this.set("playlistType", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[Segment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStart(value: Offset): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
