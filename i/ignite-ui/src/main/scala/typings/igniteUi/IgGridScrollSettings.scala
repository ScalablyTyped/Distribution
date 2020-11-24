package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridScrollSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Sets gets the modifier for how long the inertia last on touch devices.
    *
    */
  var inertiaDuration: js.UndefOr[Double] = js.native
  
  /**
    * Sets gets the modifier for how much the inertia scrolls on touch devices. Note: Value set to 0 would disable touch movements. Value set to -1 would invert them.
    *
    */
  var inertiaStep: js.UndefOr[Double] = js.native
  
  /**
    * Sets gets current horizontal position.
    *
    */
  var scrollLeft: js.UndefOr[Double] = js.native
  
  /**
    * Sets gets current vertical position.
    *
    */
  var scrollTop: js.UndefOr[Double] = js.native
  
  /**
    * Sets gets if smoother scrolling with small intertia should be used when using the mouse wheel.
    *
    */
  var smoothing: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets or gets the modifier for how long the scroll ‘animation’ lasts when using the mouse wheel once. This is used only for the [smooth scrolling behavior](ui.iggrid#options:scrollSettings.smoothing).
    *
    */
  var smoothingDuration: js.UndefOr[Double] = js.native
  
  /**
    * Sets or gets the modifier for how many pixels will be scrolled when using the mouse wheel once. This is used only for the [smooth scrolling behavior](ui.iggrid#options:scrollSettings.smoothing).
    *
    */
  var smoothingStep: js.UndefOr[Double] = js.native
  
  /**
    * Sets gets the step of the default scrolling behavior when using the mouse wheel.
    *
    */
  var wheelStep: js.UndefOr[Double] = js.native
}
object IgGridScrollSettings {
  
  @scala.inline
  def apply(): IgGridScrollSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridScrollSettings]
  }
  
  @scala.inline
  implicit class IgGridScrollSettingsOps[Self <: IgGridScrollSettings] (val x: Self) extends AnyVal {
    
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
    def setInertiaDuration(value: Double): Self = this.set("inertiaDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInertiaDuration: Self = this.set("inertiaDuration", js.undefined)
    
    @scala.inline
    def setInertiaStep(value: Double): Self = this.set("inertiaStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInertiaStep: Self = this.set("inertiaStep", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollLeft: Self = this.set("scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    
    @scala.inline
    def setSmoothing(value: Boolean): Self = this.set("smoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothing: Self = this.set("smoothing", js.undefined)
    
    @scala.inline
    def setSmoothingDuration(value: Double): Self = this.set("smoothingDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothingDuration: Self = this.set("smoothingDuration", js.undefined)
    
    @scala.inline
    def setSmoothingStep(value: Double): Self = this.set("smoothingStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmoothingStep: Self = this.set("smoothingStep", js.undefined)
    
    @scala.inline
    def setWheelStep(value: Double): Self = this.set("wheelStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelStep: Self = this.set("wheelStep", js.undefined)
  }
}
