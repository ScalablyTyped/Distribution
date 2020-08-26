package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLabelsFilterOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) The operator to compare by. Can be one of
    * `>`, `<`, `>=`, `<=`, `==`, and `===`.
    */
  var operator: js.UndefOr[OptionsOperatorValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The point property to filter by. Point
    * options are passed directly to properties, additionally there are `y`
    * value, `percentage` and others listed under Highcharts.Point members.
    */
  var property: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The value to compare against.
    */
  var value: js.UndefOr[Double] = js.native
}

object DataLabelsFilterOptionsObject {
  @scala.inline
  def apply(): DataLabelsFilterOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabelsFilterOptionsObject]
  }
  @scala.inline
  implicit class DataLabelsFilterOptionsObjectOps[Self <: DataLabelsFilterOptionsObject] (val x: Self) extends AnyVal {
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
    def setOperator(value: OptionsOperatorValue): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

