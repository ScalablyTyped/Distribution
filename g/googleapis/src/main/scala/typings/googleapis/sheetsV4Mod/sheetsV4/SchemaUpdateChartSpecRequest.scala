package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates a chart&#39;s specifications. (This does not move or resize a
  * chart. To move or resize a chart, use UpdateEmbeddedObjectPositionRequest.)
  */
@js.native
trait SchemaUpdateChartSpecRequest extends StObject {
  
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
  implicit class SchemaUpdateChartSpecRequestMutableBuilder[Self <: SchemaUpdateChartSpecRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    @scala.inline
    def setSpec(value: SchemaChartSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
