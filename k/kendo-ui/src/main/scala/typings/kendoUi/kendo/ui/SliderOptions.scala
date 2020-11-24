package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderOptions extends js.Object {
  
  var change: js.UndefOr[js.Function1[/* e */ SliderChangeEvent, Unit]] = js.native
  
  var decreaseButtonTitle: js.UndefOr[String] = js.native
  
  var dragHandleTitle: js.UndefOr[String] = js.native
  
  var increaseButtonTitle: js.UndefOr[String] = js.native
  
  var largeStep: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var showButtons: js.UndefOr[Boolean] = js.native
  
  var slide: js.UndefOr[js.Function1[/* e */ SliderSlideEvent, Unit]] = js.native
  
  var smallStep: js.UndefOr[Double] = js.native
  
  var tickPlacement: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[SliderTooltip] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object SliderOptions {
  
  @scala.inline
  def apply(): SliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOptions]
  }
  
  @scala.inline
  implicit class SliderOptionsOps[Self <: SliderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChange(value: /* e */ SliderChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setDecreaseButtonTitle(value: String): Self = this.set("decreaseButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecreaseButtonTitle: Self = this.set("decreaseButtonTitle", js.undefined)
    
    @scala.inline
    def setDragHandleTitle(value: String): Self = this.set("dragHandleTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragHandleTitle: Self = this.set("dragHandleTitle", js.undefined)
    
    @scala.inline
    def setIncreaseButtonTitle(value: String): Self = this.set("increaseButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncreaseButtonTitle: Self = this.set("increaseButtonTitle", js.undefined)
    
    @scala.inline
    def setLargeStep(value: Double): Self = this.set("largeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeStep: Self = this.set("largeStep", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setShowButtons(value: Boolean): Self = this.set("showButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowButtons: Self = this.set("showButtons", js.undefined)
    
    @scala.inline
    def setSlide(value: /* e */ SliderSlideEvent => Unit): Self = this.set("slide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    
    @scala.inline
    def setSmallStep(value: Double): Self = this.set("smallStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallStep: Self = this.set("smallStep", js.undefined)
    
    @scala.inline
    def setTickPlacement(value: String): Self = this.set("tickPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickPlacement: Self = this.set("tickPlacement", js.undefined)
    
    @scala.inline
    def setTooltip(value: SliderTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
