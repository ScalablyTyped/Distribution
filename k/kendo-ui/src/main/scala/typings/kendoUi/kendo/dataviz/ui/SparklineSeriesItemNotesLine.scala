package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesItemNotesLine extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object SparklineSeriesItemNotesLine {
  
  @scala.inline
  def apply(): SparklineSeriesItemNotesLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemNotesLine]
  }
  
  @scala.inline
  implicit class SparklineSeriesItemNotesLineMutableBuilder[Self <: SparklineSeriesItemNotesLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
