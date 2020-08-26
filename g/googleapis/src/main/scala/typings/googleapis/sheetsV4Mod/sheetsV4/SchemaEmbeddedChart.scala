package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A chart embedded in a sheet.
  */
@js.native
trait SchemaEmbeddedChart extends js.Object {
  /**
    * The ID of the chart.
    */
  var chartId: js.UndefOr[Double] = js.native
  /**
    * The position of the chart.
    */
  var position: js.UndefOr[SchemaEmbeddedObjectPosition] = js.native
  /**
    * The specification of the chart.
    */
  var spec: js.UndefOr[SchemaChartSpec] = js.native
}

object SchemaEmbeddedChart {
  @scala.inline
  def apply(): SchemaEmbeddedChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedChart]
  }
  @scala.inline
  implicit class SchemaEmbeddedChartOps[Self <: SchemaEmbeddedChart] (val x: Self) extends AnyVal {
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
    def setChartId(value: Double): Self = this.set("chartId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartId: Self = this.set("chartId", js.undefined)
    @scala.inline
    def setPosition(value: SchemaEmbeddedObjectPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSpec(value: SchemaChartSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
  }
  
}

