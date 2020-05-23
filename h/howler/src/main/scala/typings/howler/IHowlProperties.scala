package typings.howler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHowlProperties extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[js.Array[String] | String] = js.undefined
  var html5: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var mute: js.UndefOr[Boolean] = js.undefined
  var onend: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onfade: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onload: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onloaderror: js.UndefOr[js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]] = js.undefined
  var onmute: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onpause: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onplay: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onplayerror: js.UndefOr[js.Function2[/* soundId */ Double, /* error */ js.Any, Unit]] = js.undefined
  var onrate: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onseek: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onstop: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onunlock: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var onvolume: js.UndefOr[js.Function1[/* soundId */ Double, Unit]] = js.undefined
  var pool: js.UndefOr[Double] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var sprite: js.UndefOr[IHowlSoundSpriteDefinition] = js.undefined
  var src: String | js.Array[String]
  var volume: js.UndefOr[Double] = js.undefined
  var xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
}

object IHowlProperties {
  @scala.inline
  def apply(
    src: String | js.Array[String],
    autoplay: js.UndefOr[Boolean] = js.undefined,
    format: js.Array[String] | String = null,
    html5: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    onend: /* soundId */ Double => Unit = null,
    onfade: /* soundId */ Double => Unit = null,
    onload: () => Unit = null,
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
    preload: js.UndefOr[Boolean] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined,
    sprite: IHowlSoundSpriteDefinition = null,
    volume: js.UndefOr[Double] = js.undefined,
    xhrWithCredentials: js.UndefOr[Boolean] = js.undefined
  ): IHowlProperties = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(html5)) __obj.updateDynamic("html5")(html5.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.get.asInstanceOf[js.Any])
    if (onend != null) __obj.updateDynamic("onend")(js.Any.fromFunction1(onend))
    if (onfade != null) __obj.updateDynamic("onfade")(js.Any.fromFunction1(onfade))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction0(onload))
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
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xhrWithCredentials)) __obj.updateDynamic("xhrWithCredentials")(xhrWithCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHowlProperties]
  }
}

