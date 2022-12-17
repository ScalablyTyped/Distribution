package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialNotchedOutline.anon.PartialMDCNotchedOutlineA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notchedOutline {
  
  @JSImport("material-components-web", "notchedOutline.MDCNotchedOutline")
  @js.native
  open class MDCNotchedOutline protected ()
    extends typings.materialNotchedOutline.mod.MDCNotchedOutline {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialNotchedOutline.foundationMod.MDCNotchedOutlineFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCNotchedOutline {
    
    @JSImport("material-components-web", "notchedOutline.MDCNotchedOutline")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialNotchedOutline.componentMod.MDCNotchedOutline = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialNotchedOutline.componentMod.MDCNotchedOutline]
  }
  
  @JSImport("material-components-web", "notchedOutline.MDCNotchedOutlineFoundation")
  @js.native
  open class MDCNotchedOutlineFoundation ()
    extends typings.materialNotchedOutline.mod.MDCNotchedOutlineFoundation {
    def this(adapter: PartialMDCNotchedOutlineA) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "notchedOutline.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "notchedOutline.cssClasses.NO_LABEL")
    @js.native
    def NO_LABEL: String = js.native
    inline def NO_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "notchedOutline.cssClasses.OUTLINE_NOTCHED")
    @js.native
    def OUTLINE_NOTCHED: String = js.native
    inline def OUTLINE_NOTCHED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE_NOTCHED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "notchedOutline.cssClasses.OUTLINE_UPGRADED")
    @js.native
    def OUTLINE_UPGRADED: String = js.native
    inline def OUTLINE_UPGRADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE_UPGRADED")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "notchedOutline.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "notchedOutline.numbers.NOTCH_ELEMENT_PADDING")
    @js.native
    def NOTCH_ELEMENT_PADDING: Double = js.native
    inline def NOTCH_ELEMENT_PADDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTCH_ELEMENT_PADDING")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "notchedOutline.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "notchedOutline.strings.NOTCH_ELEMENT_SELECTOR")
    @js.native
    def NOTCH_ELEMENT_SELECTOR: String = js.native
    inline def NOTCH_ELEMENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTCH_ELEMENT_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
