package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of adding a chart to a spreadsheet.
  */
trait SchemaAddChartResponse extends StObject {
  
  /**
    * The newly added chart.
    */
  var chart: js.UndefOr[SchemaEmbeddedChart] = js.undefined
}
object SchemaAddChartResponse {
  
  @scala.inline
  def apply(): SchemaAddChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddChartResponse]
  }
  
  @scala.inline
  implicit class SchemaAddChartResponseMutableBuilder[Self <: SchemaAddChartResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: SchemaEmbeddedChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
  }
}
