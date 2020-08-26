package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgChartLegend
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * This is the total height of the grid, including all UI elements - scroll container with data rows, header, footer, filter row -  (if any), etc.null will stretch vertically to fit data, no other height are defined
    *
    *
    * Valid values:
    * "null"
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Type of the legend.
    *
    * Valid values:
    * "item" Specify the legend as item legend. It displays a legend item for each pie in the igPieChart control.
    * "legend" Specify the legend as legend. It is supported by all types of series in the igDataChart control.
    */
  var `type`: js.UndefOr[String] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object IgChartLegend {
  @scala.inline
  def apply(): IgChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgChartLegend]
  }
  @scala.inline
  implicit class IgChartLegendOps[Self <: IgChartLegend] (val x: Self) extends AnyVal {
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
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

