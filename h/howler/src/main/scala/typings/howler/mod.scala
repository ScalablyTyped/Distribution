package typings.howler

import org.scalablytyped.runtime.StringDictionary
import typings.howler.anon.ConeInnerAngle
import typings.howler.anon.Headers
import typings.howler.howlerStrings.end
import typings.howler.howlerStrings.fade
import typings.howler.howlerStrings.load
import typings.howler.howlerStrings.loaded
import typings.howler.howlerStrings.loaderror
import typings.howler.howlerStrings.loading
import typings.howler.howlerStrings.metadata
import typings.howler.howlerStrings.mute
import typings.howler.howlerStrings.pause
import typings.howler.howlerStrings.play
import typings.howler.howlerStrings.playerror
import typings.howler.howlerStrings.rate
import typings.howler.howlerStrings.seek
import typings.howler.howlerStrings.stop
import typings.howler.howlerStrings.unloaded
import typings.howler.howlerStrings.unlock
import typings.howler.howlerStrings.volume
import typings.std.AudioContext
import typings.std.GainNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("howler", "Howl")
  @js.native
  class Howl protected () extends StObject {
    def this(options: HowlOptions) = this()
    
    def duration(): Double = js.native
    def duration(id: Double): Double = js.native
    
    def fade(from: Double, to: Double, duration: Double): this.type = js.native
    def fade(from: Double, to: Double, duration: Double, id: Double): this.type = js.native
    
    def load(): this.type = js.native
    
    def loop(): Boolean = js.native
    def loop(id: Double): Boolean = js.native
    def loop(loop: Boolean): this.type = js.native
    def loop(loop: Boolean, id: Double): this.type = js.native
    
    def mute(): Boolean = js.native
    def mute(muted: Boolean): this.type = js.native
    def mute(muted: Boolean, id: Double): this.type = js.native
    
    def off(): this.type = js.native
    def off(event: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    def off(event: js.UndefOr[scala.Nothing], callback: HowlCallback): this.type = js.native
    def off(event: js.UndefOr[scala.Nothing], callback: HowlCallback, id: Double): this.type = js.native
    def off(event: js.UndefOr[scala.Nothing], callback: HowlErrorCallback): this.type = js.native
    def off(event: js.UndefOr[scala.Nothing], callback: HowlErrorCallback, id: Double): this.type = js.native
    def off(event: String): this.type = js.native
    def off(event: String, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    def off(event: String, callback: HowlCallback): this.type = js.native
    def off(event: String, callback: HowlCallback, id: Double): this.type = js.native
    def off(event: String, callback: HowlErrorCallback): this.type = js.native
    def off(event: String, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_end(event: end): this.type = js.native
    @JSName("off")
    def off_end(event: end, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_end(event: end, callback: HowlCallback): this.type = js.native
    @JSName("off")
    def off_end(event: end, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_fade(event: fade): this.type = js.native
    @JSName("off")
    def off_fade(event: fade, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_fade(event: fade, callback: HowlCallback): this.type = js.native
    @JSName("off")
    def off_fade(event: fade, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_load(event: load): this.type = js.native
    @JSName("off")
    def off_load(event: load, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_load(event: load, callback: js.Function0[Unit]): this.type = js.native
    @JSName("off")
    def off_load(event: load, callback: js.Function0[Unit], id: Double): this.type = js.native
    @JSName("off")
    def off_loaderror(event: loaderror): this.type = js.native
    @JSName("off")
    def off_loaderror(event: loaderror, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_loaderror(event: loaderror, callback: HowlErrorCallback): this.type = js.native
    @JSName("off")
    def off_loaderror(event: loaderror, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_mute(event: mute): this.type = js.native
    @JSName("off")
    def off_mute(event: mute, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_mute(event: mute, callback: HowlCallback): this.type = js.native
    @JSName("off")
    def off_mute(event: mute, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_pause(event: pause): this.type = js.native
    @JSName("off")
    def off_pause(event: pause, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_pause(event: pause, callback: HowlCallback): this.type = js.native
    @JSName("off")
    def off_pause(event: pause, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_play(event: play): this.type = js.native
    @JSName("off")
    def off_play(event: play, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_play(event: play, callback: HowlCallback): this.type = js.native
    @JSName("off")
    def off_play(event: play, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_playerror(event: playerror): this.type = js.native
    @JSName("off")
    def off_playerror(event: playerror, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_playerror(event: playerror, callback: HowlErrorCallback): this.type = js.native
    @JSName("off")
    def off_playerror(event: playerror, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_rate(event: rate): this.type = js.native
    @JSName("off")
    def off_rate(event: rate, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_rate(event: rate, callback: HowlCallback): this.type = js.native
    @JSName("off")
    def off_rate(event: rate, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_seek(event: seek): this.type = js.native
    @JSName("off")
    def off_seek(event: seek, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_seek(event: seek, callback: HowlCallback): this.type = js.native
    @JSName("off")
    def off_seek(event: seek, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_stop(event: stop): this.type = js.native
    @JSName("off")
    def off_stop(event: stop, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_stop(event: stop, callback: HowlCallback): this.type = js.native
    @JSName("off")
    def off_stop(event: stop, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_unlock(event: unlock): this.type = js.native
    @JSName("off")
    def off_unlock(event: unlock, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_unlock(event: unlock, callback: HowlCallback): this.type = js.native
    @JSName("off")
    def off_unlock(event: unlock, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_volume(event: volume): this.type = js.native
    @JSName("off")
    def off_volume(event: volume, callback: js.UndefOr[scala.Nothing], id: Double): this.type = js.native
    @JSName("off")
    def off_volume(event: volume, callback: HowlCallback): this.type = js.native
    @JSName("off")
    def off_volume(event: volume, callback: HowlCallback, id: Double): this.type = js.native
    
    def on(event: String, callback: HowlCallback): this.type = js.native
    def on(event: String, callback: HowlCallback, id: Double): this.type = js.native
    def on(event: String, callback: HowlErrorCallback): this.type = js.native
    def on(event: String, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_end(event: end, callback: HowlCallback): this.type = js.native
    @JSName("on")
    def on_end(event: end, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_fade(event: fade, callback: HowlCallback): this.type = js.native
    @JSName("on")
    def on_fade(event: fade, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_load(event: load, callback: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_load(event: load, callback: js.Function0[Unit], id: Double): this.type = js.native
    @JSName("on")
    def on_loaderror(event: loaderror, callback: HowlErrorCallback): this.type = js.native
    @JSName("on")
    def on_loaderror(event: loaderror, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_mute(event: mute, callback: HowlCallback): this.type = js.native
    @JSName("on")
    def on_mute(event: mute, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, callback: HowlCallback): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_play(event: play, callback: HowlCallback): this.type = js.native
    @JSName("on")
    def on_play(event: play, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_playerror(event: playerror, callback: HowlErrorCallback): this.type = js.native
    @JSName("on")
    def on_playerror(event: playerror, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_rate(event: rate, callback: HowlCallback): this.type = js.native
    @JSName("on")
    def on_rate(event: rate, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_seek(event: seek, callback: HowlCallback): this.type = js.native
    @JSName("on")
    def on_seek(event: seek, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_stop(event: stop, callback: HowlCallback): this.type = js.native
    @JSName("on")
    def on_stop(event: stop, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_unlock(event: unlock, callback: HowlCallback): this.type = js.native
    @JSName("on")
    def on_unlock(event: unlock, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_volume(event: volume, callback: HowlCallback): this.type = js.native
    @JSName("on")
    def on_volume(event: volume, callback: HowlCallback, id: Double): this.type = js.native
    
    def once(event: String, callback: HowlCallback): this.type = js.native
    def once(event: String, callback: HowlCallback, id: Double): this.type = js.native
    def once(event: String, callback: HowlErrorCallback): this.type = js.native
    def once(event: String, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_end(event: end, callback: HowlCallback): this.type = js.native
    @JSName("once")
    def once_end(event: end, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_fade(event: fade, callback: HowlCallback): this.type = js.native
    @JSName("once")
    def once_fade(event: fade, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_load(event: load, callback: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_load(event: load, callback: js.Function0[Unit], id: Double): this.type = js.native
    @JSName("once")
    def once_loaderror(event: loaderror, callback: HowlErrorCallback): this.type = js.native
    @JSName("once")
    def once_loaderror(event: loaderror, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_mute(event: mute, callback: HowlCallback): this.type = js.native
    @JSName("once")
    def once_mute(event: mute, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, callback: HowlCallback): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_play(event: play, callback: HowlCallback): this.type = js.native
    @JSName("once")
    def once_play(event: play, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_playerror(event: playerror, callback: HowlErrorCallback): this.type = js.native
    @JSName("once")
    def once_playerror(event: playerror, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_rate(event: rate, callback: HowlCallback): this.type = js.native
    @JSName("once")
    def once_rate(event: rate, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_seek(event: seek, callback: HowlCallback): this.type = js.native
    @JSName("once")
    def once_seek(event: seek, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_stop(event: stop, callback: HowlCallback): this.type = js.native
    @JSName("once")
    def once_stop(event: stop, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_unlock(event: unlock, callback: HowlCallback): this.type = js.native
    @JSName("once")
    def once_unlock(event: unlock, callback: HowlCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_volume(event: volume, callback: HowlCallback): this.type = js.native
    @JSName("once")
    def once_volume(event: volume, callback: HowlCallback, id: Double): this.type = js.native
    
    def orientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): this.type | Unit = js.native
    
    def pannerAttr(o: ConeInnerAngle): this.type = js.native
    def pannerAttr(o: ConeInnerAngle, id: Double): this.type = js.native
    
    // .play() is not chainable; the other methods are
    def pause(): this.type = js.native
    def pause(id: Double): this.type = js.native
    
    def play(): Double = js.native
    def play(spriteOrId: String): Double = js.native
    def play(spriteOrId: Double): Double = js.native
    
    def playing(): Boolean = js.native
    def playing(id: Double): Boolean = js.native
    
    def pos(x: Double, y: Double, z: Double): this.type | Unit = js.native
    def pos(x: Double, y: Double, z: Double, id: Double): this.type | Unit = js.native
    
    def rate(): Double = js.native
    def rate(idOrSetRate: Double): this.type | Double = js.native
    def rate(rate: Double, id: Double): this.type = js.native
    
    def seek(): this.type | Double = js.native
    def seek(seek: js.UndefOr[scala.Nothing], id: Double): this.type | Double = js.native
    def seek(seek: Double): this.type | Double = js.native
    def seek(seek: Double, id: Double): this.type | Double = js.native
    
    def state(): unloaded | loading | loaded = js.native
    
    def stereo(pan: Double): this.type | Unit = js.native
    def stereo(pan: Double, id: Double): this.type | Unit = js.native
    
    def stop(): this.type = js.native
    def stop(id: Double): this.type = js.native
    
    def unload(): Unit = js.native
    
    def volume(): Double = js.native
    def volume(idOrSetVolume: Double): this.type | Double = js.native
    def volume(volume: Double, id: Double): this.type = js.native
  }
  
  @js.native
  trait Howler extends StObject {
    
    var autoSuspend: Boolean = js.native
    
    var autoUnlock: Boolean = js.native
    
    def codecs(ext: String): Boolean = js.native
    
    var ctx: AudioContext = js.native
    
    var html5PoolSize: Double = js.native
    
    var masterGain: GainNode = js.native
    
    def mute(muted: Boolean): this.type = js.native
    
    var noAudio: Boolean = js.native
    
    def orientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): this.type | Unit = js.native
    
    def pos(x: Double, y: Double, z: Double): this.type | Unit = js.native
    
    def stereo(pan: Double): this.type = js.native
    
    def unload(): this.type = js.native
    
    var usingWebAudio: Boolean = js.native
    
    def volume(): Double = js.native
    def volume(volume: Double): this.type = js.native
  }
  @JSImport("howler", "Howler")
  @js.native
  val Howler: typings.howler.mod.Howler = js.native
  
  type HowlCallback = js.Function1[/* soundId */ Double, Unit]
  
  type HowlErrorCallback = js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]
  
  @js.native
  trait HowlListeners extends StObject {
    
    /**
      * Fires when the sound finishes playing (if it is looping, it'll fire at the end of each loop).
      * The first parameter is the ID of the sound.
      */
    var onend: js.UndefOr[HowlCallback] = js.native
    
    /**
      * Fires when the current sound finishes fading in/out. The first parameter is the ID of the sound.
      */
    var onfade: js.UndefOr[HowlCallback] = js.native
    
    /**
      * Fires when the sound is loaded.
      */
    var onload: js.UndefOr[HowlCallback] = js.native
    
    /**
      * Fires when the sound is unable to load. The first parameter is the ID of the sound (if it exists) and the second is the error message/code.
      */
    var onloaderror: js.UndefOr[HowlErrorCallback] = js.native
    
    /**
      * Fires when the sound has been muted/unmuted. The first parameter is the ID of the sound.
      */
    var onmute: js.UndefOr[HowlCallback] = js.native
    
    /**
      * Fires when the sound has been paused. The first parameter is the ID of the sound.
      */
    var onpause: js.UndefOr[HowlCallback] = js.native
    
    /**
      * Fires when the sound begins playing. The first parameter is the ID of the sound.
      */
    var onplay: js.UndefOr[HowlCallback] = js.native
    
    /**
      * Fires when the sound is unable to play. The first parameter is the ID of the sound and the second is the error message/code.
      */
    var onplayerror: js.UndefOr[HowlErrorCallback] = js.native
    
    /**
      * Fires when the sound's playback rate has changed. The first parameter is the ID of the sound.
      */
    var onrate: js.UndefOr[HowlCallback] = js.native
    
    /**
      * Fires when the sound has been seeked. The first parameter is the ID of the sound.
      */
    var onseek: js.UndefOr[HowlCallback] = js.native
    
    /**
      * Fires when the sound has been stopped. The first parameter is the ID of the sound.
      */
    var onstop: js.UndefOr[HowlCallback] = js.native
    
    /**
      * Fires when audio has been automatically unlocked through a touch/click event.
      */
    var onunlock: js.UndefOr[HowlCallback] = js.native
    
    /**
      * Fires when the sound's volume has changed. The first parameter is the ID of the sound.
      */
    var onvolume: js.UndefOr[HowlCallback] = js.native
  }
  object HowlListeners {
    
    @scala.inline
    def apply(): HowlListeners = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HowlListeners]
    }
    
    @scala.inline
    implicit class HowlListenersMutableBuilder[Self <: HowlListeners] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnend(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
      
      @scala.inline
      def setOnfade(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onfade", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnfadeUndefined: Self = StObject.set(x, "onfade", js.undefined)
      
      @scala.inline
      def setOnload(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      @scala.inline
      def setOnloaderror(value: (/* soundId */ Double, /* error */ js.Any) => Unit): Self = StObject.set(x, "onloaderror", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnloaderrorUndefined: Self = StObject.set(x, "onloaderror", js.undefined)
      
      @scala.inline
      def setOnmute(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onmute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmuteUndefined: Self = StObject.set(x, "onmute", js.undefined)
      
      @scala.inline
      def setOnpause(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onpause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      @scala.inline
      def setOnplay(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onplay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      @scala.inline
      def setOnplayerror(value: (/* soundId */ Double, /* error */ js.Any) => Unit): Self = StObject.set(x, "onplayerror", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnplayerrorUndefined: Self = StObject.set(x, "onplayerror", js.undefined)
      
      @scala.inline
      def setOnrate(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onrate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnrateUndefined: Self = StObject.set(x, "onrate", js.undefined)
      
      @scala.inline
      def setOnseek(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onseek", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnseekUndefined: Self = StObject.set(x, "onseek", js.undefined)
      
      @scala.inline
      def setOnstop(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onstop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnstopUndefined: Self = StObject.set(x, "onstop", js.undefined)
      
      @scala.inline
      def setOnunlock(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onunlock", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnunlockUndefined: Self = StObject.set(x, "onunlock", js.undefined)
      
      @scala.inline
      def setOnvolume(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onvolume", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnvolumeUndefined: Self = StObject.set(x, "onvolume", js.undefined)
    }
  }
  
  @js.native
  trait HowlOptions extends HowlListeners {
    
    /**
      * Set to true to automatically start playback when sound is loaded.
      *
      * @default `false`
      */
    var autoplay: js.UndefOr[Boolean] = js.native
    
    /**
      * howler.js automatically detects your file format from the extension, but you may also specify a
      * format in situations where extraction won't work (such as with a SoundCloud stream).
      *
      * @default `[]`
      */
    var format: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Set to true to force HTML5 Audio. This should be used for large audio files so that you don't
      * have to wait for the full file to be downloaded and decoded before playing.
      *
      * @default `false`
      */
    var html5: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to true to automatically loop the sound forever.
      *
      * @default `false`
      */
    var loop: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to true to load the audio muted.
      *
      * @default `false`
      */
    var mute: js.UndefOr[Boolean] = js.native
    
    /**
      * The size of the inactive sounds pool. Once sounds are stopped or finish playing, they are marked
      * as ended and ready for cleanup. We keep a pool of these to recycle for improved performance.
      * Generally this doesn't need to be changed. It is important to keep in mind that when a sound is
      * paused, it won't be removed from the pool and will still be considered active so that it can be
      * resumed later.
      *
      * @default `5`
      */
    var pool: js.UndefOr[Double] = js.native
    
    /**
      * Automatically begin downloading the audio file when the Howl is defined. If using HTML5 Audio,
      * you can set this to 'metadata' to only preload the file's metadata (to get its duration without
      * download the entire file, for example).
      *
      * @default `true`
      */
    var preload: js.UndefOr[Boolean | metadata] = js.native
    
    /**
      * The rate of playback. 0.5 to 4.0, with 1.0 being normal speed.
      *
      * @default `1.0`
      */
    var rate: js.UndefOr[Double] = js.native
    
    /**
      * Define a sound sprite for the sound. The offset and duration are defined in milliseconds. A
      * third (optional) parameter is available to set a sprite as looping. An easy way to generate
      * compatible sound sprites is with audiosprite.
      *
      * @default `{}`
      */
    var sprite: js.UndefOr[
        StringDictionary[(js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Boolean])]
      ] = js.native
    
    /**
      * The sources to the track(s) to be loaded for the sound (URLs or base64 data URIs). These should
      * be in order of preference, howler.js will automatically load the first one that is compatible
      * with the current browser. If your files have no extensions, you will need to explicitly specify
      * the extension using the format property.
      *
      * @default `[]`
      */
    var src: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * The volume of the specific track, from 0.0 to 1.0.
      *
      * @default `1.0`
      */
    var volume: js.UndefOr[Double] = js.native
    
    /**
      * When using Web Audio, howler.js uses an XHR request to load the audio files. If you need to send
      * custom headers, set the HTTP method or enable withCredentials (see reference), include them with
      * this parameter. Each is optional (method defaults to GET, headers default to null and
      * withCredentials defaults to false).
      */
    var xhr: js.UndefOr[Headers] = js.native
  }
  object HowlOptions {
    
    @scala.inline
    def apply(): HowlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HowlOptions]
    }
    
    @scala.inline
    implicit class HowlOptionsMutableBuilder[Self <: HowlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value :_*))
      
      @scala.inline
      def setHtml5(value: Boolean): Self = StObject.set(x, "html5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml5Undefined: Self = StObject.set(x, "html5", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      @scala.inline
      def setPool(value: Double): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setPreload(value: Boolean | metadata): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      @scala.inline
      def setSprite(value: StringDictionary[(js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Boolean])]): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
      
      @scala.inline
      def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
      
      @scala.inline
      def setXhr(value: Headers): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  type SoundSpriteDefinitions = StringDictionary[(js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Boolean])]
}
