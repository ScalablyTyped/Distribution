package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDataChartLegend
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * The name of the element to turn into a legend.
    */
  var element: js.UndefOr[String] = js.native
  /**
    * The height of the legend.null will stretch vertically to fit data, no other height are defined.
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
  /**
    * The width of the legend.
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgDataChartLegend {
  @scala.inline
  def apply(): IgDataChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDataChartLegend]
  }
  @scala.inline
  implicit class IgDataChartLegendOps[Self <: IgDataChartLegend] (val x: Self) extends AnyVal {
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
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
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

