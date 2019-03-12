package typings
package howlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHowlProperties extends js.Object {
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var html5: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var mute: js.UndefOr[scala.Boolean] = js.undefined
  var onend: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onfade: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onload: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onloaderror: js.UndefOr[js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit]] = js.undefined
  var onmute: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onpause: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onplay: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onplayerror: js.UndefOr[js.Function2[/* soundId */ scala.Double, /* error */ js.Any, scala.Unit]] = js.undefined
  var onrate: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onseek: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onstop: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onunlock: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var onvolume: js.UndefOr[js.Function1[/* soundId */ scala.Double, scala.Unit]] = js.undefined
  var pool: js.UndefOr[scala.Double] = js.undefined
  var preload: js.UndefOr[scala.Boolean] = js.undefined
  var rate: js.UndefOr[scala.Double] = js.undefined
  var sprite: js.UndefOr[IHowlSoundSpriteDefinition] = js.undefined
  var src: java.lang.String | js.Array[java.lang.String]
  var volume: js.UndefOr[scala.Double] = js.undefined
  var xhrWithCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object IHowlProperties {
  @scala.inline
  def apply(
    src: java.lang.String | js.Array[java.lang.String],
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    format: js.Array[java.lang.String] | java.lang.String = null,
    html5: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    mute: js.UndefOr[scala.Boolean] = js.undefined,
    onend: /* soundId */ scala.Double => scala.Unit = null,
    onfade: /* soundId */ scala.Double => scala.Unit = null,
    onload: () => scala.Unit = null,
    onloaderror: (/* soundId */ scala.Double, /* error */ js.Any) => scala.Unit = null,
    onmute: /* soundId */ scala.Double => scala.Unit = null,
    onpause: /* soundId */ scala.Double => scala.Unit = null,
    onplay: /* soundId */ scala.Double => scala.Unit = null,
    onplayerror: (/* soundId */ scala.Double, /* error */ js.Any) => scala.Unit = null,
    onrate: /* soundId */ scala.Double => scala.Unit = null,
    onseek: /* soundId */ scala.Double => scala.Unit = null,
    onstop: /* soundId */ scala.Double => scala.Unit = null,
    onunlock: /* soundId */ scala.Double => scala.Unit = null,
    onvolume: /* soundId */ scala.Double => scala.Unit = null,
    pool: scala.Int | scala.Double = null,
    preload: js.UndefOr[scala.Boolean] = js.undefined,
    rate: scala.Int | scala.Double = null,
    sprite: IHowlSoundSpriteDefinition = null,
    volume: scala.Int | scala.Double = null,
    xhrWithCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): IHowlProperties = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(html5)) __obj.updateDynamic("html5")(html5)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute)
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
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (!js.isUndefined(xhrWithCredentials)) __obj.updateDynamic("xhrWithCredentials")(xhrWithCredentials)
    __obj.asInstanceOf[IHowlProperties]
  }
}

