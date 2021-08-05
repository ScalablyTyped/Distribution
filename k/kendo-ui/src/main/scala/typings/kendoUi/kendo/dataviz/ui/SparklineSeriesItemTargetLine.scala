package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesItemTargetLine extends StObject {
  
  var width: js.UndefOr[js.Any | js.Function] = js.undefined
}
object SparklineSeriesItemTargetLine {
  
  inline def apply(): SparklineSeriesItemTargetLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemTargetLine]
  }
  
  extension [Self <: SparklineSeriesItemTargetLine](x: Self) {
    
    inline def setWidth(value: js.Any | js.Function): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
