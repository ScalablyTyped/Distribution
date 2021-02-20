package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparklineSeriesLeaveEventSeries extends StObject {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SparklineSeriesLeaveEventSeries {
  
  @scala.inline
  def apply(): SparklineSeriesLeaveEventSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesLeaveEventSeries]
  }
  
  @scala.inline
  implicit class SparklineSeriesLeaveEventSeriesMutableBuilder[Self <: SparklineSeriesLeaveEventSeries] (val x: Self) extends AnyVal {
    
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
