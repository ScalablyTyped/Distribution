package typings.ionicCore.stencilPublicRuntimeMod.JSXBase

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var autoPlay: js.UndefOr[Boolean] = js.undefined
  
  var autoplay: js.UndefOr[Boolean | String] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var crossorigin: js.UndefOr[String] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var mediaGroup: js.UndefOr[String] = js.undefined
  
  var mediagroup: js.UndefOr[String] = js.undefined
  
  var muted: js.UndefOr[Boolean] = js.undefined
  
  var onAbort: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onCanPlay: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onDurationChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onEmptied: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onEnded: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onInterruptBegin: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onInterruptEnd: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onLoadStart: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onLoadedData: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onLoadedMetaData: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onMozAudioAvailable: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onPause: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onPlay: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onPlaying: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onProgress: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onRateChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onSeeked: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onSeeking: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onStalled: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onSuspend: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onTimeUpdate: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onVolumeChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var onWaiting: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  
  var preload: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
}
object MediaHTMLAttributes {
  
  @scala.inline
  def apply[T](): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MediaHTMLAttributesMutableBuilder[Self <: MediaHTMLAttributes[?], T] (val x: Self & MediaHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setOnAbort(value: /* event */ Event => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: /* event */ Event => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThrough(value: /* event */ Event => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: /* event */ Event => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: /* event */ Event => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    @scala.inline
    def setOnEnded(value: /* event */ Event => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnInterruptBegin(value: /* event */ Event => Unit): Self = StObject.set(x, "onInterruptBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInterruptBeginUndefined: Self = StObject.set(x, "onInterruptBegin", js.undefined)
    
    @scala.inline
    def setOnInterruptEnd(value: /* event */ Event => Unit): Self = StObject.set(x, "onInterruptEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInterruptEndUndefined: Self = StObject.set(x, "onInterruptEnd", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: /* event */ Event => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: /* event */ Event => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetaData(value: /* event */ Event => Unit): Self = StObject.set(x, "onLoadedMetaData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedMetaDataUndefined: Self = StObject.set(x, "onLoadedMetaData", js.undefined)
    
    @scala.inline
    def setOnMozAudioAvailable(value: /* event */ Event => Unit): Self = StObject.set(x, "onMozAudioAvailable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMozAudioAvailableUndefined: Self = StObject.set(x, "onMozAudioAvailable", js.undefined)
    
    @scala.inline
    def setOnPause(value: /* event */ Event => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: /* event */ Event => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: /* event */ Event => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* event */ Event => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: /* event */ Event => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: /* event */ Event => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: /* event */ Event => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    @scala.inline
    def setOnStalled(value: /* event */ Event => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: /* event */ Event => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: /* event */ Event => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: /* event */ Event => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: /* event */ Event => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    @scala.inline
    def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
