package typings.materialNotchedOutline

import typings.materialNotchedOutline.adapterMod.MDCNotchedOutlineAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/notched-outline/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCNotchedOutlineFoundation
    extends typings.materialBase.foundationMod.default[MDCNotchedOutlineAdapter] {
    /**
      * Removes notched outline selector to close the notch in the outline.
      */
    def closeNotch(): Unit = js.native
    /**
      * Adds the outline notched selector and updates the notch width
      * calculated based off of notchWidth and isRtl.
      */
    def notch(notchWidth: Double): Unit = js.native
    def notch(notchWidth: Double, isRtl: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCNotchedOutlineFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialNotchedOutline.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCNotchedOutlineAdapter = js.native
    val strings: typings.materialNotchedOutline.constantsMod.strings = js.native
  }
  
}

