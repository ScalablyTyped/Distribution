package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesCursorMouseMoveEventUIParam extends StObject {
  
  /**
    * Used to get item brush.
    */
  var actualItemBrush: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get series brush.
    */
  var actualSeriesBrush: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get reference to current series item object.
    */
  var item: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get mouse X position.
    */
  var positionX: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get mouse Y position.
    */
  var positionY: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.native
}
object SeriesCursorMouseMoveEventUIParam {
  
  @scala.inline
  def apply(): SeriesCursorMouseMoveEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesCursorMouseMoveEventUIParam]
  }
  
  @scala.inline
  implicit class SeriesCursorMouseMoveEventUIParamMutableBuilder[Self <: SeriesCursorMouseMoveEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualItemBrush(value: js.Any): Self = StObject.set(x, "actualItemBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualItemBrushUndefined: Self = StObject.set(x, "actualItemBrush", js.undefined)
    
    @scala.inline
    def setActualSeriesBrush(value: js.Any): Self = StObject.set(x, "actualSeriesBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualSeriesBrushUndefined: Self = StObject.set(x, "actualSeriesBrush", js.undefined)
    
    @scala.inline
    def setChart(value: js.Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setPositionX(value: js.Any): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
    
    @scala.inline
    def setPositionY(value: js.Any): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}
