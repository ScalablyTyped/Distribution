package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgHierarchicalGridScrollSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Sets gets the modifier for how long the inertia last on touch devices.
    *
    */
  var inertiaDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets the modifier for how much the inertia scrolls on touch devices. Note: Value set to 0 would disable touch movements. Value set to -1 would invert them.
    *
    */
  var inertiaStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets current horizontal position.
    *
    */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets current vertical position.
    *
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets if smoother scrolling with small intertia should be used when using the mouse wheel.
    *
    */
  var smoothing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets or gets the modifier for how long the scroll ‘animation’ lasts when using the mouse wheel once. This is used only for the [smooth scrolling behavior](ui.ighierarchicalgrid#options:scrollSettings.smoothing).
    *
    */
  var smoothingDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets or gets the modifier for how many pixels will be scrolled when using the mouse wheel once. This is used only for the [smooth scrolling behavior](ui.ighierarchicalgrid#options:scrollSettings.smoothing).
    *
    */
  var smoothingStep: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets gets the step of the default scrolling behavior when using the mouse wheel.
    *
    */
  var wheelStep: js.UndefOr[Double] = js.undefined
}
object IgHierarchicalGridScrollSettings {
  
  @scala.inline
  def apply(): IgHierarchicalGridScrollSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGridScrollSettings]
  }
  
  @scala.inline
  implicit class IgHierarchicalGridScrollSettingsMutableBuilder[Self <: IgHierarchicalGridScrollSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInertiaDuration(value: Double): Self = StObject.set(x, "inertiaDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInertiaDurationUndefined: Self = StObject.set(x, "inertiaDuration", js.undefined)
    
    @scala.inline
    def setInertiaStep(value: Double): Self = StObject.set(x, "inertiaStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInertiaStepUndefined: Self = StObject.set(x, "inertiaStep", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
    
    @scala.inline
    def setSmoothing(value: Boolean): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothingDuration(value: Double): Self = StObject.set(x, "smoothingDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothingDurationUndefined: Self = StObject.set(x, "smoothingDuration", js.undefined)
    
    @scala.inline
    def setSmoothingStep(value: Double): Self = StObject.set(x, "smoothingStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothingStepUndefined: Self = StObject.set(x, "smoothingStep", js.undefined)
    
    @scala.inline
    def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
    
    @scala.inline
    def setWheelStep(value: Double): Self = StObject.set(x, "wheelStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelStepUndefined: Self = StObject.set(x, "wheelStep", js.undefined)
  }
}
