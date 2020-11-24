package typings.materialSlider

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSlider.adapterMod.MDCSliderAdapter
import typings.materialSlider.anon.PartialMDCSliderAdapter
import typings.materialSlider.anon.SkipUpdateUI
import typings.materialSlider.typesMod.Thumb
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/slider/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCSliderFoundation () extends MDCFoundation[MDCSliderAdapter] {
    def this(adapter: PartialMDCSliderAdapter) = this()
    
    def getBigStep(): Double = js.native
    
    def getDisabled(): Boolean = js.native
    
    /** @return Whether the slider is a range slider. */
    def getIsRange(): Boolean = js.native
    
    def getMax(): Double = js.native
    
    def getMin(): Double = js.native
    
    def getStep(): Double = js.native
    
    /**
      * - For single point sliders, returns the thumb value.
      * - For range (two-thumb) sliders, returns the end thumb's value.
      */
    def getValue(): Double = js.native
    
    /**
      * Only applicable for range sliders.
      * @return The start thumb's value.
      */
    def getValueStart(): Double = js.native
    
    def handleDown(event: MouseEvent): Unit = js.native
    /**
      * Handles pointer down events on the slider root element.
      */
    def handleDown(event: PointerEvent): Unit = js.native
    def handleDown(event: TouchEvent): Unit = js.native
    
    def handleMousedownOrTouchstart(event: MouseEvent): Unit = js.native
    def handleMousedownOrTouchstart(event: TouchEvent): Unit = js.native
    
    def handleMove(event: MouseEvent): Unit = js.native
    /**
      * Handles pointer move events on the slider root element.
      */
    def handleMove(event: PointerEvent): Unit = js.native
    def handleMove(event: TouchEvent): Unit = js.native
    
    def handlePointerdown(event: PointerEvent): Unit = js.native
    
    /** Handles resize events on the window. */
    def handleResize(): Unit = js.native
    
    /**
      * Hides the value indicator, as follows:
      * - Range slider: Hides value indicator on both thumbs, on either blur
      *   or mouseleave, provided there is no thumb already focused.
      * - Single point slider: Hides value indicator on thumb, on blur.
      */
    def handleThumbBlurOrMouseleave(event: FocusEvent): Unit = js.native
    def handleThumbBlurOrMouseleave(event: MouseEvent): Unit = js.native
    
    /**
      * Shows the value indicator, as follows:
      * - Range slider: Shows value indicator on both thumbs, on either hover or
      *   focus.
      * - Single point slider: Shows value indicator on thumb, only on focus.
      */
    def handleThumbFocusOrMouseenter(event: FocusEvent): Unit = js.native
    def handleThumbFocusOrMouseenter(event: MouseEvent): Unit = js.native
    
    /**
      * Handles keydown events on the slider thumbs.
      */
    def handleThumbKeydown(event: KeyboardEvent, thumb: Thumb): Unit = js.native
    
    /**
      * Handles pointer up events on the slider root element.
      */
    def handleUp(): Unit = js.native
    
    /**
      * - Syncs slider boundingClientRect with the current DOM.
      * - Updates UI based on internal state.
      */
    def layout(): Unit = js.native
    def layout(hasSkipUpdateUI: SkipUpdateUI): Unit = js.native
    
    /**
      * Sets disabled state, including updating styles and thumb tabindex.
      */
    def setDisabled(disabled: Boolean): Unit = js.native
    
    /**
      * - For single point sliders, sets the thumb value.
      * - For range (two-thumb) sliders, sets the end thumb's value.
      */
    def setValue(value: Double): Unit = js.native
    
    /**
      * Only applicable for range sliders. Sets the start thumb's value.
      */
    def setValueStart(valueStart: Double): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    
    var SUPPORTS_POINTER_EVENTS: Boolean = js.native
    
    def defaultAdapter: MDCSliderAdapter = js.native
  }
}
