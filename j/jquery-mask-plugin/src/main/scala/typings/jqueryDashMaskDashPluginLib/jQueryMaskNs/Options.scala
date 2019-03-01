package typings
package jqueryDashMaskDashPluginLib.jQueryMaskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var byPassKeys: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var clearIfNotMatch: js.UndefOr[scala.Boolean] = js.undefined
  var dataMask: js.UndefOr[scala.Boolean] = js.undefined
  var dataMaskAttr: js.UndefOr[java.lang.String] = js.undefined
  var maskElements: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* value */ java.lang.String, 
      /* e */ stdLib.Event, 
      /* $element */ jqueryDashMaskDashPluginLib.JQuery, 
      /* options */ this.type, 
      scala.Unit
    ]
  ] = js.undefined
  var onComplete: js.UndefOr[
    js.Function4[
      /* value */ java.lang.String, 
      /* e */ stdLib.Event, 
      /* $element */ jqueryDashMaskDashPluginLib.JQuery, 
      /* options */ this.type, 
      scala.Unit
    ]
  ] = js.undefined
  var onInvalid: js.UndefOr[
    js.Function5[
      /* value */ java.lang.String, 
      /* e */ stdLib.Event, 
      /* $element */ jqueryDashMaskDashPluginLib.JQuery, 
      /* invalid */ js.Array[Invalid], 
      /* options */ this.type, 
      scala.Unit
    ]
  ] = js.undefined
  var onKeyPress: js.UndefOr[
    js.Function4[
      /* value */ java.lang.String, 
      /* e */ stdLib.Event, 
      /* $element */ jqueryDashMaskDashPluginLib.JQuery, 
      /* options */ this.type, 
      scala.Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var selectOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var translation: js.UndefOr[Translation] = js.undefined
  var watchDataMask: js.UndefOr[scala.Boolean] = js.undefined
  var watchInputs: js.UndefOr[scala.Boolean] = js.undefined
  var watchInterval: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    byPassKeys: js.Array[scala.Double] = null,
    clearIfNotMatch: js.UndefOr[scala.Boolean] = js.undefined,
    dataMask: js.UndefOr[scala.Boolean] = js.undefined,
    dataMaskAttr: java.lang.String = null,
    maskElements: java.lang.String = null,
    onChange: js.Function4[
      /* value */ java.lang.String, 
      /* e */ stdLib.Event, 
      /* $element */ jqueryDashMaskDashPluginLib.JQuery, 
      Options, 
      scala.Unit
    ] = null,
    onComplete: js.Function4[
      /* value */ java.lang.String, 
      /* e */ stdLib.Event, 
      /* $element */ jqueryDashMaskDashPluginLib.JQuery, 
      Options, 
      scala.Unit
    ] = null,
    onInvalid: js.Function5[
      /* value */ java.lang.String, 
      /* e */ stdLib.Event, 
      /* $element */ jqueryDashMaskDashPluginLib.JQuery, 
      /* invalid */ js.Array[Invalid], 
      Options, 
      scala.Unit
    ] = null,
    onKeyPress: js.Function4[
      /* value */ java.lang.String, 
      /* e */ stdLib.Event, 
      /* $element */ jqueryDashMaskDashPluginLib.JQuery, 
      Options, 
      scala.Unit
    ] = null,
    placeholder: java.lang.String = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    selectOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    translation: Translation = null,
    watchDataMask: js.UndefOr[scala.Boolean] = js.undefined,
    watchInputs: js.UndefOr[scala.Boolean] = js.undefined,
    watchInterval: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (byPassKeys != null) __obj.updateDynamic("byPassKeys")(byPassKeys)
    if (!js.isUndefined(clearIfNotMatch)) __obj.updateDynamic("clearIfNotMatch")(clearIfNotMatch)
    if (!js.isUndefined(dataMask)) __obj.updateDynamic("dataMask")(dataMask)
    if (dataMaskAttr != null) __obj.updateDynamic("dataMaskAttr")(dataMaskAttr)
    if (maskElements != null) __obj.updateDynamic("maskElements")(maskElements)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(onInvalid)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
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

