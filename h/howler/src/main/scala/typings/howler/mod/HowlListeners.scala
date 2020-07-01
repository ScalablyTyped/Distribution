package typings.howler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HowlListeners extends js.Object {
  /**
    * Fires when the sound finishes playing (if it is looping, it'll fire at the end of each loop).
    * The first parameter is the ID of the sound.
    */
  var onend: js.UndefOr[HowlCallback] = js.undefined
  /**
    * Fires when the current sound finishes fading in/out. The first parameter is the ID of the sound.
    */
  var onfade: js.UndefOr[HowlCallback] = js.undefined
  /**
    * Fires when the sound is loaded.
    */
  var onload: js.UndefOr[HowlCallback] = js.undefined
  /**
    * Fires when the sound is unable to load. The first parameter is the ID of the sound (if it exists) and the second is the error message/code.
    */
  var onloaderror: js.UndefOr[HowlErrorCallback] = js.undefined
  /**
    * Fires when the sound has been muted/unmuted. The first parameter is the ID of the sound.
    */
  var onmute: js.UndefOr[HowlCallback] = js.undefined
  /**
    * Fires when the sound has been paused. The first parameter is the ID of the sound.
    */
  var onpause: js.UndefOr[HowlCallback] = js.undefined
  /**
    * Fires when the sound begins playing. The first parameter is the ID of the sound.
    */
  var onplay: js.UndefOr[HowlCallback] = js.undefined
  /**
    * Fires when the sound is unable to play. The first parameter is the ID of the sound and the second is the error message/code.
    */
  var onplayerror: js.UndefOr[HowlErrorCallback] = js.undefined
  /**
    * Fires when the sound's playback rate has changed. The first parameter is the ID of the sound.
    */
  var onrate: js.UndefOr[HowlCallback] = js.undefined
  /**
    * Fires when the sound has been seeked. The first parameter is the ID of the sound.
    */
  var onseek: js.UndefOr[HowlCallback] = js.undefined
  /**
    * Fires when the sound has been stopped. The first parameter is the ID of the sound.
    */
  var onstop: js.UndefOr[HowlCallback] = js.undefined
  /**
    * Fires when audio has been automatically unlocked through a touch/click event.
    */
  var onunlock: js.UndefOr[HowlCallback] = js.undefined
  /**
    * Fires when the sound's volume has changed. The first parameter is the ID of the sound.
    */
  var onvolume: js.UndefOr[HowlCallback] = js.undefined
}

object HowlListeners {
  @scala.inline
  def apply(
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
    onvolume: /* soundId */ Double => Unit = null
  ): HowlListeners = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[HowlListeners]
  }
}

