package typings.materialFormField

import typings.materialBase.Element
import typings.materialFormField.anon.PartialMDCFormFieldAdapte
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/form-field", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialFormField.foundationMod.default {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  
  @JSImport("@material/form-field", "MDCFormField")
  @js.native
  open class MDCFormField protected ()
    extends typings.materialFormField.componentMod.MDCFormField {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialFormField.foundationMod.MDCFormFieldFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCFormField {
    
    @JSImport("@material/form-field", "MDCFormField")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: HTMLElement): typings.materialFormField.componentMod.MDCFormField = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialFormField.componentMod.MDCFormField]
  }
  
  @JSImport("@material/form-field", "MDCFormFieldFoundation")
  @js.native
  open class MDCFormFieldFoundation ()
    extends typings.materialFormField.foundationMod.MDCFormFieldFoundation {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/form-field", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/form-field", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/form-field", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/form-field", "strings.LABEL_SELECTOR")
    @js.native
    def LABEL_SELECTOR: String = js.native
    inline def LABEL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
