package typings.materialRipple

import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.materialRipple.foundationMod.MDCRippleFoundation
import typings.materialRipple.typesMod.MDCRippleAttachOpts
import typings.materialRipple.typesMod.MDCRippleCapableSurface
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined unbounded, disabled */ @JSImport("@material/ripple/component", "MDCRipple")
  @js.native
  class MDCRipple protected () extends MDCComponent[MDCRippleFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCRippleFoundation, args: js.Any*) = this()
    
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
  object MDCRipple {
    
    @JSImport("@material/ripple/component", "MDCRipple")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): MDCRipple = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCRipple]
    @scala.inline
    def attachTo(root: Element, opts: MDCRippleAttachOpts): MDCRipple = (^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MDCRipple]
    
    @scala.inline
    def createAdapter(instance: MDCRippleCapableSurface): MDCRippleAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdapter")(instance.asInstanceOf[js.Any]).asInstanceOf[MDCRippleAdapter]
  }
  
  type MDCRippleFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCRippleFoundation], MDCRipple]
}
