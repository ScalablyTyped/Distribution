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
  def apply(chartImageProperties: SchemaImageProperties = null): SchemaSheetsChartProperties = {
    val __obj = js.Dynamic.literal()
    if (chartImageProperties != null) __obj.updateDynamic("chartImageProperties")(chartImageProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSheetsChartProperties]
  }
}

