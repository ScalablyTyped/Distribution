package typings.atMaterialIconDashToggle

import typings.atMaterialIconDashToggle.adapterMod.MDCIconToggleAdapter
import typings.atMaterialIconDashToggle.atMaterialIconDashToggleMod.MDCIconToggle
import typings.atMaterialIconDashToggle.foundationMod.default
import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-toggle", JSImport.Namespace)
@js.native
object atMaterialIconDashToggleMod extends js.Object {
  @js.native
  class MDCIconToggle ()
    extends typings.atMaterialBase.componentMod.default[MDCIconToggleAdapter, default] {
    var disabled: Boolean = js.native
    var on: Boolean = js.native
    val ripple: MDCRipple = js.native
    def refreshToggleData(): Unit = js.native
  }
  
  @js.native
  class MDCIconToggleFoundation () extends default
  
  /* static members */
  @js.native
  object MDCIconToggle extends js.Object {
    def attachTo(root: Element): MDCIconToggle = js.native
  }
  
  /* static members */
  @js.native
  object MDCIconToggleFoundation extends js.Object {
    val cssClasses: typings.atMaterialIconDashToggle.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCIconToggleAdapter = js.native
    val strings: typings.atMaterialIconDashToggle.constantsMod.strings = js.native
  }
  
}

