package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeFillGradientStop extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
}
object DiagramShapeFillGradientStop {
  
  @scala.inline
  def apply(): DiagramShapeFillGradientStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeFillGradientStop]
  }
  
  @scala.inline
  implicit class DiagramShapeFillGradientStopMutableBuilder[Self <: DiagramShapeFillGradientStop] (val x: Self) extends AnyVal {
    
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
