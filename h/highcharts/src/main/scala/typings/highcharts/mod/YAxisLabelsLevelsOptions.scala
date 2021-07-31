package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YAxisLabelsLevelsOptions extends StObject {
  
  /**
    * (Gantt) Specify the level which the options within this object applies
    * to.
    */
  var level: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSObject] = js.undefined
}
object YAxisLabelsLevelsOptions {
  
  @scala.inline
  def apply(): YAxisLabelsLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisLabelsLevelsOptions]
  }
  
  @scala.inline
  implicit class YAxisLabelsLevelsOptionsMutableBuilder[Self <: YAxisLabelsLevelsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
