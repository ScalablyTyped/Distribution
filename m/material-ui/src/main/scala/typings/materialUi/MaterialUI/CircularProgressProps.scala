package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.determinate
import typings.materialUi.materialUiStrings.indeterminate
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircularProgressProps extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var innerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[determinate | indeterminate] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object CircularProgressProps {
  
  @scala.inline
  def apply(): CircularProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircularProgressProps]
  }
  
  @scala.inline
  implicit class CircularProgressPropsMutableBuilder[Self <: CircularProgressProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setInnerStyle(value: CSSProperties): Self = StObject.set(x, "innerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerStyleUndefined: Self = StObject.set(x, "innerStyle", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMode(value: determinate | indeterminate): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
