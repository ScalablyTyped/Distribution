package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ SliderChangeEvent, Unit]] = js.undefined
  
  var decreaseButtonTitle: js.UndefOr[String] = js.undefined
  
  var dragHandleTitle: js.UndefOr[String] = js.undefined
  
  var increaseButtonTitle: js.UndefOr[String] = js.undefined
  
  var largeStep: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var showButtons: js.UndefOr[Boolean] = js.undefined
  
  var slide: js.UndefOr[js.Function1[/* e */ SliderSlideEvent, Unit]] = js.undefined
  
  var smallStep: js.UndefOr[Double] = js.undefined
  
  var tickPlacement: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[SliderTooltip] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object SliderOptions {
  
  @scala.inline
  def apply(): SliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOptions]
  }
  
  @scala.inline
  implicit class SliderOptionsMutableBuilder[Self <: SliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ SliderChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setDecreaseButtonTitle(value: String): Self = StObject.set(x, "decreaseButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecreaseButtonTitleUndefined: Self = StObject.set(x, "decreaseButtonTitle", js.undefined)
    
    @scala.inline
    def setDragHandleTitle(value: String): Self = StObject.set(x, "dragHandleTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragHandleTitleUndefined: Self = StObject.set(x, "dragHandleTitle", js.undefined)
    
    @scala.inline
    def setIncreaseButtonTitle(value: String): Self = StObject.set(x, "increaseButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseButtonTitleUndefined: Self = StObject.set(x, "increaseButtonTitle", js.undefined)
    
    @scala.inline
    def setLargeStep(value: Double): Self = StObject.set(x, "largeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeStepUndefined: Self = StObject.set(x, "largeStep", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
    
    @scala.inline
    def setSlide(value: /* e */ SliderSlideEvent => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
    
    @scala.inline
    def setSmallStep(value: Double): Self = StObject.set(x, "smallStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallStepUndefined: Self = StObject.set(x, "smallStep", js.undefined)
    
    @scala.inline
    def setTickPlacement(value: String): Self = StObject.set(x, "tickPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickPlacementUndefined: Self = StObject.set(x, "tickPlacement", js.undefined)
    
    @scala.inline
    def setTooltip(value: SliderTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
