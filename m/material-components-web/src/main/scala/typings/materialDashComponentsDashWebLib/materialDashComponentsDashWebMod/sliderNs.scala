package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "slider")
@js.native
object sliderNs extends js.Object {
  @js.native
  class MDCSlider ()
    extends atMaterialSliderLib.atMaterialSliderMod.MDCSlider
  
  @js.native
  class MDCSliderFoundation ()
    extends atMaterialSliderLib.atMaterialSliderMod.MDCSliderFoundation
  
  @js.native
  object MDCSlider extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialSliderLib.atMaterialSliderMod.MDCSlider = js.native
  }
  
  @js.native
  object MDCSliderFoundation extends js.Object {
    val cssClasses: atMaterialSliderLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialSliderLib.adapterMod.MDCSliderAdapter = js.native
    val numbers: atMaterialSliderLib.constantsMod.numbers = js.native
    val strings: atMaterialSliderLib.constantsMod.strings = js.native
  }
  
}

