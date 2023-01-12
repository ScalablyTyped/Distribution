package typings.howler

import org.scalablytyped.runtime.StringDictionary
import typings.howler.anon.Headers
import typings.howler.howlerStrings.HRTF
import typings.howler.howlerStrings.end
import typings.howler.howlerStrings.equalpower
import typings.howler.howlerStrings.fade
import typings.howler.howlerStrings.inverse
import typings.howler.howlerStrings.linear
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
import typings.howler.mod.global.HowlerGlobal
import typings.std.AudioContext
import typings.std.GainNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("howler", "Howl")
  @js.native
  open class Howl protected () extends StObject {
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
    def off(
      event: end | fade | loaderror | mute | pause | play | playerror | rate | seek | stop | unlock | volume
    ): this.type = js.native
    def off(
      event: end | fade | loaderror | mute | pause | play | playerror | rate | seek | stop | unlock | volume,
      callback: Unit,
      id: Double
    ): this.type = js.native
    def off(
      event: play | end | pause | stop | mute | volume | rate | seek | fade | unlock,
      callback: HowlCallback
    ): this.type = js.native
    def off(
      event: play | end | pause | stop | mute | volume | rate | seek | fade | unlock,
      callback: HowlCallback,
      id: Double
    ): this.type = js.native
    def off(event: loaderror | playerror, callback: HowlErrorCallback): this.type = js.native
    def off(event: loaderror | playerror, callback: HowlErrorCallback, id: Double): this.type = js.native
    // off() also supports passing id as second argument: internally it is type checked and treated as an id if it is a number
    def off(
      event: load | loaderror | playerror | play | end | pause | stop | mute | volume | rate | seek | fade | unlock,
      id: Double
    ): this.type = js.native
    def off(event: String): this.type = js.native
    def off(event: String, callback: Unit, id: Double): this.type = js.native
    def off(event: String, callback: HowlCallback): this.type = js.native
    def off(event: String, callback: HowlCallback, id: Double): this.type = js.native
    def off(event: String, callback: HowlErrorCallback): this.type = js.native
    def off(event: String, callback: HowlErrorCallback, id: Double): this.type = js.native
    def off(event: Unit, callback: Unit, id: Double): this.type = js.native
    def off(event: Unit, callback: HowlCallback): this.type = js.native
    def off(event: Unit, callback: HowlCallback, id: Double): this.type = js.native
    def off(event: Unit, callback: HowlErrorCallback): this.type = js.native
    def off(event: Unit, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("off")
    def off_load(event: load): this.type = js.native
    @JSName("off")
    def off_load(event: load, callback: js.Function0[Unit]): this.type = js.native
    @JSName("off")
    def off_load(event: load, callback: js.Function0[Unit], id: Double): this.type = js.native
    @JSName("off")
    def off_load(event: load, callback: Unit, id: Double): this.type = js.native
    
    def on(
      event: play | end | pause | stop | mute | volume | rate | seek | fade | unlock,
      callback: HowlCallback
    ): this.type = js.native
    def on(
      event: play | end | pause | stop | mute | volume | rate | seek | fade | unlock,
      callback: HowlCallback,
      id: Double
    ): this.type = js.native
    def on(event: loaderror | playerror, callback: HowlErrorCallback): this.type = js.native
    def on(event: loaderror | playerror, callback: HowlErrorCallback, id: Double): this.type = js.native
    def on(event: String, callback: HowlCallback): this.type = js.native
    def on(event: String, callback: HowlCallback, id: Double): this.type = js.native
    def on(event: String, callback: HowlErrorCallback): this.type = js.native
    def on(event: String, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("on")
    def on_load(event: load, callback: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_load(event: load, callback: js.Function0[Unit], id: Double): this.type = js.native
    
    def once(
      event: play | end | pause | stop | mute | volume | rate | seek | fade | unlock,
      callback: HowlCallback
    ): this.type = js.native
    def once(
      event: play | end | pause | stop | mute | volume | rate | seek | fade | unlock,
      callback: HowlCallback,
      id: Double
    ): this.type = js.native
    def once(event: loaderror | playerror, callback: HowlErrorCallback): this.type = js.native
    def once(event: loaderror | playerror, callback: HowlErrorCallback, id: Double): this.type = js.native
    def once(event: String, callback: HowlCallback): this.type = js.native
    def once(event: String, callback: HowlCallback, id: Double): this.type = js.native
    def once(event: String, callback: HowlErrorCallback): this.type = js.native
    def once(event: String, callback: HowlErrorCallback, id: Double): this.type = js.native
    @JSName("once")
    def once_load(event: load, callback: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_load(event: load, callback: js.Function0[Unit], id: Double): this.type = js.native
    
    def orientation(): SpatialOrientation = js.native
    def orientation(x: Double): this.type = js.native
    def orientation(x: Double, y: Double): this.type = js.native
    def orientation(x: Double, y: Double, z: Double): this.type = js.native
    def orientation(x: Double, y: Double, z: Double, id: Double): this.type = js.native
    def orientation(x: Double, y: Double, z: Unit, id: Double): this.type = js.native
    def orientation(x: Double, y: Unit, z: Double): this.type = js.native
    def orientation(x: Double, y: Unit, z: Double, id: Double): this.type = js.native
    def orientation(x: Double, y: Unit, z: Unit, id: Double): this.type = js.native
    
    def pannerAttr(): PannerAttributes = js.native
    def pannerAttr(id: Double): PannerAttributes = js.native
    def pannerAttr(options: PannerAttributes): this.type = js.native
    def pannerAttr(options: PannerAttributes, id: Double): this.type = js.native
    
    // .play() is not chainable; the other methods are
    def pause(): this.type = js.native
    def pause(id: Double): this.type = js.native
    
    def play(): Double = js.native
    def play(spriteOrId: String): Double = js.native
    def play(spriteOrId: Double): Double = js.native
    
    def playing(): Boolean = js.native
    def playing(id: Double): Boolean = js.native
    
    def pos(): SpatialPosition = js.native
    def pos(x: Double): this.type = js.native
    def pos(x: Double, y: Double): this.type = js.native
    def pos(x: Double, y: Double, z: Double): this.type = js.native
    def pos(x: Double, y: Double, z: Double, id: Double): this.type = js.native
    def pos(x: Double, y: Double, z: Unit, id: Double): this.type = js.native
    def pos(x: Double, y: Unit, z: Double): this.type = js.native
    def pos(x: Double, y: Unit, z: Double, id: Double): this.type = js.native
    def pos(x: Double, y: Unit, z: Unit, id: Double): this.type = js.native
    
    def rate(): Double = js.native
    def rate(rate: Double): this.type = js.native
    def rate(rate: Double, id: Double): this.type = js.native
    @JSName("rate")
    def rate_Double(id: Double): Double = js.native
    
    def seek(): Double = js.native
    def seek(seek: Double): this.type = js.native
    def seek(seek: Double, id: Double): this.type = js.native
    @JSName("seek")
    def seek_Double(id: Double): Double = js.native
    
    def state(): unloaded | loading | loaded = js.native
    
    def stereo(): Double = js.native
    def stereo(pan: Double): Double | this.type = js.native
    def stereo(pan: Double, id: Double): Double | this.type = js.native
    
    def stop(): this.type = js.native
    def stop(id: Double): this.type = js.native
    
    def unload(): Null = js.native
    
    def volume(): Double = js.native
    def volume(idOrSetVolume: Double): this.type | Double = js.native
    def volume(volume: Double, id: Double): this.type = js.native
  }
  
  @JSImport("howler", "Howler")
  @js.native
  val Howler: HowlerGlobal = js.native
  
  @js.native
  sealed trait State extends StObject
  @JSImport("howler", "State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[State & String] = js.native
    
    @js.native
    sealed trait Loaded
      extends StObject
         with State
    /* "loaded" */ val Loaded: typings.howler.mod.State.Loaded & String = js.native
    
    @js.native
    sealed trait Loading
      extends StObject
         with State
    /* "loading" */ val Loading: typings.howler.mod.State.Loading & String = js.native
    
    @js.native
    sealed trait Unloaded
      extends StObject
         with State
    /* "unloaded" */ val Unloaded: typings.howler.mod.State.Unloaded & String = js.native
  }
  
  object global {
    
    @JSGlobal("Howler")
    @js.native
    val Howler: HowlerGlobal = js.native
    
    @JSGlobal("HowlerGlobal")
    @js.native
    open class HowlerGlobal () extends StObject {
      
      var autoSuspend: Boolean = js.native
      
      var autoUnlock: Boolean = js.native
      
      def codecs(ext: String): Boolean = js.native
      
      var ctx: AudioContext = js.native
      
      var html5PoolSize: Double = js.native
      
      var masterGain: GainNode = js.native
      
      def mute(muted: Boolean): this.type = js.native
      
      var noAudio: Boolean = js.native
      
      def orientation(): SpatialOrientation = js.native
      def orientation(x: Double): this.type = js.native
      def orientation(x: Double, y: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Double, xUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Unit, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Double, xUp: Unit, yUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Double, xUp: Unit, yUp: Double, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Double, xUp: Unit, yUp: Unit, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Unit, xUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Unit, xUp: Double, yUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Unit, xUp: Double, yUp: Double, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Unit, xUp: Double, yUp: Unit, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Unit, xUp: Unit, yUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Unit, xUp: Unit, yUp: Double, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Double, z: Unit, xUp: Unit, yUp: Unit, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Double, xUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Double, xUp: Double, yUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Double, xUp: Double, yUp: Double, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Double, xUp: Double, yUp: Unit, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Double, xUp: Unit, yUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Double, xUp: Unit, yUp: Double, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Double, xUp: Unit, yUp: Unit, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Unit, xUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Unit, xUp: Double, yUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Unit, xUp: Double, yUp: Double, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Unit, xUp: Double, yUp: Unit, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Unit, xUp: Unit, yUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Unit, xUp: Unit, yUp: Double, zUp: Double): this.type = js.native
      def orientation(x: Double, y: Unit, z: Unit, xUp: Unit, yUp: Unit, zUp: Double): this.type = js.native
      
      def pos(): SpatialPosition = js.native
      def pos(x: Double): this.type = js.native
      def pos(x: Double, y: Double): this.type = js.native
      def pos(x: Double, y: Double, z: Double): this.type = js.native
      def pos(x: Double, y: Unit, z: Double): this.type = js.native
      
      def stereo(pan: Double): this.type = js.native
      
      def stop(): this.type = js.native
      
      def unload(): this.type = js.native
      
      var usingWebAudio: Boolean = js.native
      
      def volume(): Double = js.native
      def volume(volume: Double): this.type = js.native
    }
  }
  
  type HowlCallback = js.Function1[/* soundId */ Double, Unit]
  
  type HowlErrorCallback = js.Function2[/* soundId */ Double, /* error */ Any, Unit]
  
  trait HowlListeners extends StObject {
    
    /**
      * Fires when the sound finishes playing (if it is looping, it'll fire at the end of each loop).
      * The first parameter is the ID of the sound.
      */
    var onend: js.UndefOr[HowlCallback] = js.undefined
    
    /** Fires when the current sound finishes fading in/out. The first parameter is the ID of the sound. */
    var onfade: js.UndefOr[HowlCallback] = js.undefined
    
    /** Fires when the sound is loaded. */
    var onload: js.UndefOr[HowlCallback] = js.undefined
    
    /**
      * Fires when the sound is unable to load. The first parameter is the ID
      * of the sound (if it exists) and the second is the error message/code.
      */
    var onloaderror: js.UndefOr[HowlErrorCallback] = js.undefined
    
    /** Fires when the sound has been muted/unmuted. The first parameter is the ID of the sound. */
    var onmute: js.UndefOr[HowlCallback] = js.undefined
    
    /** Fires when the sound has been paused. The first parameter is the ID of the sound. */
    var onpause: js.UndefOr[HowlCallback] = js.undefined
    
    /** Fires when the sound begins playing. The first parameter is the ID of the sound. */
    var onplay: js.UndefOr[HowlCallback] = js.undefined
    
    /**
      * Fires when the sound is unable to play. The first parameter is
      * the ID of the sound and the second is the error message/code.
      */
    var onplayerror: js.UndefOr[HowlErrorCallback] = js.undefined
    
    /** Fires when the sound's playback rate has changed. The first parameter is the ID of the sound. */
    var onrate: js.UndefOr[HowlCallback] = js.undefined
    
    /** Fires when the sound has been seeked. The first parameter is the ID of the sound. */
    var onseek: js.UndefOr[HowlCallback] = js.undefined
    
    /** Fires when the sound has been stopped. The first parameter is the ID of the sound. */
    var onstop: js.UndefOr[HowlCallback] = js.undefined
    
    /** Fires when audio has been automatically unlocked through a touch/click event. */
    var onunlock: js.UndefOr[HowlCallback] = js.undefined
    
    /** Fires when the sound's volume has changed. The first parameter is the ID of the sound. */
    var onvolume: js.UndefOr[HowlCallback] = js.undefined
  }
  object HowlListeners {
    
    inline def apply(): HowlListeners = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HowlListeners]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HowlListeners] (val x: Self) extends AnyVal {
      
      inline def setOnend(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onend", js.Any.fromFunction1(value))
      
      inline def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
      
      inline def setOnfade(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onfade", js.Any.fromFunction1(value))
      
      inline def setOnfadeUndefined: Self = StObject.set(x, "onfade", js.undefined)
      
      inline def setOnload(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
      
      inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      inline def setOnloaderror(value: (/* soundId */ Double, /* error */ Any) => Unit): Self = StObject.set(x, "onloaderror", js.Any.fromFunction2(value))
      
      inline def setOnloaderrorUndefined: Self = StObject.set(x, "onloaderror", js.undefined)
      
      inline def setOnmute(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onmute", js.Any.fromFunction1(value))
      
      inline def setOnmuteUndefined: Self = StObject.set(x, "onmute", js.undefined)
      
      inline def setOnpause(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onpause", js.Any.fromFunction1(value))
      
      inline def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      inline def setOnplay(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onplay", js.Any.fromFunction1(value))
      
      inline def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      inline def setOnplayerror(value: (/* soundId */ Double, /* error */ Any) => Unit): Self = StObject.set(x, "onplayerror", js.Any.fromFunction2(value))
      
      inline def setOnplayerrorUndefined: Self = StObject.set(x, "onplayerror", js.undefined)
      
      inline def setOnrate(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onrate", js.Any.fromFunction1(value))
      
      inline def setOnrateUndefined: Self = StObject.set(x, "onrate", js.undefined)
      
      inline def setOnseek(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onseek", js.Any.fromFunction1(value))
      
      inline def setOnseekUndefined: Self = StObject.set(x, "onseek", js.undefined)
      
      inline def setOnstop(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onstop", js.Any.fromFunction1(value))
      
      inline def setOnstopUndefined: Self = StObject.set(x, "onstop", js.undefined)
      
      inline def setOnunlock(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onunlock", js.Any.fromFunction1(value))
      
      inline def setOnunlockUndefined: Self = StObject.set(x, "onunlock", js.undefined)
      
      inline def setOnvolume(value: /* soundId */ Double => Unit): Self = StObject.set(x, "onvolume", js.Any.fromFunction1(value))
      
      inline def setOnvolumeUndefined: Self = StObject.set(x, "onvolume", js.undefined)
    }
  }
  
  trait HowlOptions
    extends StObject
       with HowlListeners {
    
    /**
      * Set to true to automatically start playback when sound is loaded.
      * @default false
      */
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * howler.js automatically detects your file format from the extension, but you may also specify a
      * format in situations where extraction won't work (such as with a SoundCloud stream).
      */
    var format: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Set to true to force HTML5 Audio. This should be used for large audio files so that you don't
      * have to wait for the full file to be downloaded and decoded before playing.
      * @default false
      */
    var html5: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to automatically loop the sound forever.
      * @default false
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to load the audio muted.
      * @default false
      */
    var mute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The size of the inactive sounds pool. Once sounds are stopped or finish playing, they are marked
      * as ended and ready for cleanup. We keep a pool of these to recycle for improved performance.
      * Generally this doesn't need to be changed. It is important to keep in mind that when a sound is
      * paused, it won't be removed from the pool and will still be considered active so that it can be
      * resumed later.
      * @default 5
      */
    var pool: js.UndefOr[Double] = js.undefined
    
    /**
      * Automatically begin downloading the audio file when the Howl is defined. If using HTML5 Audio,
      * you can set this to 'metadata' to only preload the file's metadata (to get its duration without
      * download the entire file, for example).
      * @default true
      */
    var preload: js.UndefOr[Boolean | metadata] = js.undefined
    
    /**
      * The rate of playback. 0.5 to 4.0, with 1.0 being normal speed.
      * @default 1.0
      */
    var rate: js.UndefOr[Double] = js.undefined
    
    /**
      * Define a sound sprite for the sound. The offset and duration are defined in milliseconds. A
      * third (optional) parameter is available to set a sprite as looping. An easy way to generate
      * compatible sound sprites is with audiosprite.
      */
    var sprite: js.UndefOr[SoundSpriteDefinitions] = js.undefined
    
    /**
      * The sources to the track(s) to be loaded for the sound (URLs or base64 data URIs). These should
      * be in order of preference, howler.js will automatically load the first one that is compatible
      * with the current browser. If your files have no extensions, you will need to explicitly specify
      * the extension using the format property.
      */
    var src: String | js.Array[String]
    
    /**
      * The volume of the specific track, from 0.0 to 1.0.
      * @default 1.0
      */
    var volume: js.UndefOr[Double] = js.undefined
    
    /**
      * When using Web Audio, howler.js uses an XHR request to load the audio files. If you need to send
      * custom headers, set the HTTP method or enable withCredentials (see reference), include them with
      * this parameter. Each is optional (method defaults to GET, headers default to null and
      * withCredentials defaults to false).
      */
    var xhr: js.UndefOr[Headers] = js.undefined
  }
  object HowlOptions {
    
    inline def apply(src: String | js.Array[String]): HowlOptions = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[HowlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HowlOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setFormat(value: String | js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value*))
      
      inline def setHtml5(value: Boolean): Self = StObject.set(x, "html5", value.asInstanceOf[js.Any])
      
      inline def setHtml5Undefined: Self = StObject.set(x, "html5", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      inline def setPool(value: Double): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      inline def setPreload(value: Boolean | metadata): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setSprite(value: SoundSpriteDefinitions): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      inline def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
      
      inline def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value*))
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
      
      inline def setXhr(value: Headers): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait PannerAttributes extends StObject {
    
    var coneInnerAngle: js.UndefOr[Double] = js.undefined
    
    var coneOuterAngle: js.UndefOr[Double] = js.undefined
    
    var coneOuterGain: js.UndefOr[Double] = js.undefined
    
    var distanceModel: js.UndefOr[inverse | linear] = js.undefined
    
    var maxDistance: js.UndefOr[Double] = js.undefined
    
    var panningModel: js.UndefOr[HRTF | equalpower] = js.undefined
    
    var refDistance: js.UndefOr[Double] = js.undefined
    
    var rolloffFactor: js.UndefOr[Double] = js.undefined
  }
  object PannerAttributes {
    
    inline def apply(): PannerAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PannerAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PannerAttributes] (val x: Self) extends AnyVal {
      
      inline def setConeInnerAngle(value: Double): Self = StObject.set(x, "coneInnerAngle", value.asInstanceOf[js.Any])
      
      inline def setConeInnerAngleUndefined: Self = StObject.set(x, "coneInnerAngle", js.undefined)
      
      inline def setConeOuterAngle(value: Double): Self = StObject.set(x, "coneOuterAngle", value.asInstanceOf[js.Any])
      
      inline def setConeOuterAngleUndefined: Self = StObject.set(x, "coneOuterAngle", js.undefined)
      
      inline def setConeOuterGain(value: Double): Self = StObject.set(x, "coneOuterGain", value.asInstanceOf[js.Any])
      
      inline def setConeOuterGainUndefined: Self = StObject.set(x, "coneOuterGain", js.undefined)
      
      inline def setDistanceModel(value: inverse | linear): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
      
      inline def setDistanceModelUndefined: Self = StObject.set(x, "distanceModel", js.undefined)
      
      inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
      
      inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
      
      inline def setPanningModel(value: HRTF | equalpower): Self = StObject.set(x, "panningModel", value.asInstanceOf[js.Any])
      
      inline def setPanningModelUndefined: Self = StObject.set(x, "panningModel", js.undefined)
      
      inline def setRefDistance(value: Double): Self = StObject.set(x, "refDistance", value.asInstanceOf[js.Any])
      
      inline def setRefDistanceUndefined: Self = StObject.set(x, "refDistance", js.undefined)
      
      inline def setRolloffFactor(value: Double): Self = StObject.set(x, "rolloffFactor", value.asInstanceOf[js.Any])
      
      inline def setRolloffFactorUndefined: Self = StObject.set(x, "rolloffFactor", js.undefined)
    }
  }
  
  type Sound = js.Function1[/* howl */ Howl, this.type]
  
  type SoundSpriteDefinitions = StringDictionary[(js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Boolean])]
  
  type SpatialOrientation = js.Tuple3[Double, Double, Double]
  
  type SpatialPosition = js.Tuple3[Double, Double, Double]
}
