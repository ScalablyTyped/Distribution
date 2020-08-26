package typings.heatmapJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapData[T] extends js.Object {
  /**
    * An array of data points
    */
  var data: js.Array[T] = js.native
  /**
    * Max value of the valueField
    */
  var max: Double = js.native
  /**
    * Min value of the valueField
    */
  var min: Double = js.native
}

object HeatmapData {
  @scala.inline
  def apply[T](data: js.Array[T], max: Double, min: Double): HeatmapData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapData[T]]
  }
  @scala.inline
  implicit class HeatmapDataOps[Self <: HeatmapData[_], T] (val x: Self with HeatmapData[T]) extends AnyVal {
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
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
  }
  
}

