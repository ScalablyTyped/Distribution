package typings
package jqueryDashLazyloadLib.JQueryLazyLoadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var appear: js.UndefOr[
    (js.Function2[/* elementsLeft */ scala.Double, /* options */ this.type, scala.Unit]) | scala.Null
  ] = js.undefined
  var container: js.UndefOr[jqueryDashLazyloadLib.JQuery] = js.undefined
  var data_attribute: js.UndefOr[java.lang.String] = js.undefined
  var effect: js.UndefOr[java.lang.String] = js.undefined
  var event: js.UndefOr[java.lang.String] = js.undefined
  var failure_limit: js.UndefOr[scala.Double] = js.undefined
  var load: js.UndefOr[
    js.Function2[
      /* elementsLeft */ js.UndefOr[scala.Double], 
      /* options */ js.UndefOr[Options], 
      scala.Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var skip_invisible: js.UndefOr[scala.Boolean] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

