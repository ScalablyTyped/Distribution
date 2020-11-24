package typings.materialSlider

import typings.materialBase.componentMod.MDCComponent
import typings.materialSlider.anon.SkipInitialUIUpdate
import typings.materialSlider.foundationMod.MDCSliderFoundation
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/slider/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCSlider () extends MDCComponent[MDCSliderFoundation] {
    
    /** @return Slider disabled state. */
    def getDisabled(): Boolean = js.native
    
    def getValue(): Double = js.native
    
    def getValueStart(): Double = js.native
    
    /**
      * Initializes component, with the following options:
      * - `skipInitialUIUpdate`: Whether to skip updating the UI when initially
      *   syncing with the DOM. This should be enabled when the slider position
      *   is set before component initialization.
      */
    def initialize(): Unit = js.native
    def initialize(hasSkipInitialUIUpdate: SkipInitialUIUpdate): Unit = js.native
    
    /** Redraws UI based on DOM (e.g. element dimensions, RTL). */
    def layout(): Unit = js.native
    
    @JSName("root")
    var root_MDCSlider: HTMLElement = js.native
    
    /** Sets slider disabled state. */
    def setDisabled(disabled: Boolean): Unit = js.native
    
    def setValue(value: Double): Unit = js.native
    
    def setValueStart(valueStart: Double): Unit = js.native
    
    /**
      * Sets a function that maps the slider value to the value of the
      * `aria-valuetext` attribute on the thumb element.
      */
    def setValueToAriaValueTextFn(): Unit = js.native
    def setValueToAriaValueTextFn(mapFn: js.Function1[/* value */ Double, String]): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    
    def attachTo(root: Element): MDCSlider = js.native
    def attachTo(root: Element, options: SkipInitialUIUpdate): MDCSlider = js.native
  }
}
