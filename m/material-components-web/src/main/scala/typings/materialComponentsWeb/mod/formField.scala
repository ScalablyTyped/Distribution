package typings.materialComponentsWeb.mod

import typings.materialFormField.anon.PartialMDCFormFieldAdapte
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formField {
  
  @JSImport("material-components-web", "formField.MDCFormField")
  @js.native
  class MDCFormField protected ()
    extends typings.materialFormField.mod.MDCFormField {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialFormField.foundationMod.MDCFormFieldFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCFormField {
    
    @JSImport("material-components-web", "formField.MDCFormField.attachTo")
    @js.native
    def attachTo(root: HTMLElement): typings.materialFormField.componentMod.MDCFormField = js.native
  }
  
  @JSImport("material-components-web", "formField.MDCFormFieldFoundation")
  @js.native
  class MDCFormFieldFoundation ()
    extends typings.materialFormField.mod.MDCFormFieldFoundation {
    def this(adapter: PartialMDCFormFieldAdapte) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "formField.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "formField.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "formField.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "formField.strings.LABEL_SELECTOR")
    @js.native
    def LABEL_SELECTOR: String = js.native
    @scala.inline
    def LABEL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
