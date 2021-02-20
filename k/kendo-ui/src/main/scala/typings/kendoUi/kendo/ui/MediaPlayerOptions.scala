package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPlayerOptions extends StObject {
  
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  var autoRepeat: js.UndefOr[Boolean] = js.native
  
  var end: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
  
  var forwardSeek: js.UndefOr[Boolean] = js.native
  
  var fullScreen: js.UndefOr[Boolean] = js.native
  
  var media: js.UndefOr[MediaPlayerMedia] = js.native
  
  var messages: js.UndefOr[MediaPlayerMessages] = js.native
  
  var mute: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigatable: js.UndefOr[Boolean] = js.native
  
  var pause: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
  
  var play: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
  
  var ready: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
  
  var timeChange: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
  
  var volume: js.UndefOr[Double] = js.native
  
  var volumeChange: js.UndefOr[js.Function1[/* e */ MediaPlayerEvent, Unit]] = js.native
}
object MediaPlayerOptions {
  
  @scala.inline
  def apply(): MediaPlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlayerOptions]
  }
  
  @scala.inline
  implicit class MediaPlayerOptionsMutableBuilder[Self <: MediaPlayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    @scala.inline
    def setAutoRepeat(value: Boolean): Self = StObject.set(x, "autoRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRepeatUndefined: Self = StObject.set(x, "autoRepeat", js.undefined)
    
    @scala.inline
    def setEnd(value: /* e */ MediaPlayerEvent => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setForwardSeek(value: Boolean): Self = StObject.set(x, "forwardSeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardSeekUndefined: Self = StObject.set(x, "forwardSeek", js.undefined)
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    @scala.inline
    def setMedia(value: MediaPlayerMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setMessages(value: MediaPlayerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    @scala.inline
    def setPause(value: /* e */ MediaPlayerEvent => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setPlay(value: /* e */ MediaPlayerEvent => Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    @scala.inline
    def setReady(value: /* e */ MediaPlayerEvent => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    @scala.inline
    def setTimeChange(value: /* e */ MediaPlayerEvent => Unit): Self = StObject.set(x, "timeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeChangeUndefined: Self = StObject.set(x, "timeChange", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeChange(value: /* e */ MediaPlayerEvent => Unit): Self = StObject.set(x, "volumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVolumeChangeUndefined: Self = StObject.set(x, "volumeChange", js.undefined)
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
