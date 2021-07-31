package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined hls-parser.hls-parser.types.BasePlaylistConstructorProperties & {  isMasterPlaylist :boolean} */
trait BasePlaylistConstructorPr extends StObject {
  
  var independentSegments: js.UndefOr[Boolean] = js.undefined
  
  var isMasterPlaylist: Boolean
  
  var source: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[Offset] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object BasePlaylistConstructorPr {
  
  @scala.inline
  def apply(isMasterPlaylist: Boolean): BasePlaylistConstructorPr = {
    val __obj = js.Dynamic.literal(isMasterPlaylist = isMasterPlaylist.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePlaylistConstructorPr]
  }
  
  @scala.inline
  implicit class BasePlaylistConstructorPrMutableBuilder[Self <: BasePlaylistConstructorPr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndependentSegments(value: Boolean): Self = StObject.set(x, "independentSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndependentSegmentsUndefined: Self = StObject.set(x, "independentSegments", js.undefined)
    
    @scala.inline
    def setIsMasterPlaylist(value: Boolean): Self = StObject.set(x, "isMasterPlaylist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStart(value: Offset): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
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
