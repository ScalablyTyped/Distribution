package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshCompletedEventUIParam extends StObject {
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.undefined
}
object RefreshCompletedEventUIParam {
  
  @scala.inline
  def apply(): RefreshCompletedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshCompletedEventUIParam]
  }
  
  @scala.inline
  implicit class RefreshCompletedEventUIParamMutableBuilder[Self <: RefreshCompletedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: js.Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
  }
}
