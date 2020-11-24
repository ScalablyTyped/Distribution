package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryHighlightsTrayResponseRootObject extends js.Object {
  
  var show_empty_state: Boolean = js.native
  
  var status: String = js.native
  
  var tray: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem] = js.native
  
  var tv_channel: HighlightsRepositoryHighlightsTrayResponseTvChannel = js.native
}
object HighlightsRepositoryHighlightsTrayResponseRootObject {
  
  @scala.inline
  def apply(
    show_empty_state: Boolean,
    status: String,
    tray: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem],
    tv_channel: HighlightsRepositoryHighlightsTrayResponseTvChannel
  ): HighlightsRepositoryHighlightsTrayResponseRootObject = {
    val __obj = js.Dynamic.literal(show_empty_state = show_empty_state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any], tv_channel = tv_channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseRootObject]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryHighlightsTrayResponseRootObjectOps[Self <: HighlightsRepositoryHighlightsTrayResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setShow_empty_state(value: Boolean): Self = this.set("show_empty_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrayVarargs(value: HighlightsRepositoryHighlightsTrayResponseTrayItem*): Self = this.set("tray", js.Array(value :_*))
    
    @scala.inline
    def setTray(value: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem]): Self = this.set("tray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTv_channel(value: HighlightsRepositoryHighlightsTrayResponseTvChannel): Self = this.set("tv_channel", value.asInstanceOf[js.Any])
  }
}
