package typings.hark

import typings.hark.harkStrings.speaking
import typings.hark.harkStrings.state_change
import typings.hark.harkStrings.stopped_speaking
import typings.hark.harkStrings.volume_change
import typings.std.AudioContext
import typings.std.AudioContextState
import typings.std.HTMLAudioElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(stream: HTMLAudioElement): Harker = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Harker]
  @scala.inline
  def apply(stream: HTMLAudioElement, option: Option): Harker = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Harker]
  @scala.inline
  def apply(stream: HTMLVideoElement): Harker = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Harker]
  @scala.inline
  def apply(stream: HTMLVideoElement, option: Option): Harker = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Harker]
  @scala.inline
  def apply(stream: MediaStream): Harker = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Harker]
  @scala.inline
  def apply(stream: MediaStream, option: Option): Harker = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Harker]
  
  @JSImport("hark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Harker extends StObject {
    
    @JSName("on")
    def on_speaking(event: speaking, listener: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_statechange(event: state_change, listener: js.Function1[/* state */ AudioContextState, Unit]): Unit = js.native
    @JSName("on")
    def on_stoppedspeaking(event: stopped_speaking, listener: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_volumechange(
      event: volume_change,
      listener: js.Function2[/* currentVolume */ Double, /* threshold */ Double, Unit]
    ): Unit = js.native
    
    def resume(): js.Promise[Unit] = js.native
    
    def setInterval(i: Double): Unit = js.native
    
    def setThreshold(t: Double): Unit = js.native
    
    var speaking: Boolean = js.native
    
    var speakingHistory: js.Array[Double] = js.native
    
    val state: AudioContextState = js.native
    
    def stop(): Unit = js.native
    
    def suspend(): js.Promise[Unit] = js.native
  }
  
  trait Option extends StObject {
    
    var audioContext: js.UndefOr[AudioContext] = js.undefined
    
    var history: js.UndefOr[Double] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var play: js.UndefOr[Boolean] = js.undefined
    
    var smoothing: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioContextUndefined: Self = StObject.set(x, "audioContext", js.undefined)
      
      @scala.inline
      def setHistory(value: Double): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      @scala.inline
      def setSmoothing(value: Double): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
