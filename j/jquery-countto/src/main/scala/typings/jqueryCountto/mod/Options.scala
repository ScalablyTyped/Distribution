package typings.jqueryCountto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  from  :number,   to  :number,   speed  :number,   refreshInterval  :number,   decimals  :number, formatter (value : number, options : jquery-countto.jquery-countto.Options): string, onUpdate (value : number): void, onComplete (value : number): void}> */
trait Options extends js.Object {
  var decimals: js.UndefOr[Double] = js.undefined
  var formatter: js.UndefOr[js.Function2[/* value */ Double, /* options */ this.type, String]] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var refreshInterval: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    decimals: js.UndefOr[Double] = js.undefined,
    formatter: (/* value */ Double, Options) => String = null,
    from: js.UndefOr[Double] = js.undefined,
    onComplete: /* value */ Double => Unit = null,
    onUpdate: /* value */ Double => Unit = null,
    refreshInterval: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decimals)) __obj.updateDynamic("decimals")(decimals.get.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction2(formatter))
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (!js.isUndefined(refreshInterval)) __obj.updateDynamic("refreshInterval")(refreshInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

