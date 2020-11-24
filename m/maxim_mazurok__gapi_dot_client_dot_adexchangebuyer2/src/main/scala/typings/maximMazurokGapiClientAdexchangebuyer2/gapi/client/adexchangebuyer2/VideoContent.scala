package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoContent extends js.Object {
  
  /** The URL to fetch a video ad. */
  var videoUrl: js.UndefOr[String] = js.native
  
  /** The contents of a VAST document for a video ad. This document should conform to the VAST 2.0 or 3.0 standard. */
  var videoVastXml: js.UndefOr[String] = js.native
}
object VideoContent {
  
  @scala.inline
  def apply(): VideoContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContent]
  }
  
  @scala.inline
  implicit class VideoContentOps[Self <: VideoContent] (val x: Self) extends AnyVal {
    
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
    def setVideoUrl(value: String): Self = this.set("videoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoUrl: Self = this.set("videoUrl", js.undefined)
    
    @scala.inline
    def setVideoVastXml(value: String): Self = this.set("videoVastXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoVastXml: Self = this.set("videoVastXml", js.undefined)
  }
}
