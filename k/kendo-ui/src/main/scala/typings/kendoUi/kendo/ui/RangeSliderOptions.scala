package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSliderOptions extends js.Object {
  
  var change: js.UndefOr[js.Function1[/* e */ RangeSliderChangeEvent, Unit]] = js.native
  
  var largeStep: js.UndefOr[Double] = js.native
  
  var leftDragHandleTitle: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var rightDragHandleTitle: js.UndefOr[String] = js.native
  
  var selectionEnd: js.UndefOr[Double] = js.native
  
  var selectionStart: js.UndefOr[Double] = js.native
  
  var slide: js.UndefOr[js.Function1[/* e */ RangeSliderSlideEvent, Unit]] = js.native
  
  var smallStep: js.UndefOr[Double] = js.native
  
  var tickPlacement: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[RangeSliderTooltip] = js.native
}
object RangeSliderOptions {
  
  @scala.inline
  def apply(): RangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSliderOptions]
  }
  
  @scala.inline
  implicit class RangeSliderOptionsOps[Self <: RangeSliderOptions] (val x: Self) extends AnyVal {
    
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
    def setChange(value: /* e */ RangeSliderChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setLargeStep(value: Double): Self = this.set("largeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeStep: Self = this.set("largeStep", js.undefined)
    
    @scala.inline
    def setLeftDragHandleTitle(value: String): Self = this.set("leftDragHandleTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftDragHandleTitle: Self = this.set("leftDragHandleTitle", js.undefined)
    
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
    def setRightDragHandleTitle(value: String): Self = this.set("rightDragHandleTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightDragHandleTitle: Self = this.set("rightDragHandleTitle", js.undefined)
    
    @scala.inline
    def setSelectionEnd(value: Double): Self = this.set("selectionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionEnd: Self = this.set("selectionEnd", js.undefined)
    
    @scala.inline
    def setSelectionStart(value: Double): Self = this.set("selectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStart: Self = this.set("selectionStart", js.undefined)
    
    @scala.inline
    def setSlide(value: /* e */ RangeSliderSlideEvent => Unit): Self = this.set("slide", js.Any.fromFunction1(value))
    
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
    def setTooltip(value: RangeSliderTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
