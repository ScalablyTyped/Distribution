package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the SheetsChart.
  */
@js.native
trait SchemaSheetsChartProperties extends js.Object {
  /**
    * The properties of the embedded chart image.
    */
  var chartImageProperties: js.UndefOr[SchemaImageProperties] = js.native
}

object SchemaSheetsChartProperties {
  @scala.inline
  def apply(): SchemaSheetsChartProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheetsChartProperties]
  }
  @scala.inline
  implicit class SchemaSheetsChartPropertiesOps[Self <: SchemaSheetsChartProperties] (val x: Self) extends AnyVal {
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
    def setChartImageProperties(value: SchemaImageProperties): Self = this.set("chartImageProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartImageProperties: Self = this.set("chartImageProperties", js.undefined)
  }
  
}

