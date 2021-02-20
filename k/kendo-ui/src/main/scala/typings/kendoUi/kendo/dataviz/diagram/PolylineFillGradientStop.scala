package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineFillGradientStop extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
}
object PolylineFillGradientStop {
  
  @scala.inline
  def apply(): PolylineFillGradientStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineFillGradientStop]
  }
  
  @scala.inline
  implicit class PolylineFillGradientStopMutableBuilder[Self <: PolylineFillGradientStop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
