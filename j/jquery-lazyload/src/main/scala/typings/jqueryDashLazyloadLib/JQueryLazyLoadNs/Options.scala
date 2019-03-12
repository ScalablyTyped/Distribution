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

object Options {
  @scala.inline
  def apply(
    appear: (/* elementsLeft */ scala.Double, Options) => scala.Unit = null,
    container: jqueryDashLazyloadLib.JQuery = null,
    data_attribute: java.lang.String = null,
    effect: java.lang.String = null,
    event: java.lang.String = null,
    failure_limit: scala.Int | scala.Double = null,
    load: (/* elementsLeft */ js.UndefOr[scala.Double], /* options */ js.UndefOr[Options]) => scala.Unit = null,
    placeholder: java.lang.String = null,
    skip_invisible: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (appear != null) __obj.updateDynamic("appear")(js.Any.fromFunction2(appear))
    if (container != null) __obj.updateDynamic("container")(container)
    if (data_attribute != null) __obj.updateDynamic("data_attribute")(data_attribute)
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (event != null) __obj.updateDynamic("event")(event)
    if (failure_limit != null) __obj.updateDynamic("failure_limit")(failure_limit.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2(load))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(skip_invisible)) __obj.updateDynamic("skip_invisible")(skip_invisible)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

