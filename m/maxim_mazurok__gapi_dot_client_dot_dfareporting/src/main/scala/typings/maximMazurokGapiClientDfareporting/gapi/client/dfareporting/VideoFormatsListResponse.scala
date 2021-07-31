package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFormatsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoFormatsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Video format collection. */
  var videoFormats: js.UndefOr[js.Array[VideoFormat]] = js.undefined
}
object VideoFormatsListResponse {
  
  @scala.inline
  def apply(): VideoFormatsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFormatsListResponse]
  }
  
  @scala.inline
  implicit class VideoFormatsListResponseMutableBuilder[Self <: VideoFormatsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setVideoFormats(value: js.Array[VideoFormat]): Self = StObject.set(x, "videoFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoFormatsUndefined: Self = StObject.set(x, "videoFormats", js.undefined)
    
    @scala.inline
    def setVideoFormatsVarargs(value: VideoFormat*): Self = StObject.set(x, "videoFormats", js.Array(value :_*))
  }
}
