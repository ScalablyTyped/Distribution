package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AggRow extends js.Object {
  var aggregateFunction: js.UndefOr[
    js.Function3[/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any, scala.Unit]
  ] = js.undefined
  var data: js.Array[js.Object]
  var mapUnitsPerPixel: scala.Double
  var marginPixels: js.UndefOr[scala.Double] = js.undefined
  var pointKey: java.lang.String
  var valueFunction: js.UndefOr[js.Function1[/* row */ js.Any, scala.Double]] = js.undefined
  def radiusFunction(row: js.Any): scala.Double
}

object Anon_AggRow {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    mapUnitsPerPixel: scala.Double,
    pointKey: java.lang.String,
    radiusFunction: js.Function1[js.Any, scala.Double],
    aggregateFunction: js.Function3[/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any, scala.Unit] = null,
    marginPixels: scala.Int | scala.Double = null,
    valueFunction: js.Function1[/* row */ js.Any, scala.Double] = null
  ): Anon_AggRow = {
    val __obj = js.Dynamic.literal(data = data, mapUnitsPerPixel = mapUnitsPerPixel, pointKey = pointKey, radiusFunction = radiusFunction)
    if (aggregateFunction != null) __obj.updateDynamic("aggregateFunction")(aggregateFunction)
    if (marginPixels != null) __obj.updateDynamic("marginPixels")(marginPixels.asInstanceOf[js.Any])
    if (valueFunction != null) __obj.updateDynamic("valueFunction")(valueFunction)
    __obj.asInstanceOf[Anon_AggRow]
  }
}

