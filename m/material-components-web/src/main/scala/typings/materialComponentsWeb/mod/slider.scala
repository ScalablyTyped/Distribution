package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialSlider.anon.PartialMDCSliderAdapter
import typings.materialSlider.anon.SkipInitialUIUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slider {
  
  @JSImport("material-components-web", "slider.MDCSlider")
  @js.native
  open class MDCSlider protected ()
    extends typings.materialSlider.mod.MDCSlider {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialSlider.foundationMod.MDCSliderFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCSlider {
    
    @JSImport("material-components-web", "slider.MDCSlider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSlider.componentMod.MDCSlider = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSlider.componentMod.MDCSlider]
    inline def attachTo(root: typings.std.Element, options: SkipInitialUIUpdate): typings.materialSlider.componentMod.MDCSlider = (^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.materialSlider.componentMod.MDCSlider]
  }
  
  @JSImport("material-components-web", "slider.MDCSliderFoundation")
  @js.native
  open class MDCSliderFoundation ()
    extends typings.materialSlider.mod.MDCSliderFoundation {
    def this(adapter: PartialMDCSliderAdapter) = this()
  }
  /* static members */
  object MDCSliderFoundation {
    
    @JSImport("material-components-web", "slider.MDCSliderFoundation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.MDCSliderFoundation.SUPPORTS_POINTER_EVENTS")
    @js.native
    def SUPPORTS_POINTER_EVENTS: Boolean = js.native
    inline def SUPPORTS_POINTER_EVENTS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPORTS_POINTER_EVENTS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("material-components-web", "slider.Thumb")
  @js.native
  object Thumb extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialSlider.typesMod.Thumb & Double] = js.native
    
    /* 2 */ val END: typings.materialSlider.typesMod.Thumb.END & Double = js.native
    
    /* 1 */ val START: typings.materialSlider.typesMod.Thumb.START & Double = js.native
  }
  
  @JSImport("material-components-web", "slider.TickMark")
  @js.native
  object TickMark extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialSlider.typesMod.TickMark & Double] = js.native
    
    /* 0 */ val ACTIVE: typings.materialSlider.typesMod.TickMark.ACTIVE & Double = js.native
    
    /* 1 */ val INACTIVE: typings.materialSlider.typesMod.TickMark.INACTIVE & Double = js.native
  }
  
  object attributes {
    
    @JSImport("material-components-web", "slider.attributes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.attributes.ARIA_VALUETEXT")
    @js.native
    def ARIA_VALUETEXT: String = js.native
    inline def ARIA_VALUETEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUETEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.DATA_MIN_RANGE")
    @js.native
    def DATA_MIN_RANGE: String = js.native
    inline def DATA_MIN_RANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_MIN_RANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.INPUT_DISABLED")
    @js.native
    def INPUT_DISABLED: String = js.native
    inline def INPUT_DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.INPUT_MAX")
    @js.native
    def INPUT_MAX: String = js.native
    inline def INPUT_MAX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_MAX")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.INPUT_MIN")
    @js.native
    def INPUT_MIN: String = js.native
    inline def INPUT_MIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_MIN")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.INPUT_STEP")
    @js.native
    def INPUT_STEP: String = js.native
    inline def INPUT_STEP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_STEP")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.INPUT_VALUE")
    @js.native
    def INPUT_VALUE: String = js.native
    inline def INPUT_VALUE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_VALUE")(x.asInstanceOf[js.Any])
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "slider.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    inline def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.DISCRETE")
    @js.native
    def DISCRETE: String = js.native
    inline def DISCRETE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCRETE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.INPUT")
    @js.native
    def INPUT: String = js.native
    inline def INPUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.RANGE")
    @js.native
    def RANGE: String = js.native
    inline def RANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.THUMB")
    @js.native
    def THUMB: String = js.native
    inline def THUMB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.THUMB_FOCUSED")
    @js.native
    def THUMB_FOCUSED: String = js.native
    inline def THUMB_FOCUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB_FOCUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.THUMB_KNOB")
    @js.native
    def THUMB_KNOB: String = js.native
    inline def THUMB_KNOB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB_KNOB")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.THUMB_TOP")
    @js.native
    def THUMB_TOP: String = js.native
    inline def THUMB_TOP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB_TOP")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.THUMB_WITH_INDICATOR")
    @js.native
    def THUMB_WITH_INDICATOR: String = js.native
    inline def THUMB_WITH_INDICATOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB_WITH_INDICATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TICK_MARKS")
    @js.native
    def TICK_MARKS: String = js.native
    inline def TICK_MARKS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARKS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TICK_MARKS_CONTAINER")
    @js.native
    def TICK_MARKS_CONTAINER: String = js.native
    inline def TICK_MARKS_CONTAINER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARKS_CONTAINER")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TICK_MARK_ACTIVE")
    @js.native
    def TICK_MARK_ACTIVE: String = js.native
    inline def TICK_MARK_ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARK_ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TICK_MARK_INACTIVE")
    @js.native
    def TICK_MARK_INACTIVE: String = js.native
    inline def TICK_MARK_INACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARK_INACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TRACK")
    @js.native
    def TRACK: String = js.native
    inline def TRACK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACK")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TRACK_ACTIVE")
    @js.native
    def TRACK_ACTIVE: String = js.native
    inline def TRACK_ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACK_ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.VALUE_INDICATOR_CONTAINER")
    @js.native
    def VALUE_INDICATOR_CONTAINER: String = js.native
    inline def VALUE_INDICATOR_CONTAINER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_INDICATOR_CONTAINER")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.VALUE_INDICATOR_TEXT")
    @js.native
    def VALUE_INDICATOR_TEXT: String = js.native
    inline def VALUE_INDICATOR_TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_INDICATOR_TEXT")(x.asInstanceOf[js.Any])
  }
  
  object events {
    
    @JSImport("material-components-web", "slider.events")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.events.CHANGE")
    @js.native
    def CHANGE: String = js.native
    inline def CHANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.events.INPUT")
    @js.native
    def INPUT: String = js.native
    inline def INPUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "slider.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.numbers.MIN_RANGE")
    @js.native
    def MIN_RANGE: Double = js.native
    inline def MIN_RANGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_RANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.numbers.STEP_SIZE")
    @js.native
    def STEP_SIZE: Double = js.native
    inline def STEP_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STEP_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.numbers.THUMB_UPDATE_MIN_PX")
    @js.native
    def THUMB_UPDATE_MIN_PX: Double = js.native
    inline def THUMB_UPDATE_MIN_PX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB_UPDATE_MIN_PX")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "slider.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.strings.VAR_VALUE_INDICATOR_CARET_LEFT")
    @js.native
    def VAR_VALUE_INDICATOR_CARET_LEFT: String = js.native
    inline def VAR_VALUE_INDICATOR_CARET_LEFT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_VALUE_INDICATOR_CARET_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.strings.VAR_VALUE_INDICATOR_CARET_RIGHT")
    @js.native
    def VAR_VALUE_INDICATOR_CARET_RIGHT: String = js.native
    inline def VAR_VALUE_INDICATOR_CARET_RIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_VALUE_INDICATOR_CARET_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.strings.VAR_VALUE_INDICATOR_CARET_TRANSFORM")
    @js.native
    def VAR_VALUE_INDICATOR_CARET_TRANSFORM: String = js.native
    inline def VAR_VALUE_INDICATOR_CARET_TRANSFORM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_VALUE_INDICATOR_CARET_TRANSFORM")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.strings.VAR_VALUE_INDICATOR_CONTAINER_LEFT")
    @js.native
    def VAR_VALUE_INDICATOR_CONTAINER_LEFT: String = js.native
    inline def VAR_VALUE_INDICATOR_CONTAINER_LEFT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_VALUE_INDICATOR_CONTAINER_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.strings.VAR_VALUE_INDICATOR_CONTAINER_RIGHT")
    @js.native
    def VAR_VALUE_INDICATOR_CONTAINER_RIGHT: String = js.native
    inline def VAR_VALUE_INDICATOR_CONTAINER_RIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_VALUE_INDICATOR_CONTAINER_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.strings.VAR_VALUE_INDICATOR_CONTAINER_TRANSFORM")
    @js.native
    def VAR_VALUE_INDICATOR_CONTAINER_TRANSFORM: String = js.native
    inline def VAR_VALUE_INDICATOR_CONTAINER_TRANSFORM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_VALUE_INDICATOR_CONTAINER_TRANSFORM")(x.asInstanceOf[js.Any])
  }
}
