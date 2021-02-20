package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGradientOptions extends StObject {
  
  var center: js.UndefOr[js.Any | Point] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var stops: js.UndefOr[js.Any] = js.native
}
object RadialGradientOptions {
  
  @scala.inline
  def apply(): RadialGradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGradientOptions]
  }
  
  @scala.inline
  implicit class RadialGradientOptionsMutableBuilder[Self <: RadialGradientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: js.Any | Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStops(value: js.Any): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
  }
}
