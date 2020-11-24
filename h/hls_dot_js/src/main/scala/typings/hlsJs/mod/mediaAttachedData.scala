package typings.hlsJs.mod

import typings.std.HTMLMediaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait mediaAttachedData extends js.Object {
  
  var media: HTMLMediaElement = js.native
  
  var mediaSource: String = js.native
}
object mediaAttachedData {
  
  @scala.inline
  def apply(media: HTMLMediaElement, mediaSource: String): mediaAttachedData = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], mediaSource = mediaSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[mediaAttachedData]
  }
  
  @scala.inline
  implicit class mediaAttachedDataOps[Self <: mediaAttachedData] (val x: Self) extends AnyVal {
    
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
    def setMedia(value: HTMLMediaElement): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSource(value: String): Self = this.set("mediaSource", value.asInstanceOf[js.Any])
  }
}
