package typings.materialCheckbox

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialCheckbox.foundationMod.MDCCheckboxFoundation
import typings.materialRipple.componentMod.MDCRipple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/checkbox/component", "MDCCheckbox")
  @js.native
  open class MDCCheckbox protected () extends MDCComponent[MDCCheckboxFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCCheckboxFoundation, args: Any*) = this()
    
    def checked: Boolean = js.native
    def checked_=(checked: Boolean): Unit = js.native
    
    /* private */ var createRipple: Any = js.native
    
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    @JSName("disabled")
    var disabled_FMDCCheckbox: js.UndefOr[Boolean] = js.native
    
    /* private */ var getNativeControl: Any = js.native
    
    /* private */ var handleAnimationEnd: Any = js.native
    
    /* private */ var handleChange: Any = js.native
    
    def indeterminate: Boolean = js.native
    def indeterminate_=(indeterminate: Boolean): Unit = js.native
    
    def initialize(): Unit = js.native
    
    /* private */ var installPropertyChangeHooks: Any = js.native
    
    def ripple: MDCRipple = js.native
    
    /* private */ val rippleSurface: Any = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
    
    /* private */ var uninstallPropertyChangeHooks: Any = js.native
    
    def value: String = js.native
    def value_=(value: String): Unit = js.native
  }
  /* static members */
  object MDCCheckbox {
    
    @JSImport("@material/checkbox/component", "MDCCheckbox")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCCheckbox = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCCheckbox]
  }
  
  type MDCCheckboxFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCCheckboxFoundation], 
    MDCCheckbox
  ]
}
