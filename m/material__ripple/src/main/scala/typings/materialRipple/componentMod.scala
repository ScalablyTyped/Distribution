package typings.materialRipple

import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.materialRipple.foundationMod.MDCRippleFoundation
import typings.materialRipple.typesMod.MDCRippleAttachOpts
import typings.materialRipple.typesMod.MDCRippleCapableSurface
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/ripple/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined unbounded, disabled */ @js.native
  class MDCRipple () extends MDCComponent[MDCRippleFoundation] {
    
    def activate(): Unit = js.native
    
    def deactivate(): Unit = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    def layout(): Unit = js.native
    
    def unbounded: Boolean = js.native
    def unbounded_=(unbounded: Boolean): Unit = js.native
    @JSName("unbounded")
    var unbounded_FMDCRipple: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  @js.native
  object MDCRipple extends js.Object {
    
    def attachTo(root: Element): MDCRipple = js.native
    def attachTo(root: Element, opts: MDCRippleAttachOpts): MDCRipple = js.native
    
    def createAdapter(instance: MDCRippleCapableSurface): MDCRippleAdapter = js.native
  }
  
  type MDCRippleFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCRippleFoundation], MDCRipple]
}
