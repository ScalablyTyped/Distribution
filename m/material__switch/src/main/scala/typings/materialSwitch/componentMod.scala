package typings.materialSwitch

import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.componentMod.MDCRipple
import typings.materialSwitch.foundationMod.MDCSwitchFoundation
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/switch/component", "MDCSwitch")
  @js.native
  class MDCSwitch protected () extends MDCComponent[MDCSwitchFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCSwitchFoundation, args: js.Any*) = this()
    
    def checked: Boolean = js.native
    def checked_=(checked: Boolean): Unit = js.native
    
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    @JSName("disabled")
    var disabled_FMDCSwitch: js.UndefOr[Boolean] = js.native
    
    def ripple: MDCRipple = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object MDCSwitch {
    
    @JSImport("@material/switch/component", "MDCSwitch")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: HTMLElement): MDCSwitch = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCSwitch]
  }
}
