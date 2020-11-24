package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  var autoplay: js.UndefOr[Boolean | String] = js.native
  
  var controls: js.UndefOr[Boolean] = js.native
  
  var crossOrigin: js.UndefOr[String] = js.native
  
  var crossorigin: js.UndefOr[String] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var mediaGroup: js.UndefOr[String] = js.native
  
  var mediagroup: js.UndefOr[String] = js.native
  
  var muted: js.UndefOr[Boolean] = js.native
  
  var onAbort: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onCanPlay: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onCanPlayThrough: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onDurationChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onEmptied: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onEnded: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onInterruptBegin: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onInterruptEnd: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onLoadStart: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onLoadedData: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onLoadedMetaData: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onMozAudioAvailable: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onPause: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onPlay: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onPlaying: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onProgress: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onRateChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onSeeked: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onSeeking: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onStalled: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onSuspend: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onTimeUpdate: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onVolumeChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onWaiting: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var preload: js.UndefOr[String] = js.native
  
  var src: js.UndefOr[String] = js.native
}
object MediaHTMLAttributes {
  
  @scala.inline
  def apply[T](): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MediaHTMLAttributesOps[Self <: MediaHTMLAttributes[_], T] (val x: Self with MediaHTMLAttributes[T]) extends AnyVal {
    
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
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMediaGroup(value: String): Self = this.set("mediaGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaGroup: Self = this.set("mediaGroup", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    
    @scala.inline
    def setOnAbort(value: /* event */ Event => Unit): Self = this.set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: /* event */ Event => Unit): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: /* event */ Event => Unit): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: /* event */ Event => Unit): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: /* event */ Event => Unit): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    
    @scala.inline
    def setOnEnded(value: /* event */ Event => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnInterruptBegin(value: /* event */ Event => Unit): Self = this.set("onInterruptBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInterruptBegin: Self = this.set("onInterruptBegin", js.undefined)
    
    @scala.inline
    def setOnInterruptEnd(value: /* event */ Event => Unit): Self = this.set("onInterruptEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInterruptEnd: Self = this.set("onInterruptEnd", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: /* event */ Event => Unit): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: /* event */ Event => Unit): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetaData(value: /* event */ Event => Unit): Self = this.set("onLoadedMetaData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoadedMetaData: Self = this.set("onLoadedMetaData", js.undefined)
    
    @scala.inline
    def setOnMozAudioAvailable(value: /* event */ Event => Unit): Self = this.set("onMozAudioAvailable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMozAudioAvailable: Self = this.set("onMozAudioAvailable", js.undefined)
    
    @scala.inline
    def setOnPause(value: /* event */ Event => Unit): Self = this.set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: /* event */ Event => Unit): Self = this.set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: /* event */ Event => Unit): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* event */ Event => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: /* event */ Event => Unit): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: /* event */ Event => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: /* event */ Event => Unit): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    
    @scala.inline
    def setOnStalled(value: /* event */ Event => Unit): Self = this.set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: /* event */ Event => Unit): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: /* event */ Event => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: /* event */ Event => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: /* event */ Event => Unit): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
}
