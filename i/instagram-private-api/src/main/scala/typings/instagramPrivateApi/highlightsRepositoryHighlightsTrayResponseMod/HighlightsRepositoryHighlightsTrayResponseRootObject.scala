package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryHighlightsTrayResponseRootObject extends StObject {
  
  var show_empty_state: Boolean
  
  var status: String
  
  var tray: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem]
  
  var tv_channel: HighlightsRepositoryHighlightsTrayResponseTvChannel
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
  implicit class HighlightsRepositoryHighlightsTrayResponseRootObjectMutableBuilder[Self <: HighlightsRepositoryHighlightsTrayResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow_empty_state(value: Boolean): Self = StObject.set(x, "show_empty_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTray(value: js.Array[HighlightsRepositoryHighlightsTrayResponseTrayItem]): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrayVarargs(value: HighlightsRepositoryHighlightsTrayResponseTrayItem*): Self = StObject.set(x, "tray", js.Array(value :_*))
    
    @scala.inline
    def setTv_channel(value: HighlightsRepositoryHighlightsTrayResponseTvChannel): Self = StObject.set(x, "tv_channel", value.asInstanceOf[js.Any])
  }
}
