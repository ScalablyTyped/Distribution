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

