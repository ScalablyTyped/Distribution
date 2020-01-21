package typings.materialComponentsWeb.mod

import typings.materialSlider.adapterMod.MDCSliderAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "slider")
@js.native
object slider extends js.Object {
  @js.native
  class MDCSlider ()
    extends typings.materialSlider.mod.MDCSlider
  
  @js.native
  class MDCSliderFoundation ()
    extends typings.materialSlider.mod.MDCSliderFoundation
  
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    def attachTo(root: Element): typings.materialSlider.mod.MDCSlider = js.native
  }
  
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    val cssClasses: typings.materialSlider.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSliderAdapter = js.native
    val numbers: typings.materialSlider.constantsMod.numbers = js.native
    val strings: typings.materialSlider.constantsMod.strings = js.native
  }
  
}

