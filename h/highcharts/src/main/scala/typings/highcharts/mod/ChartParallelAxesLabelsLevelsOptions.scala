package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartParallelAxesLabelsLevelsOptions extends StObject {
  
  /**
    * (Gantt) Specify the level which the options within this object applies
    * to.
    */
  var level: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSObject] = js.undefined
}
object ChartParallelAxesLabelsLevelsOptions {
  
  inline def apply(): ChartParallelAxesLabelsLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesLabelsLevelsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartParallelAxesLabelsLevelsOptions] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
