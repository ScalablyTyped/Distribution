package typings.heremaps.H.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the UI controls for zooming in an out of the map.
  */
@js.native
trait ZoomControl extends Control {
  
  /**
    * This method returns the zoom speed (in levels per millisecond) which is applied when the button is pressed constantly.
    * @returns {number} - the current zoom speed
    */
  def getZoomSpeed(): Double = js.native
}
object ZoomControl {
  
  /**
    * @property zoomSpeed {number=} - the speed if zooming in and out in levels per millisecond, defaults to 0.05
    * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, defaults to H.ui.LayoutAlignment.RIGHT_MIDDLE
    * @property slider {boolean=} - flag whether to show the slider (true) or not, defaults to false
    * @property sliderSnaps {boolean=} - flag whether slider should snap to the integer values or not, defaults to false. This option has effect only if slider is enabled.
    */
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: LayoutAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setSlider(value: Boolean): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderSnaps(value: Boolean): Self = StObject.set(x, "sliderSnaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderSnapsUndefined: Self = StObject.set(x, "sliderSnaps", js.undefined)
      
      @scala.inline
      def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      @scala.inline
      def setZoomSpeed(value: Double): Self = StObject.set(x, "zoomSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomSpeedUndefined: Self = StObject.set(x, "zoomSpeed", js.undefined)
    }
  }
}
