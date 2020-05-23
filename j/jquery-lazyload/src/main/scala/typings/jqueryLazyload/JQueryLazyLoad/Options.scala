package typings.jqueryLazyload.JQueryLazyLoad

import typings.jqueryLazyload.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var appear: js.UndefOr[(js.Function2[/* elementsLeft */ Double, /* options */ this.type, Unit]) | Null] = js.undefined
  var container: js.UndefOr[JQuery] = js.undefined
  var data_attribute: js.UndefOr[String] = js.undefined
  var effect: js.UndefOr[String] = js.undefined
  var event: js.UndefOr[String] = js.undefined
  var failure_limit: js.UndefOr[Double] = js.undefined
  var load: js.UndefOr[
    js.Function2[/* elementsLeft */ js.UndefOr[Double], /* options */ js.UndefOr[Options], Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var skip_invisible: js.UndefOr[Boolean] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    appear: js.UndefOr[Null | ((/* elementsLeft */ Double, Options) => Unit)] = js.undefined,
    container: JQuery = null,
    data_attribute: String = null,
    effect: String = null,
    event: String = null,
    failure_limit: js.UndefOr[Double] = js.undefined,
    load: (/* elementsLeft */ js.UndefOr[Double], /* options */ js.UndefOr[Options]) => Unit = null,
    placeholder: String = null,
    skip_invisible: js.UndefOr[Boolean] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(if (appear != null) js.Any.fromFunction2(appear.asInstanceOf[(/* elementsLeft */ Double, Options) => Unit]) else null)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (data_attribute != null) __obj.updateDynamic("data_attribute")(data_attribute.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(failure_limit)) __obj.updateDynamic("failure_limit")(failure_limit.get.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2(load))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_invisible)) __obj.updateDynamic("skip_invisible")(skip_invisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

