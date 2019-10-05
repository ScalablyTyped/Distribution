package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialBase.foundationMod.MDCNumbers
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialBase.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "base")
@js.native
object base extends js.Object {
  @js.native
  class MDCComponent[A, F /* <: default[A] */] protected ()
    extends typings.atMaterialBase.atMaterialBaseMod.MDCComponent[A, F] {
    def this(root: Element) = this()
    def this(root: Element, foundation: F, args: js.Any*) = this()
  }
  
  @js.native
  class MDCFoundation[A] protected ()
    extends typings.atMaterialBase.atMaterialBaseMod.MDCFoundation[A] {
    def this(adapter: A) = this()
  }
  
  /* static members */
  @js.native
  object MDCComponent extends js.Object {
    def attachTo(root: Element): typings.atMaterialBase.componentMod.MDCComponent[_, default[_]] = js.native
  }
  
  /* static members */
  @js.native
  object MDCFoundation extends js.Object {
    val cssClasses: MDCStrings = js.native
    val defaultAdapter: js.Any = js.native
    val numbers: MDCNumbers = js.native
    val strings: MDCStrings = js.native
  }
  
}

