package typings.howler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.howler.anon.Headers
import typings.howler.howlerStrings.metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class HowlOptionsOps[Self <: HowlOptions] (val x: Self) extends AnyVal {
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
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setFormatVarargs(value: String*): Self = this.set("format", js.Array(value :_*))
    @scala.inline
    def setFormat(value: js.Array[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHtml5(value: Boolean): Self = this.set("html5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml5: Self = this.set("html5", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMute(value: Boolean): Self = this.set("mute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    @scala.inline
    def setPool(value: Double): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    @scala.inline
    def setPreload(value: Boolean | metadata): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    @scala.inline
    def setSprite(value: StringDictionary[(js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Boolean])]): Self = this.set("sprite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSprite: Self = this.set("sprite", js.undefined)
    @scala.inline
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    @scala.inline
    def setSrc(value: String | js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    @scala.inline
    def setXhr(value: Headers): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

