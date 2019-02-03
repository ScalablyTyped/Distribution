package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "base")
@js.native
object baseNs extends js.Object {
  @js.native
  class MDCComponent[A, F /* <: atMaterialBaseLib.foundationMod.default[A] */] protected ()
    extends atMaterialBaseLib.atMaterialBaseMod.MDCComponent[A, F] {
    def this(root: stdLib.Element) = this()
    def this(root: stdLib.Element, foundation: F, args: js.Any*) = this()
  }
  
  @js.native
  class MDCFoundation[A] protected ()
    extends atMaterialBaseLib.atMaterialBaseMod.MDCFoundation[A] {
    def this(adapter: A) = this()
  }
  
  /* static members */
  @js.native
  object MDCComponent extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialBaseLib.componentMod.MDCComponent[_, atMaterialBaseLib.foundationMod.default[_]] = js.native
  }
  
  /* static members */
  @js.native
  object MDCFoundation extends js.Object {
    val cssClasses: atMaterialBaseLib.foundationMod.MDCStrings = js.native
    val defaultAdapter: js.Any = js.native
    val numbers: atMaterialBaseLib.foundationMod.MDCNumbers = js.native
    val strings: atMaterialBaseLib.foundationMod.MDCStrings = js.native
  }
  
}

