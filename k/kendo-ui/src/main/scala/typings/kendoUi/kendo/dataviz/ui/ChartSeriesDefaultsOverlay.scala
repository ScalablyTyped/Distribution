package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeriesDefaultsOverlay extends StObject {
  
  var gradient: js.UndefOr[String] = js.native
}
object ChartSeriesDefaultsOverlay {
  
  @scala.inline
  def apply(): ChartSeriesDefaultsOverlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesDefaultsOverlay]
  }
  
  @scala.inline
  implicit class ChartSeriesDefaultsOverlayMutableBuilder[Self <: ChartSeriesDefaultsOverlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGradient(value: String): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
  }
}
