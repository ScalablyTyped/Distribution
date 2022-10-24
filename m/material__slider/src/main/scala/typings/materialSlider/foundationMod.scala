package typings.materialSlider

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSlider.adapterMod.MDCSliderAdapter
import typings.materialSlider.anon.PartialMDCSliderAdapter
import typings.materialSlider.anon.SkipUpdateUI
import typings.materialSlider.typesMod.Thumb
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/slider/foundation", "MDCSliderFoundation")
  @js.native
  open class MDCSliderFoundation () extends MDCFoundation[MDCSliderAdapter] {
    def this(adapter: PartialMDCSliderAdapter) = this()
    
    /**
      * Shifts the value indicator to either side if it would otherwise stick
      * beyond the slider's length while keeping the caret above the knob.
      */
    /* private */ var alignValueIndicator: Any = js.native
    
    /* private */ val animFrame: Any = js.native
    
    /**
      * Clamps the given value for the given thumb based on slider properties:
      * - Restricts value within [min, max].
      * - If range slider, clamp start value <= end value - min range, and
      *   end value >= start value + min range.
      */
    /* private */ var clampValue: Any = js.native
    
    /**
      * Converts attribute value to a number, e.g. '100' => 100. Throws errors
      * for invalid values.
      * @param attributeValue Attribute value, e.g. 100.
      * @param attributeName Attribute name, e.g. `aria-valuemax`.
      */
    /* private */ var convertAttributeValueToNumber: Any = js.native
    
    /* private */ var deregisterEventHandlers: Any = js.native
    
    /* private */ var downEventClientX: Any = js.native
    
    /* private */ var endThumbKnobWidth: Any = js.native
    
    def getDisabled(): Boolean = js.native
    
    /** @return Whether the slider is a range slider. */
    def getIsRange(): Boolean = js.native
    
    def getMax(): Double = js.native
    
    def getMin(): Double = js.native
    
    def getMinRange(): Double = js.native
    
    def getStep(): Double = js.native
    
    /**
      * @return The thumb to be moved based on initial down event.
      */
    /* private */ var getThumbFromDownEvent: Any = js.native
    
    /**
      * @return The thumb to be moved based on move event (based on drag
      *     direction from original down event). Only applicable if thumbs
      *     were overlapping in the down event.
      */
    /* private */ var getThumbFromMoveEvent: Any = js.native
    
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
    
    /**
      * Emits custom dragStart event, along with focusing the underlying input.
      */
    /* private */ var handleDragStart: Any = js.native
    
    /** Removes activated state and value indicator from thumb(s). */
    def handleInputBlur(thumb: Thumb): Unit = js.native
    
    /**
      * Handles input `change` event by setting internal slider value to match
      * input's new value.
      */
    def handleInputChange(thumb: Thumb): Unit = js.native
    
    /** Shows activated state and value indicator on thumb(s). */
    def handleInputFocus(thumb: Thumb): Unit = js.native
    
    def handleMousedownOrTouchstart(event: MouseEvent): Unit = js.native
    def handleMousedownOrTouchstart(event: TouchEvent): Unit = js.native
    
    def handleMove(event: MouseEvent): Unit = js.native
    /**
      * Handles pointer move events on the slider root element.
      */
    def handleMove(event: PointerEvent): Unit = js.native
    def handleMove(event: TouchEvent): Unit = js.native
    
    def handlePointerdown(event: PointerEvent): Unit = js.native
    
    /* private */ var handlePointerup: Any = js.native
    
    /** Handles resize events on the window. */
    def handleResize(): Unit = js.native
    
    /**
      * For range, discrete slider, shows the value indicator on both thumbs.
      */
    def handleThumbMouseenter(): Unit = js.native
    
    /**
      * For range, discrete slider, hides the value indicator on both thumbs.
      */
    def handleThumbMouseleave(): Unit = js.native
    
    /**
      * Handles pointer up events on the slider root element.
      */
    def handleUp(): Unit = js.native
    
    /* private */ var hasTickMarks: Any = js.native
    
    /* private */ var initialStylesRemoved: Any = js.native
    
    /* private */ var inputEndBlurListener: Any = js.native
    
    /* private */ var inputEndChangeListener: Any = js.native
    
    /* private */ var inputEndFocusListener: Any = js.native
    
    /* private */ var inputStartBlurListener: Any = js.native
    
    /* private */ var inputStartChangeListener: Any = js.native
    
    /* private */ var inputStartFocusListener: Any = js.native
    
    /* private */ var isDisabled: Any = js.native
    
    /* private */ var isDiscrete: Any = js.native
    
    /* private */ var isRange: Any = js.native
    
    /**
      * - Syncs slider boundingClientRect with the current DOM.
      * - Updates UI based on internal state.
      */
    def layout(): Unit = js.native
    def layout(param0: SkipUpdateUI): Unit = js.native
    
    /** Maps clientX to a value on the slider scale. */
    /* private */ var mapClientXOnSliderScale: Any = js.native
    
    /* private */ var max: Any = js.native
    
    /* private */ var min: Any = js.native
    
    /* private */ var minRange: Any = js.native
    
    /* private */ var mousedownOrTouchstartListener: Any = js.native
    
    /* private */ var moveListener: Any = js.native
    
    /* private */ var numDecimalPlaces: Any = js.native
    
    /* private */ var pointerdownListener: Any = js.native
    
    /* private */ var pointerupListener: Any = js.native
    
    /** Calculates the quantized value based on step value. */
    /* private */ var quantize: Any = js.native
    
    /* private */ var rect: Any = js.native
    
    /* private */ var registerEventHandlers: Any = js.native
    
    /**
      * Removes initial inline styles if not already removed. `left:<...>%`
      * inline styles can be added to position the thumb correctly before JS
      * initialization. However, they need to be removed before the JS starts
      * positioning the thumb. This is because the JS uses
      * `transform:translateX(<...>)px` (for performance reasons) to position
      * the thumb (which is not possible for initial styles since we need the
      * bounding rect measurements).
      */
    /* private */ var removeInitialStyles: Any = js.native
    
    /**
      * Resets track/thumb animation to prevent animation when adding
      * `transform` styles to thumb initially.
      */
    /* private */ var resetTrackAndThumbAnimation: Any = js.native
    
    /* private */ var resizeListener: Any = js.native
    
    /**
      * Sets disabled state, including updating styles and thumb tabindex.
      */
    def setDisabled(disabled: Boolean): Unit = js.native
    
    def setHasTickMarks(value: Boolean): Unit = js.native
    
    def setIsDiscrete(value: Boolean): Unit = js.native
    
    def setMax(value: Double): Unit = js.native
    
    def setMin(value: Double): Unit = js.native
    
    /**
      * Only applicable for range sliders. Sets the minimum difference between the
      * start and end values.
      */
    def setMinRange(value: Double): Unit = js.native
    
    def setStep(value: Double): Unit = js.native
    
    /**
      * - For single point sliders, sets the thumb value.
      * - For range (two-thumb) sliders, sets the end thumb's value.
      */
    def setValue(value: Double): Unit = js.native
    
    /**
      * Only applicable for range sliders. Sets the start thumb's value.
      */
    def setValueStart(valueStart: Double): Unit = js.native
    
    /* private */ var startThumbKnobWidth: Any = js.native
    
    /* private */ var step: Any = js.native
    
    /* private */ var thumb: Any = js.native
    
    /* private */ var thumbMouseenterListener: Any = js.native
    
    /* private */ var thumbMouseleaveListener: Any = js.native
    
    /**
      * Adds THUMB_TOP class to active thumb if thumb knobs overlap; otherwise
      * removes THUMB_TOP class from both thumbs.
      * @param thumb Thumb that is active (being moved).
      */
    /* private */ var updateOverlappingThumbsUI: Any = js.native
    
    /**
      * Updates thumb and input attributes based on current value.
      * @param thumb Thumb whose aria attributes to update.
      */
    /* private */ var updateThumbAndInputAttributes: Any = js.native
    
    /**
      * Updates the active track and thumb style properties to reflect current
      * value.
      */
    /* private */ var updateThumbAndTrackUI: Any = js.native
    
    /**
      * Updates tick marks UI within slider, based on current min, max, and step.
      */
    /* private */ var updateTickMarksUI: Any = js.native
    
    /**
      * Updates UI based on internal state.
      * @param thumb Thumb whose value is being updated. If undefined, UI is
      *     updated for both thumbs based on current internal state.
      */
    /* private */ var updateUI: Any = js.native
    
    /**
      * Updates slider value (internal state and UI) based on the given value.
      */
    /* private */ var updateValue: Any = js.native
    
    /**
      * Updates value indicator UI based on current value.
      * @param thumb Thumb whose value indicator to update. If undefined, all
      *     thumbs' value indicators are updated.
      */
    /* private */ var updateValueIndicatorUI: Any = js.native
    
    /** Checks that the given properties are valid slider values. */
    /* private */ var validateProperties: Any = js.native
    
    /* private */ var value: Any = js.native
    
    /* private */ var valueBeforeDownEvent: Any = js.native
    
    /* private */ var valueStart: Any = js.native
    
    /* private */ var valueStartBeforeDownEvent: Any = js.native
  }
  /* static members */
  object MDCSliderFoundation {
    
    @JSImport("@material/slider/foundation", "MDCSliderFoundation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/slider/foundation", "MDCSliderFoundation.SUPPORTS_POINTER_EVENTS")
    @js.native
    def SUPPORTS_POINTER_EVENTS: Boolean = js.native
    inline def SUPPORTS_POINTER_EVENTS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPORTS_POINTER_EVENTS")(x.asInstanceOf[js.Any])
  }
}
