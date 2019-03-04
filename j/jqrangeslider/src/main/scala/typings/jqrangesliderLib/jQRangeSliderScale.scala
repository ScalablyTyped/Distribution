package typings
package jqrangesliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jQRangeSliderScale extends js.Object {
  var first: js.UndefOr[js.Function2[/* min */ scala.Double, /* max */ scala.Double, scala.Double]] = js.undefined
   // 'true' to stop scale generating ticks from a given value
  var format: js.UndefOr[
    js.Function3[
      /* tickContainer */ js.Any, 
      /* tickStartValue */ js.Any, 
      /* tickEndValue */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
   // compute the next value.
  var label: js.UndefOr[js.Function2[/* value */ js.Any, /* nextValue */ js.Any, java.lang.String]] = js.undefined
   // compute displayed text for a given internal
  var stop: js.UndefOr[js.Function1[/* value */ js.Any, scala.Boolean]] = js.undefined
   // compute the ruler first value.
  def next(value: js.Any): js.Any
}

object jQRangeSliderScale {
  @scala.inline
  def apply(
    next: js.Function1[js.Any, js.Any],
    first: js.Function2[/* min */ scala.Double, /* max */ scala.Double, scala.Double] = null,
    format: js.Function3[
      /* tickContainer */ js.Any, 
      /* tickStartValue */ js.Any, 
      /* tickEndValue */ js.Any, 
      scala.Unit
    ] = null,
    label: js.Function2[/* value */ js.Any, /* nextValue */ js.Any, java.lang.String] = null,
    stop: js.Function1[/* value */ js.Any, scala.Boolean] = null
  ): jQRangeSliderScale = {
    val __obj = js.Dynamic.literal(next = next)
    if (first != null) __obj.updateDynamic("first")(first)
    if (format != null) __obj.updateDynamic("format")(format)
    if (label != null) __obj.updateDynamic("label")(label)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[jQRangeSliderScale]
  }
}

