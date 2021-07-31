package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesItemTargetLine extends StObject {
  
  var width: js.UndefOr[js.Any | js.Function] = js.undefined
}
object SparklineSeriesItemTargetLine {
  
  @scala.inline
  def apply(): SparklineSeriesItemTargetLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemTargetLine]
  }
  
  @scala.inline
  implicit class SparklineSeriesItemTargetLineMutableBuilder[Self <: SparklineSeriesItemTargetLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWidth(value: js.Any | js.Function): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
