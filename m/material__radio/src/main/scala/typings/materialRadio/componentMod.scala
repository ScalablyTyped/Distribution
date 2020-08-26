package typings.materialRadio

import typings.materialBase.componentMod.MDCComponent
import typings.materialRadio.foundationMod.MDCRadioFoundation
import typings.materialRipple.componentMod.MDCRipple
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/radio/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @js.native
  class MDCRadio () extends MDCComponent[MDCRadioFoundation] {
    @JSName("disabled")
    var disabled_FMDCRadio: js.UndefOr[Boolean] = js.native
    var unbounded: js.UndefOr[Boolean] = js.native
    def checked: Boolean = js.native
    def checked_=(checked: Boolean): Unit = js.native
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    def ripple: MDCRipple = js.native
    def value: String = js.native
    def value_=(value: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCRadio extends js.Object {
    def attachTo(root: Element): MDCRadio = js.native
  }
  
}

