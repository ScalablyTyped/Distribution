package typings.jqrangeslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jQRangeSliderScale extends js.Object {
  var first: js.UndefOr[js.Function2[/* min */ Double, /* max */ Double, Double]] = js.undefined
   // 'true' to stop scale generating ticks from a given value
  var format: js.UndefOr[
    js.Function3[
      /* tickContainer */ js.Any, 
      /* tickStartValue */ js.Any, 
      /* tickEndValue */ js.Any, 
      Unit
    ]
  ] = js.undefined
   // compute the next value.
  var label: js.UndefOr[js.Function2[/* value */ js.Any, /* nextValue */ js.Any, String]] = js.undefined
   // compute displayed text for a given internal
  var stop: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.undefined
   // compute the ruler first value.
  def next(value: js.Any): js.Any
}

object jQRangeSliderScale {
  @scala.inline
  def apply(
    next: js.Any => js.Any,
    first: (/* min */ Double, /* max */ Double) => Double = null,
    format: (/* tickContainer */ js.Any, /* tickStartValue */ js.Any, /* tickEndValue */ js.Any) => Unit = null,
    label: (/* value */ js.Any, /* nextValue */ js.Any) => String = null,
    stop: /* value */ js.Any => Boolean = null
  ): jQRangeSliderScale = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction2(first))
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3(format))
    if (label != null) __obj.updateDynamic("label")(js.Any.fromFunction2(label))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[jQRangeSliderScale]
  }
}

