package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressiveLoadStatusChangedEventUIParam extends StObject {
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get current status.
    */
  var currentStatus: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.native
}
object ProgressiveLoadStatusChangedEventUIParam {
  
  @scala.inline
  def apply(): ProgressiveLoadStatusChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressiveLoadStatusChangedEventUIParam]
  }
  
  @scala.inline
  implicit class ProgressiveLoadStatusChangedEventUIParamMutableBuilder[Self <: ProgressiveLoadStatusChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: js.Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    @scala.inline
    def setCurrentStatus(value: js.Any): Self = StObject.set(x, "currentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStatusUndefined: Self = StObject.set(x, "currentStatus", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}
