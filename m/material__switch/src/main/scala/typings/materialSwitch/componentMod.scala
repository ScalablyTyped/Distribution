package typings.materialSwitch

import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.componentMod.MDCRipple
import typings.materialSwitch.foundationMod.MDCSwitchFoundation
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/switch/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @js.native
  class MDCSwitch () extends MDCComponent[MDCSwitchFoundation] {
    @JSName("disabled")
    var disabled_FMDCSwitch: js.UndefOr[Boolean] = js.native
    var unbounded: js.UndefOr[Boolean] = js.native
    def checked: Boolean = js.native
    def checked_=(checked: Boolean): Unit = js.native
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    def ripple: MDCRipple = js.native
  }
  
  /* static members */
  @js.native
  object MDCSwitch extends js.Object {
    def attachTo(root: HTMLElement): MDCSwitch = js.native
  }
  
}

