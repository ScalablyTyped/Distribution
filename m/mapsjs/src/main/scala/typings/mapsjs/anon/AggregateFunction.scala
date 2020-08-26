package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateFunction extends js.Object {
  var aggregateFunction: js.UndefOr[
    js.Function3[/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any, Unit]
  ] = js.native
  var data: js.Array[js.Object] = js.native
  var mapUnitsPerPixel: Double = js.native
  var marginPixels: js.UndefOr[Double] = js.native
  var pointKey: String = js.native
  var valueFunction: js.UndefOr[js.Function1[/* row */ js.Any, Double]] = js.native
  def radiusFunction(row: js.Any): Double = js.native
}

object AggregateFunction {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    mapUnitsPerPixel: Double,
    pointKey: String,
    radiusFunction: js.Any => Double
  ): AggregateFunction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], pointKey = pointKey.asInstanceOf[js.Any], radiusFunction = js.Any.fromFunction1(radiusFunction))
    __obj.asInstanceOf[AggregateFunction]
  }
  @scala.inline
  implicit class AggregateFunctionOps[Self <: AggregateFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapUnitsPerPixel(value: Double): Self = this.set("mapUnitsPerPixel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointKey(value: String): Self = this.set("pointKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusFunction(value: js.Any => Double): Self = this.set("radiusFunction", js.Any.fromFunction1(value))
    @scala.inline
    def setAggregateFunction(value: (/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any) => Unit): Self = this.set("aggregateFunction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAggregateFunction: Self = this.set("aggregateFunction", js.undefined)
    @scala.inline
    def setMarginPixels(value: Double): Self = this.set("marginPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginPixels: Self = this.set("marginPixels", js.undefined)
    @scala.inline
    def setValueFunction(value: /* row */ js.Any => Double): Self = this.set("valueFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValueFunction: Self = this.set("valueFunction", js.undefined)
  }
  
}

