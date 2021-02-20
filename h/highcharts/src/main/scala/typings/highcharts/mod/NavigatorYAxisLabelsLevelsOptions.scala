package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorYAxisLabelsLevelsOptions extends StObject {
  
  /**
    * (Gantt) Specify the level which the options within this object applies
    * to.
    */
  var level: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSObject] = js.native
}
object NavigatorYAxisLabelsLevelsOptions {
  
  @scala.inline
  def apply(): NavigatorYAxisLabelsLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorYAxisLabelsLevelsOptions]
  }
  
  @scala.inline
  implicit class NavigatorYAxisLabelsLevelsOptionsMutableBuilder[Self <: NavigatorYAxisLabelsLevelsOptions] (val x: Self) extends AnyVal {
    
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
