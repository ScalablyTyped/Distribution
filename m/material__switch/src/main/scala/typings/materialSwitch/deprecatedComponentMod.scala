package typings.materialSwitch

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.componentMod.MDCRipple
import typings.materialSwitch.deprecatedFoundationMod.MDCSwitchFoundation
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedComponentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/switch/deprecated/component", "MDCSwitch")
  @js.native
  open class MDCSwitch protected () extends MDCComponent[MDCSwitchFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCSwitchFoundation, args: Any*) = this()
    
    /* private */ var changeHandler: Any = js.native
    
    def checked: Boolean = js.native
    def checked_=(checked: Boolean): Unit = js.native
    
    /* private */ var createRipple: Any = js.native
    
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    @JSName("disabled")
    var disabled_FMDCSwitch: js.UndefOr[Boolean] = js.native
    
    /* private */ def nativeControl: Any = js.native
    
    def ripple: MDCRipple = js.native
    
    /* private */ val rippleSurface: Any = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object MDCSwitch {
    
    @JSImport("@material/switch/deprecated/component", "MDCSwitch")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: HTMLElement): MDCSwitch = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCSwitch]
  }
}
