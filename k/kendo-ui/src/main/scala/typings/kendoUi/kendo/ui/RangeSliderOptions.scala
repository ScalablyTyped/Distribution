package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSliderOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ RangeSliderChangeEvent, Unit]] = js.undefined
  
  var largeStep: js.UndefOr[Double] = js.undefined
  
  var leftDragHandleTitle: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var rightDragHandleTitle: js.UndefOr[String] = js.undefined
  
  var selectionEnd: js.UndefOr[Double] = js.undefined
  
  var selectionStart: js.UndefOr[Double] = js.undefined
  
  var slide: js.UndefOr[js.Function1[/* e */ RangeSliderSlideEvent, Unit]] = js.undefined
  
  var smallStep: js.UndefOr[Double] = js.undefined
  
  var tickPlacement: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[RangeSliderTooltip] = js.undefined
}
object RangeSliderOptions {
  
  inline def apply(): RangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSliderOptions]
  }
  
  extension [Self <: RangeSliderOptions](x: Self) {
    
    inline def setChange(value: /* e */ RangeSliderChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setLargeStep(value: Double): Self = StObject.set(x, "largeStep", value.asInstanceOf[js.Any])
    
    inline def setLargeStepUndefined: Self = StObject.set(x, "largeStep", js.undefined)
    
    inline def setLeftDragHandleTitle(value: String): Self = StObject.set(x, "leftDragHandleTitle", value.asInstanceOf[js.Any])
    
    inline def setLeftDragHandleTitleUndefined: Self = StObject.set(x, "leftDragHandleTitle", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRightDragHandleTitle(value: String): Self = StObject.set(x, "rightDragHandleTitle", value.asInstanceOf[js.Any])
    
    inline def setRightDragHandleTitleUndefined: Self = StObject.set(x, "rightDragHandleTitle", js.undefined)
    
    inline def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
    
    inline def setSelectionEndUndefined: Self = StObject.set(x, "selectionEnd", js.undefined)
    
    inline def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    
    inline def setSelectionStartUndefined: Self = StObject.set(x, "selectionStart", js.undefined)
    
    inline def setSlide(value: /* e */ RangeSliderSlideEvent => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction1(value))
    
    inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
    
    inline def setSmallStep(value: Double): Self = StObject.set(x, "smallStep", value.asInstanceOf[js.Any])
    
    inline def setSmallStepUndefined: Self = StObject.set(x, "smallStep", js.undefined)
    
    inline def setTickPlacement(value: String): Self = StObject.set(x, "tickPlacement", value.asInstanceOf[js.Any])
    
    inline def setTickPlacementUndefined: Self = StObject.set(x, "tickPlacement", js.undefined)
    
    inline def setTooltip(value: RangeSliderTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
