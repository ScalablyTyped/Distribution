package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddChartRequest extends StObject {
  
  /**
    * The chart that should be added to the spreadsheet, including the position where it should be placed. The chartId field is optional; if one is not set, an id will be randomly generated. (It is an error to specify the ID of an embedded object that already exists.)
    */
  var chart: js.UndefOr[SchemaEmbeddedChart] = js.undefined
}
object SchemaAddChartRequest {
  
  inline def apply(): SchemaAddChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddChartRequest]
  }
  
  extension [Self <: SchemaAddChartRequest](x: Self) {
    
    inline def setChart(value: SchemaEmbeddedChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
  }
}
