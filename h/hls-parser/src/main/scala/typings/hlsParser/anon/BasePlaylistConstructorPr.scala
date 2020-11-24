package typings.hlsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  isMasterPlaylist :boolean} */
@js.native
trait BasePlaylistConstructorPr extends js.Object {
  
  var independentSegments: js.UndefOr[Boolean] = js.native
  
  var isMasterPlaylist: Boolean = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[Offset] = js.native
  
  var uri: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object BasePlaylistConstructorPr {
  
  @scala.inline
  def apply(isMasterPlaylist: Boolean): BasePlaylistConstructorPr = {
    val __obj = js.Dynamic.literal(isMasterPlaylist = isMasterPlaylist.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePlaylistConstructorPr]
  }
  
  @scala.inline
  implicit class BasePlaylistConstructorPrOps[Self <: BasePlaylistConstructorPr] (val x: Self) extends AnyVal {
    
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
    def setIsMasterPlaylist(value: Boolean): Self = this.set("isMasterPlaylist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndependentSegments(value: Boolean): Self = this.set("independentSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndependentSegments: Self = this.set("independentSegments", js.undefined)
    
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
