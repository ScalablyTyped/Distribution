package typings.howler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.howler.anon.Headers
import typings.howler.howlerStrings.metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HowlOptions extends HowlListeners {
  /**
    * Set to true to automatically start playback when sound is loaded.
    *
    * @default `false`
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * howler.js automatically detects your file format from the extension, but you may also specify a
    * format in situations where extraction won't work (such as with a SoundCloud stream).
    *
    * @default `[]`
    */
  var format: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Set to true to force HTML5 Audio. This should be used for large audio files so that you don't
    * have to wait for the full file to be downloaded and decoded before playing.
    *
    * @default `false`
    */
  var html5: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to automatically loop the sound forever.
    *
    * @default `false`
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to true to load the audio muted.
    *
    * @default `false`
    */
  var mute: js.UndefOr[Boolean] = js.undefined
  /**
    * The size of the inactive sounds pool. Once sounds are stopped or finish playing, they are marked
    * as ended and ready for cleanup. We keep a pool of these to recycle for improved performance.
    * Generally this doesn't need to be changed. It is important to keep in mind that when a sound is
    * paused, it won't be removed from the pool and will still be considered active so that it can be
    * resumed later.
    *
    * @default `5`
    */
  var pool: js.UndefOr[Double] = js.undefined
  /**
    * Automatically begin downloading the audio file when the Howl is defined. If using HTML5 Audio,
    * you can set this to 'metadata' to only preload the file's metadata (to get its duration without
    * download the entire file, for example).
    *
    * @default `true`
    */
  var preload: js.UndefOr[Boolean | metadata] = js.undefined
  /**
    * The rate of playback. 0.5 to 4.0, with 1.0 being normal speed.
    *
    * @default `1.0`
    */
  var rate: js.UndefOr[Double] = js.undefined
  /**
    * Define a sound sprite for the sound. The offset and duration are defined in milliseconds. A
    * third (optional) parameter is available to set a sprite as looping. An easy way to generate
    * compatible sound sprites is with audiosprite.
    *
    * @default `{}`
    */
  var sprite: js.UndefOr[
    StringDictionary[(js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Boolean])]
  ] = js.undefined
  /**
    * The sources to the track(s) to be loaded for the sound (URLs or base64 data URIs). These should
    * be in order of preference, howler.js will automatically load the first one that is compatible
    * with the current browser. If your files have no extensions, you will need to explicitly specify
    * the extension using the format property.
    *
    * @default `[]`
    */
  var src: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The volume of the specific track, from 0.0 to 1.0.
    *
    * @default `1.0`
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
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    format: js.Array[String] = null,
    html5: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    onend: /* soundId */ Double => Unit = null,
    onfade: /* soundId */ Double => Unit = null,
    onload: /* soundId */ Double => Unit = null,
    onloaderror: (/* soundId */ Double, /* error */ js.Any) => Unit = null,
    onmute: /* soundId */ Double => Unit = null,
    onpause: /* soundId */ Double => Unit = null,
    onplay: /* soundId */ Double => Unit = null,
    onplayerror: (/* soundId */ Double, /* error */ js.Any) => Unit = null,
    onrate: /* soundId */ Double => Unit = null,
    onseek: /* soundId */ Double => Unit = null,
    onstop: /* soundId */ Double => Unit = null,
    onunlock: /* soundId */ Double => Unit = null,
    onvolume: /* soundId */ Double => Unit = null,
    pool: js.UndefOr[Double] = js.undefined,
    preload: Boolean | metadata = null,
    rate: js.UndefOr[Double] = js.undefined,
    sprite: StringDictionary[(js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Boolean])] = null,
    src: String | js.Array[String] = null,
    volume: js.UndefOr[Double] = js.undefined,
    xhr: Headers = null
  ): HowlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(html5)) __obj.updateDynamic("html5")(html5.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.get.asInstanceOf[js.Any])
    if (onend != null) __obj.updateDynamic("onend")(js.Any.fromFunction1(onend))
    if (onfade != null) __obj.updateDynamic("onfade")(js.Any.fromFunction1(onfade))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1(onload))
    if (onloaderror != null) __obj.updateDynamic("onloaderror")(js.Any.fromFunction2(onloaderror))
    if (onmute != null) __obj.updateDynamic("onmute")(js.Any.fromFunction1(onmute))
    if (onpause != null) __obj.updateDynamic("onpause")(js.Any.fromFunction1(onpause))
    if (onplay != null) __obj.updateDynamic("onplay")(js.Any.fromFunction1(onplay))
    if (onplayerror != null) __obj.updateDynamic("onplayerror")(js.Any.fromFunction2(onplayerror))
    if (onrate != null) __obj.updateDynamic("onrate")(js.Any.fromFunction1(onrate))
    if (onseek != null) __obj.updateDynamic("onseek")(js.Any.fromFunction1(onseek))
    if (onstop != null) __obj.updateDynamic("onstop")(js.Any.fromFunction1(onstop))
    if (onunlock != null) __obj.updateDynamic("onunlock")(js.Any.fromFunction1(onunlock))
    if (onvolume != null) __obj.updateDynamic("onvolume")(js.Any.fromFunction1(onvolume))
    if (!js.isUndefined(pool)) __obj.updateDynamic("pool")(pool.get.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[HowlOptions]
  }
}

