package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypicalBasedOnEventUIParam extends StObject {
  
  /**
    * Used to specify which columns changing will invalidate the series and cause it to be recalculated.
    */
  var basedOn: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get the number of positions that should be calculated from the start.
    */
  var count: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get the data to use for the calculation.
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get the beginning position that should be calculated from.
    */
  var position: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to get the supporting calculations to use in the calculation.
    */
  var supportingCalculations: js.UndefOr[js.Any] = js.undefined
}
object TypicalBasedOnEventUIParam {
  
  @scala.inline
  def apply(): TypicalBasedOnEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypicalBasedOnEventUIParam]
  }
  
  @scala.inline
  implicit class TypicalBasedOnEventUIParamMutableBuilder[Self <: TypicalBasedOnEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasedOn(value: js.Any): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setChart(value: js.Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    @scala.inline
    def setCount(value: js.Any): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSupportingCalculations(value: js.Any): Self = StObject.set(x, "supportingCalculations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingCalculationsUndefined: Self = StObject.set(x, "supportingCalculations", js.undefined)
  }
}
