package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A chart embedded in a sheet.
  */
@js.native
trait SchemaEmbeddedChart extends StObject {
  
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
  implicit class SchemaEmbeddedChartMutableBuilder[Self <: SchemaEmbeddedChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    @scala.inline
    def setPosition(value: SchemaEmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSpec(value: SchemaChartSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
