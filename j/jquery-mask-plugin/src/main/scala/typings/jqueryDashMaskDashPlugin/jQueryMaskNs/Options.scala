package typings.jqueryDashMaskDashPlugin.jQueryMaskNs

import typings.jqueryDashMaskDashPlugin.JQuery
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var byPassKeys: js.UndefOr[js.Array[Double]] = js.undefined
  var clearIfNotMatch: js.UndefOr[Boolean] = js.undefined
  var dataMask: js.UndefOr[Boolean] = js.undefined
  var dataMaskAttr: js.UndefOr[String] = js.undefined
  var maskElements: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
  ] = js.undefined
  var onComplete: js.UndefOr[
    js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
  ] = js.undefined
  var onInvalid: js.UndefOr[
    js.Function5[
      /* value */ String, 
      /* e */ Event, 
      /* $element */ JQuery, 
      /* invalid */ js.Array[Invalid], 
      /* options */ this.type, 
      Unit
    ]
  ] = js.undefined
  var onKeyPress: js.UndefOr[
    js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var selectOnFocus: js.UndefOr[Boolean] = js.undefined
  var translation: js.UndefOr[Translation] = js.undefined
  var watchDataMask: js.UndefOr[Boolean] = js.undefined
  var watchInputs: js.UndefOr[Boolean] = js.undefined
  var watchInterval: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    byPassKeys: js.Array[Double] = null,
    clearIfNotMatch: js.UndefOr[Boolean] = js.undefined,
    dataMask: js.UndefOr[Boolean] = js.undefined,
    dataMaskAttr: String = null,
    maskElements: String = null,
    onChange: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit = null,
    onComplete: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit = null,
    onInvalid: (/* value */ String, /* e */ Event, /* $element */ JQuery, /* invalid */ js.Array[Invalid], Options) => Unit = null,
    onKeyPress: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit = null,
    placeholder: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    selectOnFocus: js.UndefOr[Boolean] = js.undefined,
    translation: Translation = null,
    watchDataMask: js.UndefOr[Boolean] = js.undefined,
    watchInputs: js.UndefOr[Boolean] = js.undefined,
    watchInterval: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (byPassKeys != null) __obj.updateDynamic("byPassKeys")(byPassKeys)
    if (!js.isUndefined(clearIfNotMatch)) __obj.updateDynamic("clearIfNotMatch")(clearIfNotMatch)
    if (!js.isUndefined(dataMask)) __obj.updateDynamic("dataMask")(dataMask)
    if (dataMaskAttr != null) __obj.updateDynamic("dataMaskAttr")(dataMaskAttr)
    if (maskElements != null) __obj.updateDynamic("maskElements")(maskElements)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction4(onComplete))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction5(onInvalid))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction4(onKeyPress))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(selectOnFocus)) __obj.updateDynamic("selectOnFocus")(selectOnFocus)
    if (translation != null) __obj.updateDynamic("translation")(translation)
    if (!js.isUndefined(watchDataMask)) __obj.updateDynamic("watchDataMask")(watchDataMask)
    if (!js.isUndefined(watchInputs)) __obj.updateDynamic("watchInputs")(watchInputs)
    if (watchInterval != null) __obj.updateDynamic("watchInterval")(watchInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

