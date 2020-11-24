package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates a chart&#39;s specifications. (This does not move or resize a
  * chart. To move or resize a chart, use UpdateEmbeddedObjectPositionRequest.)
  */
@js.native
trait SchemaUpdateChartSpecRequest extends js.Object {
  
  /**
    * The ID of the chart to update.
    */
  var chartId: js.UndefOr[Double] = js.native
  
  /**
    * The specification to apply to the chart.
    */
  var spec: js.UndefOr[SchemaChartSpec] = js.native
}
object SchemaUpdateChartSpecRequest {
  
  @scala.inline
  def apply(): SchemaUpdateChartSpecRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateChartSpecRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateChartSpecRequestOps[Self <: SchemaUpdateChartSpecRequest] (val x: Self) extends AnyVal {
    
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
    def setSpec(value: SchemaChartSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
  }
}
