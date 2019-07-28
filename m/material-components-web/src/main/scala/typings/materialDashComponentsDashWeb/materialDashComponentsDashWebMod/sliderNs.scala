package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialSlider.adapterMod.MDCSliderAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "slider")
@js.native
object sliderNs extends js.Object {
  @js.native
  class MDCSlider ()
    extends typings.atMaterialSlider.atMaterialSliderMod.MDCSlider
  
  @js.native
  class MDCSliderFoundation ()
    extends typings.atMaterialSlider.atMaterialSliderMod.MDCSliderFoundation
  
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    def attachTo(root: Element): typings.atMaterialSlider.atMaterialSliderMod.MDCSlider = js.native
  }
  
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    val cssClasses: typings.atMaterialSlider.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSliderAdapter = js.native
    val numbers: typings.atMaterialSlider.constantsMod.numbers = js.native
    val strings: typings.atMaterialSlider.constantsMod.strings = js.native
  }
  
}

