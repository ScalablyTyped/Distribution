package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFormatsListResponse extends js.Object {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoFormatsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Video format collection. */
  var videoFormats: js.UndefOr[js.Array[VideoFormat]] = js.native
}
object VideoFormatsListResponse {
  
  @scala.inline
  def apply(): VideoFormatsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFormatsListResponse]
  }
  
  @scala.inline
  implicit class VideoFormatsListResponseOps[Self <: VideoFormatsListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setVideoFormatsVarargs(value: VideoFormat*): Self = this.set("videoFormats", js.Array(value :_*))
    
    @scala.inline
    def setVideoFormats(value: js.Array[VideoFormat]): Self = this.set("videoFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoFormats: Self = this.set("videoFormats", js.undefined)
  }
}
