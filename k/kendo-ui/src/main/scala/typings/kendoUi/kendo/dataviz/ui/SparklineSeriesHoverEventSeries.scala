package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesHoverEventSeries extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SparklineSeriesHoverEventSeries {
  
  @scala.inline
  def apply(): SparklineSeriesHoverEventSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesHoverEventSeries]
  }
  
  @scala.inline
  implicit class SparklineSeriesHoverEventSeriesMutableBuilder[Self <: SparklineSeriesHoverEventSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
