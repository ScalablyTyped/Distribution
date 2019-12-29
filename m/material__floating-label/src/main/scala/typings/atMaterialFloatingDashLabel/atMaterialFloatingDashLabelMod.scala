package typings.atMaterialFloatingDashLabel

import typings.atMaterialFloatingDashLabel.adapterMod.MDCFloatingLabelAdapter
import typings.atMaterialFloatingDashLabel.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/floating-label", JSImport.Namespace)
@js.native
object atMaterialFloatingDashLabelMod extends js.Object {
  @js.native
  class MDCFloatingLabel ()
    extends typings.atMaterialBase.componentMod.default[MDCFloatingLabelAdapter, default] {
    /**
      * Styles label to float/dock.
      * @param shouldFloat styles the label to float by adding float class
      * if true, otherwise docks the label by removing the float class.
      */
    def float(shouldFloat: Boolean): Unit = js.native
    def getWidth(): Double = js.native
    /**
      * Styles the label to produce the label shake for errors.
      * @param  shouldShake styles the label to shake by adding shake class
      * if true, otherwise will stop shaking by removing shake class.
      */
    def shake(shouldShake: Boolean): Unit = js.native
  }
  
  @js.native
  class MDCFloatingLabelFoundation () extends default
  
  /* static members */
  @js.native
  object MDCFloatingLabel extends js.Object {
    def attachTo(root: Element): MDCFloatingLabel = js.native
  }
  
  /* static members */
  @js.native
  object MDCFloatingLabelFoundation extends js.Object {
    val cssClasses: typings.atMaterialFloatingDashLabel.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFloatingLabelAdapter = js.native
  }
  
}

