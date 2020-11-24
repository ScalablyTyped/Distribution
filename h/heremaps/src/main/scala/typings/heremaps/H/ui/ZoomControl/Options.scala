package typings.heremaps.H.ui.ZoomControl

import typings.heremaps.H.ui.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @property zoomSpeed {number=} - the speed if zooming in and out in levels per millisecond, defaults to 0.05
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, defaults to H.ui.LayoutAlignment.RIGHT_MIDDLE
  * @property slider {boolean=} - flag whether to show the slider (true) or not, defaults to false
  * @property sliderSnaps {boolean=} - flag whether slider should snap to the integer values or not, defaults to false. This option has effect only if slider is enabled.
  */
@js.native
trait Options extends js.Object {
  
  var alignment: js.UndefOr[LayoutAlignment] = js.native
  
  var slider: js.UndefOr[Boolean] = js.native
  
  var sliderSnaps: js.UndefOr[Boolean] = js.native
  
  var zoomSpeed: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: LayoutAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setSlider(value: Boolean): Self = this.set("slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlider: Self = this.set("slider", js.undefined)
    
    @scala.inline
    def setSliderSnaps(value: Boolean): Self = this.set("sliderSnaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliderSnaps: Self = this.set("sliderSnaps", js.undefined)
    
    @scala.inline
    def setZoomSpeed(value: Double): Self = this.set("zoomSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomSpeed: Self = this.set("zoomSpeed", js.undefined)
  }
}
