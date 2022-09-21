package typings.materialRadio

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialRadio.foundationMod.MDCRadioFoundation
import typings.materialRipple.componentMod.MDCRipple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/radio/component", "MDCRadio")
  @js.native
  open class MDCRadio protected () extends MDCComponent[MDCRadioFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCRadioFoundation, args: Any*) = this()
    
    def checked: Boolean = js.native
    def checked_=(checked: Boolean): Unit = js.native
    
    /* private */ var createRipple: Any = js.native
    
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    @JSName("disabled")
    var disabled_FMDCRadio: js.UndefOr[Boolean] = js.native
    
    /* private */ def nativeControl: Any = js.native
    
    def ripple: MDCRipple = js.native
    
    /* private */ val rippleSurface: Any = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
    
    def value: String = js.native
    def value_=(value: String): Unit = js.native
  }
  /* static members */
  object MDCRadio {
    
    @JSImport("@material/radio/component", "MDCRadio")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCRadio = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCRadio]
  }
}
