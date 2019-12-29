package typings.atMaterialSwitch

import typings.atMaterialBase.componentMod.MDCComponent
import typings.atMaterialBase.foundationMod.default
import typings.atMaterialSwitch.foundationMod.MDCSwitchFoundation
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/switch/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCRippleCapableSurface * / any */ @js.native
  class MDCSwitch () extends MDCComponent[MDCSwitchFoundation, default[MDCSwitchFoundation]] {
    var checked: Boolean = js.native
    var disabled: Boolean = js.native
    val ripple: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCRipple */ js.Any = js.native
    var root_ : Element = js.native
  }
  
  /* static members */
  @js.native
  object MDCSwitch extends js.Object {
    def attachTo(root: HTMLElement): MDCSwitch = js.native
  }
  
}

