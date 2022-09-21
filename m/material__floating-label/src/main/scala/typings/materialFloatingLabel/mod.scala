package typings.materialFloatingLabel

import typings.materialBase.Element
import typings.materialFloatingLabel.anon.PartialMDCFloatingLabelAd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/floating-label", "MDCFloatingLabel")
  @js.native
  open class MDCFloatingLabel protected ()
    extends typings.materialFloatingLabel.componentMod.MDCFloatingLabel {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialFloatingLabel.foundationMod.MDCFloatingLabelFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCFloatingLabel {
    
    @JSImport("@material/floating-label", "MDCFloatingLabel")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialFloatingLabel.componentMod.MDCFloatingLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialFloatingLabel.componentMod.MDCFloatingLabel]
  }
  
  @JSImport("@material/floating-label", "MDCFloatingLabelFoundation")
  @js.native
  open class MDCFloatingLabelFoundation ()
    extends typings.materialFloatingLabel.foundationMod.MDCFloatingLabelFoundation {
    def this(adapter: PartialMDCFloatingLabelAd) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/floating-label", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/floating-label", "cssClasses.LABEL_FLOAT_ABOVE")
    @js.native
    def LABEL_FLOAT_ABOVE: String = js.native
    inline def LABEL_FLOAT_ABOVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_FLOAT_ABOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/floating-label", "cssClasses.LABEL_REQUIRED")
    @js.native
    def LABEL_REQUIRED: String = js.native
    inline def LABEL_REQUIRED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_REQUIRED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/floating-label", "cssClasses.LABEL_SHAKE")
    @js.native
    def LABEL_SHAKE: String = js.native
    inline def LABEL_SHAKE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SHAKE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/floating-label", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
}
