package typings.atMaterialNotchedDashOutline

import typings.atMaterialNotchedDashOutline.adapterMod.MDCNotchedOutlineAdapter
import typings.atMaterialNotchedDashOutline.atMaterialNotchedDashOutlineMod.MDCNotchedOutline
import typings.atMaterialNotchedDashOutline.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/notched-outline", JSImport.Namespace)
@js.native
object atMaterialNotchedDashOutlineMod extends js.Object {
  @js.native
  class MDCNotchedOutline ()
    extends typings.atMaterialBase.componentMod.default[MDCNotchedOutlineAdapter, default] {
    /**
      * Updates the outline selectors to close notch and return it to idle state.
      */
    def closeNotch(): Unit = js.native
    /**
      * Updates outline selectors and SVG path to open notch.
      */
    def notch(notchWidth: Double): Unit = js.native
    def notch(notchWidth: Double, isRtl: Boolean): Unit = js.native
  }
  
  @js.native
  class MDCNotchedOutlineFoundation () extends default
  
  /* static members */
  @js.native
  object MDCNotchedOutline extends js.Object {
    def attachTo(root: Element): MDCNotchedOutline = js.native
  }
  
  /* static members */
  @js.native
  object MDCNotchedOutlineFoundation extends js.Object {
    val cssClasses: typings.atMaterialNotchedDashOutline.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCNotchedOutlineAdapter = js.native
    val strings: typings.atMaterialNotchedDashOutline.constantsMod.strings = js.native
  }
  
}

