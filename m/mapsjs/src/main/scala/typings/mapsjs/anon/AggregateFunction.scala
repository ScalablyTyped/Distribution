package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateFunction extends js.Object {
  var aggregateFunction: js.UndefOr[
    js.Function3[/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any, Unit]
  ] = js.undefined
  var data: js.Array[js.Object]
  var mapUnitsPerPixel: Double
  var marginPixels: js.UndefOr[Double] = js.undefined
  var pointKey: String
  var valueFunction: js.UndefOr[js.Function1[/* row */ js.Any, Double]] = js.undefined
  def radiusFunction(row: js.Any): Double
}

object AggregateFunction {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    mapUnitsPerPixel: Double,
    pointKey: String,
    radiusFunction: js.Any => Double,
    aggregateFunction: (/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any) => Unit = null,
    marginPixels: js.UndefOr[Double] = js.undefined,
    valueFunction: /* row */ js.Any => Double = null
  ): AggregateFunction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], pointKey = pointKey.asInstanceOf[js.Any], radiusFunction = js.Any.fromFunction1(radiusFunction))
    if (aggregateFunction != null) __obj.updateDynamic("aggregateFunction")(js.Any.fromFunction3(aggregateFunction))
    if (!js.isUndefined(marginPixels)) __obj.updateDynamic("marginPixels")(marginPixels.get.asInstanceOf[js.Any])
    if (valueFunction != null) __obj.updateDynamic("valueFunction")(js.Any.fromFunction1(valueFunction))
    __obj.asInstanceOf[AggregateFunction]
  }
}

