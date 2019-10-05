package typings.atMaterialFloatingDashLabel

import typings.atMaterialFloatingDashLabel.adapterMod.MDCFloatingLabelAdapter
import typings.atMaterialFloatingDashLabel.foundationMod.MDCFloatingLabelFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/floating-label/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCFloatingLabelFoundation
    extends typings.atMaterialBase.foundationMod.default[MDCFloatingLabelAdapter] {
    /**
      * Styles the label to float or dock.
      */
    def float(shouldFloat: Boolean): Unit = js.native
    /**
      * Returns the width of the label element.
      */
    def getWidth(): Double = js.native
    /**
      * Styles the label to produce the label shake for errors.
      */
    def shake(shouldShake: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCFloatingLabelFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.atMaterialFloatingDashLabel.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFloatingLabelAdapter = js.native
  }
  
}

